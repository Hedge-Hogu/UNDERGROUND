
public class ThreadEx5 {
	static long startTime=0;

	public static void main(String[] args) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		ThreadEx5_2 th2 = new ThreadEx5_2();
		ThreadEx5_3 th3 = new ThreadEx5_3();
		th1.start();
		th2.start();
		th3.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("-"));
		
		System.out.println("소요시간1:"+(System.currentTimeMillis()
				  -ThreadEx5.startTime)/1000.000);
	}

}

class ThreadEx5_1 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("|"));
		
		System.out.println("소요시간2:"+(System.currentTimeMillis()
												  -ThreadEx5.startTime)/1000.000);
	}
	
}

class ThreadEx5_2 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("*"));
		
		System.out.println("소요시간3:"+(System.currentTimeMillis()
												  -ThreadEx5.startTime)/1000.000);
	}
	
}

class ThreadEx5_3 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<300; i++)
			System.out.printf("%s", new String("$"));
		
		System.out.println("소요시간4:"+(System.currentTimeMillis()
												  -ThreadEx5.startTime)/1000.000);
	}
	
}