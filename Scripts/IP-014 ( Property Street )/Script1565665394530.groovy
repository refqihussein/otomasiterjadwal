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

WebUI.click(findTestObject('property street/div_Properties'))

WebUI.delay(1)

WebUI.click(findTestObject('property street/a_Property Streets'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('property street/a_Add New'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('property street/input_Property Street_property street'))

WebUI.setText(findTestObject('property street/input_Property Street_property street'), 'Jl. Otomasi Iprop')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('property street/button_Create'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

