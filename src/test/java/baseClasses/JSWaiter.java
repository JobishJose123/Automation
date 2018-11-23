package baseClasses;
import java.awt.Toolkit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

		public class JSWaiter extends Init{
			///////////////////////////////////////////////////////////////////////
			private static int waitValue = 2;
			private LoadMask loadMask = new LoadMask();

			public void clickElement(WebElement element) {
				WebDriverWait wait = new WebDriverWait(driver, 8);
				wait.until(ExpectedConditions.elementToBeClickable(element)).click();
			}
			public void clickElement(String element) {
				WebDriverWait wait = new WebDriverWait(driver, 8);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element))).click();
			}
			
			public boolean checkVisibility(WebElement element) {
				try {
				WebDriverWait wait = new WebDriverWait(driver, 8);
				wait.until(ExpectedConditions.visibilityOf(element));
				return true;
				}catch(Exception e) {
					return false;
				}
			}
			public boolean checkVisibility(String element) {
				try {
				WebDriverWait wait = new WebDriverWait(driver, 8);
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy((By.xpath(element))));
				return true;
				}catch(Exception e) {
					System.out.println(e.getMessage());
					return false;
				}
			}
			
			public int tryClick(WebElement element) {
				try{
					clickElement(element);
					return 1;
				}catch(Exception e) {
					System.out.println("Exception on try Click:"+element.toString());
					log.debug("Exception on try Click:"+element.toString());
					return 0;
				}
			}
			public int tryClick(String element) {
				log.debug("inside tryClick method to click:"+element.toString());
				try{
					clickElement(element);
					return 1;
				}catch(Exception e) {
					System.out.println("Exception on try Click:"+element.toString());
					log.debug("Exception on try Click:"+element.toString());
					return 0;
				}
			}
			public void loadClick(WebElement element) throws InterruptedException{
				log.debug("inside loadClick method to click"+element.toString());
				int initialWait = 0;
				while(initialWait<=waitValue) {
					Thread.sleep(400);
					log.debug("initial wait of 400ms for:"+element.toString());
					loadMask.waitForLoadMask();
					log.debug("no presence of loadMask for"+element.toString());
					Thread.sleep(400);
					if(tryClick(element)==1)
						return;
					Thread.sleep(1000);
					loadMask.waitForLoadMask();
					initialWait++;
				}
				clickElement(element);
			}
			public void loadClick(String element) throws InterruptedException{
				log.debug("inside loadClick method for:"+element.toString());
				int initialWait = 0;
				while(initialWait<=waitValue) {
					Thread.sleep(400);
					log.debug("initial wait of 400ms");
					loadMask.waitForLoadMask();
					log.debug("no presence of loadMask");
					Thread.sleep(400);
					if(tryClick(element)==1)
						return;
					Thread.sleep(1000);
					loadMask.waitForLoadMask();
					initialWait++;
				}
				clickElement(element);
			}
			
			public void failIfVisible(String element) throws Exception {
				Exception failIfVisibleException = new Exception("failIfVisibleException::element is visible, hence scenario failed");
				log.debug("inside failIfVisible method for:"+element.toString());
				boolean status = false;
				int initialWait = 0;
				while(initialWait<=waitValue) {
					Thread.sleep(400);
					log.debug("initial wait of 400ms");
					loadMask.waitForLoadMask();
					log.debug("no presence of loadMask");
					Thread.sleep(400);
					if(checkVisibility(element)==true)
						break;
					Thread.sleep(1000);
					loadMask.waitForLoadMask();
					initialWait++;
				}
				if(checkVisibility(element)==true)
					throw failIfVisibleException;
			}
			
			public void failIfVisible(WebElement element) throws Exception {
				Exception failIfVisibleException = new Exception("failIfVisibleException::element is visible, hence scenario failed");
				log.debug("inside failIfVisible method for:"+element.toString());
				boolean status = false;
				int initialWait = 0;
				while(initialWait<=waitValue) {
					Thread.sleep(400);
					log.debug("initial wait of 400ms");
					loadMask.waitForLoadMask();
					log.debug("no presence of loadMask");
					Thread.sleep(400);
					if(checkVisibility(element)==true)
						break;
					Thread.sleep(1000);
					loadMask.waitForLoadMask();
					initialWait++;
				}
				if(checkVisibility(element)==true)
					throw failIfVisibleException;
			}
			//////////////////////////////////////////////////////////////////
			public void loadClickTry(WebElement element) throws InterruptedException{
				 WebDriverWait wait = new WebDriverWait(driver, 8);
				 String loadMaskStatus = "";
				 Thread.sleep(400);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Trying again......");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("messsage2:"+e.getMessage());
				 }
				 }
