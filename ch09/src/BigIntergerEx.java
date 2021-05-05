import java.math.BigInteger;

public class BigIntergerEx {
	public static void main(String[] args) throws InterruptedException {
//		for(int i=1; i<100; i++) { // i = 1~99
//			System.out.printf("%d!=%s%n", i, calcFactorial(i));
//			Thread.sleep(1000);
//		}
//		System.out.println(Math.log10(2)*Integer.MAX_VALUE);
//		System.out.printf("%d", 1);

	}
	
	static String calcFactorial(int n) {
		return factorial(BigInteger.valueOf(n)).toString();
	}
	
	static BigInteger factorial(BigInteger n) {
		if(n.equals(BigInteger.ZERO))
			return BigInteger.ONE;
		else // n*factorial(n-1)
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
	}

}
