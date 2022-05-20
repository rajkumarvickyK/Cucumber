package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FeatureFile",glue="org.stepdefinition",monochrome=true, 
           dryRun=false,strict=true,tags= {"@smoke"," @Regression"},plugin= 
       {"html:C:\\Users\\This PC\\eclipse-workspace\\CucumberPracties\\AllReport\\Htmlreport",
    	"json:C:\\Users\\This PC\\eclipse-workspace\\CucumberPracties\\AllReport\\JsonReport\\Facebook.json",
    	"junit:C:\\Users\\This PC\\eclipse-workspace\\CucumberPracties\\AllReport\\JunitReport\\fb.xml"})



public class RunnerClass {

}
