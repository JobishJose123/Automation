package stepDefinitions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.TargetConditionObjects;
import pageObjetcs.WorkApprovalObjects;

public class workApprovalflow extends Init {
	final String BASE_LIST = "l";

	JSWaiter jswait = new JSWaiter();

	public ExcelHelper eM = new ExcelHelper();
	public ExcelHelper eh = new ExcelHelper();
	CampaignObjects campaignObjects = new CampaignObjects();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	LoginPageObjects loginPage = new LoginPageObjects();
	CommonObjects commonObjects = new CommonObjects();
	WorkApprovalObjects approvalPageObjects = new WorkApprovalObjects();
	TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	public WebDriverWait wait = new WebDriverWait(driver, 8);

	public workApprovalflow() {
		PageFactory.initElements(driver, this);
	}

	
	@Then("^navigate to configuration$")
	public void navigateToAnalytics() throws InterruptedException {
		approvalPageObjects.navigateToConfiguration();
		Thread.sleep(3000);
	}
	
	@Then("^navigate to Offer Prioritization Logic$")
	public void navigate_to_Offer_Prioritization_Logic() throws Throwable {
		approvalPageObjects.navigateToOfferLogic();
	}
	
	@Then("^create new custom logic \"([^\"]*)\"$")
	public void create_new_custom_logic(String arg1) throws Throwable {
		approvalPageObjects.creatNewlogic(arg1);
	}

	@Then("^click approval rules option$")
	public void clickApprovalRulesOption() throws InterruptedException {

		approvalPageObjects.clickApprovalRulesOption();
		Thread.sleep(3000);
	}

	@Then("^create new approval rule from sheet \"([^\"]*)\"$")
	public void createNewApprovalRule(String sheet) throws Throwable {

		approvalPageObjects.createNewApprovalRule(sheet);
	}

	@Then("^create new approval rule from sheet \"([^\"]*)\" with two approvers$")
	public void createNewApprovalRuleWithTwoApprovers(String sheet) throws Throwable {

		approvalPageObjects.createApprovalRuleDetailsFromSheetWithTwoApprovers(sheet);
	}

	@Then("^create new approval rule from sheet campaignonly \"([^\"]*)\"$")
	public void createNewApprovalRulecampaignonly(String sheet) throws Throwable {

		approvalPageObjects.createNewApprovalRulecampaignonly(sheet);
	}

	@Then("^create new approval rule from sheet broadcastonly \"([^\"]*)\"$")
	public void createNewApprovalRulebroadcastonly(String sheet) throws Throwable {

		approvalPageObjects.createNewApprovalRulebroadcastonly(sheet);
	}

	@Then("^editApprovalRuleDetailsFromSheet \"([^\"]*)\"$")
	public void editApprovalRuleDetailsFromSheet(String sheet) throws Throwable {

		approvalPageObjects.editApprovalRuleDetailsFromSheet(sheet);
	}

	@Then("^deleteApprovalRuleDetailsFromSheet \"([^\"]*)\"$")
	public void deleteApprovalRuleDetailsFromSheet(String sheet) throws Throwable {

		approvalPageObjects.deleteApprovalRuleDetailsFromSheet(sheet);
	}

	@Then("^default ApprovalRule edit and delete$")
	public void deleteApprovalRuleDefault() throws Throwable {

		approvalPageObjects.deleteApprovalRuleDefault();
	}

	@Then("^deleteApprovalRulecheckFromSheet \"([^\"]*)\"$")
	public void deleteApprovalRulecheck(String sheet) throws Throwable {

		approvalPageObjects.verifydeletecheckbox(sheet);
	}

	@Then("^check the Approval campaign and BC activation checkbox \"([^\"]*)\"$")
	public void createNewApprovalRulecheckboxverify(String sheet) throws Throwable {

		approvalPageObjects.createNewApprovalRulecheckboxverify(sheet);
	}

	@Then("^create new approval multiple rule from sheet \"([^\"]*)\"$")
	public void createNewApprovalmultipleRuleverify(String sheet) throws Throwable {

		approvalPageObjects.createNewApprovalRule_multiplerule_verify(sheet);
	}

	@Then("^approve campaign by selenium user$")
	public void approvecampaignbyseleniumuser() throws Throwable {

		approvalPageObjects.campaignaproveseleniumuser();
	}

	@Then("^Request for bc approval$")
	public void Requestforapprovebc() throws Throwable {
		approvalPageObjects.requestBCaproveseleniumuser();

	}

	@Then("^approve Broadcast by selenium user$")
	public void approvebroadcastbyseleniumuser() throws Throwable {

		approvalPageObjects.BCAprovalbyseleniumuser();
	}

	@Then("^approve Broadcast by selenium user without notification navigation$")
	public void BCAprovalbyseleniumuserwithoutnotificationclick() throws Throwable {

		approvalPageObjects.BCAprovalbyseleniumuserwithoutnotificationclick();
	}

	@Then("^edit campaign by selenium user$")
	public void editcampaignbyseleniumuser() throws Throwable {

		approvalPageObjects.BCeditbyseleniumuser();
	}

