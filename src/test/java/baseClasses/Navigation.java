package baseClasses;

public class Navigation extends Init {
	
	public void refreshPage() {
		driver.navigate().refresh();
	}

	public void backpage() {
		driver.navigate().back();
	}
	public void forward() {
		driver.navigate().forward();
	}
	
	
}
