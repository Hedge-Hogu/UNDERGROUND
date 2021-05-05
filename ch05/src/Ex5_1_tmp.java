import java.util.Arrays; 

public class Ex5_1_tmp {

	public static void main(String[] args) {
		int[] arr = {0,4,1,3,2};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		int[][] arr2D = {{11,12},{21,22}};
		
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D  = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int[] arr2 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr2));
	}

}
