public class ThreadEx15 {
	public static void main(String[] args) {
//		RunImplEx15 r = new RunImplEx15();
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		th1.start();
		th2.start();
		th3.start();
		
//			System.out.println("sleep 2seconds");
			delay(2000);
			System.out.println("th1.suspend!");
			th1.suspend();
//			System.out.println("sleep 2seconds");
			delay(2000);
			System.out.println("th2.suspend!");
			th2.suspend();
//			System.out.println("sleep 3seconds");
			delay(3000);
			System.out.println("th1.resume!");
			th1.resume();
//			System.out.println("sleep 3seconds");
			delay(3000);
			System.out.println("th1.stop!");
			th1.stop();
			System.out.println("th2.stop!");
			th2.stop();
//			System.out.println("sleep 2seconds");
			delay(2000);
			System.out.println("th3.stop!");
			th3.stop();
			
	}
	
	public static void delay(long millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException e) {}
	}
			
}

class MyThread implements Runnable {
	volatile boolean suspended = false; //쉽게 바뀌는 변수
	volatile boolean stopped = false;
	
	Thread th;
	
	MyThread(String name) {
		th= new Thread(this, name);
	}
	
	void start() { th.start(); }
	void stop() { stopped =true; }
	void suspend() { suspended = true; }
	void resume() { suspended =false; }

	@Override
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
//				System.out.println("th sleep 1seconds");
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
	}
}
