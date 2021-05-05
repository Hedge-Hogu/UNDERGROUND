import java.util.*;


public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
		Set set = new HashSet();
//		System.out.println(objArr.length);
		
		for(int i=0; i<objArr.length; i++) { //length= 9;
//			set.add(objArr[i]);
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
