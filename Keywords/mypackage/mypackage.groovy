package mypackage

import com.kms.katalon.core.testobject.ConditionType

import com.kms.katalon.core.testobject.TestObject

public class MySelectors {

	public static final String dynamicIdPath = '//input[@id="%s"]'

	public static TestObject getMyTestObject(String selectorType, String selectorValue) {

		TestObject to = new TestObject()

		to.addProperty(selectorType, ConditionType.EQUALS, selectorValue)

		return to
	}
}