package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Extracting  the current date nd time using Date class
		
		Date d = new Date();
		System.out.println(d.toString());
		//it will print like this Wed Feb 21 15:41:32 IST 2024
		
		//to get the date nd time in desired format we can use format class
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYY");
		String formattedDate = sdf.format(d);
		
		System.out.println(formattedDate);
	}

}
