
public class ThreadEx16 {

	public static void main(String[] args) {
		RunImpleEx16 r1 = new RunImpleEx16("*");
		RunImpleEx16 r2 = new RunImpleEx16("**");
		RunImpleEx16 r3 = new RunImpleEx16("***");
//		Thread th1 = new Thread(r1, "*");
//		Thread th2 = new Thread(r2, "**");
//		Thread th3 = new Thread(r3, "***");
//		th1.setPriority(10);
//		th3.setPriority(5);
		r1.start();
		r2.start();
		r3.start();
		
		try {
			Thread.sleep(2000);
			System.out.println("r1.suspend!");
			r1.suspend(); // RunImpleEx16.suspended = true;
			Thread.sleep(2000);
			System.out.println("r2.suspend!");
			r2.suspend(); // RunImpleEx16.suspended = true;
			Thread.sleep(3000);
			System.out.println("r1.resume!");
			r1.resume(); // RunImpleEx16.suspended = false;
			Thread.sleep(10000);
			System.out.println("r1.stop!");
			r1.stop(); // RunImpleEx16.stopped = true;
			System.out.println("r2.stop!");
			r2.stop(); // RunImpleEx16.stopped = true;
			Thread.sleep(2000);
			System.out.println("r3.stop!");
			r3.stop(); // RunImpleEx16.stopped = true;
			
		} catch(InterruptedException e) {}

	}

}

class RunImpleEx16 implements Runnable {
	
	boolean suspended = false;
	boolean stopped   = false;
	
	Thread th;
	
	RunImpleEx16(String name) {
		th = new Thread(this, name);
	}
	
	@Override
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
		System.out.println(Thread.currentThread().getName()+" - stopped");
	}
	
	public void suspend() { suspended = true; }
	public void resume() { suspended = false; }
	public void stop() { stopped = true; }
	public void start() {th.start(); }
	
}