import java.util.Iterator;
import java.util.Map;

public class ThreadEx11 {
	public static void main(String[] args) {
		System.out.println("����ȣ");
		ThreadEx11_1 t1 = new ThreadEx11_1("Thread1");
		ThreadEx11_2 t2 = new ThreadEx11_2("Thread2");
		t1.start();
		t2.start();
	}
}

class ThreadEx11_1 extends Thread {
	ThreadEx11_1(String name) {
		super(name);
	}

	@Override
	public void run() {
		try{
			sleep(5*1000);
		} catch(InterruptedException e) {}
	}
}

class ThreadEx11_2 extends Thread {
	ThreadEx11_2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		Map map = getAllStackTraces();
		Iterator it = map.keySet().iterator(); // map�� key set�� ���ͼ� iterator 
		                                       // ������η� ����
		
		int x=0;
		while(it.hasNext()) {      // ����� key�� �ϳ��� ����
			Object obj = it.next(); // object Ÿ������ ��ȯ�ؼ� ����
			Thread t = (Thread)obj; // Thread Ÿ���� ���� ���� ����ȯ
			
			// object ������ key set�� �̿��ؼ�  value���� ��´�, ����ȯ
			StackTraceElement[] ste =(StackTraceElement[])(map.get(obj));
			
			System.out.println("["+ ++x +"] name : "+t.getName()
					+", group : "+t.getThreadGroup()
					+", daemon : "+t.isDaemon());
			
			for(int i=0; i<ste.length; i++) {
				System.out.println(ste[i]);
			}
			System.out.println();
		}
	}
}
