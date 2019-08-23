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

WebUI.openBrowser('http://kamisa.web.iprop-dev.com/login')

WebUI.delay(5)

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Login/button_Resident Registration'))

WebUI.delay(5)

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_First Name_first name'), 
    'ipropio')

WebUI.delay(3)

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Last Name_last name'), 'project')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/Page_iPropio - Register Resident/Page_iPropio - Register Resident/input_Street Name_vs__search'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/li_Jl Senang sekali'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_House Number_vs__search'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/li_6'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_House Telephone Number_house-telephone-number'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_House Telephone Number_house-telephone-number'), 
    '021661660')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_land Islands_mobile number'))

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_land Islands_mobile number'), 
    '87709876543')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Email_email'))

WebUI.setText(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Email_email'), 'email5@email.com')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Residential Status_vs__search'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/li_Tenant'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Resident Since Date_date'))

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/td_31'))

WebUI.delay(5)

WebUI.takeScreenshot()

CustomKeywords.'com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot'(findTestObject('Resident-photo'), 'Users/refqi/Deskop/tes.png')

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('IP-003 (Register resident)/Page_iPropio - Register Resident/input_Not bigger than 200 x 200 pixels_agree'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('button_Register'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.delay(10)

WebUI.closeBrowser()

