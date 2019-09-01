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

WebUI.click(findTestObject('property type/div_Properties'))

WebUI.click(findTestObject('property type/a_Property Types'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('property type/a_Add New'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('property type/input_Property Type_vs__search'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('property type/li_Flats'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('property type/button_Create'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.delay(1)