//				 wait.until(ExpectedConditions.elementToBeClickable(element));
				 Thread.sleep(500);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 
				 }
				 }
				 try {
					 Thread.sleep(500);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e) {
						 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
					 }
					 while(loadMaskStatus.contains("block")) {
						 Thread.sleep(1000);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e) {
						 
					 }
					 }
				 wait.until(ExpectedConditions.elementToBeClickable(element)).click();
				 }catch(Exception e) {
					 System.out.println("messsage5:"+e.getMessage());
					 Thread.sleep(2000);
					 try {
						 Thread.sleep(500);
						 try {
							 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
						 }catch(Exception e1) {
							 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
						 }
						 while(loadMaskStatus.contains("block")) {
							 Thread.sleep(1000);
						 try {
							 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
						 }catch(Exception e1) {
							 
						 }
						 }
					 wait.until(ExpectedConditions.elementToBeClickable(element)).click();
					 }catch(Exception secondTry) {
						 System.out.println("Second Try messsage: "+secondTry.getMessage());
						 Thread.sleep(2000);
						 wait.until(ExpectedConditions.elementToBeClickable(element)).click();
					 }
				 }
		}
			public void loadClickTry(String element) throws InterruptedException{
				 WebDriverWait wait = new WebDriverWait(driver, 8);
				 String loadMaskStatus = "";
				 Thread.sleep(400);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Trying again......");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("messsage2:"+e.getMessage());
				 }
				 }
