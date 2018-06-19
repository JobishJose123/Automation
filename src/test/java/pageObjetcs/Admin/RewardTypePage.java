package pageObjetcs.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClasses.Init;
import baseClasses.JSWaiter;

public class RewardTypePage extends Init{
	JSWaiter jswait = new JSWaiter();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	public RewardTypePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//paper-button[contains(.,'Create New Reward Type')]")
	private WebElement createNewRewardTypeButton;
	@FindBy(xpath=".//*[@id='newRewardDialog']//label[text()='Name']/..//input")
	private WebElement createRewardName;
	@FindBy(xpath=".//*[@id='newRewardDialog']//label[text()='Description']/..//textarea")
	private WebElement createRewardDescription;
	@FindBy(xpath=".//*[@id='newRewardDialog']//label[text()='Flow Class']/..//input")
	private WebElement createRewardFlowClassDropDown;
	@FindBy(xpath=".//*[@id='items']/vaadin-combo-box-item[1]")
	private WebElement createRewardFlowClassSelectFirst;
	@FindBy(xpath=".//*[@id='newRewardDialog']//paper-button[contains(.,'Save')]")
	private WebElement createRewardSaveButton;
	@FindBy(xpath="//paper-button[contains(.,'Create New Reward Parameter')]")
	private WebElement createNewRewardParameterButton;
	@FindBy(xpath=".//*[@id='newParamDialog']//label[text()='Display Name']/..//input")
	private WebElement rewardParameterDisplayName;
	@FindBy(xpath=".//*[@id='newParamDialog']//label[text()='Parameter Name']/..//input")
	private WebElement rewardParameterName;
	@FindBy(xpath=".//*[@id='newParamDialog']//label[text()='Type']/..//input")
	private WebElement rewardParameterTypeDropDown;
	@FindBy(xpath="//paper-item[contains(.,'Text')]")
	private WebElement rewardParameterTypeText;
	@FindBy(xpath="//paper-item[contains(.,'Number')]")
	private WebElement rewardParameterTypeNumber;
	@FindBy(xpath="//paper-item[contains(.,'Single Select')]")
	private WebElement rewardParameterTypeSingleSelect;
	@FindBy(xpath=".//*[@id='newParamDialog']//label[text()='UI Order']/..//input")
	private WebElement rewardParameterUIOrder;
	@FindBy(xpath=".//*[@id='newParamDialog']//label[text()='Default Value']/..//input")
	private WebElement rewardParameterDefaultValue;
	@FindBy(xpath=".//*[@id='checkboxLabel' and contains(.,'Mandatory')]/..")
	private WebElement rewardParameterMandatoryCheckbox;
	@FindBy(xpath=".//*[@id='checkboxLabel' and contains(.,'Edit')]/..")
	private WebElement rewardParameterEditCheckbox;
	@FindBy(xpath=".//*[@id='checkboxLabel' and contains(.,'Reduce')]/..")
	private WebElement rewardParameterReduceCheckbox;
	@FindBy(xpath=".//*[@id='checkboxLabel' and contains(.,'Hidden')]/..")
	private WebElement rewardParameterHiddenCheckbox;
	@FindBy(xpath=".//*[@id='newParamDialog']//paper-button[contains(.,'Save')]")
	private WebElement rewartdParameterSaveButton;
	@FindBy(xpath=".//*[@id='rewardParamGrid']//paper-icon-button[@icon='delete']")
	private WebElement rewardParameterDelete;
	@FindBy(xpath="//*[@id='rewardParamGrid']//paper-icon-button[@icon='create']")
	private WebElement rewardParameterEdit;
	@FindBy(xpath=".//*[@id='deleteRewardParam']//paper-button[2]")
	private WebElement rewardParameterDeleteConfirmYes;
	@FindBy(xpath=".//*[@id='deleteReward']//paper-button[2]")
	private WebElement rewardDeleteConfirmYes;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
//	@FindBy(xpath="")
//	private WebElement partnerOption;
	
	
	
//	public void clickPartnerOption() throws InterruptedException{
//		jswait.loadClick(partnerOption);
//	}
//	public void clickEditOption() throws InterruptedException{
//		jswait.loadClick(optionsEdit);
//	}
	
	
	public void clickCreateNewRewardTypeButton() throws InterruptedException{
		jswait.loadClick(createNewRewardTypeButton);
	}
	public void clickCreateNewRewardParameterButton() throws InterruptedException{
		jswait.loadClick(createNewRewardParameterButton);
	}
	public void expandReward(String reward) throws InterruptedException{
		jswait.loadClick("//span[contains(.,'"+reward+"')]/..");
	}
	public void deleteReward(String reward) throws InterruptedException{
		jswait.loadClick("//span[contains(.,'"+reward+"')]/../..//paper-icon-button[1]");
		jswait.loadClick(rewardDeleteConfirmYes);
	}
	
	public void clickCreateRewardSaveButton() throws InterruptedException{
		jswait.loadClick(createRewardSaveButton);
	}
	public void enterCreateRewardName(String name) throws InterruptedException{
		jswait.loadSendKeys(createRewardName, name);
	}
	public void enterCreateRewardDescription(String desc) throws InterruptedException{
		jswait.loadSendKeys(createRewardDescription, desc);
	}
	public void selectFirstCreateRewardFlowClass() throws InterruptedException{
		Thread.sleep(2000);
		jswait.loadClick(createRewardFlowClassDropDown);
		jswait.loadClick(createRewardFlowClassSelectFirst);
	}
	public void createRewardParameters(String displayName,String parameterName,String type,String order) throws InterruptedException{
		jswait.loadClick(createNewRewardParameterButton);
		jswait.loadSendKeys(rewardParameterDisplayName, displayName);
		jswait.loadSendKeys(rewardParameterName, parameterName);
		jswait.loadClick(rewardParameterTypeDropDown);
		if(type.contains("SINGLE_SELECT"))
			jswait.loadClick(rewardParameterTypeSingleSelect);
		else if(type.contains("NUMBER")) {
			jswait.loadClick(rewardParameterTypeNumber);
			jswait.loadClick(rewardParameterMandatoryCheckbox);
		}
		else if(type.contains("TEXT")) {
			jswait.loadClick(rewardParameterTypeText);
			jswait.loadClick(rewardParameterMandatoryCheckbox);
			jswait.loadClick(rewardParameterHiddenCheckbox);
		}
		jswait.loadSendKeys(rewardParameterUIOrder, order);
		jswait.loadSendKeys(rewardParameterDefaultValue, "defaultValue");
		jswait.loadClick(rewartdParameterSaveButton);
	}
	public void deleteFirstParameter() throws InterruptedException{
		jswait.loadClick(rewardParameterDelete);
		jswait.loadClick(rewardParameterDeleteConfirmYes);
	}
	public void editFirstParameter() throws InterruptedException{
		jswait.loadClick(rewardParameterEdit);
		jswait.loadSendKeys(rewardParameterDisplayName, "Edited616263");
		jswait.loadClick(rewartdParameterSaveButton);
	}
	public void editReward(String reward,String newName) throws InterruptedException{
		jswait.loadClick("//span[contains(.,'"+reward+"')]/../..//paper-icon-button[2]");
		jswait.loadSendKeys(createRewardName, newName);
		jswait.loadClick(createRewardSaveButton);
	}

}
