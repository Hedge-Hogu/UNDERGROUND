import java.util.Arrays;

public class RandomEx3 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			System.out.print(getRand(5, 10)+",");
		System.out.println();
		
		int[] result = fillRand(new int[10], new int[]{2, 3, 7, 5});
		
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] fillRand(int[] arr, int from, int to) {
		for(int i=0; i<arr.length; i++)
			//새로운 배열을 만들어서 getRand(from, to)값을 저장
			arr[i] = getRand(from, to);
		
		return arr;
	}
	
	public static int[] fillRand(int[] arr, int[] data) {
		for(int i=0; i<arr.length; i++)
			// data배열의 요소를 새로운 배열에 그대로 적용
			arr[i] = data[getRand(0, data.length-1)];
		
		return arr;
	}
	
	public static int getRand(int from, int to) {
		// 5~10의 랜덤 숫자 생성
		return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to);
	}

}
