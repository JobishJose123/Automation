package stepDefinitions;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.RandomNameGenerator;
import cucumber.api.java.en.Then;
import pageObjetcs.ThreeSixtyDegreeCustomerDataPageObject;

public class CustomerDataSteps extends Init {
	ThreeSixtyDegreeCustomerDataPageObject  threeSixtyDegreeCustomerDataPageObject = new ThreeSixtyDegreeCustomerDataPageObject();
	public ExcelHelper excelHelper = new ExcelHelper(); 

	
	@Then("^click on usage metrics$")
    public void clickUsageMetricsButton() throws Throwable
    {
		threeSixtyDegreeCustomerDataPageObject.clickUsageMetricsButton();
    }
	
	@Then("^click on create new usage metrics$")
    public void clickCreateUsageMetricsButton() throws Throwable
    {
		threeSixtyDegreeCustomerDataPageObject.clickCreateUsageMetricsButton();
    }
	
	@Then("^enter new usage metric details from sheet \"([^\"]*)\" of file \"([^\"]*)\" and save$")
    public void enterdetails(String sheet, String fileName) throws Throwable
    {
		excelHelper.setExcelFile(fileName, sheet);
		threeSixtyDegreeCustomerDataPageObject.enterMetricsName(RandomNameGenerator.getRandomName((String)excelHelper.getCell(1, 0)));
		threeSixtyDegreeCustomerDataPageObject.enterMetricsDiscription((String)excelHelper.getCell(2, 0));
		threeSixtyDegreeCustomerDataPageObject.clickSaveButton();
    }
}
