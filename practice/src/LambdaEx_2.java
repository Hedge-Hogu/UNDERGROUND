import java.util.*;

public class LambdaEx_2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		
//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});
		
		Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
	}

}
