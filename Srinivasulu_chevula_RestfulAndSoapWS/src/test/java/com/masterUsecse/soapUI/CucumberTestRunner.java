package com.masterUsecse.soapUI;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "/Srinivasulu_chevula_RestfulAndSoapWS/src/test/java/http_get.feature", // Path to your feature files
    glue = "com.masterUsecse.soapUI" // Package containing your step definition classes
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
