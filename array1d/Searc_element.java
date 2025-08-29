package array.array1d;
import java.util.Scanner;
public class Searc_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the element "+(i+1));
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search : ");
		int s=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==s) {
				System.out.println(s+" is found at the index "+i);
				
			}
		}
		sc.close();
	}

}
