package arraylist.methods;
import java.util.*;
class Fruit{
	String name;
	int count;
	Fruit(String name,int count){
		this.name=name;
		this.count=count;
	}
}
public class Customobjects_Arraylist {
	public static void main(String args[]) {
		ArrayList<Fruit> fruits=new ArrayList<>();
		fruits.add(new Fruit("banana",3));
		fruits.add(new Fruit("grapes",10));
		System.out.println(fruits.get(0).name);
		System.out.println(fruits.get(0).count);
		System.out.println(fruits.get(1).name);
		System.out.println(fruits.get(1).count);
	}
}
