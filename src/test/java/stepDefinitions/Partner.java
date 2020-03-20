
package stepDefinitions;

import baseClasses.Init;
import cucumber.api.java.en.Then;
import pageObjetcs.PartnerObjects;

public class Partner extends Init {
	
	PartnerObjects partnerobjects=new PartnerObjects();


@Then ("^click on partners")


	public void clickonpartners() throws Exception
	
	{
	System.out.println("inside");
	partnerobjects.clickonpartners();	
	
	}

		
	
}