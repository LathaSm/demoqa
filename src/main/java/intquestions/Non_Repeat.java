package intquestions;
import java.util.*;
import java.util.Map.Entry;

public class Non_Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="wwoooddyahhh";
		
		LinkedHashMap<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for(char c:str.toCharArray()) {
			
			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println(map);
		
		Set<Character> set = map.keySet();

		for(char ch:set) {
			if(map.get(ch)==1){
				System.out.println("First Non Repeated Character:" +ch);
				break;
			}
			
		}
		

	}

}
