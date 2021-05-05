import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.Comparator.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student3 {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student3(String name, boolean isMale, int hak, int ban, int score) {
		this.name	=name;
		this.isMale =isMale;
		this.hak	=hak;
		this.ban	=ban;
		this.score	=score;
	}
	
	String getName() { return name;}
	boolean isMale() { return isMale;}
	int getHak() 	{ return hak;}
	int getBan() 	{ return ban;}
	int getScore() 	{ return score;}

	@Override
	public String toString() {
		return String.format("[%s, %s, %d�г�, %d��, %3d��]",
							name, isMale ? "��":"��", hak, ban, score);
	}
	// groupingBy()���� ��� 
	enum Level { HIGH, MID, LOW }
}

public class StreamEx7 {
	public static void main(String[] args) {
		Student3[] stuArr = {
			new Student3("���ڹ�", true,  1, 1, 300),	
			new Student3("������", false, 1, 1, 250),	
			new Student3("���ڹ�", true,  1, 1, 200),	
			new Student3("������", false, 1, 2, 150),	
			new Student3("���ڹ�", true,  1, 2, 100),	
			new Student3("������", false, 1, 2,  50),	
			new Student3("Ȳ����", false, 1, 3, 100),	
			new Student3("������", false, 1, 3, 150),	
			new Student3("���ڹ�", true,  1, 3, 200),
			
			new Student3("���ڹ�", true,  2, 1, 300),	
			new Student3("������", false, 2, 1, 250),	
			new Student3("���ڹ�", true,  2, 1, 200),	
			new Student3("������", false, 2, 2, 150),	
			new Student3("���ڹ�", true,  2, 2, 100),	
			new Student3("������", false, 2, 2,  50),	
			new Student3("Ȳ����", false, 2, 3, 100),	
			new Student3("������", false, 2, 3, 150),	
			new Student3("���ڹ�", true,  2, 3, 200),	
		};
		
		System.out.printf("1. �ܼ�����(������ ����)%n");
		Map<Boolean, List<Student3>> stuBySex = Stream.of(stuArr).
				collect(partitioningBy(Student3::isMale));
		
		List<Student3> maleStudent3   = stuBySex.get(true);
		List<Student3> femaleStudent3 = stuBySex.get(false);
		
		for(Student3 s : maleStudent3)   System.out.println(s);
		for(Student3 s : femaleStudent3) System.out.println(s);
		
		System.out.printf("%n2. �ܼ����� + ���(���� �л���)%n");
		Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
				.collect(
						partitioningBy(Student3::isMale,
								counting()
						)
				);
		System.out.println("���л� �� :"+stuNumBySex.get(true));
		System.out.println("���л� �� :"+stuNumBySex.get(false));
		
		System.out.printf("%n3. �ܼ����� + ���(���� 1��)%n");
		Map<Boolean, Optional<Student3>> topScoreBySex = Stream.of(stuArr)
				.collect(
						partitioningBy(Student3::isMale, maxBy(
								comparingInt(Student3::getScore))
						)
				);
		System.out.println("���л� 1�� :"+topScoreBySex.get(true));
		System.out.println("���л� 1�� :"+topScoreBySex.get(false));
		
		Map<Boolean, Student3> topScoreBySex2 = Stream.of(stuArr).collect(
				partitioningBy(Student3::isMale, collectingAndThen(maxBy(
						comparingInt(Student3::getScore)), Optional::get)));
		
		System.out.println("���л� 1�� :"+topScoreBySex2.get(true));
		System.out.println("���л� 1�� :"+topScoreBySex2.get(false));
		
		System.out.printf("%n4. ���ߺ���(���� ���հ���, 100�� ����)%n");
		
		Map<Boolean, Map<Boolean, List<Student3>> > failedStubySex =
				Stream.of(stuArr).collect(
						partitioningBy(Student3::isMale, 
								partitioningBy(s -> s.getScore() <= 100)
						)
				);
		List<Student3> failedMaleStu   = failedStubySex.get(true).get(true);
		List<Student3> failedFemaleStu = failedStubySex.get(false).get(true);
		
		for(Student3 s : failedMaleStu)   System.out.println(s);
		for(Student3 s : failedFemaleStu) System.out.println(s);
	} // main
	
	

}
