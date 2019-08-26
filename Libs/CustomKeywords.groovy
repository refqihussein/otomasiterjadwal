
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.model.FailureHandling

import com.kms.katalon.core.testobject.TestObject

import java.lang.Object

import java.util.List


def static "com.testwithhari.katalon.plugins.Browserstack.updateTestName"(
    	String sessionID	
     , 	String TestName	) {
    (new com.testwithhari.katalon.plugins.Browserstack()).updateTestName(
        	sessionID
         , 	TestName)
}

def static "com.testwithhari.katalon.plugins.Browserstack.updateTestStatusAndReason"(
    	String sessionID	
     , 	String testStatus	
     , 	String reasonForFailure	) {
    (new com.testwithhari.katalon.plugins.Browserstack()).updateTestStatusAndReason(
        	sessionID
         , 	testStatus
         , 	reasonForFailure)
}

def static "com.testwithhari.katalon.plugins.Browserstack.getCurrentTestRunSessionID"() {
    (new com.testwithhari.katalon.plugins.Browserstack()).getCurrentTestRunSessionID()
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual)
}

def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual
         , 	flowControl)
}

def static "test.testclass.uploadFile"(
    	TestObject to	
     , 	String filePath	) {
    (new test.testclass()).uploadFile(
        	to
         , 	filePath)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFile"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFile(
        	object
         , 	file)
}

def static "com.kms.katalon.keyword.uploadfile.UploadFile.uploadFileUsingRobot"(
    	TestObject object	
     , 	String file	) {
    (new com.kms.katalon.keyword.uploadfile.UploadFile()).uploadFileUsingRobot(
        	object
         , 	file)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames
         , 	isSelect)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean expectedStatus	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames
         , 	expectedStatus)
}

def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionSelectedByName"(
    	TestObject dropdownObject	
     , 	String expectedName	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionSelectedByName(
        	dropdownObject
         , 	expectedName)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDrop"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDrop(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropHtml5"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropHtml5(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropJquery"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropJquery(
        	sourceObject
         , 	destinationObject)
}

def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropBy"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	
     , 	int xOffset	
     , 	int yOffset	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropBy(
        	sourceObject
         , 	destinationObject
         , 	xOffset
         , 	yOffset)
}

def static "com.testwithhari.katalon.plugins.Gmail.getEmailsCount"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).getEmailsCount(
        	emailID
         , 	password
         , 	folderLableName)
}

def static "com.testwithhari.katalon.plugins.Gmail.deleteAllEMails"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).deleteAllEMails(
        	emailID
         , 	password
         , 	folderLableName)
}

def static "com.testwithhari.katalon.plugins.Gmail.sendEmail"(
    	String from_emailaddress	
     , 	String email_password	
     , 	String to_emailaddress	
     , 	String email_subject	
     , 	String email_body	) {
    (new com.testwithhari.katalon.plugins.Gmail()).sendEmail(
        	from_emailaddress
         , 	email_password
         , 	to_emailaddress
         , 	email_subject
         , 	email_body)
}

def static "com.testwithhari.katalon.plugins.Gmail.readLatestEMailBodyContent"(
    	String emailID	
     , 	String password	
     , 	String folderLableName	) {
    (new com.testwithhari.katalon.plugins.Gmail()).readLatestEMailBodyContent(
        	emailID
         , 	password
         , 	folderLableName)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout
         , 	flowControl)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs)
}

def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout)
}
