package stepDefinitions;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.DataFusionEngine;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.TargetConditionObjects;
import pageObjetcs.WorkApprovalObjects;

public class DataFusionEngineSteps extends Init {
	
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
	DataFusionEngine DataFusionEngineObjects = new DataFusionEngine();
	public WebDriverWait wait = new WebDriverWait(driver, 8);

	public DataFusionEngineSteps() {
		PageFactory.initElements(driver, this);
	}
	
	@Then("^click Data Fusion Engine$")
	public void ClickDFEbutton() throws InterruptedException {
		DataFusionEngineObjects.ClickDFEbutton();
		Thread.sleep(3000);
	}
	@Then("^create a DK Job from sheet \"([^\"]*)\" and verify \"([^\"]*)\" in ouput$")
	public void createDKJob(String sheet, String output) throws Exception {
		DataFusionEngineObjects.ClickAddJobbutton();
		Thread.sleep(3000);
		//DataFusionEngineObjects.ClickAddJobbutton();
		eh.setExcelFile("DKInput", sheet);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eh.setCell(1, 0, name);
		String JobName = (String) eh.getCell(1, 0);
		String fileinput = (String) eh.getCell(1, 3);
		String fileoutput = (String) eh.getCell(1, 4);
		String regex = (String) eh.getCell(1, 5);
		DataFusionEngineObjects.Jobname(JobName);
		DataFusionEngineObjects.Selctconenctor();
		DataFusionEngineObjects.Hostname();
		DataFusionEngineObjects.SelectHostname();
		DataFusionEngineObjects.FileInput(fileinput);
		DataFusionEngineObjects.FileOutput(fileoutput);
		DataFusionEngineObjects.FileRegex(regex);
		DataFusionEngineObjects.JobSave(output);
	}
	@Then("^copy the job from sheet \"([^\"]*)\"$")
	public void ClickCopy(String sheet) throws IOException, Exception {
		eh.setExcelFile("DKInput", sheet);
		String JobName = (String) eh.getCell(1, 0);
		DataFusionEngineObjects.copy(JobName);
		Thread.sleep(3000);
		//String partnerName= DataFusionEngineObjects.Hostname().getText();
			
	}
	
	@Then("^delete the job from sheet \"([^\"]*)\"$")
	public void ClickDelete(String sheet) throws IOException, Exception {
		eh.setExcelFile("DKInput", sheet);
		String JobName = (String) eh.getCell(1, 0);
		DataFusionEngineObjects.delete(JobName);
		Thread.sleep(3000);
		//String partnerName= DataFusionEngineObjects.Hostname().getText();
			
	}
	@Then("^edit the job from sheet \"([^\"]*)\"$")
	public void ClickEdit(String sheet) throws IOException, Exception {
		eh.setExcelFile("DKInput", sheet);
		String JobName = (String) eh.getCell(1, 0);
		DataFusionEngineObjects.edit(JobName);
		Thread.sleep(3000);
		//String partnerName= DataFusionEngineObjects.Hostname().getText();
			
	}
	@Then("^Open DK Job from sheet \"([^\"]*)\" and verify \"([^\"]*)\" in ouput$")
	public void VerifyDKJob(String sheet, String output) throws Exception {
		//DataFusionEngineObjects.ClickAddJobbutton();
		Thread.sleep(2000);
		//DataFusionEngineObjects.ClickAddJobbutton();
		eh.setExcelFile("DKInput", sheet);
		//Random rn = new Random();
		//int n = rn.nextInt(5000) + 1;
		//String name = (String) eh.getCell(1, 0);
		//name = name.replaceAll("[0-9]", "") + n;
		//eh.setCell(1, 0, name);
		String JobName = (String) eh.getCell(1, 0);
		commonObjects.filterName(JobName);
		commonObjects.clickOptionsIcon();
		DataFusionEngineObjects.clickEditOption();
		Thread.sleep(2000);
		//DataFusionEngineObjects.edit(JobName);
		//String fileinput = (String) eh.getCell(1, 3);
		//String fileoutput = (String) eh.getCell(1, 4);
		//String regex = (String) eh.getCell(1, 5);
		//DataFusionEngineObjects.Jobname(JobName);
		//DataFusionEngineObjects.Selctconenctor();
		//DataFusionEngineObjects.Hostname();
		//DataFusionEngineObjects.SelectHostname();
		//DataFusionEngineObjects.FileInput(fileinput);
		//DataFusionEngineObjects.FileOutput(fileoutput);
		//DataFusionEngineObjects.FileRegex(regex);
		DataFusionEngineObjects.JobSave(output);
	}
}