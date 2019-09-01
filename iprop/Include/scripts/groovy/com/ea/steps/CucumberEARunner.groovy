package com.ea.steps


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/refqi/Katalon Studio/ipropio/Reports/IP-001 (Login) ", glue="", plugin = ["pretty",
	"junit:Login/cucumber.xml",
	"html:Login",
	"json:Login/cucumber.json"])
public class CucumberEARunner {
}

