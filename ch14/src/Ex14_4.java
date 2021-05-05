import java.util.*;
import java.util.stream.*;

public class Ex14_4 {
	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5, 6};
//		
//		for(int i : arr)
//			for(int j : arr)
//				if(i+j==6)
//					System.out.printf("[%d, %d]%n", i, j);
		
		Stream<Integer> die = IntStream.rangeClosed(1, 6).boxed();
//		Stream<Integer> die = Stream.of(1, 2, 3, 4, 5, 6);
		
		die.flatMap(i -> Stream.of(1, 2, 3, 4, 5, 6).map(i2 -> new int[]{ i, i2 }))
		.filter(iArr -> iArr[0]+iArr[1]==6)
		.forEach(iArr -> System.out.println(Arrays.toString(iArr)));
		
		
	}
}
