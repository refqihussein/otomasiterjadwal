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

WebUI.click(findTestObject('all report no matching data/div_Reports'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('all report no matching data/a_All Transactions'))

WebUI.click(findTestObject('all report no matching data/input_Date Range_date'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('all report no matching data/button_previous 30 days'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('all report no matching data/input_Paid_vs__search'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('all report no matching data/li_Paid'))

WebUI.takeScreenshot()

WebUI.delay(0)

WebUI.takeScreenshot()

