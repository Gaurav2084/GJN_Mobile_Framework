package com.client.app.login;


import cucumber.api.java.Before;

import com.GNJFramework.calabash.android.*;
public class Application {
	
	public static AndroidApplication android;
	private boolean isSetup;
	protected InspectCallback callback;

	@Before
	public void test() throws CalabashException {
		if (isSetup == true) {
			return;
		}
		AndroidConfiguration androidConfiguration = new AndroidConfiguration();
		androidConfiguration.setAndroidHome("C:/android-sdk");
		androidConfiguration.setPauseTime(1000);
		AndroidRunner androidRunner = new AndroidRunner("D:/Automation/Calabash/CucumberTest/apk/AndroidTestApplication.apk", androidConfiguration);
		androidRunner.setup();
		android = androidRunner.start();
		isSetup = true;
		
		  android.inspect(new InspectCallback() {
            public void onEachElement(UIElement element, int nestingLevel) {
                for (int i = 0; i < nestingLevel; i++) {
                    System.out.print("-");
//                    try {
//						System.out.print(Application.android.query("*") + "||" + "\n");
//						//System.out.write(Application.android.query("*") );
//					} catch (CalabashException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
                }
               
                
//               System.out.print(element.getElementClass() + " || ");
//               System.out.print(element.getId() + " || ");
//               try {
//				System.out.print(element.getContentDescription() + " || ");
//			} catch (CalabashException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//               System.out.print(element.getText() + " || ");
//               System.out.print(element.getQuery() + "\n");
//              // System.out.print("\n");
//                // System.out.print(element.getId() + "\n");
            }
        });
	}
}
