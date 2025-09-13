package stack.implementation;
import java.util.Scanner;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Stack_Using_Singleliskedlist {
	Node top=null;
	void push(int x) {
		Node newnode=new Node(x);
		if(top==null) {
			top=newnode;
		}
		else {
			newnode.next=top;
			top=newnode;
		}
	}
	void pop() {
		if(top==null) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("Poped element is "+top.data);
			top=top.next;
		
		}
	}
	void peek() {
		if(top==null) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("peek element : "+top.data);
		}
	}
	void disp() {
		if(top==null) {
			System.out.println("Underflow");
		}
		else {
			Node temp=top;
			System.out.println("Elements in the Stack from top : ");
			do {
				System.out.println(temp.data);
				temp=temp.next;
				
			}while(temp!=null);
		}
	}
	void search(int s) {
		if(top==null) {
			System.out.println("Underflow");
		}
		else {
			boolean isfound=false;
			Node temp=top;
			
			do {
				
				if(temp.data==s) {
					System.out.println(s+" is found");
					isfound=true;
					break;
				}
				
				temp=temp.next;
				
			}while(temp!=null);
			if(!isfound) {
				System.out.println("Not found");
			}
		}
	}
	public static void main(String args[]) {
		Stack_Using_Singleliskedlist stack=new Stack_Using_Singleliskedlist();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be push");
		stack.push(sc.nextInt());
		stack.pop();
		stack.pop();
		stack.peek();
		System.out.println("Enter the element to be push");
		stack.push(sc.nextInt());
		System.out.println("Enter the element to be push");
		stack.push(sc.nextInt());
		System.out.println("Enter the element to be push");
		stack.push(sc.nextInt());
		stack.disp();
		stack.pop();
		System.out.println("Enter the element to be search");
		stack.search(sc.nextInt());
	}
}
