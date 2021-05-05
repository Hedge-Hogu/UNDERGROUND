import java.util.function.*;

public class Practice14 {
	public static void main(String[] args) {
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//		System.out.println(f.apply("0"));
//		Function<String, Integer> f2 = Integer::parseInt;
//		System.out.println(f2.apply("99"));
		
//		BiFunction<String, String, Boolean> f = (s1, s2) -> s1.equals(s2);
//		BiFunction<String, String, Boolean> f2= String::equals;
//		System.out.println(f2.apply(new String("2"), "1"));
		
//		MyClass obj = new MyClass();
//		Predicate<Object> f = x -> obj.equals(x);
//		Predicate<Object> f2= obj::equals;
//		
//		System.out.println(f.test(obj));
		
//		Supplier<MyClass2> s = () -> new MyClass2();
//		Supplier<MyClass2> s2= MyClass2::new;
//		System.out.println(s2.get());
		
//		Function<Integer, MyClass2> f = (i) -> new MyClass2(i);
//		Function<Integer, MyClass2> f2= MyClass2::new;
//		System.out.println(f2.apply(new Integer(5)));
		BiFunction<Integer, String, MyClass> f = (i, s) -> new MyClass(i, s);
		BiFunction<Integer, String, MyClass> f2= MyClass::new;
		System.out.println(f2.apply(1, "A"));
		
	}

}
class MyClass2 {
	
	Integer i;
	
	MyClass2(Integer i) {
		this.i =i;
	}

	@Override
	public String toString() {
		return "MyClass, "+i;
	}
	
	
	
}

class MyClass {
	
	Integer i;
	String s;
	
	MyClass(Integer i, String s) {
		this.i = i;
		this.s = s;
	}

	@Override
	public String toString() {
		return "MyClass"+i+s;
	}
	
	
};
