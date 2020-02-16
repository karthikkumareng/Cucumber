package com.anbetrack.hook;

import com.anbetrack.BaseUtilities.ActionsOnElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ServiceHooks extends ActionsOnElement{

	@Before
	public void launchApplication()  {
		System.out.println(" lauching Browser");
		
		}
	
	@After
	public void closeApplication() {
		System.out.println(" Closing Browser");
	}


}
