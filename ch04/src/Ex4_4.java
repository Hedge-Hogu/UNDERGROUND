import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = 'D';
		
		System.out.print("������ �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
//		} else {
//			grade = 'D';      // grade�� D������ �ʱ�ȭ ��Ű�� else ������ �ʿ� ����
		}
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	}

}
