package stepDefinitions;

import org.junit.Assert;

import baseClasses.Init;
import cucumber.api.java.en.Then;
import pageObjetcs.ExportCampaignLocationObjects;

public class AddExportLocationSteps extends Init {
	ExportCampaignLocationObjects  exportCampignLocationObject = new ExportCampaignLocationObjects();
	
	@Then("^add new export location and verify the same in list$")
    public void addNewExportLocation() throws Throwable
    {
		exportCampignLocationObject.clickAddExportLocationButton();
		exportCampignLocationObject.enterLocation();
		exportCampignLocationObject.enterURL();
		exportCampignLocationObject.enterPassword();
		exportCampignLocationObject.clickSaveButton();
		exportCampignLocationObject.verifyAddedExportLocation();
    }
	
	@Then("^navigate to system administration$")
    public void navigateToSystemAdministration() throws Throwable
    {
		exportCampignLocationObject.clickSystemAdministration();
    }
	
	@Then("^navigate to export location$")
    public void navigateToExportLocation() throws Throwable
    {
		exportCampignLocationObject.clickExportLocation();
    }
	
}
