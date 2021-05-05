import java.util.*;

class ClassTotalComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			int result = s1.ban - s2.ban;
			
			if(result==0)
				result = s2.total - s1.total;
			
			return result;
			
	}
}

public class Exercise11_9 {
	public static void calculateClassRank(List list) {
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan =  -1;
		int prevRank=  -1;
		int prevTotal= -1;
		int length = list.size();
		
		for(int i=0, n=0; i<length; i++, n++) {
			Student s = (Student)(list.get(i));
			
			if(s.ban != prevBan) {
				prevRank = -1;
				prevTotal= -1;
				n=0;
			}
			
			if(s.total == prevTotal) {
				s.classRank = prevRank;
			} else {
				s.classRank = n+1;
			}
			prevBan = s.ban;
			prevTotal = s.total;
			prevRank = s.classRank;
			
		}
		
		
	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list);
		
		int prevRank = -1;
		int prevTotal= -1;
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			Student o = (Student)(list.get(i));
			
			if(o.total == prevTotal) {
				
				o.schoolRank = prevRank;
			} else {
				
				o.schoolRank = i+1;
			}
			prevRank =o.schoolRank;
			prevTotal=o.total;
		}
		
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(new Student("ÀÌÀÚ¹Ù",2,1,70,90,70));
		list.add(new Student("¾ÈÀÚ¹Ù",2,2,60,100,80));
		list.add(new Student("È«±æµ¿",1,3,100,100,100));
		list.add(new Student("³²±Ã¼º",1,1,90,70,80));
		list.add(new Student("±èÀÚ¹Ù",1,2,80,80,90));
		
		calculateSchoolRank(list);
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
