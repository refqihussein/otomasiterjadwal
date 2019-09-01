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

WebUI.click(findTestObject('Object Repository/Guards Schedule/div_Guard  Security'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/a_Guard Schedule'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/a_Create Schedule'))

WebUI.click(findTestObject('input_Schedule Interval_vs__search'))

WebUI.click(findTestObject('Guards Schedule/li_monthly'))

WebUI.click(findTestObject('input_Schedule Preference_vs__search'))

WebUI.click(findTestObject('Guards Schedule/li_weekly'))

WebUI.click(findTestObject('input_Select Schedule Date_date'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/td_30'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/td_31'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Guards Schedule/button_Create Guard Now'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/span_No guard'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/span_Satpam'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/button_Add Here'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Guards Schedule/span_rinto'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/button_Add Here'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Guards Schedule/a_Back'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/button_Delete'))

WebUI.click(findTestObject('Object Repository/Guards Schedule/button_OK'))

WebUI.takeScreenshot()

