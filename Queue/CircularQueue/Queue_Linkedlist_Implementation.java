package Queue.CircularQueue;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Queue_Linkedlist_Implementation {
	Node front=null,rear=null;
	void enqueue(int x) {
		Node newnode=new Node(x);
		if(front==null) {
			
			front=rear=newnode;
			rear.next=front;
			System.out.println("Inserted element is "+rear.data);
			
		}
		else {
			rear.next=newnode;
			rear=newnode;
			rear.next=front;
			System.out.println("Inserted element is "+rear.data);
		}
	}
	void dequeue() {
		if(front==null) {
			System.out.println("Underflow!!");
		}
		else if(front==rear) {
			System.out.println("Queue contains one element deleted is "+front.data);
			front=rear=null;
		}
		else {
			System.out.println("Dequeued element is "+front.data);
			front=front.next;
			rear.next=front;
		}
	}
	void peek() {
		if(front==null) {
			System.out.println("Underflow!!");
		}
		else {
			System.out.println("Peek : "+front.data);
		}
	}
	void disp() {
		Node i=front;
		while(true) {
			
			System.out.println(i.data);
			if(i==rear) {
				break;
			}
			i=i.next;
		}
		
	}
	public static void main(String args[]) {
		Queue_Linkedlist_Implementation q=new Queue_Linkedlist_Implementation();
		q.enqueue(0);
		q.dequeue();
		q.dequeue();
		q.peek();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.peek();
		q.disp();
	}
}
