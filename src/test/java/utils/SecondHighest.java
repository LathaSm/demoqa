package utils;

import java.util.*;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//22,33,10,5,34,5}
		
		int no[]= {22,33,10,5,34,5,6,7,9,10,45,56,85,3};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int n:no) {
			list.add(n);
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		System.out.println(list.get(1));
		
		







	}

}
