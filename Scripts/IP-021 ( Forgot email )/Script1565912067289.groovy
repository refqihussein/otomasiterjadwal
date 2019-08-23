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

WebUI.openBrowser('www.gmail.com')

WebUI.setText(findTestObject('forgot email/input_Lanjutkan ke Gmail_identifier'), 'refqi.hussein@gmail.com')

WebUI.click(findTestObject('forgot email/div_Berikutnya'))

WebUI.setText(findTestObject('forgot email/input_Terlalu sering gagal_password'), 'refqihussein9892')

WebUI.click(findTestObject('forgot email/div_Berikutnya'))

WebUI.click(findTestObject('forgot email/New Message'))

WebUI.delay(2)

WebUI.click(findTestObject('forgot email/a_Reset Password'))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('forgot email/input_Password_password'), 'mysecret9892')

WebUI.takeScreenshot()

WebUI.setText(findTestObject('forgot email/input_Repeat Password_repeat password'), 'mysecret9892')

WebUI.takeScreenshot()

WebUI.click(findTestObject('forgot email/button_SET YOUR PASSWORD NOW'))

WebUI.takeScreenshot()

