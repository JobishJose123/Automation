package baseClasses;

import java.text.ParseException;
import java.util.Calendar;

public class CalenderUtility {

	public int calculateMonthlyReccuranceWeekend(int orderCount) throws ParseException {
		//***************************************************************************************************//
				//find recurrance pattern of special days assuming weekend as sat and sunday 
				
				
				Calendar rightNow =Calendar.getInstance();
//				rightNow.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("03-08-2018"));
				int daysInMonth = rightNow.getActualMaximum(Calendar.DAY_OF_MONTH);
				System.out.println(daysInMonth);
				System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
				System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));
				int currCount = 0;
				for(int i=1;i<=daysInMonth;i++) {
					rightNow.set(Calendar.DAY_OF_MONTH, i);
					System.out.println(rightNow.get(Calendar.DAY_OF_MONTH)+"day of week:"+rightNow.get(Calendar.DAY_OF_WEEK));
					if(rightNow.get(Calendar.DAY_OF_WEEK)==7||rightNow.get(Calendar.DAY_OF_WEEK)==1) {
						currCount++;
						if(currCount==orderCount) {
							break;
						}
					}
				}
				System.out.println(rightNow.get(Calendar.DAY_OF_MONTH));
				System.out.println(currCount);
				
				return rightNow.get(Calendar.DAY_OF_MONTH);
				
	}
}
