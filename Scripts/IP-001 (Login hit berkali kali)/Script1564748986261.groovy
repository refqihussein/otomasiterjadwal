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

for (def index : (2..9)) {
    WebUI.openBrowser('kamisa.web.iprop-dev.com/')

    WebUI.delay(3)

    WebUI.setText(findTestObject('Object Repository/input_Email_email'), Email)

    WebUI.delay(3)

    WebUI.setText(findTestObject('Page_iPropio - Login/input_Password_password'), Password)

    WebUI.takeScreenshot('/Users/refqi/Documents/webippro/1.png')

    WebUI.delay(10)

    WebUI.takeScreenshot('/Users/refqi/Documents/webippro/2.png')

    WebUI.click(findTestObject('Page_iPropio - Login/button_Login Now'))
}

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/6.png')

WebUI.delay(5)

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/3.png')

WebUI.setText(findTestObject('Page_iPropio - Login/input_Email_email'), 'didinonpqcms@gmail.com')

WebUI.delay(5)

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/4.png')

WebUI.setText(findTestObject('Page_iPropio - Login/input_Password_password'), 'testing12345')

WebUI.delay(3)

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/5.png')

WebUI.click(findTestObject('Page_iPropio - Login/button_Login Now'))

WebUI.delay(5)

WebUI.takeScreenshot('/Users/refqi/Documents/webippro/7.png')

WebUI.openBrowser('')

WebUI.openBrowser('kamsa.web.ipprop-dev.com/login')

WebUI.navigateToUrl('http://kamisa.web.iprop-dev.com/residents/create')

