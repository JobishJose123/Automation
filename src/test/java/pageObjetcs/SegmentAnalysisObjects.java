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
	CommonObjects commonObjects = new CommonObjects();
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public SegmentAnalysisObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id='sym1' and @icon='app-primary:segments']")
	private WebElement exploreSegments;
	@FindBy(xpath="//label[text()='Analytics']/..")
	private WebElement analytics;
	@FindBy(xpath=".//vaadin-grid-table-cell[2]//vaadin-grid-cell-content")
	private WebElement segmentAnalysis;
	@FindBy(xpath = "//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private List <WebElement> optionsIconList;
	@FindBy(xpath=".//paper-tab//div[contains(.,'Clusters')]")
	private WebElement clustersTab;
	@FindBy(xpath=".//paper-item[contains(.,'Clusters')]")
	private WebElement clustersOption;
	@FindBy(xpath=".//paper-button[contains(.,'Create Cluster')]")
	private WebElement createClusterButton;
	@FindBy(xpath=".//label[contains(.,'Name for View 1')]/../input")
	private WebElement view1;
	@FindBy(xpath=".//label[contains(.,'Name for View 2')]/../input")
	private WebElement view2;
	@FindBy(xpath=".//paper-radio-button[@name='view1']//div[@id='offRadio']")
	private List <WebElement> view1RadioButton1;
	@FindBy(xpath=".//paper-button[contains(.,'Save')]")
	private WebElement saveClusterButton;
	@FindBy(xpath=".//span[contains(.,'A minimum of one KPI must be selected for each view.')]")
	private WebElement toastSaveClusterWithView1;
	
	
	
	
	
	
	
	
	
	
	public void navigateToAnalytics() throws InterruptedException {
		jswait.loadClick(analytics);
	}
	public void clickExploreSegmentsOption() throws InterruptedException{
		jswait.loadClick(exploreSegments);
		Thread.sleep(3000);
	}
	public void clickSegmentAnalysis() throws InterruptedException {
		jswait.loadClick(segmentAnalysis);
		Thread.sleep(3000);
	
	}
	
	public void enterViewValuesForClusters() throws InterruptedException {
		jswait.loadSendKeys(view1, "Test_View1");
		Thread.sleep(2000);
		jswait.loadSendKeys(view2, "Test_View2");
	
	}
	
	public void selectRadioButtonForViews() throws InterruptedException {
		if(view1RadioButton1.size()>0) {
			for(WebElement button: view1RadioButton1) {
				jswait.loadClick(button);
				
			}
			
		}
		
	}
	
	
	
	
	
	public void clickSegmentAnalysisWithClusters() throws InterruptedException {
		
		if(optionsIconList.size()>0) {
			for(WebElement option: optionsIconList) {
				jswait.loadClick(option);
				Thread.sleep(2000);
				if(clustersOption.isDisplayed()==false) {
					continue;	
				}
				else {
					
					jswait.loadClick(clustersOption);
				    break; 
				}
			}
		}
	}
	public void clickSaveClusterButton() throws InterruptedException {
		jswait.loadClick(saveClusterButton);
		
	}
	
	public void clickClustersTab() throws InterruptedException {
		jswait.loadClick(clustersTab);
		
	}
	public void verifyClustersTab() throws InterruptedException {
		assertTrue(clustersTab.isDisplayed());
		
	}
	public void verifyClustersOption() throws InterruptedException {
		assertTrue(clustersOption.isDisplayed());
		
	}
	public void clickClustersOption() throws InterruptedException {
		jswait.loadClick(clustersOption);
		
	}
	public void clickCreateNewClusterutton() throws InterruptedException {
		jswait.loadClick(createClusterButton);
		
	}
	public void clickOptionsIcon() throws InterruptedException {
		commonObjects.clickOptionsIcon();
		
	}
	
	public void addNewKPI() throws InterruptedException {
		
		
	}
   public void verifyToastSaveClusterWithView1() throws InterruptedException {
		
	   assertTrue(toastSaveClusterWithView1.isDisplayed());
		
	}
	
	
	
	
}
