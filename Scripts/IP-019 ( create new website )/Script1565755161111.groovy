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

WebUI.openBrowser('https://secure.iprop.io/register')

WebUI.click(findTestObject('create new website/input_Email_email'))

WebUI.setText(findTestObject('create new website/input_Email_email'), 'junkmailist0908@gmail.com')

WebUI.delay(3)

WebUI.click(findTestObject('create new website/button_Lets start'))

WebUI.delay(4)

WebUI.takeScreenshot()

WebUI.click(findTestObject('create new website/input_First name_first name'))

WebUI.setText(findTestObject('create new website/input_First name_first name'), 'Otomasi')

WebUI.delay(1)

WebUI.click(findTestObject('create new website/input_Last name_last name'))

WebUI.setText(findTestObject('create new website/input_Last name_last name'), 'Iprop')

WebUI.delay(3)

WebUI.click(findTestObject('create new website/input_Association Name_company name'))

WebUI.setText(findTestObject('create new website/input_Association Name_company name'), 'otomasiiprop2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('create new website/div_Next Step'))

WebUI.delay(4)

WebUI.takeScreenshot()

