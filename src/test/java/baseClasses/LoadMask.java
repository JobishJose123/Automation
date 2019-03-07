package baseClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadMask extends Init{

	@FindBy(xpath = ".//*[@id='loadMask']")
	private WebElement loadMask;

	public String getLoadMaskStatus() {
		String loadMaskStatus = "INVALID";
		try {
			loadMaskStatus = driver.findElement(By.xpath(".//*[@id='loadMask']")).getAttribute("style");
		}catch(Exception e) {
			System.out.println("Couldnt get style of loadMask. Trying again......");
		}
		return loadMaskStatus;
	}
	public void waitForLoadMask() throws InterruptedException {     //wait until the loadMask is invisible
		while(getLoadMaskStatus().contains("block")) {
			 Thread.sleep(1000);
		}
	}

}
