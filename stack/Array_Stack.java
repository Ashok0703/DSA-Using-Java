package stack.implementation;
import java.util.*;
public class Array_Stack {
	
	int s[]=new int[5];
	int t=-1;
	public  void push(int x) {
		if(t==s.length-1) {
			System.out.println("Overflow");
		}
		else {
			t=t+1;
			s[t]=x;
			System.out.println("Inserted element is "+x);
		}
	}
	public void pop() {
		if(t==-1) {
			System.out.println("Underflow");
		}
		else {
			System.out.println("deleted element is "+s[t]);
			t=t-1;
		}
	}
	void peek() {
		if(t==-1) {
			System.out.println("Underflow");
		}
		else {
		
		System.out.println("Peek : "+s[t]);
		}
	}
	void disp() {
		for(int i=t;i>=0;i++) {
			System.out.println(s[i]);
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Array_Stack stack1=new Array_Stack();
		System.out.println("Enter the element to be search");
		stack1.pop();
		stack1.push(sc.nextInt());
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.peek();
		stack1.push(4);
		stack1.push(5);
		
	}

}
