
public class Exercise3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'B';
		
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32) : ch;
		
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		
	}

}
