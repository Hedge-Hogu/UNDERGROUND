
public class FlowEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		for(int i =0; i < 1000000000; i++) {
			;
		} //end of for
		long endTime = System.currentTimeMillis();
		
		System.out.println("시작 시간 : "+startTime);
		System.out.println("종료 시간 : "+endTime);
		System.out.println("소요 시간 : "+(endTime -startTime));
		
	}

}
