import java.util.Random;

public class RandomEx2 {
	public static void main(String[] args) {
		Random rand = new Random(1);
		Random rand2= new Random(1);
		
		method(rand);
		method(rand2);
	}
	
	public static void method(Random rand) {
		if(rand instanceof Random) {
			
			int[] number = new int[100]; 
			int[] counter= new int[10];  
			
			for(int i=0; i<number.length; i++) {
				System.out.print(number[i] = rand.nextInt(10));
				
			}
			System.out.println();
			
			for(int i=0; i<number.length; i++) {
				counter[number[i]]++;
			}
			
			for(int i=0; i<counter.length; i++) {
				System.out.println(i+"ÀÇ °³¼ö :"+printGraph('#', counter[i])+" "+counter[i]);
			}
			System.out.println();
		}
	}
	
	public static String printGraph(char ch , int value) {
		char[] bar = new char[value];
		
		
		for(int i=0; i<bar.length; i++)
			bar[i] = ch;
		
		return new String(bar);
	}
}
