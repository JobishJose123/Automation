package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;
import baseClasses.RandomNameGenerator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.PmConfigurationPage;
import pageObjetcs.TargetConditionObjects;

public class pmConfigurationSteps extends Init{

	PmConfigurationPage pmConfigurationPage = new PmConfigurationPage();
	public pmConfigurationSteps() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^navigate to saved segments$")
	public void navigate_to_saved_segments() throws Throwable {
		pmConfigurationPage.clickSavedSegmentsButton();
	}

	@Then("^create saved segment with condition \"([^\"]*)\"$")
    public void  createNewSegment(String name) throws Throwable{
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(name);
		try{
			commonObjects.clickOptionsIcon();
		}catch(Exception e) {
			pmConfigurationPage.clickCreateNewSegmentButton();
			pmConfigurationPage.enterSavedSegmentDetails(name);
			pmConfigurationPage.clickSegmentSaveButton();
		}
    }
	@Then("^edit saved segment with condition \"([^\"]*)\"$")
    public void  editSavedSegment(String name) throws Throwable{
		TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(name);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		pmConfigurationPage.enterSavedSegmentName(name+"_SegmentEdited");
		pmConfigurationPage.clickEditSegmentConditionOption();
		pmConfigurationPage.clickSavedSegmentOptionsDelete();
		targetConditionObjects.clickBasicTargetConditionWithAge("30");
		pmConfigurationPage.clickSegmentSaveButton();
//		commonObjects.filterName(name+"_SegmentEdited");
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		BroadcastSteps broadcastSteps = new BroadcastSteps();
		broadcastSteps.verifyTargetConditionDetails("segmentAgeGT40");
		pmConfigurationPage.clickSegmentSaveButton();
	}
	
	@Then("^deactivate saved segment with condition \"([^\"]*)\"$")
    public void  deactivateSavedSegment(String name) throws Throwable{
		TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(name+"_SegmentEdited");
		commonObjects.clickOptionsIcon();
		commonObjects.clickDeactivateProductButton();
	}
	
	@Then("^navigate to inactive segments$")
    public void  navigateToInactiveSegments() throws Throwable{
		pmConfigurationPage.clickInactiveSegmentTab();
	}
	
	@Then("^navigate to active segments$")
    public void  navigateToActiveSegments() throws Throwable{
		pmConfigurationPage.clickActiveSegmentTab();
	}
	
	@Then("^activate saved segment with condition \"([^\"]*)\"$")
    public void  activateSavedSegment(String name) throws Throwable{
		TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(name+"_SegmentEdited");
		commonObjects.clickOptionsIcon();
		commonObjects.clickActivateOption();
	}
	
	@Then("^copy saved segment with condition \"([^\"]*)\"$")
    public void  copySavedSegment(String name) throws Throwable{
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(name+"_SegmentEdited");
		commonObjects.clickOptionsIcon();
		commonObjects.clickDuplicateOption();
		pmConfigurationPage.enterSavedSegmentName(name+"_SegmentCopied");
		pmConfigurationPage.clickSegmentSaveButton();
		commonObjects.filterName(name+"_SegmentCopied");
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		BroadcastSteps broadcastSteps = new BroadcastSteps();
		broadcastSteps.verifyTargetConditionDetails("segmentAgeGT40");
		pmConfigurationPage.clickSegmentSaveButton();
	}
	
	@Then("^delete saved segment with condition \"([^\"]*)\"$")
    public void  deleteSavedSegment(String name) throws Throwable{
		CommonObjects commonObjects = new CommonObjects();
		commonObjects.filterName(name+"_SegmentEdited");
		commonObjects.clickOptionsIcon();
		commonObjects.clickDeleteOption();
		pmConfigurationPage.clickdeleteSaveSegmentConfirmOK();
		try {
			commonObjects.filterName(name+"_SegmentEdited");
			commonObjects.clickOptionsIcon();
			Assert.assertTrue("segment not deleted",false);
		}catch(Exception e) {
			
		}
	}
}
