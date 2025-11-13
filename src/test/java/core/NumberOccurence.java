package core;

import java.util.*;

public class NumberOccurence {
	public static void main(String[] args) {
		
		/*
		 * input= {1,3,3,3,5,6,7,5,6} Output : 1=1, 3=3, 5=2, 6=2,7=1
		 */ 
	int a[]= {1,3,3,3,5,6,7,5,6};
		
	/*List<Integer> list = new ArrayList<Integer>();*/
	
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	
	  for(Integer i : a) {
		  
		 if(map.containsKey(i)) 
		 
		 { map.put(i, map.get(i)+1); }
	  
	  else{
		  
		  map.put(i,1 );
	  
	  }

	  }
	 
System.out.println(map);
	
	}
		// TODO Auto-generated method stub}
}
