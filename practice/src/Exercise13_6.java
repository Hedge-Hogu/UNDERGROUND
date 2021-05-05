
public class Exercise13_6 {

	public static void main(String[] args) throws Exception {
		Thread4 th1 = new Thread4();
		th1.setDaemon(false);
		th1.start();
		
		try {
			th1.sleep(5000);
		} catch (InterruptedException e) {}
		
		throw new Exception("²Î~!!!");
	}

}

class Thread4 extends Thread {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
	
}
