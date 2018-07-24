package pageObjetcs;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;
import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class CommonObjects extends Init {
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public CommonObjects() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@d='M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z']/../../..")
	private WebElement filterIcon;
	@FindBy(xpath = "//*[@id='filterForm']//label[contains(.,'Name')]/..//input")
	private WebElement filterFormName;
	@FindBy(xpath = "//*[@id='filterDialog']/div/paper-button[3]")
	private WebElement filterFormApply;
	@FindBy(xpath = "//*[@id='filterDialog']/div/paper-button[1]")
	private WebElement filterFormCancel;
	@FindBy(xpath = "//*[@id='filterDialog']/div/paper-button[2]")
	private WebElement filterFormReset;
	@FindBy(xpath = "//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement optionsIcon;
	@FindBy(xpath = "//*[@d='M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z']/../../..")
	private WebElement plusIcon;
	@FindBy(xpath = "//paper-button[contains(text(),'Yes')]")
	private WebElement paperButtonYes;
	@FindBy(xpath = "//paper-item[contains(.,'Edit')]")
	private WebElement optionsEdit;
	@FindBy(xpath = "//paper-item[contains(.,'Duplicate')]")
	private WebElement optionsDuplicate;
	@FindBy(xpath = "//paper-item[contains(.,'Copy')]")
	private WebElement optionsCopy;
	@FindBy(xpath = "//paper-item[contains(.,'Pause')]")
	private WebElement optionsPause;
	@FindBy(xpath = "//paper-item[contains(.,'Delete')]")
	private WebElement optionsDelete;
	@FindBy(xpath = "//paper-icon-item[contains(.,'Edit')]")
	private WebElement targetConditionOptionsEdit;
	@FindBy(xpath = "//paper-icon-item[contains(.,'Delete')]")
	private WebElement targetConditionOptionsDelete;
	@FindBy(xpath = "//paper-item[contains(.,'Deactivate')]")
	private WebElement optionsDeactivate;
	@FindBy(xpath = "//*[@src='http://192.168.150.27/images/Flip1.svg']")
	private WebElement targetConditionViewToggle;
	@FindBy(xpath = "//paper-button[contains(.,'Activate')]")
	private WebElement ActivateBCButton;

	@FindBy(xpath = "//*[@id='sym2']")
	private WebElement offers;
	@FindBy(xpath = ".//*[@id='items']/div[1]")
	private WebElement gridFirstItem;
	@FindBy(xpath = "//paper-item[contains(.,'Attributes')]")
	private WebElement attributeIcon;
	@FindBy(xpath = "//*[@d='M12 8c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0 2c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2zm0 6c-1.1 0-2 .9-2 2s.9 2 2 2 2-.9 2-2-.9-2-2-2z']/../../..")
	private WebElement optionsAttributeIcon;
	@FindBy(xpath = "//paper-item[contains(.,'Delete')]")
	private WebElement AttributeDelete;
	@FindBy(xpath = ".//*[@id='addProductDialog']/add-product/..//*[ contains(text(), 'Cancel')]")
	private WebElement CancelButton;
	@FindBy(xpath = "//paper-button[contains(.,'Create')]")
	private WebElement createBCButton;
	@FindBy(xpath = ".//*[@id='confirmBox']//paper-button[contains(.,'Yes')]")
	private WebElement YesBCButton;

	@FindBy(xpath = "//img[@src='http://192.168.150.27/images/help.svg']/..")
	private WebElement helpIcon;

	@FindBy(xpath = "//*[@d='M14.59 8L12 10.59 9.41 8 8 9.41 10.59 12 8 14.59 9.41 16 12 13.41 14.59 16 16 14.59 13.41 12 16 9.41 14.59 8zM12 2C6.47 2 2 6.47 2 12s4.47 10 10 10 10-4.47 10-10S17.53 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8z']/../../..")
	private WebElement contextHelpCloseIcon;
	 @FindBy(xpath="//paper-toggle-button")
	 private WebElement autoRefreshButton;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;
	// @FindBy(xpath="")
	// private WebElement ;

	public void clickFilterIcon() throws InterruptedException {
		jswait.loadClick(filterIcon);
	}

	public void clickHelpIcon() throws InterruptedException {
		jswait.loadClick(helpIcon);
	}

	public void clickContextHelpCloseIcon() throws InterruptedException {
		jswait.loadClick(contextHelpCloseIcon);
	}

	public void clickTargetConditionViewToggleIcon() throws InterruptedException {
		jswait.loadClick(targetConditionViewToggle);
	}

	public void clickEditOption() throws InterruptedException {
		jswait.loadClick(optionsEdit);
	}

	public void clickDuplicateOption() throws InterruptedException {
		jswait.loadClick(optionsDuplicate);
	}
	
	public void clickCopyOption() throws InterruptedException {
		jswait.loadClick(optionsCopy);
	}

	public void clickYesBCButton() throws InterruptedException {
		jswait.loadClick(YesBCButton);
	}

	public void clickPauseOption() throws InterruptedException {
		jswait.loadClick(optionsPause);
	}

	public void clickFirstItemInGrid() throws InterruptedException {
		jswait.loadClick(gridFirstItem);
	}

	public void clickDeleteOption() throws InterruptedException {
		jswait.loadClick(optionsDelete);
	}

	public void clickActivateBCButton() throws InterruptedException {
		jswait.loadClick(ActivateBCButton);
	}

	public void clickTargetConditionOptionEdit() throws InterruptedException {
		jswait.loadClick(targetConditionOptionsEdit);
	}

	public void clickTargetConditionOptionDelete() throws InterruptedException {
		jswait.loadClick(targetConditionOptionsDelete);
	}

	public void clickAttributeIcon() throws InterruptedException {
		jswait.loadClick(attributeIcon);
	}

	public void clickcreateBCButton() throws InterruptedException {
		jswait.loadClick(createBCButton);
	}

	public void navigateToOffers() throws InterruptedException {
		jswait.loadClick(offers);
	}

	public void clickAttributeDeleteIcon() throws InterruptedException {
		jswait.loadClick(AttributeDelete);
	}

	public void clickAttributeoptionIcon() throws InterruptedException {
		jswait.loadClick(optionsAttributeIcon);
	}

	public void clickOptionsIcon() throws InterruptedException {
		jswait.loadClick(optionsIcon);
	}

	public void clickPlusIcon() throws InterruptedException {
		jswait.loadClick(plusIcon);
	}

	public void clickDeactivateProductButton() throws InterruptedException {
		jswait.loadClick(optionsDeactivate);
	}

	public void clickFilterApplyButton() throws InterruptedException {
		jswait.loadClick(filterFormApply);
	}

	public void enterFilterFormname(String name) throws InterruptedException {
		jswait.loadSendKeys(filterFormName, name);
	}

	public void clickFilterCancelButton() throws InterruptedException {
		jswait.loadClick(filterFormCancel);
	}

	public void clickConfirmYesButton() throws InterruptedException {
		jswait.loadClick(paperButtonYes);
	}

	public void clickFilterResetButton() throws InterruptedException {
		jswait.loadClick(filterFormReset);
	}

	public void filterName(String name) throws InterruptedException {
		clickFilterIcon();
		enterFilterFormname(name);
		clickFilterApplyButton();
	}

	public void clickCancelButton() throws InterruptedException {
		jswait.loadClick(CancelButton);
	}
	
	public void toggleAutoRefresh() throws InterruptedException {
		jswait.loadClick(autoRefreshButton);
	}

	public void clickEditProductButton() throws InterruptedException {
		jswait.loadClick(optionsEdit);
	}

	public String getTextFromFilterForm() throws InterruptedException, UnsupportedFlavorException, IOException {
		String text = "";
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection stringSelection = new StringSelection("checkText");
		clipboard.setContents(stringSelection, null);
		driver.findElement(
				By.xpath("//*[@id='filterForm']/paper-input[1]/paper-input-container/div[1]/../div[2]/div[1]/input[1]"))
				.sendKeys(Keys.CONTROL, "a");
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id='filterForm']/paper-input[1]/paper-input-container/div[1]/../div[2]/div[1]/input[1]"))
				.sendKeys(Keys.CONTROL, "c");
		String result = (String) clipboard.getData(DataFlavor.stringFlavor);
		text = result;
		return text;
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
}
