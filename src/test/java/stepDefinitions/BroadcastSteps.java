package stepDefinitions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;
import baseClasses.SQLHandler;

import org.apache.commons.collections4.bag.CollectionBag;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.google.common.collect.Collections2;
import com.itextpdf.text.log.SysoCounter;

import baseClasses.CalenderUtility;
import baseClasses.EmailHelper;
import baseClasses.ExcelHelper;
import baseClasses.Init;
import baseClasses.JSWaiter;
import baseClasses.Navigation;
import baseClasses.RandomNameGenerator;
import baseClasses.ShellExecuter;
import baseClasses.TimeoutImpl;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjetcs.AdminPageObjects;
import pageObjetcs.BroadcastPageObjects;
import pageObjetcs.CampaignObjects;
import pageObjetcs.CatalogPageObjects;
import pageObjetcs.CommonObjects;
import pageObjetcs.CustomerProfilePage;
import pageObjetcs.LoginPageObjects;
import pageObjetcs.OfferPageObjects;
import pageObjetcs.TargetConditionObjects;
import pageObjetcs.dkpageobjects;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import org.apache.poi.hssf.usermodel.HSSFRow;
public class BroadcastSteps extends Init {

	JSWaiter jswait = new JSWaiter();

	public ExcelHelper eM = new ExcelHelper();
	public ExcelHelper eh = new ExcelHelper();
	CampaignObjects campaignObjects = new CampaignObjects();
	AdminPageObjects adminPageObjects = new AdminPageObjects();
	CatalogPageObjects catalogPageObjects = new CatalogPageObjects();
	OfferPageObjects offerPageObjects = new OfferPageObjects();
	LoginPageObjects loginPage = new LoginPageObjects();
	CommonObjects commonObjects = new CommonObjects();
	CustomerProfilePage customerObjects= new CustomerProfilePage();
	dkpageobjects dkpageobjects = new dkpageobjects();
	TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
	BroadcastPageObjects broadcastPageObjects = new BroadcastPageObjects();
	public WebDriverWait wait = new WebDriverWait(driver, 8);
	CalenderUtility calender=new CalenderUtility();
	@Then("^check if create new bc lands in details tab$")
	public void checkLandingOfCreateNewBc() throws Throwable {
		broadcastPageObjects.enterBroadcastName("check");
	}

	@Then("^verify view braodcast breadcrumb$")
	public void verifyViewBroadcastBreadcrumb() throws Throwable {
		eM.setExcelFile("campaignInputData", "campaignBC");
		Assert.assertTrue("Wrong breadcrumb",
				jswait.checkClickable("//flytxt-breadcrumbs//flytxt-breadcrumb[5]//paper-button[contains(text(),'"
						+ (String) eM.getCell(1, 0) + "')]"));
		eM.setExcelFile("campaignCategoryInputData", "campaignCategory");
		Assert.assertTrue("Wrong breadcrumb",
				jswait.checkClickable("//flytxt-breadcrumbs//flytxt-breadcrumb[4]//paper-button[contains(text(),'"
						+ (String) eM.getCell(1, 0) + "')]"));
		Assert.assertTrue("Wrong breadcrumb", jswait.checkClickable(
				"//flytxt-breadcrumbs//flytxt-breadcrumb[3]//paper-button[contains(text(),'Life-Cycle Marketing')]"));

	}

