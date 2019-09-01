package com.kms.katalon.core.webservice.verification;

import java.io.File;
import java.lang.reflect.Type;

import org.apache.commons.lang.StringUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.kms.katalon.core.configuration.RunConfiguration;
import com.kms.katalon.core.constants.StringConstants;
import com.kms.katalon.core.testobject.HttpBodyContent;
import com.kms.katalon.core.testobject.ObjectRepository;
import com.kms.katalon.core.testobject.RequestObject;
import com.kms.katalon.core.testobject.ResponseObject;
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent;

public class WSResponseManager {

    private static final String REQUEST_OBJECT_FILE_EXTENSION = ".rs";

    private ResponseObject response;

    private String requestObjectId;

    private static WSResponseManager instance;

    private WSResponseManager() {

    }

    public static WSResponseManager getInstance() {
        if (instance == null) {
            instance = new WSResponseManager();
        }
        return instance;
    }

    public ResponseObject getCurrentResponse() throws Exception {
        if (response == null) {
            String responseObjectJson = (String) RunConfiguration
                    .getProperty(StringConstants.WS_VERIFICATION_RESPONSE_OBJECT);

            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(HttpBodyContent.class, new HttpBodyContentInstanceCreator()).create();

            response = gson.fromJson(responseObjectJson, ResponseObject.class);
            HttpBodyContent textBodyContent = new HttpTextBodyContent(response.getResponseBodyContent());
            response.setBodyContent(textBodyContent);
        }

        return response;
    }

    public void setCurrentResponse(ResponseObject responseObject) {
        response = responseObject;
    }

    public RequestObject getCurrentRequest() throws Exception {
        if (requestObjectId == null) {
            requestObjectId = (String) RunConfiguration.getProperty(StringConstants.WS_VERIFICATION_REQUEST_OBJECT_ID);
        }
        File objectFile = new File(RunConfiguration.getProjectDir(), requestObjectId + REQUEST_OBJECT_FILE_EXTENSION);
        RequestObject requestObject = (RequestObject) ObjectRepository.findRequestObject(requestObjectId, objectFile);
        return requestObject;
    }

    public void setRequestObjectId(String requestObjectId) {
        this.requestObjectId = requestObjectId;
    }

    private static class HttpBodyContentInstanceCreator implements InstanceCreator<HttpBodyContent> {

        @Override
        public HttpBodyContent createInstance(Type arg0) {
            return new HttpTextBodyContent(StringUtils.EMPTY);
        }

    }
}
