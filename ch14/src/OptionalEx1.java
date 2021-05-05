import java.util.Optional;
import java.util.OptionalInt;

public class OptionalEx1 {
	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
//		Optional<Integer> optInt= optStr.map(String::length);
		Optional<Integer> optInt= optStr.map(s -> s.length());
		System.out.println("optStr="+optStr.get());
		System.out.println("optInt="+optInt.get());
		
//		 int result1 = Optional.of("")
//					  .filter(x -> x.length() >0)
//					  .map(Integer::parseInt).get();
		int result1 = Optional.of("123")
				.filter(x -> x.length() >0)
				.map(Integer::parseInt).get();
		
		 
		 int result2 = Optional.of("")
				 	  .filter(x -> x.length() >0)
				 	  .map(Integer::parseInt).orElse(-1);
		 
		 System.out.println(result2);
		 
		 Optional.of("456").map(Integer::parseInt)
		 				   .ifPresent(x -> System.out.printf("result3=%d%n", x));
		 System.out.println();
		 
		 OptionalInt optInt1 = OptionalInt.of(0);
		 OptionalInt optInt2 = OptionalInt.empty();
		 
		 System.out.println(optInt1.isPresent());
		 System.out.println(optInt2.isPresent());
		 
		 System.out.println(optInt1.getAsInt());
//		 System.out.println(optInt2.getAsInt());
		 System.out.println("optInt1="+optInt1);
		 System.out.println("optInt2="+optInt2);
		 System.out.println("optInt1.equals(optInt2)?"+optInt1.equals(optInt2));
		 System.out.println();
		 
		 Optional<String> opt = Optional.ofNullable(null);
		 Optional<String> opt2= Optional.empty();
		 Optional<String> opt3= Optional.of("");
		 
		 System.out.println(opt);
		 System.out.println(opt2);
		 System.out.println(opt3);
		 System.out.println("optInt1.equals(optInt2)?"+opt.equals(opt2));
		 
		 int result3 = optStrToInt(Optional.of("123"), 0);
		 int result4 = optStrToInt(Optional.of(""), 0);
		 
		 System.out.println(result3);
		 System.out.println(result4);
		 
				 	  
	}
	
	static int optStrToInt(Optional<String> optStr, int defaultValue) {
		try{
			return optStr.map(Integer::parseInt).get();
		} catch(Exception e) {
			return defaultValue;
		}
		
	}
}
