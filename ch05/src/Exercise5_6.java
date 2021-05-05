
public class Exercise5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinUnit ={500, 100, 50, 10};
		
		int money =2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.printf("%3d¿ø: %d%n", coinUnit[i], money/coinUnit[i]);
			money=money%coinUnit[i];
		}
	}

}
