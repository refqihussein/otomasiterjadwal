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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import mypackage.MySelectors as MySelectors
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.openqa.selenium.Keys as Keys

WebUI.delay(5)

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_First Name_first name'), 
    'ipropio2')

WebUI.delay(3)

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Last Name_last name'), 'project3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_House Telephone Number_house-telephone-number'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_House Telephone Number_house-telephone-number'), 
    '021661660333')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_land Islands_mobile number'))

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_land Islands_mobile number'), 
    '87709876543')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Email_email'))

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Email_email'), 'email4@email.com')

WebUI.delay(2)

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('Resident-photo'), 'Users/refqi/Deskop/tes.png')

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Residents/input_Residential Status_vs__search'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Residents/li_Tenant'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_iPropio - Residents/input_Resident Since Date_date'))

WebUI.setText(findTestObject('Page_iPropio - Residents/input_Resident Since Date_date'), '2019-08-22')

WebUI.check(findTestObject('Page_iPropio - Residents/input_Resident Since Date_date'))

WebUI.click(findTestObject('Page_iPropio - Residents/input_Street Name_vs__search'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_iPropio - Residents/li_Jl Senang sekali'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('resident from tenant/Page_iPropio - Residents/input_House Number_vs__search'))

WebUI.delay(3)

WebUI.click(findTestObject('resident from tenant/Page_iPropio - Residents/li_3'), FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Page_iPropio - Residents/input_Car_vs__search'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_iPropio - Residents/li_Car'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.waitForElementAttributeValue(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'), 
    '__BVD__*', '__BVD__', 5)

WebUI.waitForElementPresent(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'), 
    5)

WebUI.click(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'))

WebUI.setText(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'), 'B1817CLM')

WebUI.delay(3)

WebUI.click(findTestObject('Page_iPropio - Residents/button_Create Resident Now'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.closeBrowser()

