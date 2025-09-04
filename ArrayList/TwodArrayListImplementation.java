package arraylist.arraylist2d;
import java.util.ArrayList;
import java.util.Scanner;
public class TwodArrayListImplementation {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		for(int i=0;i<r;i++) {
			ArrayList<Integer> each_row_arraylist=new ArrayList<>();
			System.out.println("Enter the column size of each row : ");
			int c=sc.nextInt();
			System.out.println("Enter the values for row:"+(i+1));
			for(int j=0;j<c;j++) {
				each_row_arraylist.add(sc.nextInt());
			}
			matrix.add(each_row_arraylist);
		}
		System.out.println("Elements in the 2d  array is :");
		for(int i=0;i<matrix.size();i++) {
			for(int j=0;j<matrix.get(i).size();j++) {
				System.out.print(matrix.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<matrix.size();i++) {
			for(int j=0;j<matrix.get(i).size();j++) {
				if(matrix.get(i).get(j).equals(1)) {
					System.out.println("found at row "+i+" and column"+j);
				}
			}
			System.out.println();
		}
		for(int i=0;i<matrix.size();i++) {
			if(matrix.get(i).contains(1)) {
				System.out.println("Found");
			}
		}for(int i=0;i<matrix.size();i++) {
			System.out.println("Index of 1"+matrix.get(i).indexOf(1));
		}
		
	}
}