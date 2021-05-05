import java.util.ArrayList;
import java.util.Collections;

public class prc1111 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80));
		list.add(new Student("홍길동",1,3,100,100,100));
		list.add(new Student("남궁성",1,1,90,70,80));
		list.add(new Student("김자바",1,2,80,80,90));
//		System.out.println(list);
//		System.out.println();
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		int prevRank = -1;
		int prevTotal= -1;
		int length = list.size();
		
		for(int i=0; i<length; i++) {
			
			Student o = (Student)(list.get(i));
			
			if(o.total == prevTotal)
				o.schoolRank = prevRank;
			if(o.total != prevTotal) {
				if(o.total < prevTotal) {
					o.schoolRank = ++prevRank;
				}
				o.schoolRank = 1;
			}
			prevRank =o.schoolRank;
			prevTotal=o.total;
			
			System.out.println(o.total);
			System.out.println(o.schoolRank);
			System.out.println(prevRank);
			System.out.println(prevTotal);
			System.out.println();
		}
		
	}

}
