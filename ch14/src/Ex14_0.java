import java.util.Collections;
import java.util.Set;
import java.util.stream.Collector.Characteristics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0 {
	
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	}
	
	public static void main(String[] args) {
		String[] strArr = { "AAA", "BBB", "CCC" };
		
		StringBuffer sb = new StringBuffer(); // supplier()
		
		for(String tmp : strArr) // accumulator()
			sb.append(tmp);
		
		String result = sb.toString(); // finisher()
		
		
	
		
	} //main
	

}


