import java.util.*;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set set = new TreeSet(); //범위 검색, 정렬 에유리 정렬필요없음
//		Set set = new HashSet(); // 정렬 필요
		
		
//		for(int i=0; set.size()<6; i++) {
//			int num= (int)(Math.random()*45)+1;
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
			set.add(new Test());
//		}
		
		System.out.println(set);
	}

}

class Test implements Comparable {

	@Override
	public int compareTo(Object o) {
		return -1;
	}
	
} // 비교기준이없음.

class TestComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 1;
	}
	
}