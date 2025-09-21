package Queue;
import java.util.*;
public class Queue_ArrayList {
       ArrayList<Integer> q=new ArrayList<>();
       void enqueue(int x) {
    	   q.add(x);
    	   System.out.println(x+" is added to the queue ");
    	   
       }
       void dequeue() {
    	   if(q.isEmpty()) {
    		   System.out.println("Queue is empty!!");
    	   }
    	   else {
    	  int remove= q.remove(0);
    	   System.out.println("Removed element is "+remove);
    	   }
       }
       void peek() {
    	   if(q.isEmpty()) {
    		   System.out.println("No element to peek!!");
    	   }
    	   else {
    	   System.out.println("Peeked element is "+q.getFirst());
    	   }
       }
       void disp() {
    	   System.out.println("Elements in the queue is");
    	   for(int i:q) {
    		   System.out.println(i);
    	   }
       }
       public static void main(String args[]) {
    	   Queue_ArrayList queue=new Queue_ArrayList();
    	   queue.enqueue(0);
    	   queue.enqueue(10);
    	   queue.enqueue(20);
    	   queue.dequeue();
    	   queue.peek();
    	   queue.disp();
    	   System.out.println(queue.q);
       }
}
