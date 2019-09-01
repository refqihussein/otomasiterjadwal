import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('IP-001 (Login hit berkali kali)'), [('Email') : 'aaa@gmail.com', ('Password') : '123445656'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('setting-company/Page_iPropio - Dashboard/div_Settings'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Dashboard/a_Account Settings'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/input_May_vs__search'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/li_May'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/input_AfricaLagos_vs__search'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/li_AfricaLagos'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/input_DD-MM-YYYY_vs__search'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/li_DD-MM-YYYY'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/input_Armenian dram (AMD)_vs__search'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/li_Armenian dram (AMD)'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/input_First Name Last Name_vs__search'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/li_First Name Last Name'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/input_Monday_vs__search'))

WebUI.click(findTestObject('setting-company/Page_iPropio - Account Settings/li_Monday'))

WebUI.setText(findTestObject('setting-company/Page_iPropio - Account Settings/input_Invoice Prefix_invoice-prefix'), 'Cash')

WebUI.setText(findTestObject('setting-company/Page_iPropio - Account Settings/input_Receipt Prefix_receipt-prefix'), 'cash too')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('setting-company/button_Update Settings'))

WebUI.takeScreenshot()

