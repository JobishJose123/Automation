package pageObjetcs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClasses.Init;
import baseClasses.JSWaiter;

public class ThreeSixtyDegreeCustomerDataPageObject extends Init{
	JSWaiter jswait = new JSWaiter();
	public ThreeSixtyDegreeCustomerDataPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//paper-card[contains(., 'Usage Metrics')]")
	private WebElement usageMetricButton;
	
	@FindBy(xpath="//paper-button[contains(., 'Create')]")	
	private WebElement createButton;
	
	@FindBy(xpath="//paper-dialog[@id = 'createNew']//div[@id = 'labelAndInputContainer']//label[contains(., 'Name')]/../input")
	private WebElement usageMetricName;
	
	@FindBy(xpath="//paper-dialog[@id = 'createNew']//textarea[@id = 'textarea']")
	private WebElement discription;
	
	@FindBy(xpath="//paper-dialog[@id = 'createNew']//paper-button[contains(., 'Save')]")
	private WebElement saveButton;
	
	
	public void clickUsageMetricsButton() throws InterruptedException {
		jswait.loadClick(usageMetricButton);
	}
	
	public void clickCreateUsageMetricsButton() throws InterruptedException {
		jswait.loadClick(createButton);
	}
	
	public void clickSaveButton() throws InterruptedException {
		jswait.loadClick(saveButton);
	}
	
	public void enterMetricsName(String name) throws InterruptedException
	{
		jswait.loadSendKeys(usageMetricName, name);
	}
	
	public void enterMetricsDiscription(String discriptionText) throws InterruptedException
	{
		jswait.loadSendKeys(discription, discriptionText);
	}
}
