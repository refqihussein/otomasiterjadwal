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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('IP-001 (Login)'), [('Email') : 'didinpqcms@gmail.com', ('Password') : 'testing12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_iPropio - Admins/a_Admins'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_iPropio - Admins/a_Add New'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.check(findTestObject('Page_iPropio - Admins/input_First Name_first name'))

WebUI.setText(findTestObject('Page_iPropio - Admins/input_First Name_first name'), 'iprop2')

WebUI.check(findTestObject('Page_iPropio - Admins/input_Last  Family Name_last name'))

WebUI.setText(findTestObject('Page_iPropio - Admins/input_Last  Family Name_last name'), 'project otomasi2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Page_iPropio - Admins/input_House Telephone Number_house_telephone'), '021210210')

WebUI.setText(findTestObject('Page_iPropio - Admins/input_land Islands_mobile number'), '08783129022')

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Admins/input_Email_email'))

WebUI.setText(findTestObject('Page_iPropio - Admins/input_Email_email'), 'husseinrefqi@gmail.com')

WebUI.delay(3)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('Page_iPropio - Admins/img'), 
    'Users/refqi/Desktop/tes.png')

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Admins/div_super-admin               Loading'))

WebUI.click(findTestObject('Page_iPropio - Admins/li_admin'))

WebUI.click(findTestObject('Page_iPropio - Admins/span_Non Resident'))

WebUI.click(findTestObject('Page_iPropio - Admins/li_Non Resident'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Admins/button_Generate PIN'))

WebUI.delay(3)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Admins/button_Create Admin Now'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.closeBrowser()

