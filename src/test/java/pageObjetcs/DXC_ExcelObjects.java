package pageObjetcs;

import org.openqa.selenium.support.PageFactory;

import baseClasses.Init;

public class DXC_ExcelObjects extends Init{
	DXC_ExcelObjects excel_ob = new DXC_ExcelObjects();
	
	public DXC_ExcelObjects() {
		PageFactory.initElements(driver, this);
	}

	public void Exceldata(String FileName, String FileLocation)
	{
		System.out.println();
	}
}
