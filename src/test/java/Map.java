import java.util.*;
import java.util.Map.Entry;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="latha";
		HashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();

		for(char c: str.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c,1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		System.out.println(map);
		  List<Entry<Character, Integer>> sortedList = new ArrayList<>(map.entrySet());
	        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
	        
	        System.out.println(sortedList.size());

	        if (sortedList.size() < 2) {
	            System.out.println("No second most frequent character found.");
	        } else {
	            System.out.println("Second most frequent character: " + sortedList.get(1).getKey() +
	                               " (Frequency: " + sortedList.get(1).getValue() + ")");
	        }
	    }

	

		
	
		
	}


