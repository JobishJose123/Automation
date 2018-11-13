package pageObjetcs;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	@FindBy(xpath = ".//*[@id='trigger']/paper-icon-button/iron-icon")
	private WebElement optionsIconList1;
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
	
	@FindBy(xpath="(.//paper-radio-button[@name='view2']//div[@id='offRadio'])[2]")
	private List <WebElement> view1RadioButton2;
	
	@FindBy(xpath="(.//paper-radio-button[@name='Exclude']//div[@id='offRadio'])[3]")
	private List <WebElement> view1RadioButton3;
	
	@FindBy(xpath=".//paper-button[contains(.,'Save')]")
	private WebElement saveClusterButton;
	@FindBy(xpath=".//span[contains(.,'A minimum of one KPI must be selected for each view.')]")
	private WebElement toastSaveClusterWithView1;
	
	
	@FindBy(xpath=".//*[@id='items']/vaadin-grid-table-row[1]/vaadin-grid-table-cell[4][contains(.,'Failed')]")
	private WebElement clusterfailedstatus;
	
	@FindBy(xpath=".//*[@title='Refresh']")
	private WebElement clusterRefresh;
	
	
	@FindBy(xpath="(//paper-button[contains(.,'Start New Analysis')])[1]")
	private WebElement createSegmentAnalysisbtn;
	
	@FindBy(xpath=".//*[@id='analysisForm']//paper-icon-button[2]")
	private WebElement createSegmentAnalysisList;
	
	
	
	
	@FindBy(xpath=".//*[@id='analysisForm']//label[contains(.,'Active Customer Base')]//..//input")
	private WebElement createSegmentAnalysisListinput;
	
	
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'selenium_list')]")
	private WebElement createSegmentAnalysisListselect;
	
	
	@FindBy(xpath=".//*[@id='router']//insight-analysis/paper-button[contains(.,'Add KPI')]")
	private WebElement createSegmentAnalysisKpibtn;
	
	
	
	@FindBy(xpath="(.//*[@id='topBar']//Span[contains(.,'Analysis')]//paper-icon-button[1])[1]")
	private WebElement createSegmentAnalysisname;
	
	
	@FindBy(xpath="(.//*[@id='topBar']//input)[1]")
	private WebElement createSegmentAnalysisnameinput;
	
	
	@FindBy(xpath=".//*[@id='kpiForm']//label[contains(.,'KPI Name')]//../input")
	private WebElement KpiName ;
	@FindBy(xpath=".//*[@id='kpiForm']//label[contains(.,'KPI Description')]//../input")
	private WebElement KpiDesc;
	@FindBy(xpath=".//*[@id='kpiForm']//label[contains(.,'Attribute Type')]//../input")
	private WebElement KpiAttributetype;
	@FindBy(xpath=".//*[@id='kpiForm']//label[contains(.,'Attribute Type')]//following::iron-icon[2]")
	private WebElement KpiAttributetypeclick;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'Customer Profile Info')]")
	private WebElement KpiAttributetypeselect ;
	@FindBy(xpath=".//*[@id='kpiForm']//label[contains(.,'Customer Insight')]//../input")
	private WebElement kpitype ;
	@FindBy(xpath=".//*[@id='kpiDialog']/div[2]/paper-button[contains(.,'Confirm')]")
	private WebElement KpiConfrimbtn;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'Age_q11')]")
	private WebElement kpitypeselect ;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'Balance_q11')]")
	private WebElement kpitypeselect2 ;
	@FindBy(xpath=".//*[@id='saveAnalysisModal']//label[contains(.,'Description')]//following::textarea")
	private WebElement SaveAnalysisDescinput ;
	@FindBy(xpath=".//*[@id='saveAnalysisModal']//label[contains(.,'Set Permission')]//following::input[1]")
	private WebElement SaveAnalysisSetPermission;
	@FindBy(xpath=".//*[@id='contentWrapper']/div/paper-menu/div/paper-item[contains(.,'selenium.flytxt@gmail.com')]")
	private WebElement userselect;
	@FindBy(xpath=".//*[@id='saveAnalysisModal']/paper-dialog/paper-button[contains(.,'Save Analysis')]")
	private WebElement SaveAnalysisBtn;
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Proceed')]")
	private WebElement Topproccedbtn ;
	@FindBy(xpath="(.//*[@id='items']//vaadin-grid-cell-content//div[1])[1]")
	private WebElement clustersname;
	@FindBy(xpath=".//*[@id='scrollable']//cluster-sunburst-chart")
	private WebElement clusterssunburstchart;
	@FindBy(xpath=".//*[@id='scrollable']//cluster-center-table")
	private WebElement clusterstableview;
	@FindBy(xpath="(.//vaadin-grid-table-body[@id='items']//paper-icon-button[@id='detailsButton'])[1]")
	private WebElement clusterdetailsicon;
	@FindBy(xpath=".//*[@id='item1']/div[1]/data-table-cell[1]/span[contains(.,'3')]/../../data-table-cell[2]/span[contains(.,'0.000')]/../../data-table-cell[3]/span[contains(.,'0.000')]/../../data-table-cell[4]/span[contains(.,'0.000')]/../../data-table-cell[5]/span[contains(.,'0.000')]/../../data-table-cell[6]/span[contains(.,'0.000')]")
	private WebElement clusterkpiExclusioncheck;
	@FindBy(xpath="//paper-button[contains(.,'Save Cluster')]")
	private WebElement saveclusterbtn;
	@FindBy(xpath=".//label[contains(.,'Cluster Name')]/../input")
	private WebElement saveclustername;
	@FindBy(xpath=".//paper-card[contains(.,'Saved Segments')]")
	private WebElement SavedSegments;
	@FindBy(xpath=".//*[@id='aHref']/div/div[contains(.,'Discovered Clusters')]")
	private WebElement DiscoveredClusters ;
	@FindBy(xpath=".//*[@id='item111']/div[1]/data-table-cell[1]/span[contains (.,'test selenium cluster')]")
	private WebElement discoverClusterCheck;
	@FindBy(xpath=".//hexagon-icon[1]/label[contains(.,'Customer Data')]//following::a[1]")
	private WebElement Customer360Data;
	@FindBy(xpath="//data-table-cell[contains(.,'test selenium cluster')]")
	private WebElement discoveredclusterscheck;
	@FindBy(xpath=".//*[@id='items']/vaadin-grid-table-row[1]/vaadin-grid-table-cell[2]//a")
	private WebElement segmentAnalysisnameclick;
	@FindBy(xpath=".//*[@id='tabsContent']//div[contains(.,'Clusters')]")
	private WebElement Clusterstab;
	@FindBy(xpath=".//div[contains(.,'test1/test2')]")
	private WebElement clusternamecheck;
	@FindBy(xpath=".//*[@id='scrollable']//cluster-sunburst-chart//following::span[contains(.,'A1')]//following::span[contains(.,'0')]//following::span[contains(.,'91')]")
	private WebElement combinationclusters;
	@FindBy(xpath=".//*[@id='kpiForm']//label[contains(.,'Metric')]//following::iron-icon[2]")
	private WebElement kpimetric;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'Usage Metrics')]")
	private WebElement kpimetricselect;
	@FindBy(xpath=".//*[@id='select']/div/paper-item[contains(.,'ARPU')]")
	private WebElement metricselect;
	@FindBy(xpath="(//label[contains(.,'Select')])//following::iron-icon[2]")
	private WebElement metrictoday;
	@FindBy(xpath=".//*[@id='contentWrapper']/div/paper-listbox//paper-item[contains(.,'today')]")
	private WebElement metrictodayselect;
	@FindBy(xpath=".//*[@id='createForm']/div[2]/div[2]/div[contains(.,'KPI1')]")
	private WebElement KPicheck1;
	@FindBy(xpath=".//*[@id='createForm']/div[2]/div[3]/div[contains(.,'KPI2')]")
	private WebElement KPicheck2;
	@FindBy(xpath=".//*[@id='createForm']/div[2]/div[4]/div[contains(.,'KPI3')]")
	private WebElement KPicheck3;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
	
	
	public void navigateToAnalytics() throws InterruptedException {
		jswait.loadClick(analytics);
	}
	
	
	public void navigateToSavedSegments() throws InterruptedException {
		jswait.loadClick(SavedSegments);
	}
	
	public void navigateTo360CustomerData() throws InterruptedException {
		jswait.loadClick(Customer360Data);
	}
	

	
	public void clickExploreSegmentsOption() throws InterruptedException{
		jswait.loadClick(exploreSegments);
		Thread.sleep(3000);
	}
	public void clickSegmentAnalysis() throws InterruptedException {
		jswait.loadClick(segmentAnalysis);
		Thread.sleep(3000);
	
	}
	
	public void createSegmentAnalysisbtn() throws InterruptedException {
		jswait.loadClick(createSegmentAnalysisbtn);
		Thread.sleep(3000);
	
	}
	
	
	
	public void createSegmentAnalysis() throws InterruptedException {
		jswait.loadClick(createSegmentAnalysisList);
		Thread.sleep(3000);
		jswait.loadSendKeys(createSegmentAnalysisListinput, "selenium_list");
		Thread.sleep(2000);
		jswait.loadClick(createSegmentAnalysisListselect);
		Thread.sleep(2000);
				Thread.sleep(2000);
		jswait.loadClick(createSegmentAnalysisname);
		Thread.sleep(2000);
			
		Random rn = new Random();
 		int  n = rn.nextInt(5000) + 1;
  		String name ="SegmentAnalysis";
  		name =  name.replaceAll("[0-9]", "")+n;
  		Thread.sleep(2000);
		jswait.loadSendKeys(createSegmentAnalysisnameinput,name);
				
		Thread.sleep(2000);
		addNew3KPI();
		
		Thread.sleep(2000);
		
		jswait.loadClick(Topproccedbtn);
		Thread.sleep(2000);
		jswait.loadSendKeys(SaveAnalysisDescinput,"test");
							
		Thread.sleep(2000);
		jswait.loadSendKeys(SaveAnalysisSetPermission,"selenium.flytxt@gmail.com");
		Thread.sleep(3000);
		jswait.loadClick(userselect);
		Thread.sleep(2000);
		jswait.loadClick(SaveAnalysisBtn);
		
		
		
		
	}
	
	public void addNew3KPI() throws InterruptedException {
		Thread.sleep(2000);
		int n=1;
		int flag=0;
		for(int i=0;i<2;i++) {
			Thread.sleep(2000);
			jswait.loadClick(createSegmentAnalysisKpibtn);
			Thread.sleep(2000);
			
			String name="KPI";
		jswait.loadSendKeys(KpiName, name+n);
		n=n+1;
		System.out.println(n);
		Thread.sleep(2000);
		jswait.loadSendKeys(KpiDesc, "testKpi");
		Thread.sleep(2000);
		jswait.loadSendKeys(KpiAttributetype, "Customer Profile Info");
		Thread.sleep(2000);
		jswait.loadClick(KpiAttributetypeclick);
		Thread.sleep(2000);
		jswait.loadSendKeys(kpitype, "Age_q11");
		
		if(flag==1) {
			jswait.loadSendKeys(kpitype, "Balance_q11");
			Thread.sleep(2000);
			jswait.loadClick(kpitypeselect2);
			Thread.sleep(2000);
			jswait.loadClick(KpiConfrimbtn);
		}else {
							
		Thread.sleep(2000);
		jswait.loadClick(kpitypeselect);
		Thread.sleep(2000);
		jswait.loadClick(KpiConfrimbtn);
		
		}
		//flag++;
		}
		
		Thread.sleep(2000);
		jswait.loadClick(createSegmentAnalysisKpibtn);
		Thread.sleep(2000);
		
		String name="KPI3";
		jswait.loadSendKeys(KpiName, name);
		Thread.sleep(2000);
		jswait.loadSendKeys(KpiDesc, "testKpi");
		Thread.sleep(2000);
		jswait.loadSendKeys(KpiAttributetype, "Usage Metrics");
		Thread.sleep(2000);
	
		jswait.loadClick(kpimetricselect);
		Thread.sleep(2000);
		jswait.loadClick(kpimetric);
		Thread.sleep(2000);
		jswait.loadClick(metricselect);
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		jswait.loadClick(metrictoday);
		Thread.sleep(2000);
		jswait.loadClick(metrictodayselect);
		jswait.loadClick(KpiConfrimbtn);
		
		
		
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
	
	
	public void selectRadioButtonForViews2() throws InterruptedException {
		if(view1RadioButton2.size()>0) {
			for(WebElement button: view1RadioButton2) {
				jswait.loadClick(button);
				
			}
			
		}
		
	}
	
	public void selectRadioButtonForViews3() throws InterruptedException {
		if(view1RadioButton2.size()>0) {
			for(WebElement button: view1RadioButton3) {
				jswait.loadClick(button);
				
			}
			
		}
		
	}
	
	
	public void filtersegment() throws InterruptedException {
		commonObjects.filterName("Segments");
		Thread.sleep(3000);
		commonObjects.clickOptionsIcon();
		Thread.sleep(2000);
		jswait.loadClick(clustersOption);
	
		
	
	}
	public void clustertabledetails() throws Exception {
		
		Thread.sleep(2000);
		jswait.loadClick(clustersname);
		Exception view=new Exception("The cluster table are not displayed");
		try {
		clusterssunburstchart.isDisplayed();
		Thread.sleep(2000);
		clusterstableview.isDisplayed();
			}
		catch(Exception e){
			 throw view;
		}
	
	}
	
	
	public void clusterkpicheck() throws Exception {
		
		Thread.sleep(2000);
		Exception view=new Exception("The KPI's are not displayed");
		try {
			Thread.sleep(2000);
			KPicheck1.isDisplayed();
			Thread.sleep(2000);
			KPicheck2.isDisplayed();
			Thread.sleep(2000);
			KPicheck3.isDisplayed();
		
		
			}
		catch(Exception e){
			 throw view;
		}
	
	}
	
	
	
public void clustertabledetailsandsave() throws Exception {
		
		Thread.sleep(2000);
		jswait.loadClick(clusterdetailsicon);
		Exception view=new Exception("Exclusion failed");
		try {
		
		Thread.sleep(2000);
		clusterkpiExclusioncheck.isDisplayed();
			}
		catch(Exception e){
			 throw view;
		}
		Thread.sleep(2000);
		jswait.loadClick(saveclusterbtn);
		Thread.sleep(2000);
		jswait.loadSendKeys(saveclustername, "test selenium cluster");
		Thread.sleep(2000);
		jswait.loadClick("//paper-button[contains(.,'Save')]");
		Thread.sleep(3000);
		jswait.loadClick("//paper-button[contains(.,'Close')]");
		Thread.sleep(3000);
		jswait.loadClick("//paper-button[contains(.,'Close')]");
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
	
	
   public void verifyToastSaveClusterWithView1() throws InterruptedException {
		
	   assertTrue(toastSaveClusterWithView1.isDisplayed());
		
	}
	
   public void verifyclusterfailedstatus() throws InterruptedException {
		Thread.sleep(5000);
		jswait.loadClick(clusterRefresh);
		Thread.sleep(5000);
	   assertTrue(clusterfailedstatus.isDisplayed());
		
	}
   
   public void NavigatetoDiscoveredClusters() throws InterruptedException {
		jswait.loadClick(DiscoveredClusters);
		
	}
   
   public void verifyDiscovredClusters() throws InterruptedException {
	   Thread.sleep(5000);
	   commonObjects.filterName("test selenium cluster");
		Thread.sleep(5000);
		   assertTrue(discoveredclusterscheck.isDisplayed());
						
	}
   
   public void clusternamecheck() throws InterruptedException {
	
		Thread.sleep(5000);
		   assertTrue(clusternamecheck.isDisplayed());
						
	}
   
   public void clusterscombinationcheck() throws Exception {
	   Thread.sleep(2000);
		jswait.loadClick(clusterdetailsicon);
		Exception view=new Exception("Exclusion failed");
		try {
		
		Thread.sleep(2000);
//		clusterkpiExclusioncheck.isDisplayed();
		Thread.sleep(5000);
		  
			}
		catch(Exception e){
			 throw view;
		}
		Thread.sleep(2000);
		jswait.loadClick(saveclusterbtn);
		Thread.sleep(2000);
		jswait.loadSendKeys(saveclustername, "test selenium cluster");
		Thread.sleep(2000);
		jswait.loadClick("//paper-button[contains(.,'Save')]");
		Thread.sleep(3000);
		jswait.loadClick("//paper-button[contains(.,'Close')]");
		Thread.sleep(3000);
		 assertTrue(combinationclusters.isDisplayed());
		jswait.loadClick("//paper-button[contains(.,'Close')]");
		
						
	}
  
   
	
   public void verifyclustertabinsegments() throws InterruptedException {
	   Thread.sleep(5000);
	   commonObjects.filterName("Segments");
		Thread.sleep(5000);
		jswait.loadClick(segmentAnalysisnameclick);
		
		Thread.sleep(5000);
		   assertTrue(Clusterstab.isDisplayed());
		   Thread.sleep(5000);
			jswait.loadClick(Clusterstab);
		
	}
   
   
   public void verifycreateclusterinsegmentspage() throws InterruptedException {
	   Thread.sleep(5000);
	   commonObjects.filterName("Segments");
		Thread.sleep(5000);
		jswait.loadClick(segmentAnalysisnameclick);
		
		Thread.sleep(5000);
		   assertTrue(Clusterstab.isDisplayed());
		   Thread.sleep(5000);
			jswait.loadClick(Clusterstab);
			Thread.sleep(2000);
			jswait.loadClick(optionsIconList1);
			
			//clickOptionsIcon();
			Thread.sleep(2000);
			jswait.loadClick(clustersOption);
			Thread.sleep(3000);
			 assertTrue(createClusterButton.isDisplayed());
			
	}
   
   public void verifyclusteroptioninSegments() throws InterruptedException {
	   Thread.sleep(5000);
	   commonObjects.filterStatus("Completed");
		
		
	}
   
   
}
