package stepDefinitions;

import baseClasses.ExcelHelper;
import baseClasses.JSWaiter;
import baseClasses.Request;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.Admin.OfferAttributesPage;

public class OfferAttributesSteps {
	
	public final String OFFER_ATTRIBUTE_KEYWORD = "a_sel_offer_attribute";
	JSWaiter jswait = new JSWaiter();
	public ExcelHelper eM = new ExcelHelper();
	OfferAttributesPage offerAttributesPage = new OfferAttributesPage();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	CommonObjects commonObjects = new CommonObjects();
	
	@Then("^check and create default selenium attributes$")
    public void createDefaultSeleniumAttributes() throws Throwable
    {
		try{
			commonObjects.filterName(OFFER_ATTRIBUTE_KEYWORD);
			commonObjects.clickOptionsIcon();
		}catch(Exception e) {
			offerAttributesPage.createDefaultSeleniumOfferAttribute(OFFER_ATTRIBUTE_KEYWORD);
		}			
    }

	@Then("^check offer attributes while creating offer$")
    public void verifyDefaultSeleniumAttributes() throws Throwable
    {
		offerPageObjects.clickAddOfferAttributeButton();
		offerPageObjects.selectOfferAttribute();
    }
	
	@Then("^create offer attribute with 50 characters$")
    public void createOfferAttributeWith50Characters() throws Throwable
    {
		offerAttributesPage.clickCreateNewOfferAttributeButton();
		offerAttributesPage.enterTextAttributeFields("kksjduhytgkksjduhytgkksjduhytgkksjduhytgkksjduhytg", "kksjduhytgkksjduhytgkksjduhytgkksjduhytgkksjduhytg");
		offerAttributesPage.clickSaveOfferAttributeButton();
		commonObjects.filterName("kksjduhytgkksjduhytgkksjduhytgkksjduhytgkksjduhytg");
		commonObjects.clickOptionsIcon();
		commonObjects.clickDeleteOption();
		commonObjects.clickConfirmYesButton();
		try {
			commonObjects.clickOptionsIcon();
		}catch(Exception e) {
			
		}
    }

		
}
