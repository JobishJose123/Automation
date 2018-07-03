package baseClasses;

import java.io.IOException;

public class ExcelStatus {
	static Runnable r1 = new Runnable() {
		  public void run() {
			  ExcelHelper oldFile = new ExcelHelper();
				ExcelHelper newFile = new ExcelHelper();
				newFile.setExcelFile("old", "q");
				oldFile.setExcelFile("old", "q");
				int i = 0;
				int j = 0;
				int countOld = 0;
				String oldCase = "";
				System.out.println("Initial\n");
				String newCase = "";
				for(i=0;i<=500;i++) {
					try {
						oldFile.setCell(i, 0,"check1");
						System.out.println("check1");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(countOld);
		  }
		};
		static Runnable r2 = new Runnable() {
		  public void run() {
			  ExcelHelper oldFile = new ExcelHelper();
				ExcelHelper newFile = new ExcelHelper();
				newFile.setExcelFile("old", "q");
				oldFile.setExcelFile("old", "q");
				int i = 0;
				int j = 0;
				int countOld = 0;
				String oldCase = "";
				System.out.println("Initial\n");
				String newCase = "";
				for(i=0;i<=200;i++) {
					try {
						oldFile.setCell(i, 0,"check2");
						System.out.println("check2");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(countOld);
		  }
		};

	public static void main(String[] args) throws IOException, InterruptedException {
		Thread thr1 = new Thread(r1);
		Thread thr2 = new Thread(r2);
		
		thr2.start();
		thr1.start();
		
	}
}
