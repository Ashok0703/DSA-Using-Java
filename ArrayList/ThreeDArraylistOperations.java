package arraylist.threedarraylist_operations;
import java.util.ArrayList;
import java.util.Scanner;
public class ThreeDArraylistOperations {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<ArrayList<Integer>>> m_list=new ArrayList<>();
		System.out.println("Enter the number of matrixes");
		int m=sc.nextInt();
		for(int i=0;i<m;i++) {
			ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
			System.out.println("Enter the number of rows for matrix"+(i+1));
			int r=sc.nextInt();
			for(int j=0;j<r;j++) {
				ArrayList<Integer> each_row=new ArrayList<>();
				System.out.println("Enter the number of colums for row"+(j+1));
				int c=sc.nextInt();
				System.out.println("Enter the values for row "+(j+1));
				for(int k=0;k<c;k++) {
					each_row.add(sc.nextInt());
				}
				matrix.add(each_row);
			}
			m_list.add(matrix);
			
		}
		System.out.println("Display the elements stored in the 3d array : ");
		for(int j=0;j<m_list.size();j++) {
			System.out.println("Matrix "+(j+1));
			for(int i=0;i<m_list.get(j).size();i++) {
				
				System.out.println(m_list.get(j).get(i));
				
			}
		}
		System.out.println();
		System.out.println("Searching the  element in 3d arraylist");
		System.out.println("Enter the element to be search");
		int s=sc.nextInt();
		System.out.println("Method 1");
		for(int i=0;i<m_list.size();i++) {
			for(int j=0;j<m_list.get(i).size();j++) {
				for(int k=0;k<m_list.get(i).get(j).size();k++) {
					if(m_list.get(i).get(j).get(k).equals(s)) {
						System.out.println(s+" is found at the matrix "+(i+1)+" row "+(j+1)+" column "+(k+1));
					}
				}
			}
		}
		System.out.println();
		System.out.println("Method 2");
		for(int i=0;i<m_list.size();i++) {
			for(int j=0;j<m_list.get(i).size();j++) {
				if(m_list.get(i).get(j).contains(s)) {
					System.out.println(s+" Fount at matrix "+(i+1)+" row "+(j+1));
				}
			}
		}
		System.out.println();
		System.out.println("method 3");
		for(int i=0;i<m_list.size();i++) {
			for(int j=0;j<m_list.get(i).size();j++) {
				if(m_list.get(i).get(j).indexOf(s)!=-1) {
					System.out.println(s+" Fount at matrix "+(i+1)+" row "+(j+1)+" column "+(m_list.get(i).get(j).indexOf(s)+1));
				}
			}
		}
	}
}
