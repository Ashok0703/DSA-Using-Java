package Queue;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Queue_linkedList {
	Node front=null,rear=null;
	
	void enqueue(int data) {
		Node newnode=new Node(data);
		if(front==null) {
			front=rear=newnode;
			System.out.println("First Enqueued element is "+data);
			
		}
		else {
			rear.next=newnode;
			rear=newnode;
			System.out.println("Enqueued element is "+data);
		}
		
	}
	void dequeue() {
		if(front==null) {
			System.out.println("Underflow");
		}
		
		else {
			System.out.println("Dequeued element is "+front.data);
			front=front.next;
			if(front == null) {
				rear=null;
			}
		}
	}
	void peek() {
		if(front== null) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("Peek : "+front.data);
		}
	}
	void display() {
		if(front ==null) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("Elements in the queues are");
			Node temp=front;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public static void main(String args[]) {
		Queue_linkedList q=new Queue_linkedList();
		q.enqueue(0);
		q.dequeue();
		q.dequeue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.peek();
		q.dequeue();
		q.display();
	}
}
