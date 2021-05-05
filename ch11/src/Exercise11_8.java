import java.util.*;

public class Exercise11_8 {
	
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
//		Collections.sort(list);
		calculateSchoolRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
