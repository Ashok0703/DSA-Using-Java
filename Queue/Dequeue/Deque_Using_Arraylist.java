package Queue.Dequeue;
import java.util.ArrayList;
import java.util.List;

public class Deque_Using_Arraylist {

    ArrayList<Integer> dq = new ArrayList<>();

    public boolean isEmpty() { return dq.isEmpty(); }

    public void insertFront(int x) {
        dq.add(0, x);
    }

    public void insertRear(int x) {
        dq.add(x);
    }

    public void deleteFront() {
        if (!isEmpty()) dq.remove(0);
    }

    public void deleteRear() {
        if (!isEmpty()) dq.remove(dq.size() - 1);
    }

    public int getFront() {
        return isEmpty() ? -1 : dq.get(0);
    }

    public int getRear() {
        return isEmpty() ? -1 : dq.get(dq.size() - 1);
    }

    public void display() {
        for (int x : dq) { System.out.println(x + " ");}
    }


    public static void main(String[] args) {
        Deque_Using_Arraylist dq = new Deque_Using_Arraylist();
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.insertRear(30);
        dq.display();
        dq.deleteFront();
        dq.deleteRear();
        dq.display();
        dq.insertFront(1);
        dq.insertRear(50);
        dq.display();
    }
}