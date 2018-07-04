package stepDefinitions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.mozilla.javascript.JavaScriptException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
//import baseClasses.JavaScriptExecutor;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.Admin.RewardTypePage;

public class OfferSteps extends Init {
	public ExcelHelper eh = new ExcelHelper();
	Offer_creation_steps offer_creation = new Offer_creation_steps();
	JSWaiter jswait = new JSWaiter();
	LoginPageObjects loginPage = new LoginPageObjects();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	CustomerProfilePage customerProfilePage = new CustomerProfilePage();
	CommonObjects commonObjects = new CommonObjects();
	RewardTypePage rewardTypePage = new RewardTypePage();

	public OfferSteps() {
		PageFactory.initElements(driver, this);
	}
	// @Then("^navigate to offers")
	// public void logout() throws InterruptedException {
	// offerPageObjects.navigateToOffer();
	// }

	@Then("^create new offer from sheet \"([^\"]*)\" with product \"([^\"]*)\"$")
	public void create_new_Offer(String sheet, String productSheet) throws Throwable {
		offerPageObjects.createOffer(sheet, productSheet);
	}
	
	@Then("^create new offer from sheet \"([^\"]*)\" with product \"([^\"]*)\" and verify rewards dropdown field$")
	public void create_new_OfferAndCheckRewardsDropDown(String sheet, String productSheet) throws Throwable {
		offerPageObjects.createOfferAndCheckRewardsDropDown(sheet, productSheet);
	}
	
//	@Then("^naviagte to rewards")
//	public void navigateToProductClasses() throws InterruptedException {
//		offerPageObjects.navigateToRewards();
//	}

	@Then("^verify \"([^\"]*)\" offer in grid$")
	public void verifyOfferInGrid(String sheet) throws Throwable {
		eh.setExcelFile("offerInputData", sheet);
		commonObjects.filterName(eh.getCell(1, 0).toString());
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[contains(.,'" + eh.getCell(1, 0).toString() + "')]")));
	}

	WebDriverWait wait = new WebDriverWait(driver, 15);
	Actions actions = new Actions(driver);

