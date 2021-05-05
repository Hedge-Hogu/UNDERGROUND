import java.util.function.*;

public class Pract_1 {

	public static void main(String[] args) {
//		Function<String, Integer> f = s -> Integer.parseInt(s, 16);
//		Function<Integer, String> g = i -> Integer.toBinaryString(i);
//		Function<String, String> h = f.andThen(g);
//		Function<Integer, Integer> h2 = f.compose(g);
//		System.out.println(h.apply("FF"));
//		System.out.println(h2.apply(2));
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 ==0;
		Predicate<Integer> notP = p.negate(); // i >= 100
		
		// 100 <= i && (i < 200 || i%2 ==0 )
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(201));
		
		
	}

}
