
public class Exercise3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2); // false
		System.out.println(y += 10 - x++); // 13
		System.out.println(x += 2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); //67 - 65 = 2
		System.out.println('5' - '0'); //5
		System.out.println(c+1); //65+1 = 66
		System.out.println(++c); //66 = B
		System.out.println(c++);//66 = B
		System.out.println(c); // C
	}

}
