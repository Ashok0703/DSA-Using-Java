package Queue.Dequeue;
import java.util.Scanner;
class Node{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
public class Dequeue_Using_DoublyLinkedlist {
	Node front,rear;
	boolean isEmpty() {
		return front==null;
	}
	void addfront(int x) {
		Node newnode=new Node(x);
		if(isEmpty()) {
			front=rear=newnode;
			System.out.println(front.data+" is added at the front of the queue");
		}
		else {
			newnode.next=front;
			front.prev=newnode;
			front=newnode;
			System.out.println(front.data+" is added at the front of the queue");
		}
	}
	void addlast(int x) {
		Node newnode=new Node(x);
		if(isEmpty()) {
			front=rear=newnode;
			System.out.println(rear.data+" is added at the last of the queue");
		}
		else {
			rear.next=newnode;
			newnode.prev=rear;
			rear=newnode;
			System.out.println(rear.data+" is added at the last of the queue");
		}
	}
	void removefirst() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			if(front==rear) {
				System.out.println("Removed element from front is "+front.data);
				front=rear=null;
				
			}
			else {
				System.out.println("Removed element from front is "+front.data);
				front=front.next;
				front.prev=null;
			}
		}
	}
	void removelast() {
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			if(front==rear) {
				System.out.println("Removed element from last is "+front.data);
				front=rear=null;
				
			}
			else {
				System.out.println("Removed element from last is "+rear.data);
				rear=rear.prev;
				rear.next=null;
			}
		}
	}
	void disp() {
		System.out.println("Elements in the dequeue : ");
		Node temp=front;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String args[]) {
		Dequeue_Using_DoublyLinkedlist deque=new Dequeue_Using_DoublyLinkedlist();
		System.out.println(deque.isEmpty());
		deque.addlast(1);
		deque.removefirst();
		System.out.println(deque.isEmpty());
		deque.addfront(2);
		deque.addfront(1);
		deque.addlast(3);
		deque.addfront(0);
		deque.disp();
		deque.removefirst();
		deque.removelast();
		deque.disp();
		System.out.println(deque.isEmpty());
		
	}
}
