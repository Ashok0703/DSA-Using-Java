package array.array1d;

import java.util.Scanner;

public class Search_ele_No_Occurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search : ");
		int s=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==s) {
				count+=1;
			}
		}
		System.out.println(s+" is occured "+count+"times in the array");
		sc.close();
	}


}
