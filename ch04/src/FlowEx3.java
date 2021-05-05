
public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 79;
		char grade = ' ';
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}
