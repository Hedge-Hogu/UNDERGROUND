import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer =0;
		
		answer = (int)(Math.random()*100)+1;
		System.out.println("����="+answer);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1�� 100������ ������ �Է��ϼ���.>");
		input = scanner.nextInt();
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if(input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
			
		} while(input!=answer);
//		do {
//			System.out.print("1�� 100������ ������ �Է��ϼ���.>");
//			input = scanner.nextInt();
//			
//			if(input > answer) {
//				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
//			} else if(input < answer) {
//				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
//			}
//		} while(input!=answer);
		
		System.out.println("�����Դϴ�.");
	}

}