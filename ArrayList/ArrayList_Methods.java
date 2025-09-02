package arraylist.methods;
import java.util.*;
import java.util.Scanner;
public class ArrayList_Methods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l1=new ArrayList<>();
		for(int i=0;i<10;i++) {
			l1.add(i,i);
		}
		for(int i=0;i<10;i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("After modify");
		for(int i=0;i<10;i++) {
			l1.set(i,i+1);
		}
		for(int i=0;i<10;i++) {
			System.out.println(l1.get(i));
			
		}
		System.out.println("COntains method");
		System.out.println(l1.contains(1));
		System.out.println(l1.contains(11));
		System.out.println("Index of method ");
		System.out.println(l1.indexOf(1));
		System.out.println(l1.indexOf(11));
		System.out.println("== and equals method");
		System.out.println(l1.get(0)==1);
		System.out.println(l1.get(0)==11);
		System.out.println(l1.get(0).equals(1));
		System.out.println(l1.get(0).equals(3));
		l1.add(13);
		l1.remove(1);
		System.out.println("Empty method "+l1.isEmpty());
		System.out.println("Iterator ");
		Iterator<Integer> it=l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Integer []arr=l1.toArray(new Integer[0]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
