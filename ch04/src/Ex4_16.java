
public class Ex4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		int i   =0;
		
		for(;;) { // ���� �ݺ��� for(;;) {}
			if(sum > 100) 
				break;
			++i;
			sum += i;
//			System.out.println(i+"-"+sum);
		}
		
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}

}
