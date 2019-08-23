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

WebUI.callTestCase(findTestCase('IP-001 (Login)'), [('Email') : 'aaa@gmail.com', ('Password') : '123445656'], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('add expected visitor/Page_iPropio - Dashboard/div_Visitors'))

WebUI.delay(5)

WebUI.click(findTestObject('add expected visitor/Page_iPropio - Dashboard/a_Expected Visitor'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('add expected visitor/Page_iPropio - Expected Visitor/a_Add New'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('add expected visitor/Page_iPropio - Expected Visitor/input_Visitor Name___BVID__542'), 'Diana')

WebUI.delay(5)

WebUI.setText(findTestObject('add expected visitor/Page_iPropio - Expected Visitor/input_No of Visitor___BVID__544'), '01')

WebUI.delay(5)

WebUI.click(findTestObject('add expected visitor/Page_iPropio - Expected Visitor/input_Visit Purpose___BVID__571'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('add expected visitor/Page_iPropio - Expected Visitor/li_Private'))

WebUI.delay(5)

WebUI.click(findTestObject('add expected visitor/Page_iPropio - Expected Visitor/input_Visitor Type_vs__search'))

WebUI.delay(5)

WebUI.click(findTestObject('add expected visitor/Page_iPropio - Expected Visitor/li_Motorcycle'))

WebUI.delay(5)

WebUI.click(findTestObject(null))


WebUI.waitForElementAttributeValue(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'),
	'__BVD__*', '__BVD__', 5)

WebUI.waitForElementPresent(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'),
	5)

WebUI.click(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'))

WebUI.setText(findTestObject('resident from tenant/Page_iPropio - Residents/input_Add More Vehicle___BVID__206'), 'B1817CLM')


