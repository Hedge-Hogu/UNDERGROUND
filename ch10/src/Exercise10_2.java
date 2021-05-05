import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2017/05/11)");
		
		Date inDate = null;
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		do {
			System.out.println("날짜를 "+pattern+"의 형태로 입력해주세요."
					+ "(입력예:2017/05/11)");
			
			try {
				System.out.print(">>");
				inDate = df.parse(s.nextLine());
				break;
				
				} catch (Exception e) {}
			
			} while(true);
			
		
		DateFormat df2 = new SimpleDateFormat("입력하신 날짜는 E요일 입니다.");
		System.out.println(df2.format(inDate));
	}

}
