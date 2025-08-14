package array.array1d;
import java.util.Arrays;
public class OneD_Arraymethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,34,54,67,24,11,54};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int b[]=Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.binarySearch(a,10));
		
	}

}
