package com.kms.katalon.core.util.internal;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;

import com.kms.katalon.core.network.ProxyInformation;
import com.kms.katalon.core.network.ProxyOption;
import com.kms.katalon.core.network.ProxyServerType;

public class ProxyUtil {
    private static final String JAVA_NET_USE_SYSTEM_PROXIES = "java.net.useSystemProxies";

    private static final List<NetworkInterface> NETWORK_INTERFACES;

    static {
        try {
            NETWORK_INTERFACES = Collections.list(NetworkInterface.getNetworkInterfaces());
        } catch (SocketException se) {
            throw new RuntimeException("Could not retrieve ethernet network interfaces.", se);
        }
    }

    public static Proxy getProxy(ProxyInformation proxyInfo) throws URISyntaxException, IOException {
        if (proxyInfo == null) {
            throw new IllegalArgumentException("proxyInfo cannot be null");
        }

        switch (ProxyOption.valueOf(proxyInfo.getProxyOption())) {
            case NO_PROXY:
                return Proxy.NO_PROXY;
            case USE_SYSTEM:
                return getSystemProxy();
            case MANUAL_CONFIG:
                return getProxyForManualConfig(proxyInfo);
            default:
                return Proxy.NO_PROXY;
        }
    }

    public static Proxy getSystemProxy() throws URISyntaxException, IOException {
        System.setProperty(JAVA_NET_USE_SYSTEM_PROXIES, "true");
        for (String ipAdress : getAllIpAddresses()) {
            List<Proxy> l = ProxySelector.getDefault().select(new URI("http://" + ipAdress));
            Iterator<Proxy> iter = l.iterator();
            while (iter.hasNext()) {
                Proxy proxy = iter.next();
                InetSocketAddress addr = (InetSocketAddress) proxy.address();
                if (addr != null) {
                    return proxy;
                }
            }
        }
        return Proxy.NO_PROXY;
    }

    private static Proxy getProxyForManualConfig(ProxyInformation proxyInfo) {
        System.setProperty(JAVA_NET_USE_SYSTEM_PROXIES, "false");
        Proxy proxy = new Proxy(getProxyTypeForManualConfig(proxyInfo),
                new InetSocketAddress(proxyInfo.getProxyServerAddress(), proxyInfo.getProxyServerPort()));
        if (StringUtils.isNotEmpty(proxyInfo.getUsername()) && StringUtils.isNotEmpty(proxyInfo.getPassword())) {
            Authenticator.setDefault(new Authenticator() {
                protected java.net.PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(proxyInfo.getUsername(), proxyInfo.getPassword().toCharArray());
                };
            });
        }
        return proxy;
    }

    private static Proxy.Type getProxyTypeForManualConfig(ProxyInformation proxyInfo) {
        return ProxyServerType.valueOf(proxyInfo.getProxyServerType()) == ProxyServerType.SOCKS ? Proxy.Type.SOCKS
                : Proxy.Type.HTTP;
    }

    /**
     * @return all IP addresses except the loop-back address.
     * @throws IOException if there is no IP address found.
     */
    private static Collection<String> getAllIpAddresses() throws IOException {
        SortedSet<String> addresses = new TreeSet<>();
        Iterator<NetworkInterface> iterator = NETWORK_INTERFACES.iterator();
        while (iterator.hasNext()) {
            NetworkInterface ni = iterator.next();
            Enumeration<InetAddress> addressEnumeration = ni.getInetAddresses();
            while (addressEnumeration.hasMoreElements()) {
                InetAddress address = addressEnumeration.nextElement();

                if (!address.isLoopbackAddress() && !address.getHostAddress().contains(":")) {
                    addresses.add(address.getHostAddress());
                }
            }
        }

        if (addresses.isEmpty()) {
            throw new IOException("Failed to get non-loopback IP address!");
        }

        return addresses;
    }
}
