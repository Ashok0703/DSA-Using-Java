package Queue.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BuiltInDequqExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);      // Insert at front
        dq.addLast(20);       // Insert at rear
        dq.offerFirst(5);     // Offer at front
        dq.offerLast(25);   
        dq.poll();
        // Offer at rear

        System.out.println("Deque: " + dq);

        System.out.println("Removed from front: " + dq.removeFirst());  // Remove front
        System.out.println("Removed from rear: " + dq.removeLast());    // Remove rear

        System.out.println("Peek front: " + dq.peekFirst());  // View front
        System.out.println("Peek rear: " + dq.peekLast());  
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());// View rear
        System.out.println(dq.poll());
        System.out.println(dq.poll());
       // dq.remove()--return error
        System.out.println(dq.offer(1));// return true or false
        
        System.out.println("Final Deque: " + dq);
    }
}
