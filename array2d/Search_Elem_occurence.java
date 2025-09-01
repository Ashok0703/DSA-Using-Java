package array.array2d;
import java.util.*;
public class Search_Elem_occurence {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns : ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the element to be search : ");
		int s=sc.nextInt();
		int ct=0;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(s==a[i][j]) {
					System.out.println(s+" is found at the row "+i+" and column "+j);
					ct+=1;
				}
			}
		}
		System.out.println(s+" is founded at the times : "+ct);
		sc.close();
	}
}


