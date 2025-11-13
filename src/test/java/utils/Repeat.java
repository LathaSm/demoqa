package utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
//Output: 5 
//Explanation: 5 is the first element that repeats
	int arr[] = {10, 5, 3, 4, 3, 5, 6};
	System.out.println("First Repeated Number");
	System.out.println(firstrepeatednumber(arr));
	
	}
	
	public static int firstrepeatednumber(int arr[]) {
		
		TreeMap<Integer, Integer> map = new TreeMap<Integer,Integer>();
		for(int n:arr) {
		
			if(!map.containsKey(n)) {
				map.put(n, 1);
			}
			else {
				map.put(n, map.getOrDefault(n, 0)+1);
			}
			
		}
		System.out.println(map);
		
		for(int n:arr) {
			if(map.get(n)>1) {
				return n;
			}
		}
		
		return -1;
		
	}
}

