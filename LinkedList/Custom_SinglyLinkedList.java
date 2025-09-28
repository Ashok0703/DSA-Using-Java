package LinkedList;
import java.util.Scanner;
public class Custom_SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public Custom_SinglyLinkedList() {
		 head=null;
		
		}
	void insertAtBegin(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
	}
	void insertAtEnd(int data) {
		Node newnode=new Node(data);
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	void insertAtpos(int pos,int data) {
		Node newnode=new Node(data);
		Node temp=head;
		for(int i=1;i<pos;i++ ) {
			temp=temp.next;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}
	void deleteAtFront() {
		if(head==null) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("Deleted front element is "+head.data);
			head=head.next;
		}
	}
	void deleteAtEnd() {
		if(head==null) {
			System.out.println("Underflow");
		}
		else {
			Node temp=head;
			while(temp.next.next!=null) {
				temp=temp.next;
			}
			
		}
	}
}
