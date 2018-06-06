package pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class SegmentAnalysisObjects extends Init {
	
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public SegmentAnalysisObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id='sym1' and @icon='app-primary:segments']")
	private WebElement exploreSegments;
	@FindBy(xpath="//label[text()='Analytics']/..")
	private WebElement analytics;
	@FindBy(xpath=".//vaadin-grid-table-cell//vaadin-grid-cell-content")
	private WebElement segmentAnalysis;
	@FindBy(xpath=".//paper-tab//div[contains(.,'Clusters')]")
	private WebElement clustersTab;
	
	
	
	
	public void navigateToAnalytics() throws InterruptedException {
		jswait.loadClick(analytics);
	}
	public void clickExploreSegmentsOption() throws InterruptedException{
		jswait.loadClick(exploreSegments);
	}
	public void clickSegmentAnalysis() throws InterruptedException {
		jswait.loadClick(segmentAnalysis);
		
	}
	public void verifyClustersTab() throws InterruptedException {
		assertTrue(clustersTab.isDisplayed());
		
	}
	
	
}
