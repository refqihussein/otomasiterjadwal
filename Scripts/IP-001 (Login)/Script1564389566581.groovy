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
import org.junit.runner.RunWith as RunWith
import cucumber.api.CucumberOptions as CucumberOptions
import cucumber.api.junit.Cucumber as Cucumber

WebUI.openBrowser('http://kamisa.web.iprop-dev.com/login')

WebUI.delay(1)

WebUI.setText(findTestObject('Page_iPropio - Login/input_Email_email'), 'didinonpqcms@gmail.com')

WebUI.delay(1)

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/4.png')

WebUI.setText(findTestObject('Page_iPropio - Login/input_Password_password'), 'testing12345')

WebUI.delay(1)

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/5.png')

WebUI.click(findTestObject('Page_iPropio - Login/button_Login Now'))

WebUI.delay(1)

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/7.png')

