import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_4 {

	public static void main(String[] args) {
		
		Calendar fromCal = Calendar.getInstance();
		Calendar toCal= Calendar.getInstance();
		fromCal.set(1989, 1, 28);
		
		Date d = new Date(fromCal.getTimeInMillis());
		Date d2= new Date(toCal.getTimeInMillis());
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		
		System.out.println("birth day="+df.format(d));
		System.out.println("today ="+df.format(d2));
		
		System.out.println((toCal.getTimeInMillis() 
				- fromCal.getTimeInMillis())/(1000*60*60*24)+" days");
		
		
	}

}
