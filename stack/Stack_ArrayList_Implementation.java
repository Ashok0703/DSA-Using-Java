package stack.implementation;
import java.util.*;
public class Stack_ArrayList_Implementation {
	ArrayList<Integer> stack=new ArrayList<>();
	void push(int x) {
		System.out.println("Added element is "+x);
		stack.addLast(x);
	}
	void pop() {
		if(stack.isEmpty()) {
			System.out.println("Underflow!!");
		}
		else {
			System.out.println("Removed element is "+stack.getLast());
			stack.removeLast();
			
		}
	}
	void peek() {
		if(stack.isEmpty()) {
			System.out.println("Underflow!!");
		}
		else {
		System.out.println("Peeked elemrnt is "+stack.getLast());
		}
	}
	void disp() {
		System.out.println("Elements in the stack from top are : ");
		for(int i=stack.size()-1;i>=0;i--) {
			System.out.println(stack.get(i));
		}
	}
	public static void main(String args[]) {
		Stack_ArrayList_Implementation s=new Stack_ArrayList_Implementation();
		s.push(0);
		s.pop();
		s.pop();
		s.peek();
		s.push(1);
		s.push(2);
		s.push(4);
		s.push(5);
		s.pop();
		s.peek();
		s.disp();
	}
}
