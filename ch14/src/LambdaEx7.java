import java.util.function.*;

public class LambdaEx7 {
	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16); // 16진수 로 return
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);
		
		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);
		
		System.out.println(h.apply("FF"));
		System.out.println(h2.apply(2));
		
		Function<String, String> f2 =  x -> x;
		System.out.println(f2.apply("AAA"));
		
		Predicate<Integer> p = i -> i <100;
		Predicate<Integer> q = i -> i <200;
		Predicate<Integer> r = i -> i%2==0;
		Predicate<Integer> notP = p.negate(); // i >= 100
		
		// 100 <= i && (i<200 || i%2==0)
		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//str1과 str2가 같은지 비교한 결과를 반환
		boolean result = Predicate.isEqual(str1).test(str2);
		// boolean result = str1.equals(str2)
		System.out.println(result);
	}

}
