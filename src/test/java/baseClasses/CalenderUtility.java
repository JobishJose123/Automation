package baseClasses;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderUtility {

	public int calculateMonthlyReccuranceWeekend(int orderCount) throws ParseException {
		//***************************************************************************************************//
				//find recurrance pattern of special days assuming weekend as sat and sunday 
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Calendar rightNow =Calendar.getInstance();
				Date date = new Date();
				rightNow.setTime(date);
				rightNow.add(Calendar.MONTH, 1);
				rightNow.set(Calendar.DAY_OF_MONTH, 1);
				//				rightNow.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("03-08-2018"));
				int daysInMonth = rightNow.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(daysInMonth);
				System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
				System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));
				int currCount = 0;
				while(currCount!=orderCount) {
//					System.out.println("current date:::"+sdf.format(rightNow.getTime()));
//					System.out.println(rightNow.get(Calendar.DAY_OF_MONTH)+"day of week:"+rightNow.get(Calendar.DAY_OF_WEEK));
					if(rightNow.get(Calendar.DAY_OF_WEEK)==7||rightNow.get(Calendar.DAY_OF_WEEK)==1) {
						currCount++;
						System.out.println("current count"+currCount);
						
						if(currCount==orderCount) {
							break;
						}
					}
				rightNow.add(Calendar.DATE, 1);
				}
//				System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
//				System.out.println(currCount);
				
				return rightNow.get(Calendar.DAY_OF_MONTH);
				
	}
	
	// to get the current date for specific format String DateFormate="dd MMM YYYY hh:mm aaa z" if you want it to change the date format follow your format ;
			public String getCurrentDate(String DateFormate) {	 
			 DateFormat dateFormat = new SimpleDateFormat(DateFormate);//03 Dec 2018 01:48 PM IST
			 Date date = new Date();		 
			 String date1= dateFormat.format(date);		 
//			 System.out.println("Current date and time is " +date1);
			 
			  return date1;
			}
			public static void main(String args[]) throws ParseException {
				CalenderUtility c = new CalenderUtility();
				System.out.println(c.calculateMonthlyReccuranceWeekend(5));
				
			}
}