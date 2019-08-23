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

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services/div_Settings'))

WebUI.delay(2)

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services/a_Product  Services'))

WebUI.delay(2)

WebUI.click(findTestObject('Product and service/Page_iPropio - Product and Services/a_Add a Recurring productservices'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Product and Services Recurring/input_ProductServices Name_productservices name'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_iPropio - Product and Services Recurring/input_ProductServices Name_productservices name'), 
    'apartment')

WebUI.delay(2)

WebUI.click(findTestObject('Page_iPropio - Product and Services Recurring/textarea_productServicesDescription_description'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_iPropio - Product and Services Recurring/textarea_productServicesDescription_description'), 
    'edit menjadi 30 lantai')

WebUI.delay(2)

WebUI.click(findTestObject('Page_iPropio - Product and Services Recurring/input_Monthly_vs__search'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_iPropio - Product and Services Recurring/li_Monthly'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_iPropio - Product and Services Recurring/input'))

WebUI.delay(2)

WebUI.waitForElementAttributeValue(findTestObject('Page_iPropio - Product and Services Recurring/divid__BVID__191divtabletbodytrtd3divinput'), 
    '__BVD__*', '__BVD__', 5)

WebUI.waitForElementPresent(findTestObject('Page_iPropio - Product and Services Recurring/divid__BVID__191divtabletbodytrtd3divinput'), 
    5)

WebUI.click(findTestObject('Page_iPropio - Product and Services Recurring/divid__BVID__191divtabletbodytrtd3divinput'))

WebUI.setText(findTestObject('Page_iPropio - Product and Services Recurring/divid__BVID__191divtabletbodytrtd3divinput'), 
    '10000')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Product and Services Recurring/button_Create'))

WebUI.delay(7)

WebUI.takeScreenshot()

