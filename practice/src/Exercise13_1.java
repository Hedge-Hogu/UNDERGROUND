public class Exercise13_1 {
	public static void main(String[] args) {
//		Runnable r = new Thread1();
//		Thread th1 = new Thread(r, "Thread-1");
//		th1.start();
		
		new Thread(new Thread1(), "Thread-1").start();
	}
}

class Thread1 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print('-');
		}
	}
	
}
