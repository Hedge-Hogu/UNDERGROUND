
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[10];
		
		for(int i=0; i<number.length; i++) {
			number[i] = i;
			System.out.println(number[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10); // n=4
			int temp = number[0]; //temp= 0
			number[0] = number[n];// number[0]= 4
			number[n] = temp;// number[4]=0
		}
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}

}
