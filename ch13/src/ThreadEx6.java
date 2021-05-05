import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static void main(String[] args) throws Exception{
		
		ThreadEx6_1 th1 = new ThreadEx6_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");
		
	}

}

class ThreadEx6_1 extends Thread {

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
	
}
