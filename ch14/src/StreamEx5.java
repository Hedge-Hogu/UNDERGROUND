import java.util.*;
import java.util.stream.*;

public class StreamEx5 {

	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr)
		.parallel()
		.forEachOrdered(System.out::println);
		
		System.out.println();
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length()==0);
		Optional<String> sWord = Stream.of(strArr).parallel()
							.filter(s -> s.charAt(0)=='s').findAny();
		
		System.out.println("noEmptyStr="+noEmptyStr);
		System.out.println("sWord="+sWord.get());
		
		//Stream<String>을 IntStream으로 변환. s -> s.length()
		Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);
		
		
//		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a+1);
		System.out.println("count="+count);
		int sum = intStream2.reduce(0, (a,b) -> a+b);
		System.out.println("sum="+sum);
		
		OptionalInt max = IntStream.empty().reduce((a, b) ->Integer.max(a, b));
		System.out.println("max="+max.orElse(0));
		
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println("min="+min.getAsInt());
	}

}
