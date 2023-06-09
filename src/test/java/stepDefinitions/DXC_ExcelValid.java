package stepDefinitions;

import baseClasses.Init;
import cucumber.api.java.en.Then;
import pageObjetcs.DXC_ExcelObjects;

public class DXC_ExcelValid  extends Init{
	DXC_ExcelObjects excel_ob = new DXC_ExcelObjects();


	@Then("^validate the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void validate_the_and(String FileName, String FileLocation) throws Throwable {
		
		excel_ob.Exceldata(FileName, FileLocation);

	}
}
