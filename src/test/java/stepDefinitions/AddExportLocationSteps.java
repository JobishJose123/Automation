package stepDefinitions;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.RandomNameGenerator;
import cucumber.api.java.en.Then;
import pageObjetcs.ExportCampaignLocationObjects;

public class AddExportLocationSteps extends Init {
	ExportCampaignLocationObjects  exportCampignLocationObject = new ExportCampaignLocationObjects();
	public ExcelHelper excelHelper = new ExcelHelper(); 
	
	@Then("^add new export location$")
    public void addNewExportLocation() throws Throwable
    {
		exportCampignLocationObject.clickAddExportLocationButton();
    }
	
	@Then("^enter export location from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void editLocationDetails(String sheet, String fileName) throws Throwable
	{
		excelHelper.setExcelFile(fileName, sheet);
		String location = RandomNameGenerator.getRandomName((String)excelHelper.getCell(1, 0));
		String url = (String)excelHelper.getCell(2, 0);
		String password = (String)excelHelper.getCell(3, 0);
		excelHelper.setCell(1, 0, location);
		exportCampignLocationObject.enterLocation(location);
		exportCampignLocationObject.enterURL(url);
		exportCampignLocationObject.enterPassword(password);
		exportCampignLocationObject.clickSaveButton();
	}
	
	@Then("^verify export location \"([^\"]*)\" from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
	public void verifyLocationDetails(String action, String sheet, String fileName) throws Throwable
	{
		excelHelper.setExcelFile(fileName, sheet);
		exportCampignLocationObject.verifyExportLocation(action, (String)excelHelper.getCell(1, 0));
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
	
	@Then("^click edit export location from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
    public void clickEditLocationDetails(String sheet, String fileName) throws Throwable
    {
		excelHelper.setExcelFile(fileName, sheet);
		exportCampignLocationObject.clickEditExportDetails((String)excelHelper.getCell(1, 0));
    }
	
	@Then("^delete export location from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
    public void clickDeleteLocationDetails(String sheet, String fileName) throws Throwable
    {
		excelHelper.setExcelFile(fileName, sheet);
		exportCampignLocationObject.deleteExportDetails((String)excelHelper.getCell(1, 0));
    }
	
    @Then("^select export location from sheet \"([^\"]*)\" of file \"([^\"]*)\" and click export$")
    public void selectExportLocationAndClickExport(String sheet, String fileName) throws Throwable
    {
    	Thread.sleep(4000);
    	excelHelper.setExcelFile(fileName,sheet);
 		String exportLocationName = (String) excelHelper.getCell(1, 0);
 		exportCampignLocationObject.selectCampaignTemplateForExporting(exportLocationName);;
 		exportCampignLocationObject.clickExportButton();
    }
    
    @Then("^click on notification bell$")
    public void clickNotificationBar() throws Throwable
    {
    	exportCampignLocationObject.clickNotificationBar();
    }
    
    @Then("^click on view all notifications$")
    public void clickViewAllNotifications() throws Throwable
    {
    	exportCampignLocationObject.clickViewAllNotifications();
    }
    
    @Then("^click proceed on notification from the sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
    public void clickOnProceedOnNotification(String sheet, String fileName) throws Throwable {
    	excelHelper.setExcelFile(fileName,sheet);
    	String notificationText = (String) excelHelper.getCell(1, 0);
    	exportCampignLocationObject.clickOnProceedOnNotification(notificationText);
    }
    
    @Then("^select a campaign category from sheet \"([^\"]*)\" of file \"([^\"]*)\"$")
    public void selectCampaignToWhereExported(String sheet, String fileName) throws Throwable {
    	excelHelper.setExcelFile(fileName,sheet);
    	String campaignToSelectedForExporting = (String) excelHelper.getCell(1, 0);
    	exportCampignLocationObject.selectCampaignToWhereExported(campaignToSelectedForExporting);
    }
    
    @Then("^click on import$")
    public void clickOnImport() throws Throwable
    {
    	exportCampignLocationObject.clickViewAllNotifications();
    }
}
