package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.getTime());//get output - Wed Feb 21 15:48:48 IST 2024
	
	    SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
	    System.out.println(format.format(cal.getTime()));
	    
	    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	    
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	    
	    System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    
	    System.out.println(cal.get(Calendar.DATE));
	    
	    System.out.println(cal.get(Calendar.AM_PM));
	    
	    System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
	}

}