	@Then("^check offer cancel button$")
	public void Check_cancel_button() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.clickCancelOfferButton();
		offerPageObjects.clickCreateNewOfferButton();
	}

	@Then("^check offer help icon$")
	public void Check_Offer_help_icon() throws Throwable {
		offerPageObjects.checkOfferContextHelp();
	}

	@Then("^Check_details_tab_without_entering_details$")
	public void Check_details_tab_without_entering_details() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterOfferName("details");
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterOfferDescription("description");
	}

	@Then("^Check_add_button_in_product_tab$")
	public void Check_add_button_in_product_tab() throws Throwable {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//paper-button[contains(.,'Create New Offer')]")))
				.click();
		Thread.sleep(2000);
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Offer Name')]"))).click()
				.sendKeys("name").build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Description')]"))).click()
				.sendKeys("desc").build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Offer Type')]"))).click().build()
				.perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'Balance Deduction')]"))).click()
				.build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Channel')]"))).click().build().perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'SMS')]"))).click().build()
				.perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Category')]"))).click().build()
				.perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'Balance Top ups')]"))).click()
				.build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(.,'Currency')]"))).click().build()
				.perform();
		Thread.sleep(1000);
		actions.moveToElement(driver.findElement(By.xpath("//paper-item[contains(.,'INR')]"))).click().build()
				.perform();
		actions.moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Discount')]"))).click()
				.sendKeys("20").build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//paper-button[contains(.,'Proceed')]"))).click().build()
				.perform();

		WebElement Add_button = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//*[@id='check']/div/iron-pages/offer-products/form/div/div[2]/paper-button")));
		if (Add_button.isDisplayed())
			actions.moveToElement(driver.findElement(By.xpath("//paper-button[contains(.,'Cancel')]"))).click().build()
					.perform();

		else
			throw new NoSuchElementException("Add button is not displayed in the products tab");

	}

	@Then("^create new offer using deactivated product from sheet \"([^\"]*)\"$")
	public void createOfferWithDeactivatedProduct(String sheet) throws Throwable {
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		String st = sheet;
		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("inputData", "singleProductPage");
		eh.setExcelFile("offerInputData", sheet);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eh.setCell(1, 0, name);
		String desc = (String) eh.getCell(1, 1);
		offerPageObjects.createNewOffer(name, desc);

		Thread.sleep(1000);
		String sheet2 = "fullDetails";
		eh.setExcelFile("productInputData", sheet2);
		String prod_name = (String) eh.getCell(1, 0);
		commonObjects.filterName(prod_name);
		Thread.sleep(3000);
		offerPageObjects.checkAddProductsCheckBox();

	}

	@Then("^check product help icon$")
	public void Check_Product_help_icon() throws Throwable {
		offerPageObjects.checkProductContextHelp();
	}

	@Then("^filter offer from sheet \"([^\"]*)\"$")
	public void chooseOffer(String sheet) throws Throwable {

		offerPageObjects.chooseOffer(sheet);
	}

	@Then("^edit offer$")
	public void editOffer() throws Throwable {

		commonObjects.clickOptionsIcon();
		offerPageObjects.clickEditOffer();
	}
	@Then("^duplicate offer from sheet \"([^\"]*)\"$")
	public void duplicateOfferFromSheet(String sheet) throws Throwable {
		eh.setExcelFile("offerInputData", sheet);
		String offerName = (String) eh.getCell(1, 0);
		commonObjects.filterName(offerName);
		commonObjects.clickOptionsIcon();
		commonObjects.clickDuplicateOption();
		offerPageObjects.enterOfferName(offerName+"Duplicate");
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickSaveOfferButton();
		commonObjects.filterName(offerName+"Duplicate");
		commonObjects.clickOptionsIcon();
	}
	@Then("^edit offer from sheet \"([^\"]*)\"$")
	public void editOffer(String sheet) throws Throwable {
		eh.setExcelFile("offerInputData", sheet);
		String offerName = (String) eh.getCell(1, 0);
		commonObjects.filterName(offerName);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		offerPageObjects.enterOfferName(offerName+"Edited");
		eh.setCell(1, 0,offerName+"Edited");
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickOfferEditProceedButton();
		offerPageObjects.clickSaveOfferButton();
		commonObjects.filterName(offerName+"Edited");
		commonObjects.clickOptionsIcon();
	}
	@Then("^delete offer from sheet \"([^\"]*)\"$")
	public void deleteOffer(String sheet) throws Throwable {
		eh.setExcelFile("offerInputData", sheet);
		String offerName = (String) eh.getCell(1, 0);
		commonObjects.filterName(offerName);
		commonObjects.clickOptionsIcon();
		commonObjects.clickDeleteOption();
		offerPageObjects.clickOfferDeleteConfirmYesButton();
		commonObjects.filterName(offerName);
		try {
			commonObjects.clickOptionsIcon();
		}catch(Exception e) {
			
		}
	}

	@Then("^remove product for offer from sheet \"([^\"]*)\"$")
	public void removeProduct(String sheet) throws Throwable {

		offerPageObjects.removeProduct(sheet);

	}

	@Then("^create new offer up to track tab from sheet \"([^\"]*)\" with product \"([^\"]*)\"$")
	public void create_new_Offer_Upto_Track_Tab(String sheet, String productSheet) throws Throwable {
		offerPageObjects.createOfferUptoTrackTab(sheet, productSheet);
	}

	@Then("^verify add button in track tab$")
	public void verifyAddButtonInTrackTab() throws Throwable {

		offerPageObjects.verifySetAsDefaultCheckbox();

	}

	@Then("^create new offer up to creative tab from sheet \"([^\"]*)\" with product \"([^\"]*)\"$")
	public void create_new_Offer_Upto_Creative_Tab(String sheet, String productSheet) throws Throwable {
		offerPageObjects.createOfferUptoCreativeTab(sheet, productSheet);
	}

	@Then("^verify add button in creative tab$")
	public void verifyAddButtonInCreativeTab() throws Throwable {

		offerPageObjects.verifySetAsDefaultCheckboxinCreativeTab();

	}

	@Then("^create new offer up to creative tab and choose all languages from sheet \"([^\"]*)\" with product \"([^\"]*)\"$")
	public void create_new_Offer_Upto_Creative_Tab_And_Choose_All_Languages(String sheet, String productSheet)
			throws Throwable {
		offerPageObjects.ChooseAllLanguagesCreativeTab(sheet, productSheet);
	}

	@Then("^verify sql injection in offer$")
	public void verifysqlinjectionOffer() throws Throwable {
		commonObjects.filterName("offername'; SELECT * FROM offers;");
		int pass = 0;
		org.openqa.selenium.NoSuchElementException exx = new org.openqa.selenium.NoSuchElementException("no element");
		try {
			wait.until(ExpectedConditions.elementToBeClickable(driver
					.findElement(By.xpath("//data-table-cell[text()='" + "offername'; SELECT * FROM offers;" + "']"))));
		} catch (org.openqa.selenium.NoSuchElementException e) {
			pass = 1;

		}
		if (pass == 0) {
			throw exx;
		}

	}

	@Then("^verify cross site scrpting in new offer$")
	public void verifyCrossSiteScrptingInewNewOffer() throws Throwable {

		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeWap");
		String name = "";
		char[] specialChar = { '>', '<', '\'', ';', '"' };
		for (char c : specialChar) {
			name = "name" + c;
			offerPageObjects.enterOfferName(name);
			offerPageObjects.clickProceedButton();
		}
		offerPageObjects.clickProceedButton();
	}

	@Then("^verify tab colours$")
	public void verifyTabColours() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		Assert.assertTrue(offerPageObjects.getDetailsTabColour().contains("rgba(255, 102, 50, 1)"),
				"current selection colour not orange");
		offerPageObjects.enterDetailsTabFields("tempRechargeWap");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickAddProductsButton();
		Assert.assertTrue(offerPageObjects.getDetailsTabColour().contains("rgba(84, 205, 152, 1)"),
				"current selection colour not green");
		Assert.assertTrue(offerPageObjects.getProductsTabColour().contains("rgba(255, 102, 50, 1)"),
				"current selection colour not orange");

	}

	@Then("^create new offer and verify optional fields from sheet \"([^\"]*)\" with product \"([^\"]*)\"$")
	public void create_new_Offer_And_Verify_Optional_Fields(String sheet, String productSheet) throws Throwable {
		offerPageObjects.createOfferAndVerifyOptionalFields(sheet, productSheet);
	}

	@Then("^verify checkbox of product selection$")
	public void verifyProductCheckbox() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeWap");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickAddProductsButton();
		try {
			offerPageObjects.getCheckBoxStatus();
			System.out.println("checked");
		} catch (Exception e) {
			offerPageObjects.clickAddProductFirstCheckbox();
			offerPageObjects.getCheckBoxStatus();
		}

	}

	@Then("^verify checkbox default creative creative$")
	public void verifyDefaultCreativeCheckbox() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeWap");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickAddProductsButton();
		offerPageObjects.clickAddProductFirstCheckbox();
		offerPageObjects.clickDialogBoxAddButton();
		offerPageObjects.clickProceedButton();
		offerPageObjects.verifyCheckboxOfCreative();
	}

	@Then("^validate success and failure message$")
	public void validateSuccessAndFailureMessage() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeWap");
		ExcelHelper eh = new ExcelHelper();
		eh.setExcelFile("offerInputData", "tempRechargeWap");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickAddProductsButton();
		offerPageObjects.clickAddProductFirstCheckbox();
		offerPageObjects.clickDialogBoxAddButton();
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterCreativeTabDetails(eh);
		offerPageObjects.clickProceedButton();
		Thread.sleep(3000);
		offerPageObjects.enterTrackTabDetails(eh);
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickRewardAddButton();
		offerPageObjects.enterSuccessMessage(
				"More the 500 chars Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vitae mi lacus. Maecenas tempus, urna vel efficitur porttitor, nisi mauris rutrum risus, sed sollicitudin ligula urna a turpis. Nullam sit amet elit posuere, semper ligula ut, euismod felis. Duis vel tellus sed magna facilisis eleifend vitae in leo. Aenean odio quam, aliquet egestas massa vel, aliquam scelerisque mi. Donec scelerisque a odio in consectetur. Nulla in nisi quis felis faucibus pellentesque. Vivamus euismod orci ac nullam. after");
		offerPageObjects.verifyRewardSucessMessage();
		offerPageObjects.enterFailureMessage(
				"More the 500 chars Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam vitae mi lacus. Maecenas tempus, urna vel efficitur porttitor, nisi mauris rutrum risus, sed sollicitudin ligula urna a turpis. Nullam sit amet elit posuere, semper ligula ut, euismod felis. Duis vel tellus sed magna facilisis eleifend vitae in leo. Aenean odio quam, aliquet egestas massa vel, aliquam scelerisque mi. Donec scelerisque a odio in consectetur. Nulla in nisi quis felis faucibus pellentesque. Vivamus euismod orci ac nullam. after");
		offerPageObjects.verifyRewardFailureMessage();
	}

	@Then("^verify response messages of creatives added$")
	public void verifyResponseForCreative() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeWap");
		// ExcelHelper eh = new ExcelHelper();
		eh.setExcelFile("offerInputData", "tempRechargeWap");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickAddProductsButton();
		offerPageObjects.clickAddProductFirstCheckbox();
		offerPageObjects.clickDialogBoxAddButton();
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterCreativeTabDetails(eh);
		offerPageObjects.clickAddCreativeButton();
		offerPageObjects.enterSecondCreativeTabDetails(eh);
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterTrackTabDetails(eh);
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickRewardAddButton();
		String responseXpath = "//response-message";
		jswait.waitUntil(responseXpath);
		List<WebElement> responseBox = driver.findElements(By.xpath(responseXpath));
		Assert.assertTrue(responseBox.size() == 2, "response message box should be shown for each creative");
	}

	@Then("^verify label of offer$")
	public void verifyLabelsOfOfferCatalog() throws Throwable {
		offerPageObjects.verifyHeaders();
	}

	@Then("^duplicate offer \"([^\"]*)\"$")
	public void duplicateOffer(String sheet) throws Throwable {
		eh.setExcelFile("offerInputData", sheet);
		commonObjects.filterName(eh.getCell(1, 0).toString());
		commonObjects.clickOptionsIcon();
		commonObjects.clickDuplicateOption();
		offerPageObjects.enterOfferName(eh.getCell(1, 0).toString() + "Dupe");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickSaveOfferButton();

		commonObjects.filterName(eh.getCell(1, 0).toString() + "Dupe");
		commonObjects.clickOptionsIcon();
	}

	@Then("^verify navigation to product field without mandatory fields$")
	public void verifyNavigationToProductsWithoutMandatoryFields() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		eh.setExcelFile("offerInputData", "tempRechargeWap");
		offerPageObjects.enterOfferName("checkMandatory");
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterOfferDescription((String) eh.getCell(1, 1));
		offerPageObjects.clickProceedButton();
		offerPageObjects.selectOfferType(eh.getCell(1, 2).toString());
		offerPageObjects.clickProceedButton();
		offerPageObjects.selectOfferChannel(eh.getCell(1, 3).toString());
		offerPageObjects.clickProceedButton();
		offerPageObjects.selectOfferCategory();
		offerPageObjects.clickProceedButton();
	}

	@Then("^verify length of name and description for offer creation$")
	public void verifylenthOfNameAndDescriptionInOfferCreation() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.validateNameField();
		offerPageObjects.validateDescriptionField();
	}

	@Then("^verify cancel button in product search of offer$")
	public void verifyCancelInProductSearch() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeWap");
		ExcelHelper eh = new ExcelHelper();
		eh.setExcelFile("offerInputData", "tempRechargeWap");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickAddProductsButton();// clickOfferAddButton();
		commonObjects.clickFilterIcon();
		commonObjects.enterFilterFormname("noProductWithThis");
		commonObjects.clickFilterCancelButton();
		offerPageObjects.clickAddProductFirstCheckbox();
		offerPageObjects.clickDialogBoxAddButton();
	}

	@Then("^verify adding product after adding one$")
	public void verifyaddingProductAfterAddingOne() throws Throwable {
		verifyCancelInProductSearch();
		Assert.assertTrue(offerPageObjects.getSelectedProductCount() == 1, "product not selected");
		offerPageObjects.clickAddProductAfterOneProduct();
		offerPageObjects.clickAddProductSecondCheckbox();
		offerPageObjects.clickDialogBoxAddButton();
		Assert.assertTrue(offerPageObjects.getSelectedProductCount() == 2, "product not selected");
	}

	@Then("^verify proceed button after adding product$")
	public void verifyProceedAfteraddingProduct() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeSms");
		ExcelHelper eh = new ExcelHelper();
		eh.setExcelFile("offerInputData", "tempRechargeSms");
		offerPageObjects.clickProceedButton();
		offerPageObjects.clickProceedButton();
		offerPageObjects.addFirstProduct();
		offerPageObjects.clickProceedButton();
		try {
			offerPageObjects.addFirstProduct();
			Assert.assertTrue(false, "add button displayed after proceed");
		} catch (Exception e) {

		}
	}

	@Then("^verify creative  tab colours$")
	public void verifyCreativeTabColours() throws Throwable {
		ExcelHelper eh = new ExcelHelper();
		eh.setExcelFile("offerInputData", "tempRechargeSms");
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeSms");
		offerPageObjects.clickProceedButton();
		offerPageObjects.addFirstProduct();
		offerPageObjects.clickProceedButton();
		offerPageObjects.enterCreativeTabDetails(eh);
		Assert.assertTrue(offerPageObjects.getCreativeTabColour().contains("rgba(255, 102, 50, 1)"),
				"current selection colour not orange");
		offerPageObjects.clickProceedButton();
		Thread.sleep(4000);
		Assert.assertTrue(offerPageObjects.getCreativeTabColour().contains("rgba(84, 205, 152, 1)"),
				"current selection colour not green");

	}

	@Then("^verify adding dynamic variable in creative tab$")
	public void verifyDynamicVariableInCreativeTabColours() throws Throwable {
		proceedToCreativeTab();
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.clickMapVariableFirstVariable();
		offerPageObjects.clickMapVariableOkButton();
		offerPageObjects.clickProceedButton();
	}

	public void proceedToProductTab() throws Throwable {
		offerPageObjects.clickCreateNewOfferButton();
		offerPageObjects.enterDetailsTabFields("tempRechargeSms");
		offerPageObjects.clickProceedButton();
	}

	public void proceedToCreativeTab() throws Throwable {
		proceedToProductTab();
		offerPageObjects.addFirstProduct();
		offerPageObjects.clickProceedButton();
	}

	public void proceedToTrackTab() throws Throwable {
		proceedToCreativeTab();
		eh.setExcelFile("offerInputData", "tempRechargeSms");
		offerPageObjects.enterCreativeTabDetails(eh);
		offerPageObjects.clickProceedButton();
	}

	@Then("^verify map variable list headers$")
	public void verifyMapVariableHeaders() throws Throwable {
		proceedToCreativeTab();
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.verifyMapVariableHeader();
	}

	@Then("^verify length of creative title and details$")
	public void verifyLengthOfCreativeTitleAndDetails() throws Throwable {
		proceedToCreativeTab();
		eh.setExcelFile("offerInputData", "tempRechargeSms");
		offerPageObjects.enterCreativeTabDetails(eh);
		offerPageObjects.verifyLengthOfCreativeTitleAndDetails();
		offerPageObjects.clickProceedButton();
		Thread.sleep(3000);
		offerPageObjects.enterTrackTabDetails(eh);
	}

	@Then("^verify special characters of creative title and details$")
	public void verifySpecialCharactersOfCreativeTitleAndDetails() throws Throwable {
		proceedToCreativeTab();
		eh.setExcelFile("offerInputData", "tempRechargeSms");
		offerPageObjects.enterCreativeTabDetails(eh);
		offerPageObjects.verifySpecialCharacterOfCreativeTitleAndDetails();
		offerPageObjects.clickProceedButton();
		Thread.sleep(3000);
		offerPageObjects.enterTrackTabDetails(eh);
	}
	@Then("^verify adding rule to tracking source$")
	public void verifyAddingRuleToTrackingSource() throws Throwable {
		proceedToTrackTab();
		offerPageObjects.enterTrackTabDetails(eh);
		offerPageObjects.createFirstDefaultTrackingRuleCondition();
		offerPageObjects.clickAddRuleButton();
	}
	@Then("^verify validation of rule name$")
	public void verifyAddingMultipleCondiionsInRule() throws Throwable {
//		offerPageObjects.clickAddRuleButton();
		offerPageObjects.validateRuleNameField();
		offerPageObjects.clickaddTrackingRuleCancelButton();
	}
	@Then("^verify deleting added tracking rule$")
	public void verifyDeletingTrackingRule() throws Throwable {
		offerPageObjects.clickDeleteRule();
		offerPageObjects.clickDeleteRuleConfirmYes();
		try {
			offerPageObjects.clickDeleteRule();
			Assert.assertTrue(false,"rule deletion not successfull");
		}catch(Exception e) {
		}
	}
	@Then("^verify cancelling tracking rule$")
	public void verifyCancellingTrackingRule() throws Throwable {
		proceedToTrackTab();
		offerPageObjects.enterTrackTabDetails(eh);
		offerPageObjects.clickAddRuleButton();
		offerPageObjects.enterDetailsFirstDefaultTrackingRuleCondition();
		offerPageObjects.clickaddTrackingRuleCancelButton();
		try {
			offerPageObjects.clickEditRule();
			Assert.assertTrue(false, "Rule saved after cliking cancel button");
		}catch(Exception e){
			
		}
	}
	@Then("^verify adding multiple tracking rule$")
	public void verifyAddingMultipleTrackingRule() throws Throwable {
		offerPageObjects.createFirstDefaultTrackingRuleCondition();
		offerPageObjects.createSecondDefaultTrackingRuleCondition();
	}
	@Then("^verify adding multiple rules with same priority$")
	public void verifyAddingMultipleTrackingRuleWithSamePriority() throws Throwable {
		proceedToTrackTab();
		offerPageObjects.enterTrackTabDetails(eh);
		offerPageObjects.createFirstDefaultTrackingRuleCondition("priorityCheck1");
		
		try{
			offerPageObjects.createFirstDefaultTrackingRuleCondition("priorityCheck2");
			Assert.assertTrue(false, "rules saved with same priority");
		}catch(Exception e) {
			
		}
	}
	@Then("^verify editing added rule in track tab$")
	public void verifyEditingTrackingRule() throws Throwable {
		proceedToTrackTab();
		offerPageObjects.enterTrackTabDetails(eh);
		offerPageObjects.createFirstDefaultTrackingRuleCondition();
		Thread.sleep(3000);
		offerPageObjects.clickEditRule();
		offerPageObjects.enterEditRuleName("EditedRule");
		offerPageObjects.clickEditRuleSaveButton();
		offerPageObjects.checkRuleCreation("EditedRule");
	}
	@Then("^verify maximum priority for tracking rule$")
	public void verifyMaximumPriorityTrackingRule() throws Throwable {
		offerPageObjects.clickAddRuleButton();
		offerPageObjects.enterDetailsFirstDefaultTrackingRuleCondition("maxPriority");
		offerPageObjects.selectPriority("15");
		try{
			offerPageObjects.selectPriority("16");
			Assert.assertTrue(false, "priority set to 16");
		}catch(Exception e) {
			
		}
		offerPageObjects.selectAddTrackingRuleConditionParameterAge();
	}
	@Then("^verify deleting added tracking rule condition$")
	public void verifyDeletingTrackingRuleCondition() throws Throwable {
		offerPageObjects.clickAddTrackingRuleConditionDeleteButton();
		offerPageObjects.createSecondTrackRuleCondition();
	}
	@Then("^verify adding multiple track source$")
	public void verifyAddingMultipleTrackSource() throws Throwable {
		proceedToTrackTab();
		offerPageObjects.enterTrackTabDetails(eh);
		Assert.assertTrue(offerPageObjects.getNumberOfTrackSources()==1, "issue in current count of track sources");
		offerPageObjects.clickAddTrackSourceButton();
		Assert.assertTrue(offerPageObjects.getNumberOfTrackSources()==2, "issue in current count of track sources");
		offerPageObjects.clickSecondTrackSourceDeleteButton();
		offerPageObjects.clicktrackSourceDeleteConfirmYes();
		Assert.assertTrue(offerPageObjects.getNumberOfTrackSources()==1, "issue in current count of track sources");
	}
	@Then("^verify cancelling added variable$")
	public void verifyCancelDynamicVariables() throws Throwable {
		proceedToCreativeTab();
		offerPageObjects.selectCreativeLanguageEnglish();
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.createFirstVariable("sel_var1");
		offerPageObjects.createSecondVariable("sel_var2");
		offerPageObjects.MapVariableFilterName("sel_var1");
		offerPageObjects.clickMapVariableFirstVariable();
		offerPageObjects.clickMapVariableCancelButton();
		try{
			jswait.waitUntil("//h3[contains(.,'Variables used:')]/following::label[contains(.,'sel_var1')]");
			Assert.assertTrue(false, "variable selected after cancel");
		}catch(Exception e) {
			
		}
	}
	@Then("^verify label message after variable selection$")
	public void verifyLabelAfterSelectingDynamicVariables() throws Throwable {
		offerPageObjects.clickMapVariableIcon();
		jswait.waitUntil("//label[text()='(0 variable selected)']");
		offerPageObjects.MapVariableFilterName("sel_var1");
		offerPageObjects.clickMapVariableFirstVariable();
		jswait.waitUntil("//label[text()='(1 variable selected)']");
	}
	@Then("^verify adding multiple dynamic variables$")
	public void verifyAddingMultipleDynamicVariables() throws Throwable {
		offerPageObjects.clickMapVariableOkButton();
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.MapVariableFilterName("sel_var2");
		offerPageObjects.clickMapVariableFirstVariable();
		offerPageObjects.clickMapVariableOkButton();
		jswait.waitUntil("//h3[contains(.,'Variables used:')]/following::label[contains(.,'sel_var1')]");
		jswait.waitUntil("//h3[contains(.,'Variables used:')]/following::label[contains(.,'sel_var2')]");
	}
	@Then("^verify editing added variable$")
	public void verifyEditingDynamicVariables() throws Throwable {
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.MapVariableFilterName("sel_var1");
		offerPageObjects.clickAddNewVariableEditButton();
		offerPageObjects.enterAddVariableDefault("66545675456456654645");
		offerPageObjects.clickAddNewVariableSaveButton();
		offerPageObjects.MapVariableFilterName("sel_var1");
		jswait.waitUntil("//data-table-cell[contains(.,'66545675456456654645')]");
	}
	@Then("^verify deleting added variable$")
	public void verifyDeletingDynamicVariables() throws Throwable {
		offerPageObjects.clickAddVariableDeleteButton();
		offerPageObjects.MapVariableFilterName("sel_var2");
		offerPageObjects.clickAddVariableDeleteButton();
		offerPageObjects.MapVariableFilterName("sel_var2");
		try {
			offerPageObjects.clickAddVariableDeleteButton();
			Assert.assertTrue(false, "variable exists after deletion");
		}catch(Exception e) {
			
		}
		
	}
	@Then("^verify cancelling newly added variable$")
	public void verifyCancellingNeDynamicVariables() throws Throwable {
		proceedToCreativeTab();
		offerPageObjects.selectCreativeLanguageEnglish();
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.clickAddNewVariableButton();
		offerPageObjects.enterFirstDynamicVariableDetails("sel_var");
		offerPageObjects.clickAddNewVariableCancelButton();
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.MapVariableFilterName("sel_var");
		try {
			offerPageObjects.clickAddVariableDeleteButton();
			Assert.assertTrue(false, "variable exists after cancel button");
		}catch(Exception e) {
			
		}
	}
	@Then("^verify cross site scripting for filtering offers$")
	public void verifyCrossSiteScriptingForOfferFilter() throws Throwable {
		commonObjects.filterName("<script>alert(document.cookies)</script>");
		try {
			commonObjects.clickOptionsIcon();
			Assert.assertTrue(false, "Error with cross site scripting");
		}catch(Exception e) {
			
		}
	}
	@Then("^verify response box for creatives$")
	public void verify_response_box_for_creatives() throws Throwable {
		proceedToCreativeTab();
	offerPageObjects.enterCreativeTabDetails(eh);
	offerPageObjects.clickAddCreativeButton();
	offerPageObjects.enterSecondCreativeTabDetails(eh);
	offerPageObjects.clickProceedButton();
	offerPageObjects.enterTrackTabDetails(eh);
	offerPageObjects.clickProceedButton();
	offerPageObjects.clickRewardAddButton();
	String responseXpath = "//response-message";
	jswait.waitUntil(responseXpath);
	List<WebElement> responseBox = driver.findElements(By.xpath(responseXpath));
	Assert.assertTrue(responseBox.size() == 2, "response message box should be shown for each creative");
	driver.findElement(By.xpath("//h4[contains(.,'Add fulfillment response in English')]"));
	driver.findElement(By.xpath("//h4[contains(.,'Add fulfillment response in Spanish')]"));
	List<WebElement> responseMessages = driver.findElements(By.xpath("//label[contains(.,'Response on success')]"));
	Assert.assertTrue(responseMessages.size() == 2, "response message success should be shown for each creative");
	responseMessages = driver.findElements(By.xpath("//label[contains(.,'Response on Failure')]"));
	Assert.assertTrue(responseMessages.size() == 2, "response message Failure should be shown for each creative");
	}
	@Then("^verify set as default checkbox with multiple track sources$")
	public void verifySetAsDefaultForTrackSources() throws Throwable {
		proceedToTrackTab();
		offerPageObjects.clickAddTrackSourceButton();
		offerPageObjects.clickAddTrackSourceButton();
		List<WebElement> setAsDefault = driver.findElements(By.xpath("//paper-item[contains(.,'Set as default')]"));
		Assert.assertTrue(setAsDefault.size() == 3, "set as default should be shown for each track source");
	}
	@Then("^verify selecting set as default check box for multiple track sources$")
	public void verifySetAsDefaultForMultipleTrackSources() throws Throwable {
		proceedToTrackTab();
		offerPageObjects.clickAddTrackSourceButton();
		offerPageObjects.clickAddTrackSourceButton();
		List<WebElement> setAsDefault = driver.findElements(By.xpath("//paper-item[contains(.,'Set as default')]"));
		Assert.assertTrue(setAsDefault.size() == 3, "set as default should be shown for each track source");
		List<WebElement> deselectedCheck = driver.findElements(By.xpath("//paper-item[contains(.,'Set as default')]/../../div/div/div[contains(@class,'hidden')]"));
		Assert.assertTrue(deselectedCheck.size() == 2, "more than one track seleced as default");
		offerPageObjects.clickSetAsDefaultSecondTrack();
		Assert.assertTrue(deselectedCheck.size() == 2, "more than one track seleced as default");
		
	}
	@Then("^create new reward type$")
	public void createNewRewardType() throws Throwable {
		rewardTypePage.clickCreateNewRewardTypeButton();
		rewardTypePage.enterCreateRewardName("Selenium_reward");
		rewardTypePage.enterCreateRewardDescription("desc_for reward created using sekenium");
		rewardTypePage.selectFirstCreateRewardFlowClass();
		rewardTypePage.clickCreateRewardSaveButton();
		commonObjects.filterName("Selenium_reward");
		rewardTypePage.expandReward("Selenium_reward");
		rewardTypePage.createRewardParameters("Text", "text", "TEXT","1");
		rewardTypePage.createRewardParameters("Number", "number", "NUMBER","2");
		rewardTypePage.createRewardParameters("Single Select", "singleSelect", "SINGLE_SELECT","3");
		Thread.sleep(2000);
	}
	@Then("^verify created reward type$")
	public void verifyCreatedRewardParameters() throws Throwable {
		jswait.waitUntil(".//*[@id='rewardParamGrid']//data-table-cell[contains(.,'Text')]/../..//data-table-cell[3][contains(.,'Text')]/../..//data-table-cell[4][contains(.,'Yes')]/../..//data-table-cell[5][contains(.,'Yes')]/../..//data-table-cell[6][contains(.,'No')]/../..//data-table-cell[7][contains(.,'Yes')]/../..//data-table-cell[8][contains(.,'1')]/../..//data-table-cell[9][contains(.,'defaultValue')]");
		jswait.waitUntil(".//*[@id='rewardParamGrid']//data-table-cell[contains(.,'Number')]/../..//data-table-cell[3][contains(.,'Number')]/../..//data-table-cell[4][contains(.,'Yes')]/../..//data-table-cell[5][contains(.,'Yes')]/../..//data-table-cell[6][contains(.,'No')]/../..//data-table-cell[7][contains(.,'No')]/../..//data-table-cell[8][contains(.,'2')]/../..//data-table-cell[9][contains(.,'defaultValue')]");
		jswait.waitUntil(".//*[@id='rewardParamGrid']//data-table-cell[contains(.,'Single Select')]/../..//data-table-cell[3][contains(.,'Single Select')]/../..//data-table-cell[4][contains(.,'No')]/../..//data-table-cell[5][contains(.,'Yes')]/../..//data-table-cell[6][contains(.,'No')]/../..//data-table-cell[7][contains(.,'No')]/../..//data-table-cell[8][contains(.,'3')]/../..//data-table-cell[9][contains(.,'defaultValue')]");
	}
	@Then("^edit created reward type$")
	public void editCreatedReward() throws Throwable {
		rewardTypePage.editReward("Selenium_reward","Edited191817");
		commonObjects.filterName("Edited191817");
	}
	@Then("^delete created reward type$")
	public void deleteCreatedReward() throws Throwable {
		rewardTypePage.deleteReward("Edited191817");
		try {
			Exception e = new Exception("Reward not deleted successfully");
			commonObjects.filterName("Edited191817");
			rewardTypePage.expandReward("Edited191817");
			throw e;
		}catch(Exception e) {
			
		}
	}
	@Then("^edit reward parameter$")
	public void editRewardParameters() throws Throwable {
		rewardTypePage.editFirstParameter();
		jswait.waitUntil(".//*[@id='rewardParamGrid']//data-table-cell[contains(.,'Edited616263')]/../..//data-table-cell[3][contains(.,'Text')]/../..//data-table-cell[4][contains(.,'Yes')]/../..//data-table-cell[5][contains(.,'Yes')]/../..//data-table-cell[6][contains(.,'No')]/../..//data-table-cell[7][contains(.,'Yes')]/../..//data-table-cell[8][contains(.,'1')]/../..//data-table-cell[9][contains(.,'defaultValue')]");
	}
	@Then("^delete reward parameter$")
	public void deleteRewardParameters() throws Throwable {
		rewardTypePage.deleteFirstParameter();
		rewardTypePage.deleteFirstParameter();
		rewardTypePage.deleteFirstParameter();
	}

