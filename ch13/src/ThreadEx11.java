import java.util.Iterator;
import java.util.Map;

public class ThreadEx11 {
	public static void main(String[] args) {
		System.out.println("무야호");
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
		Iterator it = map.keySet().iterator(); // map에 key set을 얻어와서 iterator 
		                                       // 방식으로로 저장
		
		int x=0;
		while(it.hasNext()) {      // 저장된 key를 하나씩 읽음
			Object obj = it.next(); // object 타입으로 변환해서 저장
			Thread t = (Thread)obj; // Thread 타입을 쓰기 위해 형변환
			
			// object 형태의 key set을 이용해서  value값을 얻는다, 형변환
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
