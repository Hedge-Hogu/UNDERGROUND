public class Ex13_11 {
	static long startTime =0;
	
	public static void main(String[] args) {
		ThreadEx1_1 th1 = new ThreadEx1_1();
		ThreadEx1_2 th2 = new ThreadEx1_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try{
			th1.join();
			th2.join();
		} catch(InterruptedException e) {}
		
		System.out.println("�ҿ�ð�:"+(System.currentTimeMillis()-startTime));
		
	}

}
