import java.util.*;

public class Ex12_2 {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>(); // jdk1.7ºÎÅÍ °¡´É
		map.put("ÀÚ¹Ù¿Õ", new Student("ÀÚ¹Ù¿Õ", 1, 1, 100, 100, 100));
		
		
		//    public V get(Object key) {
		Student s = map.get("ÀÚ¹Ù¿Õ");
		
		System.out.println(s.name);
	}

}

class Student {
	String name ="";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, 
			int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
}
