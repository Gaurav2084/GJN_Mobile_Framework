package com.client.app.login;

import static junit.framework.Assert.assertEquals;

import com.GJNFramework.login.homepage;
import com.GNJFramework.calabash.android.UIElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
 public	homepage test = new homepage();

	@Given("^activity should be \"([^\"]*)\"$")
	public void activity_should_be(String arg1) throws Throwable {
				test.CurrentAct(arg1);
		
	}

	@Given("^I go to \"([^\"]*)\"$")
	public void I_go_to(String activityName) throws Throwable {
		test.TapSimpleElements(activityName);
	}

	@When("^I press on \"([^\"]*)\"$")
	public void I_press(String button) throws Throwable {
		test.PressNormalButton(button);
	}
	@When("^I press \"([^\"]*)\"$")
	public void long_press(String text) throws Throwable {
		test.LongPressElements(text);
	}
	@SuppressWarnings("deprecation")
	@Then("^I should see \"([^\"]*)\"$")
	public void I_should_see(String text) throws Throwable {
		UIElement abc =	test.validateText();
		assertEquals(text, abc.getText());
	}
}
