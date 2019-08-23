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

WebUI.delay(2)

WebUI.click(findTestObject('vehicles/Page_iPropio - Property/div_GuardSecurity'))

WebUI.delay(1)

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/a_Vehicle Types'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/a_Add New Vehicle'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/input_Vehicle Type_vehicle name'))

WebUI.setText(findTestObject('vehicles/Page_iPropio - Vehicle Type/input_Vehicle Type_vehicle name'), 'Delman')

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/button_Create New Vehicle'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/a_Edit'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/input_Vehicle Type_vehicle-type'))

WebUI.setText(findTestObject('vehicles/Page_iPropio - Vehicle Type/input_Vehicle Type_vehicle-type'), 'Dokar')

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/button_Update'))

WebUI.delay(1)

WebUI.takeScreenshot()

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/button_Delete'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('vehicles/Page_iPropio - Vehicle Type/button_Yes Delete'))

WebUI.delay(2)

WebUI.takeScreenshot()

