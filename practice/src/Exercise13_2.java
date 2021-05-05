
public class Exercise13_2 {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.start();
		
		for(int i=0; i<10; i++)
			System.out.print(i+"- main thread");
	}	

}

class Thread2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.print(i);
	}
}