//	@Then("^create new reward type$")
//	public void createNewRewardType() throws Throwable {
//		rewardTypePage.clickCreateNewRewardTypeButton();
//		rewardTypePage.enterCreateRewardName("Selenium_reward");
//		rewardTypePage.enterCreateRewardDescription("desc_for reward created using sekenium");
//		rewardTypePage.selectFirstCreateRewardFlowClass();
//		rewardTypePage.clickCreateRewardSaveButton();
//		commonObjects.filterName("Selenium_reward");
//		rewardTypePage.expandReward("Selenium_reward");
//		rewardTypePage.createRewardParameters("Text", "text", "TEXT");
//		Thread.sleep(2000);
//	}
//	@Then("^create alert$")
//	public void createAlert() throws Throwable {
//		JavaScriptExecutor je = new JavaScriptExecutor();
//		je.createAlert();
//	}



	@Then("^verify delete added variable$")
	public void verifydeleteDynamicVariables() throws Throwable {
		proceedToCreativeTab();
		offerPageObjects.selectCreativeLanguageEnglish();
		offerPageObjects.clickMapVariableIcon();
		offerPageObjects.createFirstVariable("sel_test");
		Thread.sleep(3000);
		offerPageObjects.MapVariableFilterName("sel_test");
		Thread.sleep(3000);
		
		offerPageObjects.clickAddVariableDeleteButton();
		Thread.sleep(3000);
		offerPageObjects.MapVariableFilterName("sel_test");
//		offerPageObjects.clickMapVariableFirstVariable();
//		offerPageObjects.clickMapVariableCancelButton();
		try{
			jswait.waitUntil("//h3[contains(.,'Variables used:')]/following::label[contains(.,'sel_test')]");
			Assert.assertTrue(false, "variable selected after cancel");
		}catch(Exception e) {
			
		}
		}



	@Then("^verify recharge offer from sheet \"([^\"]*)\"$")
	public void verifyrechargeOffer(String sheet) throws Throwable {
		eh.setExcelFile("offerInputData", sheet);
		String offerName = (String) eh.getCell(1, 0);
		commonObjects.filterName(offerName);
		
		String name=driver.findElement(By.xpath(".//*[@id='offerGrid']//data-table-cell[contains(.,'Recharge')]")).getText();
//		commonObjects.clickOptionsIcon();
//		commonObjects.clickDeleteOption();
//		offerPageObjects.clickOfferDeleteConfirmYesButton();
//		commonObjects.filterName(offerName);
		try {
			Assert.assertEquals("Recharge", name, "passed");
		}catch(Exception e) {
			
		}
	}









	}




