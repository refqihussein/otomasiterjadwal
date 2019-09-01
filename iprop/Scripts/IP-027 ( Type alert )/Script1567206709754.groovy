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

WebUI.click(findTestObject('Object Repository/Alert Types/div_Guard  Security'))

WebUI.click(findTestObject('Object Repository/Alert Types/a_Alert Types'))

WebUI.click(findTestObject('Object Repository/Alert Types/button_Add New Alert'))

WebUI.setText(findTestObject('Object Repository/Alert Types/input_Add Alert Type_name-input'), 'Otomation 1')

WebUI.click(findTestObject('Object Repository/Alert Types/button_Create New Alert'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Alert Types/button_Delete'))

WebUI.click(findTestObject('Object Repository/Alert Types/button_Yes Delete'))

WebUI.delay(0)

WebUI.takeScreenshot()

