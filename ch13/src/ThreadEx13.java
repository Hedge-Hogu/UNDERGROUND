import javax.swing.JOptionPane;

public class ThreadEx13 {

	public static void main(String[] args) {
//		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadEx13_1 th1 = new ThreadEx13_1();
//		Thread th1 = new Thread(new ThreadEx13_1(), "th1");
		th1.start();
//		main.list();
		System.out.println("isInterrupted():"+th1.isInterrupted());
		String input =JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�.");
		th1.interrupt(); // interrupted() = true
//		System.out.println("isInterrupted():"+th1.isInterrupted());
//		System.out.println("isInterrupted():"+th1.isInterrupted());
		
//		 main �����尡 interrupt�Ǿ����� Ȯ��
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
		// interrupted()�� interrupted��� ���º����� false�� �ʱ�ȭ
		System.out.println("interrupted():"+Thread.interrupted());
		System.out.println("interrupted():"+Thread.interrupted());
		System.out.println("ī��Ʈ�� ����Ǿ����ϴ�.");
	}
	
}