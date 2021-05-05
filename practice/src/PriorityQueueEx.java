import java.util.*;

public class PriorityQueueEx {
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(new Integer(3));
		pq.offer(new Integer(1));
		pq.offer(new Integer(5));
		pq.offer(new Integer(2));
		pq.offer(new Integer(4));
		System.out.println(pq);
		
		Deque dq = new LinkedList();
		
		Object obj = null;
		
		while((obj=pq.poll()) != null) {
			System.out.println(obj);
		}
		
	}

}