//				 wait.until(ExpectedConditions.elementToBeClickable(element));
				 Thread.sleep(400);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 
				 }
				 }
				 try {
					 Thread.sleep(500);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e) {
						 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
					 }
					 while(loadMaskStatus.contains("block")) {
						 Thread.sleep(1000);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e) {
						 
					 }
					 }
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).click();
				 }catch(Exception e) {
					 System.out.println("messsage5:"+e.getMessage());
					 Thread.sleep(2000);
					 try {
						 Thread.sleep(500);
						 try {
							 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
						 }catch(Exception e1) {
							 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
						 }
						 while(loadMaskStatus.contains("block")) {
							 Thread.sleep(1000);
						 try {
							 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
						 }catch(Exception e1) {
							 
						 }
						 }
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).click();
					 }catch(Exception secondTry) {
						 System.out.println("messsage5:"+secondTry.getMessage());
						 Thread.sleep(2000);
						 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).click();
					 }
				 }
		}

		public void loadSendKeys(WebElement element, String key) throws InterruptedException{
			 WebDriverWait wait = new WebDriverWait(driver, 8);
			 String loadMaskStatus = "";
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 wait.until(ExpectedConditions.visibilityOf(element));	
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 try {
				 Thread.sleep(500);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 
				 }
				 }
				 wait.until(ExpectedConditions.visibilityOf(element)).clear();
				 wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(key);
			 }catch(Exception e) {
				 System.out.println("messsage5:"+e.getMessage());
				 Thread.sleep(2000);
				 try {
					 Thread.sleep(500);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
					 }
					 while(loadMaskStatus.contains("block")) {
						 Thread.sleep(1000);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 
					 }
					 }
				 wait.until(ExpectedConditions.visibilityOf(element)).clear();
				 wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(key);
				 }catch(Exception secondTry) {
					 System.out.println("messsage5:"+secondTry.getMessage());
					 Thread.sleep(2000);
					 wait.until(ExpectedConditions.visibilityOf(element)).clear();
					 wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(key);
				 }
			 }
		}
		public void loadSendKeys(String element, String key) throws InterruptedException{
			 WebDriverWait wait = new WebDriverWait(driver, 8);
			 String loadMaskStatus = "";
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));	
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 try {
				 Thread.sleep(500);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 
				 }
				 }
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).clear();
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).sendKeys(key);
			 }catch(Exception e) {
				 System.out.println("messsage5:"+e.getMessage());
				 Thread.sleep(2000);
				 try {
					 Thread.sleep(500);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
					 }
					 while(loadMaskStatus.contains("block")) {
						 Thread.sleep(1000);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 
					 }
					 }
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).clear();
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).sendKeys(key);
				 }catch(Exception secondTry) {
					 System.out.println("messsage5:"+secondTry.getMessage());
					 Thread.sleep(2000);
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).clear();
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element))).sendKeys(key);
				 }
			 }
		}
		public void waitUntil(WebElement element) throws InterruptedException{
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 8);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		public void waitUntil(String xpath) throws Exception{
			WebDriverWait wait = new WebDriverWait(driver, 8);
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			}catch(Exception e) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			}
			
		}
		public void waitForInvisibility(String xpath) throws Exception{
			WebDriverWait wait = new WebDriverWait(driver, 8);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
		}
		public void waitForOverlay() throws InterruptedException{
			boolean overlayStatus = false;
			try {
				overlayStatus = driver.findElement(By.xpath(".//iron-overlay-backdrop")).isDisplayed();
			}catch(Exception e) {
				 
			 	}
			while(overlayStatus) {
				try {
					overlayStatus = driver.findElement(By.xpath(".//iron-overlay-backdrop")).isDisplayed();
				Thread.sleep(1000);
			 }catch(Exception e) {
				 
			 	}
			}
		}
		public boolean checkClickable(WebElement element) throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 8);
			 String loadMaskStatus = "";
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 System.out.println("Couldnt get style of loadMask. Trying again......");
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 System.out.println("messsage2:"+e.getMessage());
			 }
			 }
//			 wait.until(ExpectedConditions.elementToBeClickable(element));
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 try {
				 Thread.sleep(500);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 
				 }
				 }
			 wait.until(ExpectedConditions.elementToBeClickable(element));
			 return true;
			 }catch(Exception e) {
				 System.out.println("messsage5:"+e.getMessage());
				 Thread.sleep(1000);
				 try {
					 Thread.sleep(500);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
					 }
					 while(loadMaskStatus.contains("block")) {
						 Thread.sleep(1000);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 
					 }
					 }
					 wait.until(ExpectedConditions.elementToBeClickable(element));
					 return true;
				 }catch(Exception e1) {
					 return false;
				 }
				 
			 }
		}
		public boolean checkClickable(String element) throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 8);
			 String loadMaskStatus = "";
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 System.out.println("Couldnt get style of loadMask. Trying again......");
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 System.out.println("messsage2:"+e.getMessage());
			 }
			 }
