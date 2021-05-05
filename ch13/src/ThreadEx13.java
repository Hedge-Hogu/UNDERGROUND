import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) {
//		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadEx13_1 th1 = new ThreadEx13_1();
//		Thread th1 = new Thread(new ThreadEx13_1(), "th1");
		th1.start();
//		main.list();
		System.out.println("isInterrupted():"+th1.isInterrupted());
		String input =JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");
		th1.interrupt(); // interrupted() = true
//		System.out.println("isInterrupted():"+th1.isInterrupted());
//		System.out.println("isInterrupted():"+th1.isInterrupted());
		
//		 main 쓰레드가 interrupt되었는지 확인
//		System.out.println("interrupted():"+Thread.interrupted());
	}
}

class ThreadEx13_1 extends Thread {

	@Override
	public void run() {
		int i=10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x<2500000000L; x++);
		}
		System.out.println("isInterrupted():"+this.isInterrupted());
		System.out.println("isInterrupted():"+this.isInterrupted());
		// interrupted()는 interrupted라는 상태변수를 false로 초기화
		System.out.println("interrupted():"+Thread.interrupted());
		System.out.println("interrupted():"+Thread.interrupted());
		System.out.println("카운트가 종료되었습니다.");
	}
	
}