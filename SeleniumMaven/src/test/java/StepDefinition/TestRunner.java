package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Acer\\eclipse-workspace\\SeleniumMaven\\src\\test\\resources\\Feature File\\Login&Logoutnew.feature",
glue ="StepDefinition",
plugin= {"pretty","html:target/cucumber-reports/loginandlogout2.html"},
tags="@Login or @Logout",
monochrome = true)

public class TestRunner {
	

}