//			 wait.until(ExpectedConditions.elementToBeClickable(element));
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 try {
				 Thread.sleep(500);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
				 }
				 while(loadMaskStatus.contains("block")) {
					 Thread.sleep(1000);
				 try {
					 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
				 }catch(Exception e) {
					 
				 }
				 }
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
			 return true;
			 }catch(Exception e) {
				 System.out.println("messsage5:"+e.getMessage());
				 Thread.sleep(1000);
				try {
					Thread.sleep(500);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 System.out.println("Couldnt get style of loadMask. Proceeding without checking loadMask");
					 }
					 while(loadMaskStatus.contains("block")) {
						 Thread.sleep(1000);
					 try {
						 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
					 }catch(Exception e1) {
						 
					 }
					 }
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
					return true;
				}catch(Exception e1) {
				return false;
				}
			 }
		}
		public boolean checkVisible(WebElement element) throws InterruptedException{
			WebDriverWait wait = new WebDriverWait(driver, 8);
			try{
				wait.until(ExpectedConditions.visibilityOf(element));
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		public void scrollAndClick(String scrollPane, String toClick) throws Exception{
			Actions clickAction = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver, 8);
			 String loadMaskStatus = "";
			 Thread.sleep(2000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(scrollPane)));	
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 WebElement scrollablePane = driver.findElement(By.xpath(scrollPane));
		        clickAction.moveToElement(scrollablePane).click().build().perform();
		        Actions scrollAction = new Actions(driver);
		        for(int i=0;i<50;i++){
		        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
		        try{
		        	driver.findElement(By.xpath(toClick));
		        	break;
		        }
		        catch(Exception e){
		        }
		        Thread.sleep(1000);
		        }
		        Thread.sleep(2000);
		    	loadClick(toClick);
		}
		public void scrollIntoView(String scrollPane, String toClick) throws Exception{
			Actions clickAction = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver, 8);
			 String loadMaskStatus = "";
			 Thread.sleep(2000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(scrollPane)));	
			 Thread.sleep(400);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 while(loadMaskStatus.contains("block")) {
				 Thread.sleep(1000);
			 try {
				 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
			 }catch(Exception e) {
				 
			 }
			 }
			 WebElement scrollablePane = driver.findElement(By.xpath(scrollPane));
		        clickAction.moveToElement(scrollablePane).click().build().perform();
		        Actions scrollAction = new Actions(driver);
		        for(int i=0;i<50;i++){
		        scrollAction.sendKeys(Keys.PAGE_DOWN).perform();
		        try{
		        	driver.findElement(By.xpath(toClick));
		        	break;
		        }
		        catch(Exception e){
		        }
		        Thread.sleep(1000);
		        }
		        Thread.sleep(2000);	
		}
		public String getTextFormElement(String xpath) throws InterruptedException, UnsupportedFlavorException, IOException {
			WebDriverWait wait = new WebDriverWait(driver, 8);
			String text = "";
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			text = driver.findElement(By.xpath(xpath)).getText();
			return text;
		}
public void waitForLoadMask() throws InterruptedException{
	WebDriverWait wait = new WebDriverWait(driver, 8);
	 String loadMaskStatus = "";
	 Thread.sleep(2000);
	 try {
		 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
	 }catch(Exception e) {
		 
	 }
	 while(loadMaskStatus.contains("block")) {
		 Thread.sleep(1000);
	 try {
		 loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
	 }catch(Exception e) {
		 
	 }
		}
		
}
public String getTextFormTextField(String xpath)
		throws InterruptedException, UnsupportedFlavorException, IOException {
	String text = "";
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	StringSelection stringSelection = new StringSelection("checkText");
	clipboard.setContents(stringSelection, null);
	driver.findElement(By.xpath(xpath)).sendKeys(Keys.CONTROL, "a");
	Thread.sleep(1000);
	driver.findElement(By.xpath(xpath)).sendKeys(Keys.CONTROL, "c");
	String result = (String) clipboard.getData(DataFlavor.stringFlavor);
	text = result;
	return text;
}

public String getTextFormTextField(WebElement element)
		throws InterruptedException, UnsupportedFlavorException, IOException {
	String text = "";
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Clipboard clipboard = toolkit.getSystemClipboard();
	StringSelection stringSelection = new StringSelection("checkText");
	clipboard.setContents(stringSelection, null);
	element.sendKeys(Keys.CONTROL, "a");
	Thread.sleep(1000);
	element.sendKeys(Keys.CONTROL, "c");
	String result = (String) clipboard.getData(DataFlavor.stringFlavor);
	text = result;
	return text;
}
public String getGridColumnNumber(String columnXpath, String matchKey) {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(columnXpath)));
	List<WebElement> columnHeader = driver.findElements(By.xpath(columnXpath));
	int status =0 ;
	for(int i = 0;i<columnHeader.size();i++) {
		if(columnHeader.get(i).getText().contains(matchKey)) {
			status = i+1;
			break;
		}	
	}
	if(status!=0)
		return String.valueOf(status);
	else
		return "couldnt fint header__"+matchKey;
}

}
		
	
