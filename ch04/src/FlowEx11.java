
public class FlowEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = (int)(Math.random()*101);
		char grade = ' ';
		
		switch(score/10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
		} // end of switch
		System.out.println("����� ������ "+grade+"�Դϴ�.");
	} //end of main

}
