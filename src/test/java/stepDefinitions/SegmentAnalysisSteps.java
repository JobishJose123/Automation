package stepDefinitions;

import java.util.Calendar;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.SegmentAnalysisObjects;
import pageObjetcs.BroadcastPageObjects;

public class SegmentAnalysisSteps extends Init {
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	ExcelHelper eM = new ExcelHelper();
	BroadcastPageObjects broadcastPageObjects=new BroadcastPageObjects();
	SegmentAnalysisObjects segmentObjects=new SegmentAnalysisObjects();
	CommonObjects CommonObjects=new CommonObjects();
	BroadcastSteps 	BroadcastStepsObjects=new 	BroadcastSteps();

	
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
	@Then("^Select Segment Analysis job$")
	public void SelectSegmentAnalysis() throws Exception{
		segmentObjects.SelectSegmentAnalysis();
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
		Thread.sleep(2000);
//		jswait.loadClick("//a[@class='analysisName style-scope analysis-list']/..");
		Thread.sleep(2000);
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
		
		segmentObjects.addNew3KPI();	
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
	
	@Then("^select radio button for view3$")
	public void selectRadioButtonForViews3() throws InterruptedException {
		
		segmentObjects.selectRadioButtonForViews3();	
		
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
	
	
	@Then("^select Cluster Option$")
	public void ClusterOption() throws InterruptedException {
		
		segmentObjects.selectClusterOption();	
	}
	
	@Then("^check cluster details$")
	public void clusterdetails() throws Exception {
		
		segmentObjects.clustertabledetails();	
	}
	
	@Then("^check cluster details table and save cluster$")
	public void clustertabledetailsandsave() throws Exception {
		
		
		segmentObjects.clustertabledetailsandsave();	
	}
	
	@Then("^check cluster name and details$")
	public void checknameandDetails() throws Exception {
		segmentObjects.clusternamecheck();
		
		segmentObjects.clustertabledetailsandsave();	
	}
	
	@Then("^check clusters combination details$")
	public void clusterscombainedDetails() throws Exception {
		segmentObjects.clusternamecheck();
		segmentObjects.clusterscombinationcheck();
	}
	
	
	@Then("^Navigate to Saved Segments$")
	public void navigateToSavedSegments() throws Exception {
		
		segmentObjects.navigateToSavedSegments();	
	}
	
	
	@Then("^create Segment Analysis$")
	public void createSegmentAnalysis() throws InterruptedException {
		
		segmentObjects.createSegmentAnalysisbtn();	
		segmentObjects.createSegmentAnalysis();
	}
	
	
	@Then("^Navigate to Discovered clusters$")
	public void navigateToDiscoveredClusters() throws Exception {
		
		segmentObjects.NavigatetoDiscoveredClusters();	
	}
	
	
	@Then("^Navigate to 360 Customer Data$")
	public void navigateTo360CustomerData() throws Exception {
		
		segmentObjects.navigateTo360CustomerData();	
	}
	@Then("^verify Discovered clusters$")
	public void verifyDiscoveredClusters() throws Exception {
		
		segmentObjects.verifyDiscovredClusters();	
	}
	
	@Then("^verify clusters tab in segments$")
	public void verifyclustertabinsegments() throws Exception {
		Thread.sleep(5000);
		segmentObjects.verifyclustertabinsegments();	
	}
	
	
	@Then("^check cluster kpi's$")
	public void clusterkpicheck() throws Exception {
		
		segmentObjects.clusterkpicheck();	
	}
	
	@Then("^verify create clusters option in segments$")
	public void verifycreateclusterinsegmentspage() throws Exception {
		
		segmentObjects.verifycreateclusterinsegmentspage();	
	}
	
	@Then("^verify create clusters option in all completed segments$")
	public void verifycreateclusterforallcompleted() throws Exception {
		
		segmentObjects.verifyclusteroptioninSegments();	
	}
	
	@Then("^verify clusters kpis in views$")
	public void clustertablekpischeck() throws Exception {
		
		segmentObjects.verifyclustertabinsegments();
		
	}
	
	@Then("^verify clusters disabled in segments$")
	public void clusterdisablecheck() throws Exception {
		
		segmentObjects.verifyclusteroptiondisableinSegments();
		
	}
	
	@Then("^wait until status of cluster is complete$")
	public void waitUntilBCStatus() throws Throwable
	{  
		
		segmentObjects.Clustersstatuscheck();
	
	}
	@Then("^verify clusters kpi exclude check$")
	public void clusterkpiexclusioncheck() throws Exception {
		
		segmentObjects.clusterkpiexclusioncheck();
		
	}
	
	
//=========================================================================================================================================================================================//
	
	
			
	@Then("^create SegmentAnalysis from sheet \"([^\"]*)\"$")
	public void create_Segment_Analysis_from_sheet(String AnalysisName) throws Exception{
		 eh.setExcelFile("SegmentAnalysis", AnalysisName);//set excel file
		 String name = eh.getCellByColumnName("Segment_Analysis");//get sheet name
		 name = RandomNameGenerator.getRandomName(name);//append new random name
		 segmentObjects.SegmentName(name,"none"); //pass new name to SegmentName()
		 eh.setCell("Segment_Analysis",name);
		 
	}
	
	@Then("^create SegmentAnalysis from sheet \"([^\"]*)\" with condition \"([^\"]*)\"$")
	public void create_Segment_Analysis_from_sheet_with_condition(String AnalysisName,String condition) throws Exception{
		 eh.setExcelFile("SegmentAnalysis", AnalysisName);//set excel file
		 String name = eh.getCellByColumnName("Segment_Analysis");//get sheet name
		 name = RandomNameGenerator.getRandomName(name);//append new random name
		 segmentObjects.SegmentName(name,condition); //pass new name to SegmentName()
		 eh.setCell("Segment_Analysis",name);
		 
	}
	
	 @Then("^filter the Segment Analysis job for status check from sheet \"([^\"]*)\"$")                                    // filter a job
	public void filter_the_Segment_Analysis_job_for_status_check_from_sheet(String SegmentAnalysisSheet) throws Exception{
	 eh.setExcelFile("SegmentAnalysis", SegmentAnalysisSheet);//set excel file
	 String Segmentname = eh.getCellByColumnName("Segment_Analysis").toString();
	 CommonObjects.filterName(Segmentname);
	}

	@Then("^wait until Segment Analysis job status is changed to \"([^\"]*)\"$")
	  public void wait_until_status_is_changed(String SegmentAnalysisJobstatus) throws Exception {
//		filter_the_Segment_Analysis_job_for_status_check(SegmentAnalysisSheet);
		Thread.sleep(5000);
			TimeoutImpl t = new TimeoutImpl();
			t.startTimer();
		    String currSegmentAnalysisJobStatus= segmentObjects.getSegmentAnalysisJobStatus();
			while(!SegmentAnalysisJobstatus.contentEquals(currSegmentAnalysisJobStatus)&& t.checkTimerMin(30)) {
			Thread.sleep(2000);
			currSegmentAnalysisJobStatus= segmentObjects.getSegmentAnalysisJobStatus();
		
			}
			Assert.assertTrue("Required status not found", SegmentAnalysisJobstatus.contentEquals(currSegmentAnalysisJobStatus));
	
	}
	
	
	
	@Then("^edit the Segment Analysis job from sheet \"([^\"]*)\"$")                                      // filter a job
	public void edit_the_Segment_Analysis_job_from_sheet(String SegmentAnalysisSheet) throws Exception{
		 eh.setExcelFile("SegmentAnalysis", SegmentAnalysisSheet);//set excel file
		 String Segmentname = eh.getCellByColumnName("Segment_Analysis").toString();
		 CommonObjects.filterName(Segmentname);
	      segmentObjects.editSegmentAnalysis();
	      			 
	}
	
	@Then("^edit the Segment Analysis job Copy from sheet \"([^\"]*)\"$")                                      // filter a job
	public void edit_the_Segment_Analysis_job_Copy_from_sheet(String SegmentAnalysisSheet) throws Exception{
		 eh.setExcelFile("SegmentAnalysis", SegmentAnalysisSheet);//set excel file
		 String Segmentname = eh.getCellByColumnName("Segment_Analysis").toString();
		 String jobnameCopy= Segmentname+"_Copy";
		 CommonObjects.filterName(jobnameCopy);
	      segmentObjects.editSegmentAnalysis();
	}
	
	@Then("^change the target condition to create and save$")
	public void change_the_Target_Condition_to_Create_and_save() throws Exception{
		segmentObjects.changeTargetConditionCreate();
	}
	
	@Then("^change the target condition to Saved Segment and save$")
	public void change_Target_Conditin_Saved_Segment_and_save() throws Exception{
		segmentObjects.changeTargetConditinSavedSegment();
	}
	
	@Then("^add a KPI$")
	public void add_a_KPI() throws Exception{
		segmentObjects.addKPI();
	}
	
	@Then("^delete a KPI$")
	public void delete_a_KPI() throws Exception{
		segmentObjects.deleteKPI();
	}
	@Then("^edit a KPI$")
	public void edit_a_KPI() throws Exception{
		segmentObjects.editKPI();
	}
	
	@Then("^filter the Segment Analysis job from sheet \"([^\"]*)\"$")                                      // filter a job
	public void filter_Segment_Analysis_job_from_sheet(String SegmentAnalysisSheet) throws Exception{
	 eh.setExcelFile("SegmentAnalysis", SegmentAnalysisSheet);//set excel file
	 String Segmentname = eh.getCellByColumnName("Segment_Analysis").toString();
	 CommonObjects.filterName(Segmentname);
	 segmentObjects.filtersegmentAnalysisJob();
	}
	
	@Then("^filter the Segment Analysis job Copy from sheet \"([^\"]*)\"$")                                      // filter a job
	public void filter_Segment_Analysis_job_Copy_from_sheet(String SegmentAnalysisSheet) throws Exception{
	 eh.setExcelFile("SegmentAnalysis", SegmentAnalysisSheet);//set excel file
	 String Segmentname = eh.getCellByColumnName("Segment_Analysis").toString();
	 String jobnameCopy= Segmentname+"_Copy";
	 CommonObjects.filterName(jobnameCopy);
	  segmentObjects.filtersegmentAnalysisJob();
	}
	 
	
	
	@Then("^Rerun the SegmentAnalysisJob$")
	public void Rerun_job() throws Exception{
		segmentObjects.RerunSegmentAnalysisJob();
	}
	
	@Then("^Copy the SegmentAnalysisJob$")
	public void Copy_Job() throws Exception{
		segmentObjects.CopySegmentAnalysisJob();
	}
	
	
	@Then("^filter the Segment Analysis Copy for status check from sheet \"([^\"]*)\"$")                                      // filter a job
	public void filter_the_Segment_Analysis_Copy_for_status_check_from_sheet(String SegmentAnalysisSheet) throws Exception{
	 eh.setExcelFile("SegmentAnalysis", SegmentAnalysisSheet);//set excel file
	 String jobname = eh.getCellByColumnName("Segment_Analysis").toString();
	 String jobnameCopy= jobname+"_Copy";
	 CommonObjects.filterName(jobnameCopy);
	}
	
	@Then("^Create Micro Segment")
	public void Create_Micro_Segment() throws Exception{
		segmentObjects.CreateMicroSegment();
	}

	@Then("^Create Cross-Tab$")
	public void Create_Cross_Tab() throws Exception{
		segmentObjects.CreateCrossTab();
	}
	

	@Then("^edit Micro-Segment$")
	public void edit_Micro_Segment() throws Exception{
		segmentObjects.editMicroSegment();
		
	}
	@Then("^delete Segment Analysis job from sheet \"([^\"]*)\"$")
	public void delete_Segment_Analysi_Job(String jobName) throws Exception{
		eh.setExcelFile("SegmentAnalysis", jobName);//set excel file
		 String SegmentJobname = eh.getCellByColumnName("Segment_Analysis").toString();
		segmentObjects.deleteSegmentAnalysisjob(SegmentJobname);
	}
	@Then("^find the Target count$")
	public void find_the_target_count() throws Exception{
		segmentObjects.TargetCount() ;
	}
	@Then("^save the Micro Segment$")
	public void save_the_Micro_Segment() throws Throwable {
		segmentObjects.saveMicroSegment();
		
	    
	}
	
	
	
	
	}
	
	
	


