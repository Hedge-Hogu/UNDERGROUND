import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
//		System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է����ּ���.(�Է¿�:2017/05/11)");
		
		Date inDate = null;
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		do {
			System.out.println("��¥�� "+pattern+"�� ���·� �Է����ּ���."
					+ "(�Է¿�:2017/05/11)");
			
			try {
				System.out.print(">>");
				inDate = df.parse(s.nextLine());
				break;
				
				} catch (Exception e) {}
			
			} while(true);
			
		
		DateFormat df2 = new SimpleDateFormat("�Է��Ͻ� ��¥�� E���� �Դϴ�.");
		System.out.println(df2.format(inDate));
	}

}
