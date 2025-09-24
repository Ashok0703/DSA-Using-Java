package Queue.PriorityQueue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator;
public class PriorityQueue_maxheap {
			//Largest element has a high priority
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.add(10);pq.add(20);
		pq.add(30);
		pq.add(5);
		pq.add(50);
		pq.offer(15);
		System.out.println(pq.isEmpty());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.size());
		Iterator<Integer> it=pq.iterator();
		for(Integer i:pq) {
			System.out.println(i);
		}
		

	}

}
