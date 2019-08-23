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

WebUI.click(findTestObject('change password/img_Open Menu_img-avatar'))

WebUI.delay(3)

WebUI.click(findTestObject('change password/a_My Profile'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('change password/a_Change Password'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.setText(findTestObject('change password/input_Password_current password'), 'test12345')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('change password/input_Password_password'), 'test123456')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('change password/input_Repeat Password_repeat password'), 'test123456')

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('change password/button_Change Password'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.takeScreenshot()

