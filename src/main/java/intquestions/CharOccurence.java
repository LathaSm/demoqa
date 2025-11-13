package intquestions;

import java.util.*;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "latha";
		char ch[]=str.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
			System.out.println(map);
		Set<Character> keys=map.keySet();
		for(char c:keys) {
			if(map.get(c)>1) {
				System.out.println(c+"-"+map.get(c));
			}
		}
	}
}
