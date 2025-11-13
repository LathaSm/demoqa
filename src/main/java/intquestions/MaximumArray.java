package intquestions;
import java.util.*;

public class MaximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,24,56,78,99,12,45,85};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int n : arr) {
			list.add(n);
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(1));
		
	}

}
