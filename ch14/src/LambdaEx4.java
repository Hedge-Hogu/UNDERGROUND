import java.util.*;

public class LambdaEx4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
			list.add(i);
		
		list.forEach(i -> System.out.print(i+","));
//		System.out.println();
//		System.out.println(list);
//		Iterator z = list.iterator();
//		System.out.print("[");
//		while(z.hasNext()) {
//			int i = (Integer)z.next();
//			System.out.print(i+", ");
//		}
//		System.out.println("]");
		System.out.println();
		
		list.removeIf(x -> (x%2==0 || x%3==0));
		System.out.println(list);
		
		list.replaceAll(i -> i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		
		map.forEach((k, v) -> System.out.print("{"+k+","+v+"},"));
		
//		Iterator it = map.entrySet().iterator();
//		
//		while(it.hasNext())
//			System.out.println(it.next());
		System.out.println();
		
	}
	
	

}