	@Then("^naigate to \"([^\"]*)\" campaign show history$")
	public void verify_campaign_show_history(String sheet) throws Throwable {

		approvalPageObjects.verify_campaign_show_history(sheet);
	}

	@Then("^naigate to \"([^\"]*)\" campaign show historyapprove$")
	public void verify_campaign_show_historyapprove(String sheet) throws Throwable {

		approvalPageObjects.verify_campaign_show_historyapprove(sheet);
	}

	@Then("^verify campaign status waiting for approval from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void isWaitingForApprovalStatusDisplayed(String sheet, String fileName) throws Throwable {
		eM.setExcelFile(fileName, sheet);	
		String campaignName=(String) eM.getCell(1, 0);
		System.out.println("campaignName is :++++++++++++++++"  +campaignName);
		Thread.holdsLock(2000);
		approvalPageObjects.isWaitingForApprovalStatusDisplayed((String) eM.getCell(1, 0));
	}
	
	@Then("^verify campaign status rejected from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void isRejectedStatusDisplayed(String sheet, String fileName) throws Throwable {
		eM.setExcelFile(fileName, sheet);
		approvalPageObjects.isRejectedStatusDisplayed((String) eM.getCell(1, 0));
	}
	
	@Then("^verify campaign status approved from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void isApprovedStatusDisplayed(String sheet, String fileName) throws Throwable {
		eM.setExcelFile(fileName, sheet);
		approvalPageObjects.isApprovedStatusDisplayed((String) eM.getCell(1, 0));
	}

	@Then("^verify approve button displayed$")
	public void isApproveButtonDisplayed() throws Throwable {
		approvalPageObjects.isApprovedButtonDisplayed();
	}

	@Then("^verify approve and activate button displayed$")
	public void isApproveAndActivateButtonDisplayed() throws Throwable {
		approvalPageObjects.isApprovedAndActivateButtonDisplayed();
	}
	
	@Then("^click on review button$")
	public void clickOnCampaignReviewButton() throws Throwable {
		approvalPageObjects.clickOnCampaignReviewButton();
	}
	
	@Then("^click on approve campaign$")
	public void clickOnCampaignApproveButton() throws Throwable {
		approvalPageObjects.approveCampaign();
	}
	
	@Then("^click on reject button$")
	public void clickOnRejectButton() throws Throwable {
		approvalPageObjects.clickOnRejectButton();
	}
	
	@Then("^verify Reject message panel displayed$")
	public void verifyRejectMessagePanelDisplayed() throws Throwable {
		approvalPageObjects.verifyRejectMessagePanelDisplayed();
	}
	
	@Then("^enter reject message \"([^\"]*)\"$")
	public void enterRejectMessage(String message) throws Throwable {
		approvalPageObjects.enterRejectMessage(message);
	}
	
	@Then("verify rejected message of campaign from the sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void verifyRejectMessage(String sheet, String fileName) throws Throwable {
		
		eM.setExcelFile(fileName, sheet);
		String campaignName = (String) eM.getCell(1, 0);
		approvalPageObjects.verifyRejectMessage(campaignName);
	}
	
	@Then("verify approved message of campaign from the sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void verifyApprovedMessage(String sheet, String fileName) throws Throwable {
		
		eM.setExcelFile(fileName, sheet);
		String campaignName = (String) eM.getCell(1, 0);
		approvalPageObjects.verifyApprovedMessage(campaignName);
	}
	
	@Then("verify review page$")
	public void verifyCampaignReviewPage() throws Throwable {
		approvalPageObjects.verifyCampaignReviewPage();
	}
	
	@Then("delete the campaign of sheet \"([^\"]*)\" from approval rule of sheet \"([^\"]*)\"$")
	public void deleteCampaignFromAprovalRule(String sheetForcampaign, String sheetForApprovalRule) throws Throwable {
		eM.setExcelFile("campaignCategoryInputData", sheetForcampaign);
		String campaignName = (String) eM.getCell(1, 0);
		ExcelHelper excelHelper = new ExcelHelper();
		excelHelper.setExcelFile("appRuleInputData", sheetForApprovalRule);
		String appRule = (String) excelHelper.getCell(1, 0);
		approvalPageObjects.deleteCampaignFromAprovalRule(campaignName, appRule);
	}
	
	@Then("^verify broadcast status render scheduled from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void isRenderScheduledStatusDisplayed(String sheet, String fileName) throws Throwable {
		eM.setExcelFile(fileName, sheet);
		approvalPageObjects.isRenderScheduledStatusDisplayed((String) eM.getCell(1, 0));
	}
	@Then("^verify show history and review options from sheet \"([^\"]*)\"$")
	public void verify_historyandreview(String sheet) throws Throwable {
		approvalPageObjects.verifyHistoryandReview(sheet);
	}
	@Then("^verify bc status changed to waitinf for approval from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void verify_bc_status_changed_to_waitinf_for_approval_from_sheet_of_file(String bcsheet, String bcExcelFile) throws Throwable {
	   eh.setExcelFile(bcExcelFile, bcsheet);
	   String bcName = (String) eh.getCell(1, 0);
	   approvalPageObjects.verifyBCStatusWaitingForApproval(bcName);
	}

}
