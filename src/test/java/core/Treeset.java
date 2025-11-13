package core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Character> letters=new HashSet<Character>();
		letters.add('a');
		letters.add('z');
		letters.add('c');
		letters.add('m');
		System.out.println(letters);
		letters.add(null);
		int a[]= {1,3,3,3,5,6,7,5,6};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int n:a) {
			list.add(n);
		}
		
		System.out.println(list);
		
		HashSet<Integer> dupvalues=new HashSet<Integer>(list);
		System.out.println(dupvalues);
	
		

	}

}