	public void pauseChildBC(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		jswait.loadClick(
				"//vaadin-grid-cell-content[contains(.,'" + eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
		jswait.loadClick(".//*[@id='broadcastGridMenu']//paper-item[contains(.,'Pause')]");
		jswait.loadClick(".//*[@id='confirmBoxPause']//paper-button[contains(text(),'Yes')]");
		Thread.sleep(5000);
		jswait.waitUntil("//vaadin-grid-cell-content[contains(.,'" + eh.getCellByColumnName("BC Name")
				+ "')]/../..//vaadin-grid-cell-content[contains(.,'Paused')]");
	}

	public void pauseBC(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		if (eh.getCellByColumnName("Type").contentEquals("recurring")) {
			jswait.loadClick("//vaadin-grid-cell-content[contains(.,'" + eh.getCellByColumnName("BC Name")
					+ "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastRecurGridMenu']//paper-item[contains(.,'Pause')]");
			jswait.loadClick(".//*[@id='confirmBoxPause']//paper-button[contains(text(),'Yes')]");
			commonObjects.toggleAutoRefresh();
			Thread.sleep(5000);
			jswait.waitUntil("//vaadin-grid-cell-content[contains(.,'" + eh.getCellByColumnName("BC Name")
					+ "')]/../..//vaadin-grid-cell-content[contains(.,'Paused')]");
		} else if (eh.getCellByColumnName("Type2").contentEquals("seedingTriggerable")) {

			jswait.loadClick("//vaadin-grid-cell-content[contains(.,'" + eh.getCellByColumnName("BC Name")
					+ "')]/../..//iron-icon");
			jswait.loadClick(
					".//paper-menu-button[@id='broadcastTriggerGridMenu']/iron-dropdown[@id='dropdown']//paper-menu[@role='menu']/div/paper-item[contains(.,'Pause')]");
			jswait.loadClick(".//*[@id='confirmBoxPause']//paper-button[contains(text(),'Yes')]");
			jswait.loadClick("(//div[@id='toggleButton'])[2]");
			Thread.sleep(5000);
			jswait.waitUntil("//vaadin-grid-cell-content[contains(.,'" + eh.getCellByColumnName("BC Name")
					+ "')]/../..//vaadin-grid-cell-content[contains(.,'Paused')]");
		} else if (eh.getCellByColumnName("Type").contentEquals("seedingRecurring")
				|| eh.getCellByColumnName("Type").contentEquals("seedingTriggerableRecurringBC")) {
			jswait.loadClick(".//*[@id='broadcastSeedList']//vaadin-grid-cell-content[contains(.,'"
					+ eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastSeedGridMenu']//paper-item[contains(.,'Pause')]");
			jswait.loadClick(".//*[@id='confirmBoxPause']//paper-button[contains(text(),'Yes')]");
			commonObjects.toggleAutoRefresh();
			Thread.sleep(5000);
			jswait.waitUntil(".//*[@id='broadcastSeedList']//vaadin-grid-cell-content[text()='"
					+ eh.getCellByColumnName("BC Name")
					+ "']/../..//vaadin-grid-cell-content[contains(text(),'Paused')]");
		}
	}

	public void resumeBC(String sheet) throws Exception {
		eh.setExcelFile("bcInputData", sheet);
		if (eh.getCellByColumnName("Type").contentEquals("recurring")) {
			jswait.loadClick(".//*[@id='broadcastRecurList']//vaadin-grid-cell-content[text()='"
					+ eh.getCellByColumnName("BC Name") + "']/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastRecurGridMenu']//paper-item[contains(.,'Resume')]");
			jswait.loadClick(".//*[@id='confirmBoxResume']//paper-button[contains(text(),'Yes')]");
			Thread.sleep(5000);
			jswait.waitUntil(".//*[@id='broadcastRecurList']//vaadin-grid-cell-content[text()='"
					+ eh.getCellByColumnName("BC Name")
					+ "']/../..//vaadin-grid-cell-content[contains(text(),'Active')]");
		}
		if (eh.getCellByColumnName("Type").contentEquals("seedingRecurring")
				|| eh.getCellByColumnName("Type").contentEquals("seedingTriggerableRecurringBC")) {
			jswait.loadClick(".//*[@id='broadcastSeedList']//vaadin-grid-cell-content[text()='"
					+ eh.getCellByColumnName("BC Name") + "']/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastSeedGridMenu']//paper-item[contains(.,'Resume')]");
			jswait.loadClick(".//*[@id='confirmBoxResume']//paper-button[contains(text(),'Yes')]");
			Thread.sleep(5000);
			jswait.waitUntil(".//*[@id='broadcastSeedList']//vaadin-grid-cell-content[text()='"
					+ eh.getCellByColumnName("BC Name")
					+ "']/../..//vaadin-grid-cell-content[contains(text(),'Active')]");
		}
	}

	@Then("^pause bc from sheet \"([^\"]*)\"$")
	public void verifyPauseAndResume(String sheet) throws Throwable {
		pauseBC(sheet);
		Thread.sleep(3000);
	}

	@Then("^pause child bc from sheet \"([^\"]*)\"$")
	public void verifyPauseAndResumeChild(String sheet) throws Throwable {
		pauseChildBC(sheet);
		Thread.sleep(3000);
	}

	@Then("^resume bc from sheet \"([^\"]*)\"$")
	public void ResumeBC(String sheet) throws Exception {
		resumeBC(sheet);
	}

	@Then("^verify selected campaign name$")
	public void verifyViewBroadcastCampaignName() throws Throwable {
		eM.setExcelFile("campaignInputData", "campaignBC");
		Assert.assertTrue("Wrong breadcrumb",
				jswait.checkClickable("//flytxt-breadcrumbs//flytxt-breadcrumb[5]//paper-button[contains(text(),'"
						+ (String) eM.getCell(1, 0) + "')]"));
	}

	@Then("^verify create new broadcast button$")
	public void verifyCreateNewBroadcast() throws Throwable {
		broadcastPageObjects.enterBroadcastName("new BC");
	}

	@Then("^verify options icon of bc$")
	public void verifyOptionsIconBroadcast() throws Throwable {
		commonObjects.clickOptionsIcon();
	}

	@Then("^view broadcast from sheet \"([^\"]*)\"$")
	public void view_broadcasts(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		if (eh.getCellByColumnName("Type").contentEquals("recurring")) {
			jswait.loadClick(".//*[@id='broadcastRecurList']//vaadin-grid-cell-content[contains(.,'"
					+ eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastRecurGridMenu']//paper-item[contains(.,'View')]");
		} else if (eh.getCellByColumnName("Type").contentEquals("seedingRecurring")
				|| eh.getCellByColumnName("Type").contentEquals("seedingTriggerableRecurringBC")) {
			jswait.loadClick(".//*[@id='broadcastSeedList']//vaadin-grid-cell-content[contains(.,'"
					+ eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastSeedGridMenu']//paper-item[contains(.,'View')]");
		} else if (eh.getCellByColumnName("Type").contentEquals("one-off")) {
			commonObjects.filterName(eh.getCellByColumnName("BC Name"));
			commonObjects.clickOptionsIcon();
			broadcastPageObjects.clickBroadcastViewOption();
		}
	}

	@Then("^verify delivery details from \"([^\"]*)\"$")
	public void verify_view_broadcasts_delivery(String sheet) throws Throwable {
		jswait.loadClick(".//*[@id='headingdel'][contains(.,'Delivery Details')]");
		eh.setExcelFile("bcInputData", sheet);
		if (eh.getCellByColumnName("Recurrance Pattern").contentEquals("months")) {
			StringBuilder xpathBUlder = new StringBuilder("//*[@id='longPattern']/p/a[");
			String daysStr = eh.getCellByColumnName("Recur on");
			String[] days = daysStr.split(",");
			xpathBUlder.append("contains(.,'" + days[0] + "')");
			for (int i = 1; i < days.length; i++)
				xpathBUlder.append(" and contains(.,'" + days[i] + "')");
			xpathBUlder.append("]");
			jswait.waitUntil(xpathBUlder.toString());
			jswait.waitUntil("//*[@id='longPattern']/p[2][contains(.,'Recur every')]");
			jswait.waitUntil("//*[@id='longPattern']/p[2][contains(.,'month')]");
		}
	}

	public void enterDeliveryTabDetails(String bc_type, String sheet) throws InterruptedException, Exception {
		eM.setExcelFile("bcInputData", sheet);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = String.format("%02d", rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		 if(min==0)
			{
				min+=5;
			}
			
			
		
		try {
			eM.setExcelFile("bcInputData", sheet);
			if ((String) eM.getCell(1, 6) == "later") {
				day++;
			}
		} catch (Exception e) {
			System.out.println("edit days");
			eh.setExcelFile("bcInputDataForEdit", sheet);
			if ((String) eh.getCell(1, 6) == "later") {
				day++;
			} else if ((eh.getCell(1, 6).toString()).contains("After2Days")) {
				day = rightNow.get(Calendar.DAY_OF_MONTH) + 2;
				// day=day+2;
				System.out.println("Days" + day);
				date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-" + String.format("%02d", day);
				System.out.println(date);
			}
		}
		// we are getting the broadcast start date and stored in sheet , row 1 column 11
		String Start_Date="";
		if(sheet.contains("Edit")||sheet.contains("seedingTriggerableRecurringBCEd")){
			String monthString=calender.getMonthForInt(rightNow.get(Calendar.MONTH));
			if(am_pm==0) {
			Start_Date= String.format("%02d", day)+" "+monthString.substring(0, 3)+" "+year+" "+String.format("%02d", hours)+":"+String.format("%02d", min)+" AM GMT+05:30";
			}else {
				 Start_Date= String.format("%02d", day)+" "+monthString.substring(0, 3)+" "+year+" "+String.format("%02d", hours)+":"+String.format("%02d", min)+" PM GMT+05:30";
			}
			eh.setExcelFile("bcInputDataForEdit", sheet);
			eh.setCell(1, 11, Start_Date);
		}else {
			String monthString=calender.getMonthForInt(rightNow.get(Calendar.MONTH));
			if(am_pm==0) {
			Start_Date= String.format("%02d", day)+" "+monthString.substring(0, 3)+" "+year+" "+String.format("%02d", hours)+":"+String.format("%02d", min)+" AM GMT+05:30";
			}else {
				 Start_Date= String.format("%02d", day)+" "+monthString.substring(0, 3)+" "+year+" "+String.format("%02d", hours)+":"+String.format("%02d", min)+" PM GMT+05:30";
			}
			eM.setExcelFile("bcInputData", sheet);
			eM.setCell(1, 11, Start_Date);
			
		}
		
		
		Actions builder = new Actions(driver);
		if (bc_type.contentEquals("one-off") || bc_type.contentEquals("seedingTriggerable")
				|| bc_type.contentEquals("one-offInformational")) {
			Thread.sleep(1000);
			broadcastPageObjects.clickOneOffRadioButton();
			// jswait.loadClick(".//div[@id='radioLabel' and
			// contains(.,'One-off')]/../div[1]");
			Thread.sleep(1000);
			jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			// jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			// jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
			// num1 =
			// driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number
			// style-scope paper-clock-selector'][41]"));
			// builder.moveToElement(num1).click().build().perform();
			// Thread.sleep(2000);
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			if (bc_type.contentEquals("one-off")) {
				jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
				Thread.sleep(1000);
				jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
				Thread.sleep(1000);
				jswait.loadClick(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
				Thread.sleep(3000);
				jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
				Thread.sleep(2000);
				num = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
								+ (hours + 1) + "]"));
				builder.moveToElement(num).click().build().perform();
				Thread.sleep(1000);
				// jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
				WebElement num2 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
								+ (min + 1) + "]"));
				builder.moveToElement(num2).click().build().perform();
				Thread.sleep(1000);
				// jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
				// num1 =
				// driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number
				// style-scope paper-clock-selector'][21]"));
				// builder.moveToElement(num1).click().build().perform();
				// Thread.sleep(1000);
				if (am_pm == 0) {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
					builder.moveToElement(num1).click().build().perform();

				} else {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
					builder.moveToElement(num1).click().build().perform();
				}

				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
				builder.moveToElement(num1).click().build().perform();
				Thread.sleep(1000);
			} else if (bc_type.contentEquals("one-offInformational")) {
				jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
				Thread.sleep(1000);
				jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
				Thread.sleep(1000);
				jswait.loadClick(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
				Thread.sleep(3000);
				jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
				Thread.sleep(2000);
				num = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
								+ (hours + 1) + "]"));
				builder.moveToElement(num).click().build().perform();
				Thread.sleep(1000);
				// jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
				WebElement num2 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
								+ (min + 1) + "]"));
				builder.moveToElement(num2).click().build().perform();
				Thread.sleep(1000);
				// jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
				// num1 =
				// driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number
				// style-scope paper-clock-selector'][21]"));
				// builder.moveToElement(num1).click().build().perform();
				// Thread.sleep(1000);
				if (am_pm == 0) {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
					builder.moveToElement(num1).click().build().perform();

				} else {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
					builder.moveToElement(num1).click().build().perform();
				}

				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
				builder.moveToElement(num1).click().build().perform();
				Thread.sleep(1000);
			}
			// Thread.sleep(1000);
		} else if (bc_type.contentEquals("one-off") || bc_type.contentEquals("facebook")) {
			Thread.sleep(1000);
			broadcastPageObjects.clickOneOffRadioButton();
			// jswait.loadClick(".//div[@id='radioLabel' and
			// contains(.,'One-off')]/../div[1]");
			Thread.sleep(1000);
			jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			// jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			// jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
			// num1 =
			// driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number
			// style-scope paper-clock-selector'][41]"));
			// builder.moveToElement(num1).click().build().perform();
			// Thread.sleep(2000);
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			if (bc_type.contentEquals("facebook")) {
				jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
				Thread.sleep(1000);
				jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
				Thread.sleep(1000);
				jswait.loadClick(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
				Thread.sleep(3000);
				jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
				Thread.sleep(2000);
				num = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
								+ (hours + 1) + "]"));
				builder.moveToElement(num).click().build().perform();
				Thread.sleep(1000);
				// jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
				WebElement num2 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
								+ (min + 1) + "]"));
				builder.moveToElement(num2).click().build().perform();
				Thread.sleep(1000);
				// jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
				// num1 =
				// driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number
				// style-scope paper-clock-selector'][21]"));
				// builder.moveToElement(num1).click().build().perform();
				// Thread.sleep(1000);
				if (am_pm == 0) {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
					builder.moveToElement(num1).click().build().perform();

				} else {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
					builder.moveToElement(num1).click().build().perform();
				}

				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
				builder.moveToElement(num1).click().build().perform();
			}
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[1]");
			Thread.sleep(3000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'After')]");

			Thread.sleep(2000);
			jswait.loadSendKeys("//label[contains(.,'Expires')]//following::input[2]", "1");

			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[2]");
			Thread.sleep(3000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'Days')]");

			Thread.sleep(2000);
			jswait.loadSendKeys("//label[contains(.,'Budget Amount')]//following::input[1]", "50");

		}

		else if (bc_type.contentEquals("recurring") || bc_type.contentEquals("seedingRecurring")
				|| bc_type.contentEquals("seedingTriggerableRecurringBC")) {
			Thread.sleep(2000);
			System.out.println("Inside recurring");
			
			
			// if(bc_type.contentEquals("recurring")){
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
			jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
			jswait.loadClick(".//*[@id='months']//div[@date='" + date + "']");
			jswait.loadClick("//paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			// }
			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			// jswait.loadClick("//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
			
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			// Thread.sleep(1000);
			// jswait.loadClick("//form[@id='deliverDetailForm']//paper-input-container//label[contains(.,'Time
			// Zone')]/..//input");
			Thread.sleep(1000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			try {
				if (eM.getCellByColumnName("Recurrance Pattern").contains("days")) {
					// to get the recurence time and stored into bcinputdata wb and recurring bc sheets in column 11, row 1 
//					String bcRecurTime=hours+":"+min;
//					eM.setCell(1, 11, bcRecurTime);
					
					String recurringDays=(eM.getCellByColumnName("Recurrance Pattern").toString()).substring(0);
					
					System.out.println("Selecting the"+ recurringDays +" recurrence pattren");
					
					jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
					Thread.sleep(1000);
					jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
					Thread.sleep(1000);
					jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input",recurringDays);
					Thread.sleep(1000);

				} else if (eM.getCellByColumnName("Recurrance Pattern").contentEquals("months")
						&& !eM.getCellByColumnName("BC Name").contains("Copy")) {
					System.out.println("Selecting the recurrence pattren in months");
					jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
					Thread.sleep(1000);
					jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Months')]");
					Thread.sleep(1000);

					jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input",
							eM.getCellByColumnName("Recur every months"));
					Thread.sleep(1000);

					if (eM.getCellByColumnName("Recur on").contentEquals("5th weekend day")) {
						System.out.println("Selecting the recurrence pattren in 5th weekend day");
						jswait.loadClick("//div[@id='radioLabel'][contains(.,'Select special day')]/..");
						jswait.loadClick("//label[contains(.,'Order of the Day')]/..//input");
						jswait.loadClick("//paper-item[contains(.,'5th')]");
						jswait.loadClick("//label[contains(.,'Type of Day')]/..//input");
						jswait.loadClick("//paper-item[contains(.,'Weekend Day')]");
					} else {
						jswait.loadClick("//label[contains(.,'Select days')]/..//input");
						String daysStr = eM.getCellByColumnName("Recur on");
						String[] days = daysStr.split(",");
						jswait.loadClick("//*[@id='dayDialog']//div[text()='" + rightNow.get(Calendar.DAY_OF_MONTH)
								+ "']/../..");
						for (int i = 0; i < days.length; i++)
							jswait.loadClick("//*[@id='dayDialog']//div[text()='" + days[i] + "']/../..");
						jswait.loadClick(".//*[@id='dayDialog']//paper-button[text()='Done']");
					}

				}

				jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
				Thread.sleep(2000);
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
				num = driver.findElement(By.xpath(
						"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
								+ (hours + 1) + "]"));
				builder.moveToElement(num).click().build().perform();
				Thread.sleep(2000);
				// jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
				num1 = driver.findElement(By.xpath(
						"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
								+ (min + 1) + "]"));
				Thread.sleep(1000);
				builder.moveToElement(num1).click().build().perform();

				Thread.sleep(1000);
				if (am_pm == 0)
					jswait.loadClick(
							"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
				else
					jswait.loadClick(
							"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
				Thread.sleep(2000);
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
				Thread.sleep(2000);
				jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");
			} catch (Exception e) {
				eh.setExcelFile("bcInputDataForEdit", sheet);
				
				System.out.println("Inside catch");

				String recurringDays="";
				if (eh.getCellByColumnName("Recurrance Pattern").contains("days")) {
					
					try {
                   recurringDays=(eh.getCellByColumnName("Recurrance Pattern").toString()).substring(0);
					
					System.out.println("Selecting the"+ recurringDays +" recurrence pattren");
					}catch (Exception ep) {
					 recurringDays="1";
					}
					
					jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
					Thread.sleep(1000);
					jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
					Thread.sleep(1000);
					jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", recurringDays);
					Thread.sleep(1000);

				} else if (eh.getCellByColumnName("Recurrance Pattern").contentEquals("months")
						&& !eh.getCellByColumnName("BC Name").contains("Copy")) {
					System.out.println("Selecting the recurrence pattren in months");
					jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
					Thread.sleep(1000);
					jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Months')]");
					Thread.sleep(1000);

					jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input",
							eM.getCellByColumnName("Recur every months"));
					Thread.sleep(1000);

					if (eh.getCellByColumnName("Recur on").contentEquals("5th weekend day")) {
						System.out.println("Selecting the recurrence pattren in 5th weekend day");
						jswait.loadClick("//div[@id='radioLabel'][contains(.,'Select special day')]/..");
						jswait.loadClick("//label[contains(.,'Order of the Day')]/..//input");
						jswait.loadClick("//paper-item[contains(.,'5th')]");
						jswait.loadClick("//label[contains(.,'Type of Day')]/..//input");
						jswait.loadClick("//paper-item[contains(.,'Weekend Day')]");
					} else {
						jswait.loadClick("//label[contains(.,'Select days')]/..//input");
						String daysStr = eh.getCellByColumnName("Recur on");
						String[] days = daysStr.split(",");
						jswait.loadClick("//*[@id='dayDialog']//div[text()='" + rightNow.get(Calendar.DAY_OF_MONTH)
								+ "']/../..");
						for (int i = 0; i < days.length; i++)
							jswait.loadClick("//*[@id='dayDialog']//div[text()='" + days[i] + "']/../..");
						jswait.loadClick(".//*[@id='dayDialog']//paper-button[text()='Done']");
					}

				}

				jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
				Thread.sleep(2000);
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
				num = driver.findElement(By.xpath(
						"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
								+ (hours + 1) + "]"));
				builder.moveToElement(num).click().build().perform();
				Thread.sleep(2000);
				// jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
				num1 = driver.findElement(By.xpath(
						"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
								+ (min + 1) + "]"));
				Thread.sleep(1000);
				builder.moveToElement(num1).click().build().perform();

				Thread.sleep(1000);
				if (am_pm == 0)
					jswait.loadClick(
							"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
				else
					jswait.loadClick(
							"//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
				Thread.sleep(2000);
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
				Thread.sleep(2000);
				jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");

			}
		} else if (bc_type.contentEquals("recurringfacebook")) {
			Thread.sleep(2000);
			System.out.println("Inside recurring");
			// if(bc_type.contentEquals("recurring")){
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
			jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
			jswait.loadClick(".//*[@id='months']//div[@date='" + date + "']");
			jswait.loadClick("//paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			// }
			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			// jswait.loadClick("//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			// Thread.sleep(1000);
			// jswait.loadClick("//form[@id='deliverDetailForm']//paper-input-container//label[contains(.,'Time
			// Zone')]/..//input");
			Thread.sleep(1000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			if (eM.getCellByColumnName("Recurrance Pattern").contentEquals("days")) {

				jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
				Thread.sleep(1000);
				jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
				Thread.sleep(1000);
				jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
				Thread.sleep(1000);

			} else if (eM.getCellByColumnName("Recurrance Pattern").contentEquals("months")
					&& !eM.getCellByColumnName("BC Name").contains("Copy")) {
				jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
				Thread.sleep(1000);
				jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Months')]");
				Thread.sleep(1000);

				jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input",
						eM.getCellByColumnName("Recur every months"));
				Thread.sleep(1000);

				if (eM.getCellByColumnName("Recur on").contentEquals("5th weekend day")) {
					jswait.loadClick("//div[@id='radioLabel'][contains(.,'Select special day')]/..");
					jswait.loadClick("//label[contains(.,'Order of the Day')]/..//input");
					jswait.loadClick("//paper-item[contains(.,'5th')]");
					jswait.loadClick("//label[contains(.,'Type of Day')]/..//input");
					jswait.loadClick("//paper-item[contains(.,'Weekend Day')]");
				} else {
					jswait.loadClick("//label[contains(.,'Select days')]/..//input");
					String daysStr = eM.getCellByColumnName("Recur on");
					String[] days = daysStr.split(",");
					jswait.loadClick(
							"//*[@id='dayDialog']//div[text()='" + rightNow.get(Calendar.DAY_OF_MONTH) + "']/../..");
					for (int i = 0; i < days.length; i++)
						jswait.loadClick("//*[@id='dayDialog']//div[text()='" + days[i] + "']/../..");
					jswait.loadClick(".//*[@id='dayDialog']//paper-button[text()='Done']");
				}

			}
			jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
			num = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
			// jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
			num1 = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();

			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");

			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[1]");
			Thread.sleep(3000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'After')]");

			Thread.sleep(2000);
			jswait.loadSendKeys("//label[contains(.,'Expires')]//following::input[2]", "1");

			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[2]");
			Thread.sleep(3000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'Days')]");

			Thread.sleep(2000);
			jswait.loadSendKeys("//label[contains(.,'Budget Amount')]//following::input[1]", "50");
		}

	}

	@Then("^verify selected campaign category name$")
	public void verifyViewBroadcastCampaignCategoryName() throws Throwable {
		eM.setExcelFile("campaignCategoryInputData", "campaignCategory");
		Assert.assertTrue("Wrong breadcrumb",
				jswait.checkClickable("//flytxt-breadcrumbs//flytxt-breadcrumb[4]//paper-button[contains(text(),'"
						+ (String) eM.getCell(1, 0) + "')]"));
	}

	@Then("^check create new offer in bc creation$")
	public void checkCreateNewOfferOfCreateNewBc() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("new Offer", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		broadcastPageObjects.clickProceedButton();
		offerPageObjects.clickCreateNewOfferButton();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions actions = new Actions(driver);

		ExcelHelper prodcutFile = new ExcelHelper();
		prodcutFile.setExcelFile("productInputData", "singleProductPage");
		eh.setExcelFile("offerInputData", "rechargeSMS");

		// ******************Details tab******************:
		offerPageObjects.enterDetailsTabFields("rechargeSMS");
		broadcastPageObjects.clickOfferPopUpProceedButton();
		// ******************Products tab*****************:
		offerPageObjects.clickOfferAddButton();
		broadcastPageObjects.clickProductFilterButton();
		broadcastPageObjects.enterFilterProductName(prodcutFile.getCell(1, 0).toString());
		broadcastPageObjects.clickProductFilterApplyButton();
		jswait.loadClick("//span[contains(.,'" + prodcutFile.getCell(1, 0).toString() + "')]");
		offerPageObjects.clickDialogBoxAddButton();
		broadcastPageObjects.clickOfferPopUpProceedButton();

		// ******************Creative tab*****************:
		offerPageObjects.selectCreativeLanguageEnglish();
		if (((String) eh.getCell(1, 3)).contains("WAP")) {
			offerPageObjects.enterWapCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		}
		if (eh.getCell(1, 3).toString().contains("SMS"))
			offerPageObjects.enterSmsCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());
		if (eh.getCell(1, 3).toString().contains("Voice"))
			offerPageObjects.enterVoiceCreative(eh.getCell(1, 10).toString(), eh.getCell(1, 11).toString());

		broadcastPageObjects.clickOfferPopUpProceedButton();
		Thread.sleep(3000);

		// ******************Track tab*****************:
		if (!eh.getCell(1, 2).toString().contains("Informational")) {
			offerPageObjects.clickTrackSourceSelector();
			offerPageObjects.selectTrackSource("track");
		}
		broadcastPageObjects.clickOfferPopUpProceedButton();

		// ******************Rewards tab*****************:
		if (eh.getCell(1, 2).toString().contains("Seeding")) {
			offerPageObjects.clickRewardTypeInputField();
			offerPageObjects.clickRewardTypeAny();
		}
		offerPageObjects.clickSaveOfferButton();
		eh.setExcelFile("offerInputData", "rechargeSMS");
		commonObjects.filterName((String) eh.getCell(1, 0));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//data-table-cell[contains(.,'" + (String) eh.getCell(1, 0) + "')]")));

	}

	@Then("^activate bc$")
	public void activateBc() throws Throwable {
		broadcastPageObjects.clickCreateButton();
		broadcastPageObjects.clickActivateButton();
		broadcastPageObjects.clickActivateConfirmYes();
		Thread.sleep(10000);
	}

	@Then("^verify bc created from sheet \"([^\"]*)\"$")
	public void verifyBCFromSheet(String sheet) throws InterruptedException {

		Thread.sleep(3000);
		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);
		broadcastPageObjects.verifyBCFromSheet(name);

	}

	@Then("^verify edit option of bc$")
	public void verifyEditBc() throws Throwable {
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		broadcastPageObjects.enterBroadcastName("edit bc");
	}

	@Then("^verify pause option of bc$")
	public void verifyPauseBc() throws Throwable {
		commonObjects.clickOptionsIcon();
		commonObjects.clickPauseOption();
		String statusOfBc = broadcastPageObjects.getTopBcStatus();
		Assert.assertTrue("Invalid status of BC", statusOfBc.contains("Pause"));
	}

	@Then("^verify textual editor for target condition$")
	public void verifyTextualEditorOfTargetCondition() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("check", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		commonObjects.clickOptionsIcon();
		commonObjects.clickTargetConditionOptionEdit();
		targetConditionObjects.clickBasicTargetConditionWithAge();
	}

	@Then("^verify delete option of target condition$")
	public void verifyDeleteOptionOfTargetCondition() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("check", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		commonObjects.clickOptionsIcon();
		commonObjects.clickTargetConditionOptionDelete();
		targetConditionObjects.clickBasicTargetConditionWithAge();
	}

	@Then("^verify proceed button without adding target condition$")
	public void verifyProceedWithoutTargetCondition() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("check", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectOffer("Offer");
	}

	@Then("^verify choose offer window after selecting offer$")
	public void verifyChooseOfferWindowAfterSelectingOffer() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("check", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectOffer("Offer");
		broadcastPageObjects.selectTrackSession();
		broadcastPageObjects.selectTrackingSource();
		broadcastPageObjects.selectSenderAndRoute();
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^verify selecting channel and sender$")
	public void verifySelectingChannelAndSender() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("check", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectOffer("Offer");
		broadcastPageObjects.selectTrackSession();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectTrackingSource();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectSenderAndRoute();
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^verify navigating to delivery tab without selecting channel and sender$")
	public void verifyNavigatingToDeliveryTab() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("check", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectOffer("Offer");
		broadcastPageObjects.selectTrackSession();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectTrackingSource();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectSenderAndRoute();
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^verify mandatory fields in details tab$")
	public void verifyMandatoryFieldsInDetailsTab() throws Throwable {
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.enterBroadcastName("check");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.enterBroadcastPurpose("purpose");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectInventory(INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^verify proceeding to target tab$")
	public void verifyProceedingToTab() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("ProceedCheck", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
	}

	@Then("^verify headers after proceeding to next target tab$")
	public void verifyHeaderAfterProceedingToNextTab() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("ProceedCheck", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.checkDetailsTabHeaderColor();
	}

	@Then("^verify validations of bc details tab$")
	public void verifyValidationsOfBcDetails() throws Throwable {
		broadcastPageObjects.validateNameField();
		broadcastPageObjects.validatePurposeField();
		broadcastPageObjects.verifySelectionFields();
	}

	@Then("^verify broadcast schedle range details$")
	public void verifyBcScheduleRangeDetails() throws Throwable {
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		// schedule for later
		day++;

		broadcastPageObjects.enterBroadcastBasicDetails("schedle", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectFirstOffer();
		broadcastPageObjects.selectTrackSession();
		broadcastPageObjects.selectTrackingSource();
		broadcastPageObjects.selectSenderAndRoute();
		broadcastPageObjects.clickProceedButton();
		jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
		jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
		jswait.loadClick(".//div/paper-date-time-input[1]//div[@date='" + date + "']");
		jswait.loadClick(".//div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
//		 jswait.loadClick(".//paper-date-time-input[1]//paper-input[2]//input");
		///////////////////////////////////////////////////////////////////
		broadcastPageObjects.clickBcEndNeverRadioButton();
		broadcastPageObjects.selectRecurrancePattern();
		broadcastPageObjects.clickCreateButton();
		date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH) + 1);
		jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
		jswait.loadClick(".//div/paper-date-time-input[1]//div[@date='" + date + "']");
		jswait.loadClick(".//div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
		broadcastPageObjects.clickBcEndAtRadioButton();
		broadcastPageObjects.clickCreateButton();
		broadcastPageObjects.clickBcEndNeverRadioButton();
		broadcastPageObjects.clickCreateButton();
		broadcastPageObjects.clickActivateButton();

	}
	// ---------------------------------------------------------------------

	@Then("^verify target duplicate function in new broadcast$")
	public void targetduplicationbc() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("targetduplication", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList(BASE_LIST);
		broadcastPageObjects.clickcreateTargetCondition();
		commonObjects.clickOptionsIcon();
		broadcastPageObjects.ClickCopyAsAnd();
		broadcastPageObjects.ClickCopiedAnd();
		// broadcastPageObjects.AddAnd();

	}

	@Then("^verify create BC Notification$")
	public void createBCNotification() throws Exception {

//		broadcastPageObjects.enterBroadcastBasicDetails("notification","Unlimited");
//		broadcastPageObjects.clickProceedButton();
//		broadcastPageObjects.selectBaseList(BASE_LIST);
//		//broadcastPageObjects.clickcreateTargetCondition();
//	    //broadcastPageObjects.clickProceedButton();
//		//broadcastPageObjects.selectBaseList("Latest_list");
//		broadcastPageObjects.clickProceedButton();
//		broadcastPageObjects.selectFirstOffer();
//		broadcastPageObjects.selectTrackSession();
//		broadcastPageObjects.selectTrackingSource();
//		broadcastPageObjects.selectSenderAndRoute();
//		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.bcNotifications();
		broadcastPageObjects.bcNotificationsadd();
		broadcastPageObjects.addNotificationuser();
		broadcastPageObjects.bcNotificationsok();
		// broadcastPageObjects.bcNotificationscancel();

	}

	@Then("^enter details for new broadcast and configure TG and CG from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_andconfigur_TG_CG(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eM.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCAndConfigurCG_TG(name, bc_type, BASE_LIST, offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		if (bc_type.contentEquals("one-off")) {
			Thread.sleep(1000);
			broadcastPageObjects.clickOneOffRadioButton();
//		 jswait.loadClick(".//div[@id='radioLabel' and contains(.,'One-off')]/../div[1]");
			Thread.sleep(1000);
			jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//      jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
//	  jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
//	    num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][41]"));
//	    builder.moveToElement(num1).click().build().perform();
//	    Thread.sleep(2000);     
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);

			jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(3000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
			Thread.sleep(2000);
			num = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num2 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
//  num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][21]"));
//  builder.moveToElement(num1).click().build().perform();
//  Thread.sleep(1000);
			if (am_pm == 0) {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
				builder.moveToElement(num1).click().build().perform();

			} else {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
				builder.moveToElement(num1).click().build().perform();
			}

			num1 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
		} else if (bc_type.contentEquals("recurring") || bc_type.contentEquals("seedingRecurring")
				|| bc_type.contentEquals("seedingTriggerable")) {
			Thread.sleep(2000);
			if (bc_type.contentEquals("recurring")) {
				jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
//			 jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
//			 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='"+date+"']");
//			 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
//			 jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");
			}
			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//		      jswait.loadClick("//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
//			 Thread.sleep(1000);
//			  jswait.loadClick("//form[@id='deliverDetailForm']//paper-input-container//label[contains(.,'Time Zone')]/..//input");
			Thread.sleep(1000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
			Thread.sleep(1000);
			jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
			num = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//		      jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
			num1 = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();

			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");
		}
		
		
	}

	@Then("^enter details for new broadcast and calculate TG and CG from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_and_calculate_TG_CG(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eM.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCAndCalculateCG_TG(name, bc_type, BASE_LIST, offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		if (bc_type.contentEquals("one-off")) {
			Thread.sleep(1000);
			broadcastPageObjects.clickOneOffRadioButton();
//		 jswait.loadClick(".//div[@id='radioLabel' and contains(.,'One-off')]/../div[1]");
			Thread.sleep(1000);
			jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//      jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
//	  jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
//	    num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][41]"));
//	    builder.moveToElement(num1).click().build().perform();
//	    Thread.sleep(2000);     
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);

			jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(3000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
			Thread.sleep(2000);
			num = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num2 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
//  num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][21]"));
//  builder.moveToElement(num1).click().build().perform();
//  Thread.sleep(1000);
			if (am_pm == 0) {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
				builder.moveToElement(num1).click().build().perform();

			} else {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
				builder.moveToElement(num1).click().build().perform();
			}

			num1 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
		} else if (bc_type.contentEquals("recurring") || bc_type.contentEquals("seedingRecurring")
				|| bc_type.contentEquals("seedingTriggerable")) {
			Thread.sleep(2000);
			if (bc_type.contentEquals("recurring")) {
				jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
//			 jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
//			 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='"+date+"']");
//			 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
//			 jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");
			}
			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//		      jswait.loadClick("//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
//			 Thread.sleep(1000);
//			  jswait.loadClick("//form[@id='deliverDetailForm']//paper-input-container//label[contains(.,'Time Zone')]/..//input");
			Thread.sleep(1000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
			Thread.sleep(1000);
			jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
			num = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//		      jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
			num1 = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();

			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");
		}
	}

	@Then("^verify active option for bc$")
	public void verifyActiveOptionForBC() throws Throwable {

		broadcastPageObjects.verifyActiveOptionForBC();

	}

	@Then("^navigate to Seeding Bc tab$")
	public void navigatetoseedingBC() throws Throwable {
		Thread.sleep(2000);
		jswait.loadClick("//div[@id='tabsContent']//div[contains(.,'Seedings Broadcasts')]");

	}

	@Then("^enter details for new broadcast from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBC(name, bc_type, BASE_LIST, offer);

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

	@Then("^enter details for new broadcast for use template from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcastForUseTemplate(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCForUseTemplate(name, bc_type, BASE_LIST_FOR_USE_TEMPLATE, offer);

	}

	@Then("^enter details for new broadcast with condition (.*) from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_with_target_condition(String condition, String sheet, String offer)
			throws Throwable {
		System.out.println(condition);
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		eh.setExcelFile("bcInputData", sheet);
		String DNCExclusion = "";
		try {
			DNCExclusion = eh.getCellByColumnName("DNCExclusion");
		} catch (Exception e) {
			DNCExclusion = "none";
		}
		broadcastPageObjects.createBC(name, bc_type, BASE_LIST, offer, condition, INVENTORY_UNLIMITED, DNCExclusion);

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);
		dateForCompare = new Date();
	}

	@Then("^verify all operations of target using visual editor$")
	public void verify_all_operations_of_target_using_visual_editor() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("ForTargetCondition", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList("list");

	}

	@Then("^verify editing target condition$")
	public void verify_EditingTargetCoindition() throws Throwable {
		commonObjects.clickOptionsIcon();
		targetConditionObjects.clickTargetConditionEdit();
		targetConditionObjects.clickBasicTargetConditionWithAge("20");

	}

	@Then("^navigate to broadcast target condition$")
	public void navigate_to_broadcast_target_condition() throws Throwable {
		broadcastPageObjects.enterBroadcastBasicDetails("TargetConditionCheck", INVENTORY_UNLIMITED);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList(BASE_LIST);
//	    commonObjects.clickTargetConditionViewToggleIcon();

	}

	@Then("^verify adding target condition with and condition$")
	public void verifyAddingTargetConditionWithAnd() throws Throwable {
		targetConditionObjects.clickManualAndButton();
		targetConditionObjects.clickConditionTypeField();

	}

	@Then("^verify adding target condition with or condition$")
	public void verifyAddingTargetConditionWithOr() throws Throwable {
		targetConditionObjects.clickManualOrButton();
		targetConditionObjects.clickConditionTypeField();

	}

	@Then("^save bc$")
	public void save_bc() throws Throwable {
		broadcastPageObjects.clickCreateButton();
		Thread.sleep(1000);
		broadcastPageObjects.clickSaveButton();
	}

	@Then("^navigate to \"([^\"]*)\" broadcasts$")
	public void navigate_to_broadcasts(String type) throws Throwable {
		jswait.loadClick("//paper-tab//div[contains(.,'" + type + "')]");
	}

	@Then("^activate saved \"([^\"]*)\" bc from sheet \"([^\"]*)\"$")
	public void activate_saved_bc_from_sheet(String arg1, String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		jswait.loadClick("//vaadin-grid-cell-content[contains(.,'" + eh.getCell(1, 0) + "')]/../..//paper-icon-button");
		jswait.loadClick("//label[text()='Edit']/..");
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		// to update the time
		eM.setExcelFile("bcInputData", sheet);
		String bc_type = (String) eM.getCell(1, 7);
		enterDeliveryTabDetails(bc_type, sheet);

		broadcastPageObjects.clickCreateButton();
		broadcastPageObjects.clickActivateButton();
		broadcastPageObjects.clickActivateConfirmYes();
	}

	@Then("^verify failure in activating bc$")
	public void verifyFailureInActivatingBc() throws Throwable {
		Exception failure = new Exception("broadcast created(expected to fail)");
		try {
			broadcastPageObjects.clickCreateNewBroadcastButton();
			throw failure;
		} catch (Exception e) {
		}
	}

	@Then("^check if \"([^\"]*)\" bc status is \"([^\"]*)\" from sheet \"([^\"]*)\"$")
	public void check_if_bc_status_is_from_sheet(String type, String status, String sheet) throws Throwable {
		String currStatus = "";
		Thread.sleep(3000);
		if (type.contains("Recurring")) {
			currStatus = jswait.getTextFormElement(
					"//div[@val='broadcastRecurringViews']//vaadin-grid-table-row/vaadin-grid-table-cell[2]/vaadin-grid-cell-content");
			Assert.assertEquals("Status of Bc is not chnaged", currStatus, status);
		} else if (type.contains("One-time")) {
			currStatus = jswait
					.getTextFormElement("//vaadin-grid-table-row/vaadin-grid-table-cell[2]/vaadin-grid-cell-content");
			Assert.assertEquals("Status of Bc is not chnaged", currStatus, status);
		} else if (type.contains("Seeding")) {
			currStatus = jswait.getTextFormElement(
					".//*[@id='broadcastSeedList']//vaadin-grid-table-row/vaadin-grid-table-cell[2]/vaadin-grid-cell-content");
			Assert.assertEquals("Status of Bc is not chnaged", currStatus, status);
		} else {

			currStatus = jswait.getTextFormElement(
					".//*[@id='broadcastTriggerList']//vaadin-grid-table-row/vaadin-grid-table-cell[2]/vaadin-grid-cell-content");
			Assert.assertEquals("Status of Bc is not chnaged", currStatus, status);
		}
	}

	@Then("^wait until broadcast from sheet \"([^\"]*)\" change status to \"([^\"]*)\"$")
	public void waitUntilStatusOfBroadcast(String sheet, String status) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		String type = (String) eh.getCell(1, 7);
		String bcName = (String) eh.getCell(1, 0);
		String currStatus = "";
		currStatus = broadcastPageObjects.getBcStatus(bcName);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (!status.contentEquals(currStatus) && t.checkTimerMin(15)) {
			Thread.sleep(2000);
			currStatus = broadcastPageObjects.getBcStatus(bcName);
		}

	}

	@Then("^verify copy bc from sheet \"([^\"]*)\"$")
	public void verifyCopyBC(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		String type = (String) eh.getCellByColumnName("Type");
		String bcName = (String) eh.getCellByColumnName("BC Name");
		eh.setCell(1, "BC Name", bcName + "Copy");
		Exception ex = new Exception("type mentionedif");
		if (type.contentEquals("one-off") || type.contentEquals("facebook")) {
			commonObjects.filterName(bcName);
			commonObjects.clickOptionsIcon();
			commonObjects.clickCopyOption();
			broadcastPageObjects.enterBroadcastName(bcName + "Copy");
			broadcastPageObjects.clickProceedButton();
			broadcastPageObjects.clickProceedButton();
			broadcastPageObjects.clickProceedButton();
			enterDeliveryTabDetails(type, sheet);
			broadcastPageObjects.clickCreateButton();
			broadcastPageObjects.clickActivateButton();
			broadcastPageObjects.clickActivateConfirmYes();
			Thread.sleep(10000);

		} else if (eh.getCellByColumnName("Type").contentEquals("recurring")) {
			jswait.loadClick(".//*[@id='broadcastRecurList']//vaadin-grid-cell-content[contains(.,'" + bcName
					+ "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastRecurGridMenu']//paper-item[contains(.,'Copy')]");
			broadcastPageObjects.enterBroadcastName(bcName + "Copy");
			broadcastPageObjects.clickProceedButton();
			broadcastPageObjects.clickProceedButton();
			broadcastPageObjects.clickProceedButton();
			enterDeliveryTabDetails(type, sheet);
			broadcastPageObjects.clickCreateButton();
			broadcastPageObjects.clickActivateButton();
			broadcastPageObjects.clickActivateConfirmYes();
			Thread.sleep(10000);
		} else {
			throw ex;
		}
	}

	@Then("^check targeted count of \"([^\"]*)\"$")
	public void checkTargtedCountOfBroadcast(String sheet) throws Throwable {
		Thread.sleep(5000);
		eh.setExcelFile("bcInputData", sheet);
		String bcName = (String) eh.getCell(1, 0);
		RegistrationList rl = new RegistrationList();
	}

	@Then("^validate bc$")
	public void validateBc() throws Throwable {
		broadcastPageObjects.clickCreateButton();
		broadcastPageObjects.clickValidateButton();
		Thread.sleep(10000);
	}

	@Then("^export bc$")
	public void exportBc() throws Throwable {
		broadcastPageObjects.exportBroadcast();

	}

	@Then("^verify validate option for bc$")
	public void verifyValidateOptionForBC() throws Throwable {

		broadcastPageObjects.verifyValidateOptionForBC();

	}

	@Then("^verify validating CG status for bc$")
	public void verifyValidatingCGStatusForBC() throws Throwable {

		broadcastPageObjects.verifyValidatingCGStatusForBC();

	}

	@Then("^verify targeting status for bc$")
	public void verifyTargetingCGStatusForBC() throws Throwable {

		broadcastPageObjects.verifyTargetingStatusForBC();

	}

	@Then("^verify delivering status for bc$")
	public void verifyDeliveringCGStatusForBC() throws Throwable {

		broadcastPageObjects.verifyDeliveringStatusForBC();

	}

	@Then("^verify targeted count$")
	public void verifyTargetedCount() throws Throwable {

		broadcastPageObjects.verifyTargetedCount();

	}

	@Then("^enter details for new broadcast and verify starts broadcast at option from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcastand_verify_starts_broadcast_at_option(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eM.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCAndVerifyStartBroadcastAtOption(name, bc_type, BASE_LIST,
				offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);
	}

	@Then("^view bc from sheet \"([^\"]*)\"$")
	public void viewBc(String sheet) throws Throwable {

		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);
		broadcastPageObjects.broadcastView(name);

	}

	@Then("^abort bc$")
	public void abortBc() throws Throwable {

		broadcastPageObjects.abortBC();

	}

	@Then("^copy bc$")
	public void copyBc() throws Throwable {
		broadcastPageObjects.copyBC();

	}

	@Then("^navigate to partners Edit page$")
	public void navigate_to_partners_Edit_page() throws Throwable {
		//
		// throw new PendingException();
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		adminPageObjects.clickBCSettings();
		// adminPageObjects.selectUsers();
		adminPageObjects.checkBCConfiguration();
		// AdminPageObjects.clickEditOption();

	}

	@Then("^verify weekdays and weekend settings$")
	public void selectWeekendAndWeekdays() throws Throwable {
		//
		// throw new PendingException();
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		adminPageObjects.clickWeekSettings();

		adminPageObjects.selectWeekdaysAndWeekend();

	}

	@Then("^enter details for new broadcast and select any DNC exclusion list from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_and_Select_DNC_Exclusion_List(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCAndSelectDNCList(name, bc_type, BASE_LIST, offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

	@Then("^enter details for new broadcast and select any DNC exclusion list for partner level CG from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_and_Select_DNC_Exclusion_List_for_partner_level_CG(String sheet, String offer)
			throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCAndSelectDNCListForPartnerLevelCG(name, bc_type, SELENIUM_DND_LIST,
				offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

	@Then("^enter details for new broadcast with DNC exclusion and calculate TG and CG from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_seeding_broadcast_and_Select_DNC_Exclusion_List(String sheet, String offer)
			throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCAndSelectDNCListForSeedingBC(name, bc_type, BASE_LIST,
				offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

	@Then("^enter details for new broadcast with DNC exclusion and configure TG and CG from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_and_Select_DNC_Exclusion_List_And_Configure_TG_CG(String sheet, String offer)
			throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCAndSelectDNCList_AndConfigureCG_TG(name, bc_type, BASE_LIST,
				offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

	@Then("^copy and create new broadcast from sheet \"([^\"]*)\"$")
	public void copy_new_broadcast(String sheet) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();

		eM.setExcelFile("bcInputData", sheet);
//    	
		String name = (String) eM.getCell(1, 0);
		eM.setCell(1, 0, name + "_Copy");
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCWithCopyOption();

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

//	@Then("^verify adding target condition with or condition$")
//	public void verifyEditingTargetCondition() throws Throwable {
//		targetConditionObjects.clickManualOrButton();
//		targetConditionObjects.clickConditionTypeField();
//		
//	}
	@Then("^Save BC Settings as selected users$")
	public void BCSettings_Selectedusers() throws Throwable {
		//
		// throw new PendingException();
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		adminPageObjects.clickBCSettings();
		adminPageObjects.selectUsers();
		adminPageObjects.BCSaveSettings();
		adminPageObjects.BCSettingsclose();
		// driver.get("http://192.168.150.27/#/precision-marketer/life-cycle-marketing/campaignId/4/broadcasts");

		// adminPageObjects.checkBCConfiguration();
		// AdminPageObjects.clickEditOption();

	}

	// To Find a BC and Edit
	@Then("^Search BC and Edit from \"([^\"]*)\"$")
	public void Search_BC_and_Edit_from(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);
		catalogPageObjects.filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^enter edit recurrance pattern of \"([^\"]*)\" with \"([^\"]*)\"$")
	public void enterEditRecurranceDetails(String oldSheet, String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		enterDeliveryTabDetails(eh.getCellByColumnName("Type"), sheet);
	}

	@Then("^click edit option for bc from sheet \"([^\"]*)\"$")
	public void clickEditOptionOfBcFromSheet(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		if (eh.getCellByColumnName("Type").contentEquals("recurring")) {
			jswait.loadClick(".//*[@id='broadcastRecurList']//vaadin-grid-cell-content[contains(.,'"
					+ eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastRecurGridMenu']//paper-item[contains(.,'Edit')]");
		} else if (eh.getCellByColumnName("Type").contentEquals("seedingRecurring")
				|| eh.getCellByColumnName("Type").contentEquals("seedingTriggerableRecurringBC")) {
			jswait.loadClick(".//*[@id='broadcastSeedList']//vaadin-grid-cell-content[contains(.,'"
					+ eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastSeedGridMenu']//paper-item[contains(.,'Edit')]");
		} else if (eh.getCellByColumnName("Type").contentEquals("one-off")) {
			commonObjects.filterName(eh.getCellByColumnName("BC Name"));
			commonObjects.clickOptionsIcon();
			commonObjects.clickEditOption();
		}
	}

	@Then("^click copy option for bc from sheet \"([^\"]*)\"$")
	public void clickCopyOptionOfBcFromSheet(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		if (eh.getCellByColumnName("Type").contentEquals("recurring")) {
			jswait.loadClick(".//*[@id='broadcastRecurList']//vaadin-grid-cell-content[contains(.,'"
					+ eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastRecurGridMenu']//paper-item[contains(.,'Copy')]");
		} else if (eh.getCellByColumnName("Type").contentEquals("seedingRecurring")
				|| eh.getCellByColumnName("Type").contentEquals("seedingTriggerableRecurringBC")) {
			jswait.loadClick(".//*[@id='broadcastSeedList']//vaadin-grid-cell-content[contains(.,'"
					+ eh.getCellByColumnName("BC Name") + "')]/../..//iron-icon");
			jswait.loadClick(".//*[@id='broadcastSeedGridMenu']//paper-item[contains(.,'Copy')]");
		} else if (eh.getCellByColumnName("Type").contentEquals("one-off")
				|| eh.getCellByColumnName("Type").contentEquals("facebook")) {
			System.out.println("inside facebook");
			commonObjects.filterName(eh.getCellByColumnName("BC Name"));
			commonObjects.clickOptionsIcon();
			commonObjects.clickCopyOption();
		}
	}

	@Then("^Then Search BC and give permission from \"([^\"]*)\" for user \"([^\"]*)\"$")
	public void then_Search_BC_and_give_permission_from_for_user(String sheet, String user) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		// Random rn = new Random();
		// int n = rn.nextInt(5000) + 1;
		String name = (String) eh.getCell(1, 0);
		// name = name.replaceAll("[0-9]", "")+n;
		// eh.setCell(1, 0, name);
		// productClassesPageObjects.createProductClass(name, (String) eh.getCell(1,
		// 1));
		catalogPageObjects.filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		broadcastPageObjects.ClickPermissions();
		broadcastPageObjects.Clickclickusers();
		broadcastPageObjects.Clickclickusers();
		// jswait.loadClick("//div[@id='contentWrapper']/div/paper-menu/div//label[contains(.,'Permissions')]");
//		jswait.loadClick(".//label[contains(.,'Select users who can edit this broadcast')]");
		// jswait.loadClick(".//label[contains(.,'Select users who can edit this
		// broadcast')]/../../../div");
		// jswait.loadClick(".//label[contains(.,'Select users who can edit this
		// broadcast')]/../../../div");
		// jswait.loadClick("//paper-dialog[@id='addUserDialog']//paper-input-container//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down']");
		// jswait.loadClick("//paper-tags-dropdown[@id='tagDropDown']/paper-menu-button[@id='menuButton']//paper-tags-input[@id='tagInput']/paper-input[@id='tagInput']//iron-icon[@icon='paper-dropdown-menu:arrow-drop-down']/../div");
		// jswait.loadClick("//paper-item[contains(.,'rahul.chandran@flytxt.com')]");
		jswait.loadClick("//paper-item[contains(.,'" + user + "')]");
		broadcastPageObjects.ClickPermissionTitle();
		// jswait.loadClick("//paper-dialog[@id='addUserDialog']//span[.='Broadcast Edit
		// Permissions']");
		broadcastPageObjects.ClickPermissionSave();
		// jswait.loadClick("//paper-dialog[@id='addUserDialog']//paper-button[2][contains(.,Save)]");

	}

	@Then("^enter details for new broadcast without target condition from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_without_target_condition(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCWithoutTargetCondition(name, bc_type, BASE_LIST,
				offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

	@Then("^pause bc$")
	public void pauseBc() throws Throwable {
		broadcastPageObjects.pauseBC();

	}

	@Then("^verify send trial option for bc$")
	public void verifySendTrialOptionForBc() throws Throwable {
		broadcastPageObjects.verifySendTrialOptionForBc();
		Thread.sleep(15000);

	}

	@Then("^verify trial message event$")
	public void verifyTrialMessageEvent() throws Exception {

		broadcastPageObjects.verifyTrialMessageEvent();

	}

	@Then("^enter details for new broadcast with 1M subscribers and configure TG and CG from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_with_1M_subscribers_and_configur_TG_CG(String sheet, String offer)
			throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//    	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eM.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCWith1MSubscribersAndConfigurCG_TG(name, bc_type, BASE_LIST,
				offerExcel.getCell(1, 0).toString());

//		 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//		Thread.sleep(1500);

		if (bc_type.contentEquals("one-off")) {
			Thread.sleep(1000);
			broadcastPageObjects.clickOneOffRadioButton();
//		 jswait.loadClick(".//div[@id='radioLabel' and contains(.,'One-off')]/../div[1]");
			Thread.sleep(1000);
			jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//      jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
//	  jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
//	    num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][41]"));
//	    builder.moveToElement(num1).click().build().perform();
//	    Thread.sleep(2000);     
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);

			jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(3000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
			Thread.sleep(2000);
			num = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num2 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
//  num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][21]"));
//  builder.moveToElement(num1).click().build().perform();
//  Thread.sleep(1000);
			if (am_pm == 0) {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
				builder.moveToElement(num1).click().build().perform();

			} else {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
				builder.moveToElement(num1).click().build().perform();
			}

			num1 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
		} else if (bc_type.contentEquals("one-off") || bc_type.contentEquals("facebook")) {
			Thread.sleep(1000);
			broadcastPageObjects.clickOneOffRadioButton();
//		 jswait.loadClick(".//div[@id='radioLabel' and contains(.,'One-off')]/../div[1]");
			Thread.sleep(1000);
			jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//    jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
//	  jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
//	    num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][41]"));
//	    builder.moveToElement(num1).click().build().perform();
//	    Thread.sleep(2000);     
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			if (bc_type.contentEquals("facebook")) {
				jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
				Thread.sleep(1000);
				jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
				Thread.sleep(1000);
				jswait.loadClick(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
				Thread.sleep(3000);
				jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
				Thread.sleep(2000);
				num = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
								+ (hours + 1) + "]"));
				builder.moveToElement(num).click().build().perform();
				Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
				WebElement num2 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
								+ (min + 1) + "]"));
				builder.moveToElement(num2).click().build().perform();
				Thread.sleep(1000);
//   jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
//  num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][21]"));
//  builder.moveToElement(num1).click().build().perform();
//  Thread.sleep(1000);
				if (am_pm == 0) {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
					builder.moveToElement(num1).click().build().perform();

				} else {
					num1 = driver.findElement(By.xpath(
							".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
					builder.moveToElement(num1).click().build().perform();
				}

				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
				builder.moveToElement(num1).click().build().perform();
			}
			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[1]");
			Thread.sleep(3000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'After')]");

			Thread.sleep(2000);
			jswait.loadSendKeys("//label[contains(.,'Expires')]//following::input[2]", "1");

			Thread.sleep(1000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::iron-icon[2]");
			Thread.sleep(3000);
			jswait.loadClick("//label[contains(.,'Expires')]//following::paper-item[contains(.,'Days')]");

			Thread.sleep(2000);
			jswait.loadSendKeys("//label[contains(.,'Budget Amount')]//following::input[1]", "50");

		} else if (bc_type.contentEquals("recurring") || bc_type.contentEquals("seedingRecurring")
				|| bc_type.contentEquals("seedingTriggerable")) {
			Thread.sleep(2000);
			if (bc_type.contentEquals("recurring")) {
				jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
//			 jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
//			 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='"+date+"']");
//			 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
//			 jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");
			}
			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//		      jswait.loadClick("//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
//			 Thread.sleep(1000);
//			  jswait.loadClick("//form[@id='deliverDetailForm']//paper-input-container//label[contains(.,'Time Zone')]/..//input");
			Thread.sleep(1000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
			Thread.sleep(1000);
			jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
			num = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//		      jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
			num1 = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();

			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");
		}
	}

	@Then("^navigate to BC page$")
	public void navigate_to_bc_page() throws Throwable {
		Thread.sleep(2000);
		driver.get("https://192.168.150.209/#/precision-marketer/life-cycle-marketing/campaignId/370/broadcasts");
		Thread.sleep(2000);
	}

	@Then("^wait until status of \"([^\"]*)\" is \"([^\"]*)\"$")
	public void waitUntilBCStatus(String bcSheet, String statusExpected) throws Throwable {
		eh.setExcelFile("bcInputData", bcSheet);
		commonObjects.filterName(eh.getCellByColumnName("BC Name"));
		commonObjects.toggleAutoRefresh();
		String statusOfBc = broadcastPageObjects.getTopBcStatus();
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (!statusOfBc.contains(statusExpected) && t.checkTimerMin(20)) {
			statusOfBc = broadcastPageObjects.getTopBcStatus();
			System.out.println(statusOfBc);
			Thread.sleep(3000);
		}
		Assert.assertTrue("Invalid status of BC", statusOfBc.contains(statusExpected));
	}

	@Then("^wait until status of child bc of \"([^\"]*)\" is \"([^\"]*)\"$")
	public void waitUntilChildBCStatus(String bcSheet, String statusExpected) throws Throwable {
		eh.setExcelFile("bcInputData", bcSheet);
		String bc_type = eh.getCellByColumnName("Type");
		if (bc_type.contentEquals("recurring") || bc_type.contentEquals("seedingRecurring")
				|| bc_type.contentEquals("seedingTriggerable")) {
			Calendar rightNow = Calendar.getInstance();
			CalenderUtility cal = new CalenderUtility();
			if (eh.getCellByColumnName("Recurrance Pattern").contentEquals("months")) {
				if (eh.getCellByColumnName("Recur on").contentEquals("5th weekend day")) {
					commonObjects.filterName(
							eh.getCellByColumnName("BC Name") + "-" + cal.calculateMonthlyReccuranceWeekend(5));
				} else if (eh.getCellByColumnName("Recur on").contains(",")) {
					commonObjects.filterName(eh.getCellByColumnName("BC Name") + "-"
							+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH)));
				}
			}
			commonObjects.toggleAutoRefresh();
		}
		String statusOfBc = broadcastPageObjects.getTopBcStatus();
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		while (!statusOfBc.contains(statusExpected) && t.checkTimerMin(15)) {
			statusOfBc = broadcastPageObjects.getTopBcStatus();
			System.out.println(statusOfBc);
			Thread.sleep(3000);
		}
		Assert.assertTrue("Invalid status of BC", statusOfBc.contains(statusExpected));
	}

	@Then("^verify targeted and sent count of \"([^\"]*)\" with condition (.*)$")
	public void verifyBCTargetedCount(String sheet, String condition) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		String targetStr = broadcastPageObjects.getBcTargtedCount(eh.getCellByColumnName("BC Name"));
		String sentStr = broadcastPageObjects.getBcSentCount(eh.getCellByColumnName("BC Name"));
		int targeted = Integer.parseInt(targetStr);
		int sent = Integer.parseInt(sentStr);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		if (condition.contentEquals("customerDeviceInfo")) {
			targetStr = list.getCellByColumnName("device_idnot6666");
			int expected = Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("customerWasSentTheTrialMessage")) {
			int SEND_TRIAL_COUNT = 3;
			int expected = SEND_TRIAL_COUNT;
			Assert.assertEquals("expected count not equal to actual count, SEND_TRIAL_COUNT harcoded to 3", expected,
					targeted);
			Assert.assertEquals("sent count not equal to targeted count , SEND_TRIAL_COUNT harcoded to 3", sent,
					targeted);
		} else if (condition.contentEquals("customerLocationInsightsGT5")) {
			targetStr = list.getCellByColumnName("customerLocationInsightsGT5");
			int expected = Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("digitalEngagementGT235")) {
			targetStr = list.getCellByColumnName("digitalEngagementGT235");
			int expected = Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("analyticalScoresGT45")) {
			targetStr = list.getCellByColumnName("analyticalScoresGT45");
			int expected = Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("learnedBehaviourGT35")) {
			targetStr = list.getCellByColumnName("learnedBehaviourGT35");
			int expected = Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		}

		else if (condition.contentEquals("customerDemographicsGT25")) {
			targetStr = list.getCellByColumnName("customerDemographicsGT25");
			int expected = Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("digitalPersonaGT15")) {
			targetStr = list.getCellByColumnName("digitalPersonaGT15");
			int expected = Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("customerList")) {
//		targetStr = list.getCellByColumnName("digitalPersonaGT15");
			int expected = 215; // Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count; List count hardcoded to 200", expected,
					targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("discoveredClusters200")) {
//		targetStr = list.getCellByColumnName("digitalPersonaGT15");
			int expected = 200; // Integer.parseInt(targetStr);
			Assert.assertEquals(
					"expected count not equal to actual count; discovered Cluster List count hardcoded to 200",
					expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("Nacklist")) {
			Assert.assertEquals("expected count not equal to actual count", 0, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, 0);
		} else if (condition.contentEquals("customerDrivenEvent")) {
			int expected = 200; // Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count; count hardcoded to 200", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("usageMetric")) {
			int expected = 200; // Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count; count hardcoded to 200", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("revenueMetric")) {
			int expected = 200; // Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count; count hardcoded to 200", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else if (condition.contentEquals("eventCounts")) {
			int expected = 200; // Integer.parseInt(targetStr);
			Assert.assertEquals("expected count not equal to actual count; count hardcoded to 200", expected, targeted);
			Assert.assertEquals("sent count not equal to targeted count", sent, targeted);
		} else {
			Exception notDefined = new Exception("Condition not defined");
			throw notDefined;
		}

	}

	@Then("^Search BC and check for permissions from \"([^\"]*)\"$")
	public void Search_BC_and_check_for_permissions_from(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);
		catalogPageObjects.filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		broadcastPageObjects.verifyPermissions();

	}

	@Then("^verify preferred language field in broadcast settings$")
	public void verifyPreferredLanguageInBroadcastSettings() throws Throwable {
		adminPageObjects.checkPreferredLanguageDropdown();
	}

	@Then("^enter details for new broadcast with 1M subscribers and configure partner level CG from sheet \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcast_with_1M_subscribers_and_configur_partner_level_CG(String sheet, String offer)
			throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		Random rn = new Random();
		int n = rn.nextInt(5000) + 1;
		String name = (String) eM.getCell(1, 0);
		name = name.replaceAll("[0-9]", "") + n;
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCWith1MSubscribersAndConfigurPartnerLevelCG(name, bc_type, BASE_LIST4,
				offerExcel.getCell(1, 0).toString());

//	 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//	Thread.sleep(1500);

		if (bc_type.contentEquals("one-off")) {
			Thread.sleep(1000);
			broadcastPageObjects.clickOneOffRadioButton();
//	 jswait.loadClick(".//div[@id='radioLabel' and contains(.,'One-off')]/../div[1]");
			Thread.sleep(1000);
			jswait.loadClick(".//label[contains(.,'Send Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");

			Thread.sleep(2000);
			jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector'][" + (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//  jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector'][" + (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
//  jswait.loadClick(".//*[@id='heading']/iron-selector[1]/div[5]");
//    num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][41]"));
//    builder.moveToElement(num1).click().build().perform();
//    Thread.sleep(2000);     
			if (am_pm == 0)
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick(".//*[@id='heading']/iron-selector[2]/div[2]");

			jswait.loadClick(".//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);

			jswait.loadClick(".//label[contains(.,'Target Render Time')]/../input");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//div[@date='" + date + "']");
			Thread.sleep(1000);
			jswait.loadClick(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='dateDialog']/div/paper-button[2]");
			Thread.sleep(3000);
			jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[2]//paper-input[2]//input");
			Thread.sleep(2000);
			num = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(1000);
//jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num2 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='minuteClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			builder.moveToElement(num2).click().build().perform();
			Thread.sleep(1000);
//jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[1]/div[5]");
//num1 = driver.findElement(By.xpath(".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='secondClock']//*[@id='numbers']//*[@class='number style-scope paper-clock-selector'][21]"));
//builder.moveToElement(num1).click().build().perform();
//Thread.sleep(1000);
			if (am_pm == 0) {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[1]"));
				builder.moveToElement(num1).click().build().perform();

			} else {
				num1 = driver.findElement(By.xpath(
						".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='heading']/iron-selector[2]/div[2]"));
				builder.moveToElement(num1).click().build().perform();
			}

			num1 = driver.findElement(By.xpath(
					".//*[@id='one-off-form']/div/paper-date-time-input[2]//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
		} else if (bc_type.contentEquals("recurring") || bc_type.contentEquals("seedingRecurring")
				|| bc_type.contentEquals("seedingTriggerable")) {
			Thread.sleep(2000);
			if (bc_type.contentEquals("recurring")) {
				jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Recurring')]/../div[1]");
//		 jswait.loadClick(".//paper-date-time-input//paper-input[1]//input");
//		 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//div[@date='"+date+"']");
//		 jswait.loadClick(".//*[@id='one-off-form']/div/paper-date-time-input[1]//*[@id='dateDialog']/div/paper-button[2]");
//		 jswait.loadClick(".//*[@id='one-off-form']//paper-date-time-input[1]//paper-input[2]//input");
			}
			Thread.sleep(2000);
			jswait.loadClick(".//paper-date-time-input//paper-input[2]//input");
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[1]/div[1]");
			WebElement num = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//	      jswait.loadClick("//*[@id='heading']/iron-selector[1]/div[3]");
			WebElement num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();
			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[1]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(1000);
			num1 = driver.findElement(By.xpath(
					".//*[@id='deliverDetailForm']//*[@class='start-time-wrap style-scope broadcast-deliver-details']//*[@id='timeDialog']/div/paper-button[2]"));
			builder.moveToElement(num1).click().build().perform();
//		 Thread.sleep(1000);
//		  jswait.loadClick("//form[@id='deliverDetailForm']//paper-input-container//label[contains(.,'Time Zone')]/..//input");
			Thread.sleep(1000);
			jswait.loadSendKeys(".//label[contains(.,'Time Zone')]/../input", "GMT+05:30");
			Thread.sleep(1000);
			jswait.loadClick("//vaadin-combo-box-item[contains(.,'GMT+05:30')]");
			Thread.sleep(1000);
			jswait.loadClick(".//*[@id='deliver-card']//label[contains(.,'Recurrence Pattern')]/..//input");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//paper-item[contains(.,'Days')]");
			Thread.sleep(1000);
			jswait.loadSendKeys("//*[contains(@class,'recurrence')]//input", "1");
			Thread.sleep(1000);
			jswait.loadClick("//*[@id='deliver-card']//label[contains(.,'Start broadcasts at')]/..//input");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[1]");
			num = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='hourClock']//*[@class='number style-scope paper-clock-selector']["
							+ (hours + 1) + "]"));
			builder.moveToElement(num).click().build().perform();
			Thread.sleep(2000);
//	      jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[1]/div[3]");
			num1 = driver.findElement(By.xpath(
					"//*[@id='deliver-card']/../paper-card[2]//*[@id='timePicker']//*[@id='minuteClock']//*[@class='number style-scope paper-clock-selector']["
							+ (min + 1) + "]"));
			Thread.sleep(1000);
			builder.moveToElement(num1).click().build().perform();

			Thread.sleep(1000);
			if (am_pm == 0)
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[1]");
			else
				jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='heading']/iron-selector[2]/div[2]");
			Thread.sleep(2000);
			jswait.loadClick("//*[@id='deliver-card']/../paper-card[2]//*[@id='timeDialog']/div/paper-button[2]");
			Thread.sleep(2000);
			jswait.loadClick(".//div[@id='radioLabel' and contains(.,'Real Time')]/../div[1]");
		}
	}

	@Then("^verify targeted count for partner level CG$")
	public void verifyTargetedCountForPartnerLevelCG() throws Throwable {

		broadcastPageObjects.verifyTargetedCountForPartnerLevelCG();

	}

	@Then("^check target condition \"([^\"]*)\"$")
	public void verifyImEventTargetCondition(String event) throws Throwable {
		broadcastPageObjects.clickTargetDetailsInBcView();
		verifyTargetConditionDetails(event);
	}

	public void verifyTargetConditionDetails(String event) throws Throwable {
		if (event.contentEquals("IMEventsOfferAccepted")) {
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//target-event[contains(.,'This event occured')]"));
			Assert.assertTrue("condition not displayed", jswait.checkVisibility("//b[contains(.,'Offer accepted')]"));
		} else if (event.contentEquals("IMEventsOfferDeclined")) {
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//target-event[contains(.,'This event occured')]"));
			Assert.assertTrue("condition not displayed", jswait.checkVisibility("//b[contains(.,'Offer declined')]"));
		} else if (event.contentEquals("IMEventsOfferRecommended")) {
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//target-event[contains(.,'This event occured')]"));
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//b[contains(.,'Offer Recommended')]"));
		} else if (event.contentEquals("IMEventsCustomerCareUsage")) {
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//target-event[contains(.,'This event occured')]"));
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//b[contains(.,'Customer Care Usage')]"));
		} else if (event.contains("segmentAgeGT40")) {
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//profile-field[contains(.,'Customer Profile Info')]"));
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//profile-field[contains(.,'is greater than')]"));
			Assert.assertTrue("condition not displayed", jswait.checkVisibility("//profile-field[contains(.,'40')]"));
		} else if (event.contains("segmentAgeGT30")) {
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//profile-field[contains(.,'Customer Profile Info')]"));
			Assert.assertTrue("condition not displayed",
					jswait.checkVisibility("//profile-field[contains(.,'is greater than')]"));
			Assert.assertTrue("condition not displayed", jswait.checkVisibility("//profile-field[contains(.,'30')]"));
		} else {
			Assert.assertTrue("condition not handled in if else", false);
		}
	}

	@Then("^Search BC and Click on Sendtrial from \"([^\"]*)\"$")
	public void Search_BC_and_click_on_sendtrial_from(String sheet) throws Throwable {
		eh.setExcelFile("bcInputData", sheet);
		String name = (String) eh.getCell(1, 0);
		catalogPageObjects.filterWorkaround(name);
		commonObjects.clickOptionsIcon();
		broadcastPageObjects.clickSendTrialBroadcastOption();
		broadcastPageObjects.VerifySendTrialPage();
		broadcastPageObjects.clickCloseSendTrialWindow();
		// commonObjects.clickEditOption();
		// broadcastPageObjects.clickProceedButton();
		// broadcastPageObjects.clickProceedButton();
		// broadcastPageObjects.clickProceedButton();
	}

	@Then("^verify email from sheet \"([^\"]*)\"$")
	public void verify_email_notification(String sheet) throws Throwable {

		broadcastPageObjects.Verifyemail(sheet);

	}

	@Then("^verify email notifications from sheet \"([^\"]*)\"$")
	public void verify_email_(String sheet) throws Throwable {

		broadcastPageObjects.Verifyemailnotification(sheet);

	}

	@Then("^verify view option for bc$")
	public void verify_view_option_for_bc() throws Throwable {

		broadcastPageObjects.verifyViewOptionForBC();

	}

	@Then("^navigate to dk to trigger bc$")
	public void naviagate_to_dk_to_trigger_bc() throws Throwable {

		dkpageobjects.navigateTostreamingattribute();
		dkpageobjects.createstreamingAttributes();
		dkpageobjects.createstreamingAttributesname();
		dkpageobjects.StreamingattributesDES();
		dkpageobjects.Streamingattributessource();
		Thread.sleep(3000);
		dkpageobjects.selectDataFusionEngine();
		dkpageobjects.labelvalue1();
		dkpageobjects.labelvalue2();
		dkpageobjects.streamingAttributeSavebtn();

	}

	@Then("^provide file for conversion$")
	public void provideFileForConversion() throws Throwable {
		String csvFileData = "";
		File conversionCSV = new File("ExcelFiles\\" + "conversion.csv");
		BufferedReader br = null;
		String temp = "";
		int initial = 1;
		br = new BufferedReader(new FileReader(conversionCSV.getCanonicalPath()));
		while ((temp = br.readLine()) != null) {
			if (initial == 0) {
				csvFileData += "\n";
			}
			initial = 0;
			csvFileData += temp;
		}
		System.out.println(csvFileData);
		System.out.println("test");
		br.close();
		ShellExecuter se = new ShellExecuter();
		se.executeScript("cd /usr/local/flytxt/selenium/conversion; echo '" + csvFileData + "' >conversionJob.csv");
	}

	@Then("^remove file for conversion$")
	public void deleteFileForConversion() throws Throwable {
		ShellExecuter se = new ShellExecuter();
		se.executeScript("cd /usr/local/flytxt/selenium/conversion; rm conversionJob.csv -f");
	}

	public String getLastConversionTime() {
		try {
			jswait.waitUntil("//consumer-events//iron-list//data-table-row//data-table-cell[2]");
			String latestTime = driver
					.findElement(By.xpath("//consumer-events//iron-list//data-table-row//data-table-cell[2]"))
					.getText();
			return latestTime;
		} catch (Exception e) {
			return "noConversionFound";
		}
	}

	public boolean checkConversionTime(Date startTime, Date conversionTime) {
		if (conversionTime.after(startTime))
			return true;
		else
			return false;

	}

	@Then("^wait for comversion event$")
//consumer-events//iron-list//data-table-row  
	public void wait_for_comversion_event() throws Throwable {
		CustomerProfilePage customerProfilePage = new CustomerProfilePage();
		customerProfilePage.clickEventTypesCheckBox();
		customerProfilePage.clickEventTypesCheckBox();
		customerProfilePage.clickConversionEventCheckBox();
		customerProfilePage.clickSelectEventApplyButton();
		Thread.sleep(2000);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		String date = getLastConversionTime();
		if (date.equals("noConversionFound"))
			date = "05 Sep 2000 04:18 PM";
		Date timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
		System.out.println(timeStamp);
		System.out.println(checkConversionTime(dateForCompare, timeStamp));
		while (t.checkTimerMin(15) && !checkConversionTime(dateForCompare, timeStamp)) {
			System.out.println("insie while");
			Thread.sleep(5000);
//		customerProfilePage.clickEventsTab();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickSelectEventApplyButton();
			Thread.sleep(2000);
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickConversionEventCheckBox();
			customerProfilePage.clickSelectEventApplyButton();
			Thread.sleep(2000);

			date = getLastConversionTime();
			if (date.equals("noConversionFound"))
				date = "05 Sep 2000 04:18 PM";
			timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			System.out.println(timeStamp);
			System.out.println(getLastConversionTime());

		}
		date = getLastConversionTime();
		if (date.equals("noConversionFound"))
			date = "05 Sep 2000 04:18 PM";
		timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
		Assert.assertTrue("convertion event not found", checkConversionTime(dateForCompare, timeStamp));
	}

	public String getLastFullfillmentTime() {
		try {
			jswait.waitUntil(
					"//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Fulfillment Success')]/..//data-table-cell[2]");
			String latestTime = driver.findElement(By.xpath(
					"//consumer-events//iron-list//data-table-row//data-table-cell[contains(.,'Fulfillment Success')]/..//data-table-cell[2]"))
					.getText();
			return latestTime;
		} catch (Exception e) {
			return "noFulfillmentFound";
		}
	}

	public boolean checkFullfillmentTime(Date startTime, Date conversionTime) {
		if (conversionTime.after(startTime))
			return true;
		else
			return false;

	}

	@Then("^wait for reward in consumer profile$")
//consumer-events//iron-list//data-table-row  
	public void wait_for_Fullfillment_event() throws Throwable {
//	Date startTime = new Date();
//	System.out.println(startTime);
		CustomerProfilePage customerProfilePage = new CustomerProfilePage();
		customerProfilePage.clickEventTypesCheckBox();
		customerProfilePage.clickEventTypesCheckBox();
		customerProfilePage.clickFulfillmentEventCheckBox();
		customerProfilePage.clickSelectEventApplyButton();
		Thread.sleep(2000);
		TimeoutImpl t = new TimeoutImpl();
		t.startTimer();
		String date = getLastFullfillmentTime();
		if (date.equals("noFulfillmentFound"))
			date = "05 Sep 2000 04:18 PM";
		Date timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
		System.out.println(timeStamp);
		System.out.println(checkFullfillmentTime(dateForCompare, timeStamp));
		while (t.checkTimerMin(15) && !checkFullfillmentTime(dateForCompare, timeStamp)) {
			System.out.println("insie while");
			Thread.sleep(5000);
//		customerProfilePage.clickEventsTab();
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickSelectEventApplyButton();
			Thread.sleep(2000);
			customerProfilePage.clickEventTypesCheckBox();
			customerProfilePage.clickFulfillmentEventCheckBox();
			customerProfilePage.clickSelectEventApplyButton();
			Thread.sleep(2000);

			date = getLastFullfillmentTime();
			if (date.equals("noFulfillmentFound"))
				date = "05 Sep 2000 04:18 PM";
			timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
			System.out.println(timeStamp);
			System.out.println(getLastFullfillmentTime());

		}
		date = getLastFullfillmentTime();
		if (date.equals("noFulfillmentFound"))
			date = "05 Sep 2000 04:18 PM";
		timeStamp = new SimpleDateFormat("dd MMM yyyy hh:mm a").parse(date);
		Assert.assertTrue("fulfillment event not found", checkFullfillmentTime(dateForCompare, timeStamp));
	}

//---------------------------------------------------------------------------------//

	@Then("^enter details for new broadcast from sheet for NACK \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcastfornack(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBC(name, bc_type, BASE_LISTNack, offer);

//	 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//	Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);
		broadcastPageObjects.Broadcast_Expiry();

	}

	@Then("^enter details for new broadcast with condition (.*) from sheet \"([^\"]*)\" with \"([^\"]*)\" to check frequency exclusion$")
	public void create_new_broadcast_with_target_condition_freq_exclusion(String condition, String sheet, String offer)
			throws Throwable {
		System.out.println(condition);
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);

		eh.setExcelFile("bcInputData", sheet);
		String DNCExclusion = "";
		try {
			DNCExclusion = eh.getCellByColumnName("DNCExclusion");
		} catch (Exception e) {
			DNCExclusion = "none";
		}
		broadcastPageObjects.createBC(name, bc_type, BASE_LIST, offer, condition, INVENTORY_ONE_PER_DAY, DNCExclusion);

//	 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//	Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);

	}

	@Then("^verify frequency exclusion$")
	public void verifyBCFrequencyExcludedCount() throws Throwable {
		String targetStr = broadcastPageObjects.getTopBcTargeted();
		Assert.assertEquals("targeted should be 0 after frequency exclusion", targetStr, "0");
	}

	@Then("^enter details for new broadcast from sheet with clusters \"([^\"]*)\" with \"([^\"]*)\"$")
	public void create_new_broadcastwithclusters(String sheet, String offer) throws Throwable {
		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//	String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBC(name, bc_type, "test selenium cluster", offer);

//	 jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//	Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);
		broadcastPageObjects.Broadcast_Expiry();

	}

	@Then("^verify DNC Exclusion from bc from sheet \"([^\"]*)\" with DNC count \"([^\"]*)\"$")
	public void verify_DNC_Exclusion(String sheet, String count) throws Throwable {

		broadcastPageObjects.Verify_DNC_Exclusion(sheet, count);

	}

	@Then("^verify targetcount from bc from sheet$")
	public void verify_Target_count() throws Throwable {

		broadcastPageObjects.Verify_targetcountbc();

	}

	@Then("^verify edit option of bc from sheet \"([^\"]*)\"$")
	public void verifyEditBc(String sheet) throws Throwable {
		eM.setExcelFile("bcInputData", sheet);
		String beforeEditBcNamefromSheet = eM.getCell(1, 0).toString();
		System.out.println("before editing BCNAME" + beforeEditBcNamefromSheet);
		Thread.sleep(20000);
		commonObjects.clickOptionsIcon();
		commonObjects.clickEditOption();
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		broadcastPageObjects.enterBroadcastName(name);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		eM.setExcelFile("bcInputData", sheet);
		String bc_type = (String) eM.getCell(1, 7);
		enterDeliveryTabDetails(bc_type, sheet);
		broadcastPageObjects.clickCreateButton();
		broadcastPageObjects.clickSaveButton();
		eM.setExcelFile("bcInputData", sheet);
		String afterEditBcNamefromSheet = eM.getCell(1, 0).toString();
		System.out.println("After editing BCNAME" + afterEditBcNamefromSheet);
		Assert.assertNotEquals("Boadcast name Edited", beforeEditBcNamefromSheet, afterEditBcNamefromSheet);

	}

	@Then("^enter details for new broadcast from sheet \"([^\"]*)\" with \"([^\"]*)\" with language \"([^\"]*)\"$")
	public void enter_details_for_new_broadcast_from_sheet_with_with_language(String sheet, String offer,
			String language) throws Throwable {

		Thread.sleep(3000);
		ExcelHelper list = new ExcelHelper();
		list.setExcelFile("registrationListInputData", "Sheet1");
		eM.setExcelFile("bcInputData", sheet);
//String baseList = list.getCell(1, 2).toString();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String name = (String) eM.getCell(1, 0);
		name = RandomNameGenerator.getRandomName(name);
		eM.setCell(1, 0, name);
		String bc_type = (String) eM.getCell(1, 7);
		Calendar rightNow = Calendar.getInstance();
		String mn = "";
		if (rightNow.get(Calendar.MONTH) + 1 < 9) {
			mn = "0" + Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		} else
			mn = Integer.toString(rightNow.get(Calendar.MONTH) + 1);
		String date = Integer.toString(rightNow.get(Calendar.YEAR)) + "-" + mn + "-"
				+ String.format("%02d", rightNow.get(Calendar.DAY_OF_MONTH));
		int hours = rightNow.get(Calendar.HOUR);
		int min = rightNow.get(Calendar.MINUTE);
		int am_pm = rightNow.get(Calendar.AM_PM);
		int day = rightNow.get(Calendar.DAY_OF_MONTH);
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH) + 1;
		min += 2;
		int rem = min % 5;
		rem = 5 - rem;
		min += rem;
		if (min > 59) {
			min -= 60;
			hours++;
		}
		if ((String) eM.getCell(1, 6) == "later") {
			day++;
		}
		Actions builder = new Actions(driver);
		broadcastPageObjects.createBCWithLanguage(name, bc_type, BASE_LIST, offer, language);

// jswait.loadClick(".//label[contains(.,'Target Conditions')]/../paper-radio-group/paper-radio-button[1]/div[1]");
//Thread.sleep(1500);

		enterDeliveryTabDetails(bc_type, sheet);
	}

	@Then("^BC Settings page validation$")
	public void bc_Settings_page_validation() throws Throwable {

	}
	
	@Then("^click on Archive from workbook \"([^\"]*)\" and sheet \"([^\"]*)\"$")
	public void click_on_Archive_from_workbook_and_sheet(String workbook, String sheet) throws Throwable {
		eh.setExcelFile(workbook, sheet);
		String name = eh.getCell(1, 0).toString();
		commonObjects.filterBCName(sheet, name);
		commonObjects.clickBCOptionsIcon(sheet);
		commonObjects.clickArchiveOption();
	}
	
	@Then("^click on delete from workbook \"([^\"]*)\" and sheet \"([^\"]*)\"$")
	public void click_on_delete_from_workbook_and_sheet(String workbook, String sheet) throws Throwable {
		eh.setExcelFile(workbook, sheet);
		String name = eh.getCell(1, 0).toString();
		commonObjects.filterBCName(sheet, name);
		commonObjects.clickBCOptionsIcon(sheet);
		commonObjects.clickDeleteOption();
	}



	@Then("^click on BC edit button from workbook \"([^\"]*)\" sheet \"([^\"]*)\"$")
	public void click_on_BC_edit_button_from_workbook_sheet(String workbook, String sheet) throws Throwable {
		eh.setExcelFile(workbook, sheet);
		String name = eh.getCell(1, 0).toString();
		commonObjects.filterBCName(sheet, name);
		commonObjects.clickBCOptionsIcon(sheet);
		commonObjects.clickEditOption();
	}

	@Then("^view the bc from workbook \"([^\"]*)\" in sheet \"([^\"]*)\"$")
	public void view_the_bc_from_workbook_in_sheet(String workbook, String sheet) throws Throwable {
		Thread.sleep(2000);
		eh.setExcelFile(workbook, sheet);
		String name = (String) eh.getCell(1, 0);
		commonObjects.filterBCName(sheet, name);

		// broadcastPageObjects.broadcastView(name);
		commonObjects.clickBCOptionsIcon(sheet);
		broadcastPageObjects.clickBroadcastViewOption();
		Thread.sleep(2000);

	}

//****************Editing*****************************

	@Then("^editing the BC from sheet \"([^\"]*)\" basic details With edit data from sheet \"([^\"]*)\"$")
	public void editing_the_BC_from_sheet_basic_details_With_edit_data_from_sheet(String oneoffsheet,
			String oneoffeditsheet) throws Throwable {
		String bcName="";
		if(oneoffsheet.contains("Edit")||oneoffsheet.contains("seedingTriggerableRecurringBCEd")) {
			eh.setExcelFile("bcInputDataForEdit", oneoffeditsheet);
			 bcName = (eh.getCell(1, 0).toString()) + "Edited";
			eh.setCell(1, 0, bcName);
		}else {
			eh.setExcelFile("bcInputData", oneoffsheet);
			 bcName = (eh.getCell(1, 0).toString()) + "Edited";
			 eh.setExcelFile("bcInputDataForEdit", oneoffeditsheet);
			eh.setCell(1, 0, bcName);
		}
				
		broadcastPageObjects.editingTheBcBasicDeatils(bcName, oneoffeditsheet);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();

	}

	@Then("^edit the broadcast with taget condition (.*)$")
	public void edit_the_broadcast_with_taget_condition(String condition) throws Throwable {
		System.out.println(condition);
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(3000);
		broadcastPageObjects.editingTheBCTargetConditionDetails(condition);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^edit the Delevery tab details from workbook \"([^\"]*)\" sheet \"([^\"]*)\"$")
	public void edit_the_Delevery_tab_details_from_workbook_sheet(String workbook, String sheet) throws Throwable {
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		broadcastPageObjects.clickProceedButton();

		broadcastPageObjects.editTheDeleveryTabDetails(workbook,sheet);

	}

	@Then("^edit the target List in taget tab from workbook \"([^\"]*)\" sheet \"([^\"]*)\"$")
	public void edit_the_target_List_in_taget_tab_from_workbook_sheet(String workbook, String sheet) throws Throwable {
		eh.setExcelFile(workbook, sheet);
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		broadcastPageObjects.selectBaseList(eh.getCell(1, 5).toString());
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^edit the offer for BC from workbook \"([^\"]*)\" sheet \"([^\"]*)\" with offer \"([^\"]*)\"$")
	public void edit_the_offer_for_BC_from_workbook_sheet(String workbook, String sheet, String offer)
			throws Throwable {
		eh.setExcelFile(workbook, sheet);
		Thread.sleep(1000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(3000);
		broadcastPageObjects.backToOffers();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		broadcastPageObjects.selectOffer(offerExcel.getCellByColumnName("Offer Name"));

		
		broadcastPageObjects.selectTrackSession();
		broadcastPageObjects.selectTrackingSource();
		
//		String bc_type=eh.getCell(1, 7).toString();
//		
//		System.out.println("bc_type="+bc_type);
//		if(!bc_type.contains("Informational"))
//		{
//			broadcastPageObjects.selectTrackSession();
//			broadcastPageObjects.selectTrackingSource();
//			if(offerExcel.getCellByColumnName("Channel").contains("Email"))
//			{
//				broadcastPageObjects.selectSenderAndRouteEmail();
//			}
//			else if(offerExcel.getCellByColumnName("Channel").contains("Facebook")) {
//				broadcastPageObjects.selectSenderAndRouteFacebook(); }
//			else
//				broadcastPageObjects.selectSenderAndRoute();
//			
//		}
//		else {
//			broadcastPageObjects.defaultSendID();
//
//		}
//		
		
		
		
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^edit the targetSelection (.*) for BC$")
	public void edit_the_targetSelection_None_for_BC(String targetSelection) throws Throwable {
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		if (targetSelection.contains("None")) {
			broadcastPageObjects.clickTargetConditionNoneOption();
			
		} else if (targetSelection.contains("Create")) {

			broadcastPageObjects.clickcreateTargetCondition();
			TargetConditionObjects targetConditionObjects = new TargetConditionObjects();
			commonObjects.clickOptionsIcon();
			targetConditionObjects.clickTargetConditionDeletet();
			targetConditionObjects.clickBasicTargetConditionWithAge();

		} else if (targetSelection.contains("SavedSegments")) {
			broadcastPageObjects.clickOnSavedSegments();
			broadcastPageObjects.selectSavedSegmentSelectorField("SegmentForMoreThanTenConditions");
		}

		Thread.sleep(2000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		broadcastPageObjects.clickProceedButton();
	}

	@Then("^edit the offer for BC expiry After hours \"([^\"]*)\"$")
	public void edit_the_offer_for_BC_expiry_After_hours(String expiry) throws Throwable {
		Thread.sleep(4000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(2000);
		broadcastPageObjects.Broadcast_Expiry(expiry);
	}

//************Verification**********************

	@Then("^verify the basic details before editing the BC data from sheet \"([^\"]*)\"$")
	public void verify_the_basic_details_before_editing_the_BC_data_from_sheet(String sheet) throws Throwable {
		broadcastPageObjects.verifyTheBcBasicDetailsBeforeEdit(sheet);
	}

	@Then("^verify the basic details from Broadcast View and data sheet \"([^\"]*)\"$")
	public void verify_the_basic_details_from_Broadcast_View_and_data_sheet(String sheet) throws Throwable {

		broadcastPageObjects.verifyTheBcBasicDetails(sheet);

	}

	@Then("^verify the target conditions from Broadcast View and condition (.*)$")
	public void verify_the_target_conditions_from_Broadcast_View_and_condition_customerWasSentTheTrialMessage(
			String condition) throws Throwable {
		broadcastPageObjects.verifyTheBCTargetConditionDetails(condition);
	}

	@Then("^Verify the BC Delivery tab details from Broadcast View from workbook \"([^\"]*)\" in sheet \"([^\"]*)\"$")
	public void verify_the_BC_Delivery_tab_details_from_Broadcast_View_from_workbook_in_sheet(String workbook,
			String sheet) throws Throwable {

		broadcastPageObjects.verifyDeleveryTabDetails(workbook, sheet);

	}

	@Then("^verify the BC taget List in BC View from workbook \"([^\"]*)\" sheet \"([^\"]*)\"$")
	public void verify_the_BC_taget_List_in_BC_View_from_workbook_sheet(String workbook, String sheet)
			throws Throwable {

		broadcastPageObjects.verifyTheBCTargetList(workbook, sheet);

	}

	@Then("^verify the BC offer in BC View from workbook \"([^\"]*)\" sheet \"([^\"]*)\" with offer \"([^\"]*)\"$")
	public void verify_the_BC_offer_in_BC_View_from_workbook_sheet_with_offer(String workbook, String sheet,
			String offer) throws Throwable {
		broadcastPageObjects.offerDetailsBC();
		ExcelHelper offerExcel = new ExcelHelper();
		offerExcel.setExcelFile("offerInputData", offer);
		String offerName = offerExcel.getCellByColumnName("Offer Name");
		Assert.assertTrue(
				jswait.checkVisibility("//p[contains(.,'Offer Name')]/..//p[contains(.,'" + offerName + "')]"));

	}

	@Then("^verify the BC targetSelection (.*) in BC View$")
	public void verify_the_BC_targetSelection_None_in_BC_View(String targetSelection) throws Throwable {
		broadcastPageObjects.targetDetailsBC();
		Thread.sleep(2000);
		if (targetSelection.contains("None")) {
			Assert.assertTrue(jswait.checkVisibility("//p[contains(.,'Segment condition not configured.')]"));
		} else if (targetSelection.contains("Create")) {
			Assert.assertTrue(jswait
					.checkVisibility("//profile-field[contains(.,'Customer Profile Info')]//b[contains(.,'Age_q11')]"));
		} else if (targetSelection.contains("SavedSegments")) {
			Assert.assertTrue(jswait.checkVisibility(
					"//p[contains(.,'Segment Name')]/..//p[contains(.,'SegmentForMoreThanTenConditions')]"));
		}

	}

	@Then("^verify the BC expiry in BC View$")
	public void verify_the_BC_expiry_in_BC_View() throws Throwable {

		broadcastPageObjects.clickBroadcastDeliveryDetails();
		Assert.assertTrue(jswait.checkVisibility(
				"//p[contains(.,'Broadcast expiry settings')]/..//p//a[contains(.,'After')]/..//a[contains(.,'2')]"));
	}

	@Then("^verify the BC expiry in BC View After hours \"([^\"]*)\"$")
	public void verify_the_BC_expiry_in_BC_View_After_hours(String hours) throws Throwable {
		broadcastPageObjects.clickBroadcastDeliveryDetails();
		Assert.assertTrue(jswait.checkVisibility(
				"//p[contains(.,'Broadcast expiry settings')]/..//p//a[contains(.,'After')]/..//a[contains(.,'" + hours
						+ "')]"));
	}

	
	@Then("^verify the Child BC count and recurring dates from workbook \"([^\"]*)\" in sheet \"([^\"]*)\"$")
	public void verify_the_Child_BC_count_and_recurring_dates_from_workbook_in_sheet(String workbook, String sheet) throws Throwable {
		eh.setExcelFile(workbook, sheet);
		String bcName = eh.getCell(1, 0).toString();
		//Navigation navigation=new Navigation();
		//navigation.refreshPage();
		Thread.sleep(8000);
		
		String output = "";
		List<WebElement> recurChilds=null;
		

		if (sheet.contains("seeding")) {
			Thread.sleep(8000);
			commonObjects.filterName(bcName+"_re");
			Thread.sleep(2000);
			commonObjects.toggleAutoRefresh();
			Thread.sleep(1000);
			commonObjects.toggleAutoRefresh();
			Thread.sleep(1000);
			recurChilds = driver.findElements(By.xpath("//vaadin-grid-table//vaadin-grid-table-body//vaadin-grid-table-row//vaadin-grid-table-cell[1]//vaadin-grid-cell-content[contains(.,'"+bcName+"')]/../..//vaadin-grid-table-cell[3]//vaadin-grid-cell-content"));

			System.out.println("Size of seedingReward recur bcs" + recurChilds.size());
		} else {
			commonObjects.filterName(bcName);
			Thread.sleep(2000);
			recurChilds = driver.findElements(By.xpath(
					"//vaadin-grid-table//vaadin-grid-table-body//vaadin-grid-table-row//vaadin-grid-table-cell[1]//vaadin-grid-cell-content[contains(.,'"
							+ bcName + "')]/../..//vaadin-grid-table-cell[3]//vaadin-grid-cell-content"));

			System.out.println("size of recurring bcs" + recurChilds.size());
		}


		ArrayList<String> getData = new ArrayList<String>();
		String getTextFromElement;
		for (WebElement webElement : recurChilds) {
			//System.out.println(webElement.getText());
			getTextFromElement=webElement.getText();
			getData.add(getTextFromElement);	
		}
//		 Collections.sort(getData);
		System.out.println("getdatasort" + getData);

		String dates = eh.getCell(1, 11).toString();
		String s1 = (eh.getCellByColumnName("Recurrance Pattern").toString());
		//System.out.println(s1.substring(0, 1));
		int recurringDays = Integer.parseInt(s1.substring(0, 1));
		//System.out.println(recurringDays);
		SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy hh:mm a");
		Calendar c = Calendar.getInstance();
		Date db = new Date();
		Date gh = df.parse(dates);
		//System.out.println(gh);
		c.setTime(gh); 		
		
//		for (int i=0;i<getData.size();i++) {
//			output = df.format(c.getTime());
//			System.out.println("before list"+getData.get(i));
//			System.out.println("before"+output);
//			if((getData.get(i)).equalsIgnoreCase(output)){
//			Assert.assertTrue(true);
//			}else {
//				Assert.assertTrue("NO child BC spawn",false);
//			}
//			c.add(Calendar.DATE, recurringDays);
//		}
		int recurringDays1=recurringDays*2;
		c.add(Calendar.DATE, recurringDays1);
		//System.out.println(Calendar.DATE);
		for (int i=0;i<getData.size();i++) {
			output = df.format(c.getTime());
			System.out.println("before list"+getData.get(i));
			System.out.println("before"+output);
			if((getData.get(i)).equalsIgnoreCase(output)){
			Assert.assertTrue(true);
			}else {
				Assert.assertTrue("NO child BC spawn",false);
			}
			c.add(Calendar.DATE, -recurringDays);
		}
		
		
	}

	
//*******Copy BC*******//
	
	
	@Then("^click on BC Copy button from workbook \"([^\"]*)\" sheet \"([^\"]*)\"$")
	public void click_on_BC_Copy_button_from_workbook_sheet(String workbook, String sheet) throws Throwable {
		eh.setExcelFile(workbook, sheet);
		String name = eh.getCell(1, 0).toString();
		commonObjects.filterBCName(sheet, name);
		commonObjects.clickBCOptionsIcon(sheet);
		commonObjects.clickCopyOption();
	}

	@Then("^Save the copied BC from workbook \"([^\"]*)\" and sheet \"([^\"]*)\"$")
	public void save_the_copied_BC_from_workbook_and_sheet(String workbook, String sheet) throws Throwable {
		Thread.sleep(3000);
		eM.setExcelFile(workbook, sheet);
		String bcName=eM.getCell(1,0).toString();
		//eM.setCell(1, 0, bcName+"_Copy");
			if(sheet.contains("seedingTriggerableRecurringBC")) {
			eh.setExcelFile("bcInputDataForEdit", "seedingTriggerableRecurringBCEd");
			eh.setCell(1,0,bcName+"_Copy");
		}else {
			eh.setExcelFile("bcInputDataForEdit",sheet+"Edit");
			eh.setCell(1,0,bcName+"_Copy");
		}
		
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		Thread.sleep(3000);
		broadcastPageObjects.clickProceedButton();
		
		Thread.sleep(2000);
		System.out.println("Delivery tab details entering ...");
		broadcastPageObjects.editTheDeleveryTabDetails(workbook,sheet);
		//broadcastPageObjects.clickCreateButton();
		//Thread.sleep(2000);
		//broadcastPageObjects.clickSaveButton();
	}

	@Then("^Verify the Copied Bc in view page workbook \"([^\"]*)\" sheet \"([^\"]*)\" with \"([^\"]*)\" condition (.*)$")
	public void verify_the_Copied_Bc_in_view_page_sheet_with_condition_digitalPersonaGT(String workbook, String bcSheet, String offerSheet,String condition) throws Throwable {
	    
		broadcastPageObjects.verifyTheBcBasicDetailsBeforeEdit(bcSheet);
		Thread.sleep(2000);
		broadcastPageObjects.verifyTheBCTargetConditionDetails(condition);
		Thread.sleep(2000);
		Assert.assertTrue(jswait.checkVisibility(".//p[contains(.,'"+BASE_LIST+"')]"));
		
		Thread.sleep(2000);
		broadcastPageObjects.offerDetailsBC();
		eM.setExcelFile("offerInputData", offerSheet);
		String offerName = eM.getCellByColumnName("Offer Name");
		Assert.assertTrue(
				jswait.checkVisibility("//p[contains(.,'Offer Name')]/..//p[contains(.,'" + offerName + "')]"));
		Thread.sleep(2000);
		if (workbook.contains("Edit")) {
			if (bcSheet.contains("seedingTriggerableRecurringBC")) {
				broadcastPageObjects.verifyDeleveryTabDetails(workbook, bcSheet + "Ed");
			} else {
				broadcastPageObjects.verifyDeleveryTabDetails(workbook, bcSheet + "Edit");
			}
		} else {
			broadcastPageObjects.verifyDeleveryTabDetails(workbook, bcSheet);
		}
	}
	
	@Then("^click on toggleAutoRefresh$")
	public void click_on_toggleAutoRefresh() throws Throwable {
		commonObjects.toggleAutoRefresh();
	}

	
	

@Then("^Save bcInputData data to registrationListInputData \"([^\"]*)\" from \"([^\"]*)\" with condition (.*)$")
public void save_bcInputData_data_to_registrationListInputData_from_with_condition_customerWasSentTheTrialMessage(String registraionSheet, String bcSheet,String condition) throws Throwable {
	 eh.setExcelFile("bcInputData", bcSheet);
	   
	    String BCname=eh.getCell(1,0).toString();
	    BCname=BCname+"-"+condition;
	     eM.setExcelFile("registrationListInputData","WithOutDNC");
	     int rows=eM.numRows();
	    int cols=eM.numCols();
	    eM.addCells(rows,0,BCname);	    
	   System.out.println(eM.getCell(rows, 0).toString());
}

@Then("^verify the BC notification in mail \"([^\"]*)\" from workbook \"([^\"]*)\" and sheet \"([^\"]*)\"$")
public void verify_the_BC_notification_in_mail_from_workbook_and_sheet(String status,String workbook, String sheet) throws Throwable {
	Thread.sleep(2000);
	eh.setExcelFile(workbook, sheet);
	String bcName=eh.getCell(1, 0).toString();
	EmailHelper emailHelper= new EmailHelper();
	Thread.sleep(5000);
	String fromAddrForBCNotification="";
	String subjectOfEmail="";
	
	if(status.contentEquals("Rendering")) {
	fromAddrForBCNotification="\"flyops@flytxt.com\" <flyops@flytxt.com>";// you pass your from address- swapna.p@flytxt.com
	subjectOfEmail= "Broadcast Rendering Notification - "+bcName;//BCNotification is BC name
	}else if(status.contentEquals("Delivering")) {
		 fromAddrForBCNotification="\"flyops@flytxt.com\" <flyops@flytxt.com>";
		 subjectOfEmail="Broadcast Delivery Notification - "+bcName;
	}else if(status.contentEquals("Completed")){
		fromAddrForBCNotification="\"flyops@flytxt.com\" <flyops@flytxt.com>";
		subjectOfEmail="Broadcast Finished - "+bcName;
	}
	
	Date emailRecivedDate = emailHelper.getMailRecivedDate(fromAddrForBCNotification, subjectOfEmail);
	System.out.println("email recived Date"+emailRecivedDate);
	String bcStartDate=(eh.getCell(1, 11).toString()).substring(0, 20);
	bcStartDate=bcStartDate.trim();
	System.out.println(bcStartDate);
	
		if(status.contentEquals("Completed")) {
			SimpleDateFormat sdf= new SimpleDateFormat("dd MMM yyyy hh:mm a");
			  Date bcdate = sdf.parse(bcStartDate);
			  System.out.println(bcdate);
			  Assert.assertTrue(bcdate.before(emailRecivedDate));
		}else {	
	SimpleDateFormat sdf= new SimpleDateFormat("dd MMM yyyy hh:mm a");
	  Date bcdate = sdf.parse(bcStartDate);
	  System.out.println(bcdate);
	  Assert.assertTrue(emailRecivedDate.before(bcdate));
		}
   
}
@Then("^enter details for new broadcast with condition (.*) from sheet \"([^\"]*)\" with \"([^\"]*)\" and inventory \"([^\"]*)\"$")
public void enter_details_for_new_broadcast_with_condition_digitalPersonaGT_from_sheet_with_and_inventory(String condition, String sheet, String offer, String inventory) throws Throwable {
   
	System.out.println(condition);
	Thread.sleep(3000);
	ExcelHelper list = new ExcelHelper();
	list.setExcelFile("registrationListInputData", "Sheet1");
	eM.setExcelFile("bcInputData", sheet);
//	String baseList = list.getCell(1, 2).toString();
	ExcelHelper offerExcel = new ExcelHelper();
	offerExcel.setExcelFile("offerInputData", offer);
	String name = (String) eM.getCell(1, 0);
	name = RandomNameGenerator.getRandomName(name);
	eM.setCell(1, 0, name);
	String bc_type = (String) eM.getCell(1, 7);
	
	eh.setExcelFile("bcInputData", sheet);
	String DNCExclusion = "";
	try {
		DNCExclusion = eh.getCellByColumnName("DNCExclusion");
	} catch (Exception e) {
		DNCExclusion = "none";
	}
	
	if(inventory.equalsIgnoreCase("Unlimited")){
		broadcastPageObjects.createBC(name, bc_type, BASE_LIST, offer, condition, INVENTORY_UNLIMITED, DNCExclusion);
	}else if(inventory.equalsIgnoreCase("OneperDay")){ 
		broadcastPageObjects.createBC(name, bc_type, BASE_LIST, offer, condition, INVENTORY_ONEPERDAY, DNCExclusion);
	}else if(inventory.equalsIgnoreCase("BlackoutAlways")) {
		broadcastPageObjects.createBC(name, bc_type, BASE_LIST, offer, condition, INVENTORY_BLACKOUTALWAYS, DNCExclusion);
	}else {
		System.out.println("no invetory selected, default inventory unlimited ");
		broadcastPageObjects.createBC(name, bc_type, BASE_LIST, offer, condition, INVENTORY_UNLIMITED, DNCExclusion);
	}
	
	enterDeliveryTabDetails(bc_type, sheet);
}



@Then("^save \"([^\"]*)\" migration data to spreadsheet from \"([^\"]*)\" with string (.*)$")
public void save_migration_data_to_spreadsheet_from_with_string_one_off_bc_blackout_with_condition_Condition(String workbook, String bcsheet, String key) throws Throwable {
String speadSheetID="1JZx7woJSspCYbBdhujwtjCq-TmS778rC68NfLPRJH84";
String speadSheetName="Migration";

commonObjects.speadSheetTestFunction(workbook, bcsheet, key, speadSheetID, speadSheetName);

}

@Then("^add the BC Data to \"([^\"]*)\" from BCsheet \"([^\"]*)\" campaignname \"([^\"]*)\" campaign category \"([^\"]*)\" offer \"([^\"]*)\" condition \"([^\"]*)\" inventory \"([^\"]*)\" with string (.*)$")
public void add_the_BC_Data_to_from_BCsheet_campaignname_campaign_category_offer_condition_inventory_with_string(String parllelRunSheet, String bcSheet, String campaignSheet, String campaignCategory, String offerSheet, String condition, String inventory, String description) throws Throwable {

eh.setExcelFile("bcInputData", bcSheet);
String bcName=eh.getCell(1,0).toString();
String bcType=eh.getCell(1,7).toString();

eh.setExcelFile("offerInputData", offerSheet);
String offername=eh.getCell(1,0).toString();

eh.setExcelFile("campaignCategoryInputData", campaignCategory);
String campaignCategoryName=eh.getCell(1,0).toString();

eh.setExcelFile("campaignInputData", campaignSheet);
String campaignName=eh.getCell(1,0).toString();

eh.addDataToParllelSheet(parllelRunSheet, bcName, campaignName, campaignCategoryName, offername, condition, inventory, description, bcType,bcSheet);
	
}

/***
* 
* @param parallelRunBCSheet , hm.getKey()=bcname, hm.getValue()=bcSheet
* @throws Throwable
*/
@Then("^Activate the BCs from sheet \"([^\"]*)\"$")
public void activate_the_BCs_from_sheet(String parallelRunBCSheet) throws Throwable {
eh.setExcelFile("parallelRunBC", parallelRunBCSheet);
Thread.sleep(2000);
String statusOfBC="";
// here we passing the parameters sheetname and for bcname: Name(coulmn name), for bcsheet : BCSheet(column name) keys are bcname and values are bcsheet like(oneoffBC, rucurringBC)
LinkedHashMap<String, String> dataList = eh.extractDataFromExcelFile(parallelRunBCSheet,"Name","BCSheet");
for (Entry<String, String> hm: dataList.entrySet()) {

	try { 

		broadcastPageObjects.navigate_to_broadcasts(hm.getValue());
	    commonObjects.filterBCName(hm.getValue(), hm.getKey());
	    Thread.sleep(1000);
	    statusOfBC=broadcastPageObjects.getTopBcStatus(hm.getValue(),hm.getKey());
	    
			if (statusOfBC.equals("Planned")) {
				commonObjects.clickBCOptionsIcon(hm.getValue());
				commonObjects.clickEditOption();

				edit_the_Delevery_tab_details_from_workbook_sheet("bcInputData", hm.getValue());
				activateBc();

				Thread.sleep(3000);
				broadcastPageObjects.navigate_to_broadcasts(hm.getValue());
				commonObjects.filterBCName(hm.getValue(), hm.getKey());
				// broadcastPageObjects.getTopBcStatus(bcSheetName,bcname);
				statusOfBC = broadcastPageObjects.getTopBcStatus(hm.getValue(), hm.getKey());

				eh.insertLastColumnValues("parallelRunBC", parallelRunBCSheet, statusOfBC, hm.getKey(), "Name",
						"StatusofBC");

				Thread.sleep(3000);

				System.out.println(hm.getKey() + " is acivated");
			} else {

				statusOfBC = broadcastPageObjects.getTopBcStatus(hm.getValue(), hm.getKey());

				eh.insertLastColumnValues("parallelRunBC", parallelRunBCSheet, statusOfBC, hm.getKey(), "Name",
						"StatusofBC");
			}
		
	}catch (Exception e) {
		commonObjects.filterBCName(hm.getValue(), hm.getKey());
		statusOfBC=broadcastPageObjects.getTopBcStatus(hm.getValue(),hm.getKey());
		System.out.println(statusOfBC);
		eh.insertLastColumnValues("parallelRunBC", parallelRunBCSheet,statusOfBC, hm.getKey(), "Name","StatusofBC" );
		//System.out.println(hm.getKey()+" is not acivated");
		}
		
		
	   
}

Thread.sleep(2000);
}
	

@Then("^verify the activated Bcs from Sheet \"([^\"]*)\" and inventory \"([^\"]*)\" with condition \"([^\"]*)\"$")
public void verify_the_activated_Bcs_from_Sheet_and_inventory_with_condition(String parallelRunBCSheet, String inventory, String targetCondition) throws Throwable {
    int count=0;
    boolean boolean1;
	eh.setExcelFile("parallelRunBC", parallelRunBCSheet);
	LinkedHashMap<String, String> dataList = eh.extractDataFromExcelFile(parallelRunBCSheet,"Name","Inventory");
	
	for (Entry<String, String> hm: dataList.entrySet()) {
	
		
	 if(hm.getValue().equals("BlackoutAlways")&&inventory.equals("BlackoutAlways")) {
		 commonObjects.filterName(hm.getKey());
		 
		 boolean1 = jswait.checkVisibility("(//vaadin-grid-cell-content[contains(.,'"+hm.getKey()+"')]/../..//vaadin-grid-table-cell[contains(.,'Blackout Snooze')]/..//vaadin-grid-table-cell[contains(.,'728')]/..//vaadin-grid-table-cell[contains(.,'0')]/..//vaadin-grid-table-cell[8][contains(.,'0')])[1]");
	
		if(boolean1==true)
			eh.insertLastColumnValues("parallelRunBC", parallelRunBCSheet,"Pass", hm.getKey(), "Name","StatusOfTestcase");
		else
			eh.insertLastColumnValues("parallelRunBC", parallelRunBCSheet,"Fail", hm.getKey(), "Name","StatusOfTestcase");
	
	 }else if(hm.getValue().equals("OneperDay")&&inventory.equals("OneperDay")) {
		 commonObjects.filterName(hm.getKey());
		
			 if(count==0) {
		 jswait.checkVisibility("(//vaadin-grid-cell-content[contains(.,'"+hm.getKey()+"')]/../..//vaadin-grid-table-cell[contains(.,'Completed')]/..//vaadin-grid-table-cell[contains(.,'728')]/..//vaadin-grid-table-cell[contains(.,'728')]/..//vaadin-grid-table-cell[8][contains(.,'728')])[1]");
		 ++count;
		 System.out.println(hm.getKey()+" one per day 1st bc");
			 }else if(count>=1) {
			 jswait.checkVisibility("(//vaadin-grid-cell-content[contains(.,'"+hm.getKey()+"')]/../..//vaadin-grid-table-cell[contains(.,'Completed')]/..//vaadin-grid-table-cell[contains(.,'0')]/..//vaadin-grid-table-cell[contains(.,'0')]/..//vaadin-grid-table-cell[8][contains(.,'0')])[1]");
		System.out.println(hm.getKey()+" one per day 2nd bc");
		 }
			 
	 }else if(hm.getValue().equals("Unlimited")&&inventory.equals("Unlimited")) {
		 commonObjects.filterName(hm.getKey());
		
		if(hm.getKey().contains("seeding"))
		  boolean1= jswait.checkVisibility("(//vaadin-grid-cell-content[contains(.,'"+hm.getKey()+"')]/../..//vaadin-grid-table-cell[contains(.,'Completed')]/..//vaadin-grid-table-cell[contains(.,'728')]/..//vaadin-grid-table-cell[contains(.,'728')]/..//vaadin-grid-table-cell[8][contains(.,'0')])[1]");
		 else
		 boolean1= jswait.checkVisibility("(//vaadin-grid-cell-content[contains(.,'"+hm.getKey()+"')]/../..//vaadin-grid-table-cell[contains(.,'Completed')]/..//vaadin-grid-table-cell[contains(.,'728')]/..//vaadin-grid-table-cell[contains(.,'728')]/..//vaadin-grid-table-cell[8][contains(.,'728')])[1]");
		 
		 if(boolean1==true)
				eh.insertLastColumnValues("parallelRunBC", parallelRunBCSheet,"Pass", hm.getKey(), "Name","StatusOfTestcase");
			else
				eh.insertLastColumnValues("parallelRunBC", parallelRunBCSheet,"Fail", hm.getKey(), "Name","StatusOfTestcase");
	 }
		
		
	}//for
	
	
}//method

	


}//class


