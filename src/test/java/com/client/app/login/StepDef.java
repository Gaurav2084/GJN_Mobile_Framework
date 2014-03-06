package com.client.app.login;
import static junit.framework.Assert.assertEquals;

import com.GNJFramework.calabash.android.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

//	public static AndroidApplication android;
//	private boolean isSetup;
	
//	public void setup1() throws CalabashException{
//		
//		AndroidConfiguration androidConfiguration = new AndroidConfiguration();
//		androidConfiguration.setAndroidHome("C:/android-sdk");
//		androidConfiguration.setPauseTime(1000);
//		AndroidRunner androidRunner = new AndroidRunner("D:/Automation/Calabash/CucumberTest/apk/AndroidTestApplication.apk", androidConfiguration);
//		androidRunner.setup();
//		android = androidRunner.start();
//	}
	@Given("^activity should be \"([^\"]*)\"$")
	public void activity_should_be(String arg1) throws Throwable {
		assertEquals(arg1, Application.android.getCurrentActivity());
	}

	@Given("^I go to \"([^\"]*)\"$")
	public void I_go_to(String activityName) throws Throwable {
		Application.android.query("* marked:'" + activityName + "'").touch();
	}

	@When("^I press \"([^\"]*)\"$")
	public void I_press(String button) throws Throwable {
		Application.android.query("button marked:'" + button + "'").touch();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String text) throws Throwable {
		UIElement textView = Application.android.query("textView id:'textView'").get(0);
		assertEquals(text, textView.getText());

	}
}
