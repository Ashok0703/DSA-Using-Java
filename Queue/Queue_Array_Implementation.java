package Queue;
import java.util.*;
public class Queue_Array_Implementation {
	int q[]=new int[10];
	int head=-1;
	int rear=-1;
	void enqueue(int x) {
		if(head==-1 && rear==-1) {
			head=0;
			rear=0;
			q[rear]=x;
			
		}
		else if(rear==q.length-1) {
			System.out.println("Overflow");
		}
		else {
			rear=rear+1;
			q[rear]=x;
		}
		
	}
	void dequeue() {
		if(head==-1 && rear==-1) {
			System.out.println("Underflow");
		}
		else if(head==rear) {
			System.out.println("Dequeued element is "+q[head]);
			head=rear=-1;
		}
		else {
		
		System.out.println("Dequeued element is "+q[head]);
		head=head+1;
		}
	}
	void peek() {
		if(head==-1 && rear==-1) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("Peek : "+q[head]);
		}
	}
	void disp() {
		System.out.println("Elements in Queue");
		for(int i=head;i<=rear;i++) {
			System.out.println(q[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue_Array_Implementation queue=new Queue_Array_Implementation();
		
		queue.enqueue(sc.nextInt());
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(sc.nextInt());
		queue.enqueue(sc.nextInt());
		queue.disp();
		queue.peek();
		System.out.println(Arrays.toString(queue.q));
		
		
		

	}

}
