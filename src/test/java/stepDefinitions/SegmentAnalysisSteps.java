package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.RandomNameGenerator;
import baseClasses.TimeoutImpl;
import cucumber.api.java.en.Then;
import pageObjetcs.CommonObjects;
import pageObjetcs.SegmentAnalysisObjects;

public class SegmentAnalysisSteps extends Init {
	
	JSWaiter jswait = new JSWaiter();
	ExcelHelper eh = new ExcelHelper();
	SegmentAnalysisObjects segmentObjects=new SegmentAnalysisObjects();
	CommonObjects CommonObjects=new CommonObjects();

	
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
	
	
	@Then("^filter segment analysis$")
	public void filtersegment() throws InterruptedException {
		
		segmentObjects.filtersegment();	
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
	
	@Then("^create SegmentAnalysis \"([^\"]*)\"$")
	public void enterSegmentAnalysisName(String AnalysisName) throws Exception{
		 eh.setExcelFile("SegmentAnalysis", AnalysisName);//set excel file
		 String name = eh.getCellByColumnName("Segment_Analysis");//get sheet name
		 name = RandomNameGenerator.getRandomName(name);//append new random name
		 segmentObjects.SegmentName(name); //pass new name to SegmentName()
		 eh.setCell("Segment_Analysis",name);
		 
	}
	
	
	@Then("^edit the Segment Analysis job \"([^\"]*)\"$")                                      // filter a job
		public void editSegmentAnalysis(String SegmentAnalysisSheet) throws Exception{
		 eh.setExcelFile("SegmentAnalysis", SegmentAnalysisSheet);//set excel file
		 String Segmentname = eh.getCellByColumnName("Segment_Analysis").toString();
		 CommonObjects.filterName(Segmentname);
	      segmentObjects.editSegmentAnalysis();
	      			 
	}

	@Then("^change the target condition to create and save$")
	public void changeTargetConditionCreate() throws Exception{
		segmentObjects.changeTargetConditionCreate();
	}
	
	@Then("^change the target condition to Saved Segment and save$")
	public void changeTargetConditinSavedSegment() throws Exception{
		segmentObjects.changeTargetConditinSavedSegment();
	}
	
	@Then("^add a KPI$")
	public void addKPI() throws Exception{
		segmentObjects.addKPI();
	}
	
	@Then("^delete a KPI$")
	public void deleteKPI() throws Exception{
		segmentObjects.deleteKPI();
	}
	@Then("^edit a KPI$")
	public void editKPI() throws Exception{
		
	}
	}
	
	
	


