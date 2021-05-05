import java.util.*;

public class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int total;
	int schoolRank;
	int classRank;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name =name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		total = kor+eng+math;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
	public int compareTo(Object o) {
		if(o instanceof Student) {
			Student tmp = (Student)o;
			
			return tmp.total - this.total;
		} else {
			return -1;
			
		}
		
		
		
	}
	public String toString() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","
				+getTotal()+","
				+getAverage()+","
				+schoolRank+","
				+classRank
				;
	}
	
}

class BanNoAscending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			int result = s1.ban-s2.ban;
			
			if(result ==0) {
				return s1.no-s2.no;
			}
			
			return result;
		} 
		
		return -1;
		
	}
}

