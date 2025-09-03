package arraylist.methods;
import java.util.*;
public class Search_element {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> fruits=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				fruits.add("banana");
			}
			else {
				fruits.add("Appple");
			}
		}
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("grapes");
		fruits.add("orange");
		fruits.add("orange");
		String s1=sc.nextLine();
		for(int i=0;i<fruits.size();i++) {
			if(fruits.get(i).equals(s1)) {
				System.out.println(s1+" is found at index "+i);
			}
		}
		String s2=sc.nextLine();
		System.out.println(s2+" is found at index "+fruits.indexOf(s2));
		System.out.println(fruits.contains("banana"));
		System.out.println(fruits.lastIndexOf("banana"));
	}
}
