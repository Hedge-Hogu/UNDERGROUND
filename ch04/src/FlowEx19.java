
public class FlowEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i =0; i < 1000000000; i++) {
			;
		} //end of for
		long endTime = System.currentTimeMillis();
		
		System.out.println("���� �ð� : "+startTime);
		System.out.println("���� �ð� : "+endTime);
		System.out.println("�ҿ� �ð� : "+(endTime -startTime));
		
	}

}
