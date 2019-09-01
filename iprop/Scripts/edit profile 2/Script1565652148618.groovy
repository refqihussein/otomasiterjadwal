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

WebUI.click(findTestObject('edit profile 2/img_Open Menu_img-avatar'))

WebUI.click(findTestObject('edit profile 2/a_My Profile'))

WebUI.click(findTestObject('edit profile 2/a_Edit Profile'))

WebUI.delay(2)

WebUI.setText(findTestObject('edit profile 2/input_First Name_first name'), 'otomasi')

WebUI.delay(2)

WebUI.setText(findTestObject('edit profile 2/input_Last Name_last name'), 'iprop')

WebUI.delay(1)

WebUI.setText(findTestObject('edit profile 2/input_House Telephone Number_house-telephone-number'), '0210101011')

WebUI.delay(1)

WebUI.setText(findTestObject('edit profile 2/input_land Islands_mobile number'), '8770099009')

WebUI.delay(1)

WebUI.click(findTestObject('edit profile 2/input_Tenant_vs__search'))

WebUI.click(findTestObject('edit profile 2/li_Tenant'))

WebUI.delay(1)

WebUI.click(findTestObject('edit profile 2/input_Resident Since Date_date'))

WebUI.click(findTestObject('edit profile 2/span_May'))

WebUI.delay(1)

WebUI.click(findTestObject('edit profile 2/input_Jl Mentari Bersinar_vs__search'))

WebUI.click(findTestObject('edit profile 2/li_Jl Senang sekali'))

WebUI.delay(1)

WebUI.click(findTestObject('edit profile 2/input_Vehicle_vs__search'))

WebUI.click(findTestObject('edit profile 2/li_Truk'))

WebUI.delay(1)

WebUI.setText(findTestObject('edit profile 2/input_Loading___BVID__252'), 'B12345FF')

WebUI.delay(1)

WebUI.click(findTestObject('edit profile 2/button_Save Resident Data'))
