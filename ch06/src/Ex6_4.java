
public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		mm.printGugudan(8);
//		long result1 = mm.add(3, 2);
		
//		long result = mm.min(5, 3);
//		long result2 = mm.subtract(5l, 3l);
//		long result3 = mm.multiply(5l, 3l);
//		double result4 = mm.divide(5l, 3l);
//		
//		System.out.println("add(5l, 3l) = "+result1);
//		System.out.println("min(5l, 3l) = "+mm.min(2, 3));
//		System.out.println("subtract(5l, 3l) = "+result2);
//		System.out.println("multiply(5l, 3l) = "+result3);
//		System.out.println("divide(5l, 3l) = "+result4);

	}

}

class MyMath {
	long add(long a, long b) {
		return (a>b) ? a : b;
		
	}
	
	void printGugudan(int dan) {
		if(!(2<=dan&&dan<=9))
			return;
		for(int i=1; i<=9; i++) {
			System.out.printf("%d*%d=%d%n", dan, i, dan*i);
		}
		return;
	}
	
	long subtract(long a, long b) { return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {
		return a/b; }
	long min(long a, long b){
		return (a<b)? a : b;
	}			
}
