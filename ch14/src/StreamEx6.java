import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx6 {
	public static void main(String[] args) {
		Student2[] stuArr = {
				new Student2("이자바", 3, 300),
				new Student2("김자바", 1, 200),
				new Student2("안자바", 2, 100),
				new Student2("박자바", 2, 150),
				new Student2("소자바", 1, 200),
				new Student2("나자바", 3, 290),
				new Student2("감자바", 3, 180)
		};
		
		List<String> names = Stream.of(stuArr).map(Student2::getName)
						 					  .collect(Collectors.toList());
		System.out.println(names);
		
		Student2[] stuArr2 = Stream.of(stuArr).toArray(Student2[]::new);
		
		for(Student2 s : stuArr2)
			System.out.println(s);
		
		Map<String, Student2> stuMap = Stream.of(stuArr)
				.collect(Collectors.toMap(s -> s.getName(), s -> s));
		
		for(String name : stuMap.keySet())
			System.out.println(name+"-"+stuMap.get(name));
		
		long count = Stream.of(stuArr).collect(Collectors.counting());
		long totalScore = Stream.of(stuArr)
				.collect(Collectors.summingInt(Student2::getTotalScore));
		
		System.out.println("count="+count);
		System.out.println("totalScore="+totalScore);
		
		totalScore = Stream.of(stuArr)
	    .collect(Collectors.reducing(0, Student2::getTotalScore, Integer::sum));
		System.out.println("totalScore="+totalScore);
		
		Optional<Student2> topStudent2 = Stream.of(stuArr)
	.collect(Collectors.maxBy(Comparator.comparingInt(Student2::getTotalScore)));
		System.out.println("topStudent2="+topStudent2.get());
		IntSummaryStatistics stat = Stream.of(stuArr)
				.collect(Collectors.summarizingInt(Student2::getTotalScore));
		System.out.println(stat);
		String stuNames = Stream.of(stuArr).map(Student2::getName)
							.collect(Collectors.joining(",", "{", "}"));
		System.out.println(stuNames);
	}
}
class Student2 implements Comparable<Student2> {
	String name;
	int ban;
	int totalScore;
	
	Student2(String name, int ban, int totalScore) {
		this.name =name;
		this.ban =ban;
		this.totalScore=totalScore;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
//		System.out.printf("[%s, %d, %d]", name, ban, totalscore);
	}
	
	String getName() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }

	@Override
	public int compareTo(Student2 s) {
		return s.totalScore - this.totalScore;
	}
	
}
