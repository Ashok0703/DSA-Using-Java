package stack.implementation;
import java.util.Stack;
public class Stack_implement_Methods {
	static void push_stack(Stack<Integer> stack) {
		for(int i=0;i<5;i++) {
			System.out.println(stack.push(i));
		}
	}
	static void pop_stack(Stack<Integer> stack) {
		
			System.out.println(stack.pop());
			
	}
	static void peek_stack(Stack<Integer> stack) {
		for(int i=0;i<5;i++) {
		System.out.println(stack.peek());
		pop_stack(stack);
		}
}

	public static void main(String args[]) {
		Stack<Integer> stack=new Stack<>();
		push_stack(stack);
		System.out.println("Search the index of element 0 from the topD");
		System.out.println(stack.search(0));
		System.out.println("peek and pop");
		peek_stack(stack);
		System.out.println(stack.isEmpty());
	}
}
