package Queue.CircularQueue;

public class CircularQueue_ArrayImplementation {
	int q[];
	int size;
	int front,rear;
	public CircularQueue_ArrayImplementation() {
		size=5;
		q=new int[size];
		front=-1;
		rear=-1;
	}
	boolean isfull() {
		if((front==0 && rear==size-1)||(front==rear+1)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	boolean isempty() {
		if(front==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	void enqueue(int x) {
		if(isfull()) {
			System.out.println("Overflow!!");
		}
		else if(isempty()) {
			front =rear=0;
			q[rear]=x;
			System.out.println("Inserted element is "+x);
		}
		
		else {
			rear=(rear+1)%size;
			q[rear]=x;
			System.out.println("Inserted element is "+x);
			
		}
	}
	void dequeue() {
		if(isempty()) {
			System.out.println("Underflow!!");
		}
		else if(front==rear) {
			System.out.println("dequeued element is "+q[front]);
			front=rear=-1;
		}
		else {
			System.out.println("dequeued element is "+q[front]);
			front=(front+1)%size;
			
		}
	}
	void peek() {
		if(isempty()) {
			System.out.println("Underflow");
		}
		else {
		System.out.println("Peek : "+q[front]);
		}
	}
	void disp() {
	    if (isempty()) {
	        System.out.println("Underflow");
	    } else {
	    	
	        int i = front;
	        System.out.println("Queue elements:");
	        while (true) {
	            System.out.println(q[i]);
	            if (i == rear) {
	                break;
	            }
	            i = (i + 1) % size;
	        }
	    }
	    
	}

	
	
	public static void main(String args[]) {
		CircularQueue_ArrayImplementation queue=new CircularQueue_ArrayImplementation();
		queue.dequeue();
		queue.peek();
		queue.enqueue(0);
		queue.dequeue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.disp();
		queue.peek();
	}

}
