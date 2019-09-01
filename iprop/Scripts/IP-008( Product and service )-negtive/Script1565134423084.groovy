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

WebUI.callTestCase(findTestCase('IP-001 (Login tenant)'), [('Email') : 'aaa@gmail.com', ('Password') : '123445656'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services/div_Settings'))

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services/a_Product  Services'))

WebUI.delay(2)

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services/a_Add a One-off productservices'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services One Off/input_ProductServices Name_productservices name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Product and service/Page_iPropio - Product and Services One Off/input_ProductServices Name_productservices name'), 
    '')

WebUI.delay(2)

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services One Off/textarea_productServicesDescription_description'))

WebUI.delay(2)

WebUI.setText(findTestObject('Product and service/Page_iPropio - Product and Services One Off/textarea_productServicesDescription_description'), 
    'terdiri dari 25 lantai')

WebUI.delay(2)

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services One Off/input_Fee Amount_fee amount'))

WebUI.delay(2)

WebUI.setText(findTestObject('Product and service/Page_iPropio - Product and Services One Off/input_Fee Amount_fee amount'), 
    '1010')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services One Off/button_Create'))

WebUI.delay(7)

WebUI.takeScreenshot()

WebUI.closeBrowser()

