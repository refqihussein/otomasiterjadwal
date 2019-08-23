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

WebUI.callTestCase(findTestCase('IP-001 (Login)'), [('Email') : 'aaa@gmail.com', ('Password') : '123445656'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Dashboard/div_Historical Transaction'))

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Dashboard/a_Add Historical Invoices'))

WebUI.delay(2)

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/input_Street Name_vs__search'))

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/li_Jl Mentari Bersinar'))

WebUI.delay(2)

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/input_House Number_vs__search'))

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/li_16'))

WebUI.delay(2)

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/button_Autofill Invoice From'))

WebUI.delay(2)

WebUI.click(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/button_Autofill Invoice To'))

WebUI.delay(2)

WebUI.waitForElementPresent(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/divid__layoutdivdivmaindivdivdivdivdivdiv2divdiv3divtabletbodytrtddivlabel'), 
    5)

WebUI.waitForElementClickable(findTestObject('add invoice historical/Page_iPropio - Historical Add Invoice/div_Fee Amount_custom-control custom-checkbox'), 
    0)

