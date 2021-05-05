import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		c1.set(2020, 0, 1);
		
		for(int i=0; i<12; i++) {
			
			c1.set(Calendar.MONTH, i);
			c1.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
			c1.set(Calendar.DAY_OF_WEEK, 1);
			
			Date d = c1.getTime();
			
			System.out.println(new SimpleDateFormat
					("yyyy-MM-dd은 F번째 E요일입니다.").format(d));
		}
	}

}
