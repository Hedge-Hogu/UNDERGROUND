import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = 'D';
		
		System.out.print("점수를 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
//		} else {
//			grade = 'D';      // grade를 D값으로 초기화 시키면 else 문장이 필요 없음
		}
		System.out.println("당신의 학점은 "+grade+"입니다.");
	}

}
