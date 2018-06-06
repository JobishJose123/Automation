package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import cucumber.api.java.en.Then;
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
	
	@Then("^verify cluster tab$")
	public void verifyClusterTab() throws InterruptedException {
		
		segmentObjects.verifyClustersTab();
		
	}
	
	
	
}
