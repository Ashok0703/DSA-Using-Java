package Queue.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;
public class PriorityQueue_Minheap {
			//smallest element highest priority
	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		System.out.println(pq.isEmpty());
		pq.add(40);
		pq.add(20);
		pq.add(60);
		pq.add(10);
		pq.add(50);
		System.out.println(pq.isEmpty());
		System.out.println("Initial Queue :"+pq);
		System.out.println(pq.add(30));
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq.peek());
		System.out.println("Final Queue : "+pq);
		System.out.println(pq.size());
		Iterator <Integer> it=pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
