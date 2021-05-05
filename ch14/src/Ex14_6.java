import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex14_6 {
	public static void main(String[] args) {
		String[] strArr = { "aaa", "bb", "c", "dddd" };
		
//		Optional<String> str = Stream.of(strArr)
//				.max(Comparator.comparing(s -> s.length()));
//		System.out.println(str.get());
		
//		Stream.of(strArr)
//		.map(s -> s.length())
//		.peek(s -> System.out.printf("%d%n", s))
//		.sorted(Comparator.reverseOrder())
//		.limit(1).forEach(System.out::println);;
		
		Stream.of(strArr)
		.sorted(Comparator.comparingInt(String::length).reversed())
		.limit(1).forEach(System.out::println);
		
	}

}
