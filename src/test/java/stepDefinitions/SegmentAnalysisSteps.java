package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.SegmentAnalysisObjects;

public class SegmentAnalysisSteps extends Init {
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	SegmentAnalysisObjects segmentObjects=new SegmentAnalysisObjects();
	
	public SegmentAnalysisSteps() {
		PageFactory.initElements(driver, this);
	}

	@Then("^navigate to analytics$")
	public void navigateToAnalytics() throws InterruptedException {
		segmentObjects.navigateToAnalytics();
		Thread.sleep(3000);
	}
	
	@Then("^navigate to explore segments$")
	public void navigateToExploreSegments() throws InterruptedException{
		
		segmentObjects.clickExploreSegmentsOption();
	}
	
	@Then("^choose a segment analysis$")
	public void chooseASegmentanalysis() throws InterruptedException{
		
		segmentObjects.clickSegmentAnalysis();
	}
	@Then("^choose a segment analysis with clusters$")
	public void chooseASegmentanalysisWithClusters() throws InterruptedException{
		Thread.sleep(5000);
		segmentObjects.clickSegmentAnalysisWithClusters();
	}
	
	@Then("^verify cluster tab$")
	public void verifyClusterTab() throws InterruptedException {
		segmentObjects.verifyClustersTab();	
	}
	
	@Then("^verify cluster option$")
	public void verifyClusterOption() throws InterruptedException {
		Thread.sleep(2000);
		segmentObjects.verifyClustersOption();	
	}
	
	@Then("^click on cluster tab$")
	public void clickClusterTab() throws InterruptedException {
		
		segmentObjects.clickClustersTab();	
	}
	
	@Then("^click on cluster option$")
	public void clickClusterOption() throws InterruptedException {
		
		segmentObjects.clickClustersOption();	
	}
	
	@Then("^click on options icon$")
	public void clickOptionsIcon() throws InterruptedException {
		
		segmentObjects.clickOptionsIcon();	
	}
	
	@Then("^add KPI for segment analysis$")
	public void addNewKPI() throws InterruptedException {
		
		segmentObjects.addNewKPI();	
	}
	
	@Then("^click on create new cluster button$")
	public void clickCreateNewClusterutton() throws InterruptedException {
		
		segmentObjects.clickCreateNewClusterutton();	
	}
	
	@Then("^enter view values for cluster$")
	public void enterViewValuesForClusters() throws InterruptedException {
		
		segmentObjects.enterViewValuesForClusters();	
	}
	
	@Then("^select radio button for view1$")
	public void selectRadioButtonForViews() throws InterruptedException {
		
		segmentObjects.selectRadioButtonForViews();	
		
	}
	
	@Then("^select radio button for view2$")
	public void selectRadioButtonForViews2() throws InterruptedException {
		
		segmentObjects.selectRadioButtonForViews2();	
		
	}
	
	@Then("^verify cluster failed$")
	public void verifyclusterfailedstatus() throws InterruptedException {
		
		segmentObjects.verifyclusterfailedstatus();	
		
	}
	
	
	@Then("^click save cluster button$")
	public void clickSaveClusterButton() throws InterruptedException {
		
		segmentObjects.clickSaveClusterButton();	
	}
	
	@Then("^toast messagewhile saving cluster with only view1 values$")
	public void verifyToastSaveClusterWithView1() throws InterruptedException {
		
		segmentObjects.verifyToastSaveClusterWithView1();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
