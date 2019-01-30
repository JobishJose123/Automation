package pageObjetcs;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Random;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjetcs.CommonObjects;

import com.google.api.services.gmail.Gmail.Users;
import com.itextpdf.text.log.SysoCounter;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.TimeoutImpl;

public class SegmentAnalysisObjects extends Init {
	CommonObjects commonObjects = new CommonObjects();
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	BroadcastPageObjects broadcastPageObjects=new BroadcastPageObjects();
	Init Init =new Init();
	public SegmentAnalysisObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Insight Workbench']/../..")
	private WebElement IM;

	@FindBy(xpath="//*[@id='sym1' and @icon='app-primary:segments']")
	private WebElement exploreSegments;
	@FindBy(xpath="//label[text()='Analytics']/..")
	private WebElement analytics;
	@FindBy(xpath=".//vaadin-grid-table-cell[2]//vaadin-grid-cell-content")
	private WebElement segmentAnalysis;
	@FindBy(xpath = "//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private List <WebElement> optionsIconList;
	@FindBy(xpath = "(//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..)[2]")
	private WebElement optionsIcon2;
	@FindBy(xpath = "(//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..)[3]")
	private WebElement optionsIcon3;
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
	
	@FindBy(xpath="(.//paper-radio-button[@name='view2']//div[@id='offRadio'])[3]//following::div[@id='offRadio']")
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
	
	@FindBy(xpath="//a[@class='analysisName style-scope analysis-list']")
	private WebElement SelectAnalysisName;
	
	
	
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
	
	@FindBy(xpath="//div[@id='checkboxContainer']")
    private WebElement MarkAsImp;
	
	@FindBy(xpath=".//*[@id='saveAnalysisModal']/paper-dialog/paper-button[contains(.,'Save Analysis')]")
	private WebElement SaveAnalysisBtn;
	@FindBy(xpath=".//*[@id='topBar']/paper-button[contains(.,'Proceed')]")
	private WebElement Topproccedbtn ;
	@FindBy(xpath="(.//*[@id='items']//vaadin-grid-cell-content//div[1])[1]")
	private WebElement clustersname;
	@FindBy(xpath=".//*[@id='sunb']")
	private WebElement clusterssunburstchart;
	@FindBy(xpath="(//cluster-center-table[@class='style-scope cluster-row-expander x-scope cluster-center-table-0'])[3]")
	private WebElement clusterstableview;
	@FindBy(xpath="(.//vaadin-grid-table-body[@id='items']//paper-icon-button[@id='detailsButton'])[1]")
	private WebElement clusterdetailsicon;
	@FindBy(xpath=".//*[@id='items']/vaadin-grid-table-row[1]/vaadin-grid-table-cell[2]/vaadin-grid-cell-content")
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
	@FindBy(xpath=".//div[contains(.,'Test_View1/Test_View2')]")
	private WebElement clusternamecheck;
	@FindBy(xpath=".//*[@id='scrollable']//cluster-sunburst-chart//following::span[contains(.,'A1')]//following::span[contains(.,'0')]//following::span[contains(.,'205')]")
	private WebElement combinationclusters;
	@FindBy(xpath=".//*[@id='kpiForm']//label[contains(.,'Metric')]//following::iron-icon[2]")
	private WebElement kpimetric;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[contains(.,'Revenue Metrics')]")
	private WebElement kpimetricselect;
	@FindBy(xpath=".//*[@id='select']/div/paper-item[contains(.,'"+SELENIUM_REVENUE_METRIC+"')]")
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
	@FindBy(xpath=".//*[@id='scrollable']/div/div/cluster-center-table[1]//vaadin-grid-table-header-cell[contains(.,'test1')]//following::vaadin-grid-table-header-cell[contains(.,'KPI1')]")
	private WebElement kpicheckclustertable;
	@FindBy(xpath=".//*[@id='scrollable']/div/div/cluster-center-table[2]//vaadin-grid-table-header-cell[contains(.,'test2')]//following::vaadin-grid-table-header-cell[contains(.,'KPI2')]")
	private WebElement kpicheckclustertable2;
	
	@FindBy(xpath="//div[contains(@class,'profile-name')]/..")
	private WebElement topbarProfileName;
	@FindBy(xpath=".//*[@id='items']/vaadin-grid-table-row[1]/vaadin-grid-table-cell[4]/vaadin-grid-cell-content")
	private WebElement clusterstatusgrid;
	@FindBy(xpath="//paper-ripple[@id='ink']/..")
	private WebElement Optionbtn;
	
	@FindBy(xpath="//paper-item[@class='style-scope analysis-list x-scope paper-item-1'][contains(.,'Edit')]")
	private WebElement EditSegment ;

	@FindBy(xpath="(//div[@id='offRadio'])[2]")
   private WebElement ClickRadiobtn;

	@FindBy(xpath="//paper-button[contains(. , 'Create Condition')]")
     private WebElement CreateCondition ;
	
	@FindBy(xpath="(//div[@id='offRadio'])[3]")
	private WebElement SavedSegmentsRadiobtn;

	
	@FindBy(xpath="//paper-button[@class='style-scope segment-analysis x-scope paper-button-0'][contains(., 'Start New Analysis')]/..")
    private WebElement StartNewAnalysis;
	
	@FindBy(xpath="(//iron-icon[@id='icon'])[1]")
	private WebElement EditSegmentAnalysisName;
	
   @FindBy(xpath="(//input[@id='input'][@class='style-scope paper-input'])[1]")
    private WebElement SegmentAnalysisNameInput;
   
	@FindBy(xpath="(//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down'])[1]")
	private WebElement dropDown;
	
	@FindBy(xpath="//paper-item[contains(.,'Customer Profile Info')]")
	private WebElement ConditionType1;
	
	
	@FindBy(xpath="//paper-item[contains(.,'Customer Driven Event')]")
	private WebElement ConditionType3;  
	
	
	@FindBy(xpath="//paper-item[contains(.,'Revenue Metrics')]")
	private WebElement ConditionType2;
	
   @FindBy(xpath="(//input[@id='input'])[4]")
  private WebElement ClickField1 ;

   @FindBy(xpath="//paper-item[contains(.,'"+AGE_PROFILE_FIELD+"')]")
	private WebElement Field1;
   
   @FindBy(xpath="//paper-item[contains(.,'"+SELENIUM_REVENUE_METRIC+"')]")
	private WebElement Field2;
   
   @FindBy(xpath="//vaadin-combo-box-item[contains(.,'"+SELENIUM_CUSTOMER_DRIVEN_EVENT+"')]")
   private WebElement Event;
   
   @FindBy(xpath="//label[contains(.,'Event Date and Time')]//following::input[1]")
   private WebElement ClickEventDateTime;
   
   @FindBy(xpath="//paper-item[contains(.,'All events before')]")
   private WebElement EventDateTime;
   
   @FindBy(xpath="//label[contains(.,'Select')]//following::input[1]")
   private WebElement ClickSelect2;
   
   @FindBy(xpath="//paper-item[contains(.,'this date and time')]")
   private WebElement SelectThisDateTime;
   
   @FindBy(xpath="(//div[@id='checkboxContainer'])[2]")
   private WebElement NotOccured;
   
   @FindBy(xpath="//label[contains(.,'Select')]//following::input[2]")
   private WebElement ClickSelect1;
   
   @FindBy(xpath="//paper-item[contains(.,'today')]")
   private WebElement SelectDay1;

@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement ClickCondition1 ;

@FindBy(xpath="(//label[contains(.,'Condition')]//following::input[5])[1]")
private WebElement ClickCondition2;

	@FindBy(xpath="//paper-item[contains(.,'is greater than or equal to')]")
	private WebElement Condition1;
	
	@FindBy(xpath="(//paper-item[contains(.,'is greater than or equal to')])[1]")
	private WebElement Condition2;
	
@FindBy(xpath="(//input[@id='input'])[@type='number']")
	private WebElement Value1 ;
	
	@FindBy(xpath="//paper-button[contains(.,'Save')][@id='saveButton']")
	private WebElement SaveCondition1 ;
	

	@FindBy(xpath="(//paper-button[contains(.,'Save')][@id='saveButton'])[2]")
	private WebElement SaveCondition2 ;
	
	@FindBy(xpath="(//paper-button[contains(.,'Save')][@id='saveButton'])[3]")
	private WebElement SaveCondition3 ;
	
	@FindBy(xpath="(//paper-button[contains(.,'Save')][@id='saveButton'])[4]")
	private WebElement SaveCondition4 ;
	
	
	@FindBy(xpath="//paper-button[contains(.,'Add AND')]")
	private WebElement AddANDbtn;
	
	@FindBy(xpath="(//paper-button[contains(.,'Add AND')])[2]")
	private WebElement AddANDbtn2;
	
	@FindBy(xpath="(//paper-button[contains(.,'Add AND')])[3]")
	private WebElement AddANDbtn3;
	
	@FindBy(xpath="//label[contains(.,'Saved Segments')]//following::input[1]")
	private WebElement SavedSegmentInput ;
	
	
	@FindBy(xpath="//paper-item[contains(.,'segmentAgeGT40')]")
	private WebElement SavedSegmentName;
	

	
	@FindBy(xpath="(//paper-icon-button[@icon='icons:delete'])[1]")
	private WebElement deleteKPI;
	
	@FindBy(xpath="//paper-icon-button[@icon='icons:create'][@class='style-scope start-new x-scope paper-icon-button-0']")
	private WebElement editKPIbtn;
	
	@FindBy(xpath="//paper-button[contains(.,'OK')]")
	private WebElement OKbtn;
	
	@FindBy(xpath="//paper-item[contains(.,'Rerun')]")
	private WebElement Rerunbtn;
	
	
	@FindBy(xpath="//iron-icon[@icon='icons:content-copy']")
	private WebElement Copybtn;
	
	@FindBy(xpath="//span[@class='style-scope analysis-list']")
	private WebElement SegmentAnalysisJobstatus;
	
	@FindBy(xpath="//paper-button[contains(.,'Add AND')]")
	private WebElement AddKPI;
	
	@FindBy(xpath="//div[@id='toggleButton']")
	private WebElement AutoRefreshbtn;
	 
	@FindBy(xpath="//vaadin-combo-box-item[contains(.,'Demographics_q11')]")
	private WebElement kpitypeClick;
	
	@FindBy(xpath="//iron-icon[@icon='icons:view-quilt']")
	private WebElement CreatedMicroSegment;                                                             //.stack [fill='\#36c0cd']:nth-of-type(1)
	
	@FindBy(xpath="//paper-icon-button[@icon='icons:create'][@title='Create Micro-Segments']")
	private WebElement CreateMicroSegmentbtn;
	
	
	@FindBy(css=".stack [fill='\\#79dab0']:nth-of-type(1)")
	private WebElement SelectBarGraphRect1;
	
	
	@FindBy(css=".stack [fill='\\#36c0cd']:nth-of-type(1)")
	private WebElement SelectBarGraphRect2;
	
	@FindBy(css="svg > g:nth-of-type(1) [fill='\\#6e97d9']")
	private WebElement SelectBarGraphRect3;
	
	@FindBy(xpath="//paper-button[contains(.,'Compute')]")
	private WebElement Computebtn;
	
	@FindBy(xpath="(//paper-item[contains(.,'Edit')])[1]")
	private WebElement editMicroSegmentbtn;
	
	@FindBy(xpath="//paper-item[contains(.,'Delete')]")
	private WebElement deleteSegmentAnalysisjobbtn;
	
	@FindBy(xpath="(//paper-button[contains(.,'OK')])[5]")
	private WebElement OKbtnToDeleteJob;
	
	
	@FindBy(xpath="(//iron-icon[@icon='icons:close'])[1]")
    private WebElement CloseSlabOfAPI	;	

	
	
	@FindBy(xpath="//paper-button[contains(.,'Save')][@class='style-scope microsegments-list x-scope paper-button-0']")
	private WebElement MicroSegmentSavebtn;
	
	
	@FindBy(xpath="//paper-item[contains(.,'Cross-Tab')]")
	private WebElement CrossTabbtn;
	@FindBy(xpath="(//label[contains(.,'Name')]//following::input[1])[1]")
	private WebElement CrossTabName;
	
	@FindBy(xpath="//label[contains(.,'Kpi1')]//following::input[1]")
	private WebElement AddKPIForCrossTabbtn1;
	
	@FindBy(xpath="//paper-item[contains(.,'KPI1')]")
	private WebElement AddKPIForCrossTab1;
	
	@FindBy(xpath="//label[contains(.,'Kpi2')]//following::input[1]")
	private WebElement AddKPIForCrossTabbtn2;
	
	@FindBy(xpath="(//paper-item[contains(.,'KPI2')])[2]")
	private WebElement AddKPIForCrossTab2;
	
	@FindBy(xpath="//paper-button[contains(.,'Create')]")
	private WebElement CreateCrossTabbtn;
	
	@FindBy(xpath="//paper-icon-button[@icon='icons:refresh']")
	private WebElement RefreshCrossTabbtn;
	
	@FindBy(xpath="//p[@class='cross-tab style-scope']")
	private WebElement CreatedCrossTabName;
	
	@FindBy(xpath="//heatmap-chart[@class='style-scope cross-tab x-scope heatmap-chart-0']")
	private WebElement CrossTabTable;
	
	@FindBy(xpath="(//paper-button[contains(.,'Save')])[2]")
	private WebElement SaveCrossTabbtn;
	
	@FindBy(xpath="(//paper-button[contains(.,'Save')])[1]")
	private WebElement CrossTabSave;
	
	@FindBy(xpath="//b[@class='style-scope tree-map'][contains(.,'Micro-Segment')]")
	private WebElement MicroSegmentName;
	
	@FindBy(xpath="//paper-item[contains(.,'Saved Segment')]")
	private WebElement SavedSegmentbtn;
	
	
	
	@FindBy(xpath="//paper-button[@class='saveBtn style-scope saved-segment-option x-scope paper-button-0'][contains(.,'Save')]")
	private WebElement SaveMicroSegmentNameToSavedSegment;
	
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
		jswait.loadSendKeys(createSegmentAnalysisListinput, BASE_LIST);
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
		jswait.loadSendKeys(kpitype, AGE_PROFILE_FIELD);
		
		if(flag==1) {
			jswait.loadSendKeys(kpitype, BALANCE_PROFILE_FIELD);
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
		jswait.loadSendKeys(KpiAttributetype, "Revenue Metrics");
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
		Thread.sleep(2000);
		if(view1RadioButton1.size()>0) {
			for(WebElement button: view1RadioButton1) {
				jswait.loadClick(button);
				
			}
			
		}
		
	}
	
	
	public void selectRadioButtonForViews2() throws InterruptedException {
		Thread.sleep(2000);
		if(view1RadioButton2.size()>0) {
			for(WebElement button: view1RadioButton2) {
				jswait.loadClick(button);
				
			}
			
		}
		
	}
	
	public void selectRadioButtonForViews3() throws InterruptedException {
		Thread.sleep(2000);
		if(view1RadioButton2.size()>0) {
			for(WebElement button: view1RadioButton3) {
				jswait.loadClick(button);
				
			}
			
		}
		
	}
	
	
	public void selectClusterOption() throws InterruptedException {
		
//		commonObjects.filterName("Segments");
//		Thread.sleep(3000);
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
		Thread.sleep(3000);
		//jswait.loadClick("//paper-button[contains(.,'Close')]");
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
  
   
	
   public void verifyclustertabinsegments() throws Exception {
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
		
	}
   
   
   public void verifycreateclusterinsegmentspage() throws InterruptedException {
	   Thread.sleep(5000);
//	   commonObjects.filterName("Segments");
//		Thread.sleep(5000);
		jswait.loadClick(segmentAnalysisnameclick);
		
		Thread.sleep(5000);
		   assertTrue(Clusterstab.isDisplayed());
		   Thread.sleep(5000);
			jswait.loadClick(Clusterstab);
			Thread.sleep(2000);
			jswait.loadClick(optionsIconList1);
			Thread.sleep(2000);
			jswait.loadClick(clustersOption);
			Thread.sleep(3000);
			 assertTrue(createClusterButton.isDisplayed());
			
	}
   
   public void verifyclusteroptioninSegments() throws InterruptedException {
	   Thread.sleep(5000);
	   commonObjects.filterStatus("Completed");
	   Thread.sleep(2000);
	 clickOptionsIcon();
		Thread.sleep(2000);
		assertTrue(clustersOption.isDisplayed());
		Thread.sleep(2000);
		jswait.loadClick(optionsIcon2);
		Thread.sleep(2000);
		assertTrue(clustersOption.isDisplayed());
		Thread.sleep(2000);
		jswait.loadClick(optionsIcon3);
		Thread.sleep(2000);
		assertTrue(clustersOption.isDisplayed());
		
	}
   
   public void clustertablekpischeck() throws Exception {
		
		Thread.sleep(2000);
		jswait.loadClick(clusterdetailsicon);
	
		Thread.sleep(2000);
		jswait.loadClick(saveclusterbtn);
		Thread.sleep(2000);
		jswait.loadSendKeys(saveclustername, "test selenium cluster");
		Thread.sleep(2000);
		jswait.loadClick("//paper-button[contains(.,'Save')]");
		Thread.sleep(3000);
		jswait.loadClick("//paper-button[contains(.,'Close')]");
		Thread.sleep(3000);
		
		kpicheckclustertable.isDisplayed();
		Thread.sleep(3000);
		
		kpicheckclustertable2.isDisplayed();
		jswait.loadClick("//paper-button[contains(.,'Close')]");
	}
   
   public void verifyclusteroptiondisableinSegments() throws Exception {
	   Thread.sleep(5000);
	   commonObjects.filterStatus("Completed");
	   Thread.sleep(2000);
	 clickOptionsIcon();
		Thread.sleep(2000);
		try {
		assertFalse(clustersOption.isDisplayed());
		Thread.sleep(2000);
		}
		catch(Exception e) {
			System.out.println("The cluster option is disabled");
		}
		
		
	}
	public String getTopclusterStatus() throws InterruptedException {
		jswait.waitUntil(clusterstatusgrid);
		String status = clusterstatusgrid.getText();
		return status;
	}
	
	public String clusterkpiExclusioncheck() throws InterruptedException {
		jswait.waitUntil(clusterkpiExclusioncheck);
		String status = clusterkpiExclusioncheck.getText();
		return status;
	}
   
   
   
   public void Clustersstatuscheck() throws InterruptedException {
	   
		String statusOfcluster = getTopclusterStatus();
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while(!statusOfcluster.contains("Completed")&& t.checkTimerMin(7)) {
			statusOfcluster = getTopclusterStatus();
			System.out.println(statusOfcluster);
			Thread.sleep(3000);
			jswait.loadClick("//paper-icon-button[@icon='icons:refresh']");
		}
	   
		
	}
   public void clusterkpiexclusioncheck() throws Exception {
	   String status = clusterkpiExclusioncheck();
	   System.out.println(status);
		try {
			assertEquals(status,"KPI1");
			
		}catch(Exception e) {
			
		}
		  
						
	}
   //=====================================================================================================================================================================================//
   
   public String getSegmentAnalysisJobStatus() throws Exception{
	   jswait.loadClick(AutoRefreshbtn);
	   return SegmentAnalysisJobstatus.getText();
	   
   }
   public void SegmentName(String  SegmentName,String condition)throws Exception{
	   jswait.loadClick(StartNewAnalysis);
	   Thread.sleep(3000);
	   jswait.loadClick(EditSegmentAnalysisName);
	   jswait.loadSendKeys( SegmentAnalysisNameInput ,SegmentName);
	 
	   jswait.loadClick(createSegmentAnalysisList);
		Thread.sleep(3000);
		jswait.loadSendKeys(createSegmentAnalysisListinput, BASE_LIST);
		Thread.sleep(2000);
		jswait.loadClick("//vaadin-combo-box-item[contains(.,'"+BASE_LIST+"')]");
		if(condition.contains("segment")) {
			 changeTargetConditinSavedSegment(); 
		 }
		else if(!condition.contains("none") && !condition.contains("segment")) {
			 TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
			 targetConditionObjects.clickBasicTargetCondition(condition);
		 }
		System.out.println("before KPI");
	addNew3KPI();
	System.out.println("after KPI");

	Thread.sleep(2000);
	
	jswait.loadClick(Topproccedbtn);
	Thread.sleep(2000);
	jswait.loadSendKeys(SaveAnalysisDescinput,"test");
						
	Thread.sleep(2000);
	jswait.loadSendKeys(SaveAnalysisSetPermission,"selenium.flytxt@gmail.com");
	Thread.sleep(3000);
	jswait.loadClick(userselect);
	Thread.sleep(2000);
	jswait.loadClick(MarkAsImp);
	jswait.loadClick(SaveAnalysisBtn);
	Thread.sleep(2000);
   }
   
   public void editSegmentAnalysis() throws Exception{
	   commonObjects.clickOptionsIcon();
	   commonObjects.clickEditOption() ;

}
   
   public void changeTargetConditionCreate() throws Exception{
	   jswait.loadClick(ClickRadiobtn);
	   jswait.loadClick(CreateCondition);
	   jswait.loadClick(dropDown);
	   jswait.loadClick(ConditionType1);
	   jswait.loadClick(ClickField1);
	   jswait.loadClick(Field1);
	   jswait.loadClick(ClickCondition1);
	   jswait.loadClick(Condition1);
	   jswait.loadSendKeys(Value1, "18");
	   jswait.loadClick(SaveCondition1);
	   Thread.sleep(3000);
	   
	   jswait.loadClick(AddANDbtn);
	   jswait.loadClick(dropDown);
	   jswait.loadClick(ConditionType2);
	   jswait.loadClick(ClickField1);
	   jswait.loadClick(Field2);
	   jswait.loadClick(ClickSelect1);
	   jswait.loadClick(SelectDay1);
	   jswait.loadClick(ClickCondition2);
	   jswait.loadClick(Condition2);
	   jswait.loadSendKeys(Value1, "10");
	   jswait.loadClick(SaveCondition2);
	   Thread.sleep(3000);
	   
	   jswait.loadClick(AddANDbtn2);
	   jswait.loadClick(dropDown);
	   jswait.loadClick(ConditionType3);
       jswait.loadClick(ClickField1);
       jswait.loadClick(Event);
	   jswait.loadClick(Event);
	   jswait.loadClick(ClickEventDateTime);
	   jswait.loadClick(EventDateTime);
	   jswait.loadClick(ClickSelect2);
	   jswait.loadClick(SelectThisDateTime);
	   jswait.loadClick(SaveCondition3);
	   Thread.sleep(3000);
	   
	   jswait.loadClick(AddANDbtn3);
	   jswait.loadClick(dropDown);
	   jswait.loadClick(ConditionType3);
	   jswait.loadClick(ClickField1);
	   jswait.loadClick(Event);
	   jswait.loadClick(Event);
	   Thread.sleep(2000);
	   jswait.loadClick(NotOccured);
	   jswait.loadClick(ClickEventDateTime);
	   jswait.loadClick(EventDateTime);
	   jswait.loadClick(ClickSelect2);
	   jswait.loadClick(SelectThisDateTime);
	   jswait.loadClick(SaveCondition4);
	   Thread.sleep(3000);

	   jswait.loadClick(Topproccedbtn);
		Thread.sleep(2000);
       jswait.loadClick(SaveAnalysisBtn);
   }
   public void changeTargetConditinSavedSegment() throws Exception{
	   jswait.loadClick(SavedSegmentsRadiobtn);
	   jswait.loadClick(SavedSegmentInput);
	   jswait.loadClick(SavedSegmentName);
	   jswait.loadClick(Topproccedbtn);
	   jswait.loadClick(SaveAnalysisBtn);
	   }
   public void addKPI() throws Exception{
	   jswait.loadClick(createSegmentAnalysisKpibtn);
		Thread.sleep(2000);		
	jswait.loadSendKeys(KpiName, "KPI4");
	Thread.sleep(2000);
	jswait.loadSendKeys(KpiDesc, "testKpi");
	Thread.sleep(2000);
	jswait.loadSendKeys(KpiAttributetype, "Customer Demographics");
	Thread.sleep(2000);
	jswait.loadClick(KpiAttributetypeclick);
	Thread.sleep(2000);
	jswait.loadSendKeys(kpitype,DEMOGRAPHICS_FIELD);
	jswait.loadClick(kpitypeClick);
	jswait.loadClick(KpiConfrimbtn);
	Assert.assertTrue(driver.findElement(By.xpath("//vaadin-grid-cell-content[contains(.,'KPI4')]")).isDisplayed());
	jswait.loadClick(Topproccedbtn);
	jswait.loadClick(SaveAnalysisBtn);
	
	//
	   
   }
   public void deleteKPI() throws Exception{
	   jswait.loadClick(deleteKPI);
	   Thread.sleep(2000);
	   Assert.assertTrue(driver.findElement(By.xpath("//vaadin-grid-cell-content[contains(.,'KPI1')]")).isDisplayed());
	   Thread.sleep(2000);
	   jswait.loadClick(OKbtn);
	   Thread.sleep(2000);
	   jswait.loadClick(Topproccedbtn);
		jswait.loadClick(SaveAnalysisBtn);	
		Thread.sleep(2000);
   }
   
   public void editKPI() throws Exception{
	   jswait.loadClick(editKPIbtn);
	   Thread.sleep(2000);
	   jswait.loadSendKeys(KpiName,"KPI5");
	   jswait.loadClick(KpiConfrimbtn);
	   jswait.loadClick(Topproccedbtn);
		jswait.loadClick(SaveAnalysisBtn);		
   }
   
   public void filtersegmentAnalysisJob() throws Exception{
	   commonObjects.clickOptionsIcon();
   }
   
   public void RerunSegmentAnalysisJob() throws Exception{
	   jswait.loadClick(Rerunbtn);
	   
   }
   public void CopySegmentAnalysisJob() throws Exception{
	   jswait.loadClick(Copybtn);
	   Thread.sleep(3000);
	   jswait.loadClick(Topproccedbtn);
		jswait.loadClick(SaveAnalysisBtn);
		
	    }
   public void SelectSegmentAnalysis() throws Exception{
		jswait.loadClick(SelectAnalysisName);
	}
   
   public void CreateMicroSegment() throws Exception{
	   commonObjects.clickOptionsIcon();
	   jswait.loadClick(CreatedMicroSegment);
	   jswait.loadClick(CreateMicroSegmentbtn);
	   Thread.sleep(6000);
	   SelectBarGraphRect1.click();
	   SelectBarGraphRect2.click();
	   SelectBarGraphRect3.click();
       jswait.loadClick(Computebtn);
       Thread.sleep(3000);
     jswait.loadClick(MicroSegmentSavebtn);
     jswait.loadClick(SaveAnalysisBtn);
		
   }
   
   public void CreateCrossTab() throws Exception{
	   commonObjects.clickOptionsIcon();
	   jswait.loadClick(CrossTabbtn);
	   jswait.loadSendKeys(CrossTabName, "SelCrossTab");
	   jswait.loadClick(AddKPIForCrossTabbtn1);
	   jswait.loadClick(AddKPIForCrossTab1);
	   jswait.loadClick(AddKPIForCrossTabbtn2);
	   jswait.loadClick(AddKPIForCrossTab2);
	   jswait.loadClick(CreateCrossTabbtn);
	   jswait.loadClick(SaveCrossTabbtn);
	   jswait.loadClick(RefreshCrossTabbtn);
	   Thread.sleep(5000);
	   jswait.loadClick(RefreshCrossTabbtn);
	   Assert.assertTrue(driver.findElement(By.xpath("//p[@class='cross-tab style-scope'][contains(.,'SelCrossTab')]")).isDisplayed());
	   jswait.loadClick(CreatedCrossTabName);
	   CrossTabTable.isDisplayed();
//	   jswait.loadClick(MicroSegmentSavebtn);
//	   jswait.loadClick(SaveAnalysisBtn);
//		
	   	    }
   
   
   public void editMicroSegment() throws Exception{
	   jswait.loadClick(CreatedMicroSegment);
	   commonObjects.clickOptionsIcon();
	   jswait.loadClick(editMicroSegmentbtn);
	   jswait.loadClick(CloseSlabOfAPI);
	   jswait.loadClick(Computebtn);
	   jswait.loadClick(MicroSegmentSavebtn);
	   jswait.loadClick(SaveAnalysisBtn);
   }
   
  public void deleteSegmentAnalysisjob(String jobName) throws Exception{
	  jswait.loadClick(deleteSegmentAnalysisjobbtn);
	  jswait.loadClick(OKbtnToDeleteJob);
	  Thread.sleep(2000);
	  commonObjects.clickFilterIcon();
	  commonObjects.clickFilterResetButton();
	  Thread.sleep(3000);
	  
	  
//	  List<WebElement> el = driver.findElements(By.xpath("//a[@class='analysisName style-scope analysis-list'][contains(.,'"+jobName+"')])"));
//	  if(el.size()==0) {
//		  Assert.assertTrue("job not deleted", false);
//	  }
	  
	  Assert.assertFalse(jswait.checkVisibility("//a[@class='analysisName style-scope analysis-list'][contains(.,'"+jobName+"')])"));
  }
	  
public void TargetCount() throws Exception {

	Assert.assertTrue(jswait.checkVisibility("//b[@class='style-scope analysis-list'][contains(.,'218')]"));
}

  public void editCrossTab() throws Exception{
	  commonObjects.clickOptionsIcon();
	  jswait.loadClick(CrossTabbtn);
	  
  }
  public void saveMicroSegment() throws Exception{
	String Name = MicroSegmentName.getText();
	  commonObjects.clickOptionsIcon();
	  jswait.loadClick(SavedSegmentbtn);
	  jswait.loadClick(SaveMicroSegmentNameToSavedSegment);
	  
  }

	public void createBCWithMicroSegmentSaved(String name, String bc_type, String baseList, String offer,String inventory) throws InterruptedException {
		ExcelHelper offerExcel = new ExcelHelper(); 
  	offerExcel.setExcelFile("offerInputData", offer);
	broadcastPageObjects.enterBroadcastBasicDetails(name,inventory);
		if (bc_type.contentEquals("triggerable") || bc_type.contentEquals("seedingTriggerable")|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			System.out.println("inside triggerable");
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Triggers')]/../../iron-icon");
			Thread.sleep(2000);
			jswait.loadClick("//paper-item[contains(.,'trigger')]");
			Thread.sleep(1500);
		}
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList(baseList);
		jswait.loadClick(SavedSegmentsRadiobtn);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList(baseList);
//		jswait.loadClick(CGConfigure);
//		jswait.loadClick(noControlGroupRadioButton);
//		jswait.loadClick(defineCGLimitSave);


	}
	  }

