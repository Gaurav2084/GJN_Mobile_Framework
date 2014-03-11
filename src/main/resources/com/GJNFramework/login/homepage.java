package com.GJNFramework.login;

import static junit.framework.Assert.assertEquals;

import com.GNJFramework.calabash.android.UIElement;
import com.GNJFramework.calabash.android.UIElements;
import com.client.app.login.Application;

public class homepage {

@SuppressWarnings("deprecation")
public void CurrentAct(String arg1) throws Throwable{
	
	assertEquals(arg1, Application.android.getCurrentActivity());
}


public void TapSimpleElements(String activityName) throws Throwable{

Application.android.query("* marked:'" + activityName + "'").touch();
}


public void PressNormalButton(String button) throws Throwable{

	Application.android.query("*");
	Application.android.query("button marked:'" + button + "'").touch();
}
public void LongPressElements(String text) throws Throwable{
	Application.android.query("*");
Application.android.query("* marked:'" + text + "'").longPress();
}
public UIElement validateText() throws Throwable {
	UIElement textView = Application.android.query("textView id:'textView'").get(0);
	return(textView);
}
}


