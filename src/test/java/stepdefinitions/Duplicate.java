package stepdefinitions;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hackerearth
		
		String str="hackerearth";
		
		/*
		 * Map<Character,Integer> map= new HashMap<Character,Integer>();
		 * 
		 * char c[]=str.toCharArray();
		 * 
		 * for(Character ch:c) { if(map.containsKey(ch)) { map.put(ch, map.get(ch)+1); }
		 * 
		 * else { map.put(ch, 1); } }
		 * 
		 * Set<Character> set=map.keySet();
		 * 
		 * System.out.println(set);
		 * 
		 * for(Character cha: set) {
		 * 
		 * if(map.get(cha)>1) { System.out.println("Duplicate Characters:" + cha); } }
		 */
	
		/*
		 * Map<Character,Long> map = str.chars().mapToObj(c ->(char) c)
		 * .collect(Collectors.groupingBy(c -> c,Collectors.counting()));
		 * System.out.println(map);
		 * 
		 * List<Character> list = map.entrySet().stream() .filter(e -> e.getValue()>1)
		 * .map(Map.Entry::getKey) .collect(Collectors.toList());
		 * 
		 * System.out.println(list);
		 * 
		 * Set<Character> set = new HashSet<Character>();
		 * 
		 * Set<Character> dupset = str.chars().mapToObj(c -> (char) c) .filter( c ->
		 * !set.add(c)).collect(Collectors.toSet()); System.out.println(dupset);
		 */
		
		
		
		
		/*
		 * Map<Character,Long> map = str.chars().mapToObj(c -> (char) c)
		 * .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		 * 
		 * List<Character> list = map.entrySet().stream().filter(entry ->
		 * entry.getValue()>1) .map(Map.Entry ::getKey).collect(Collectors.toList());
		 * 
		 * Set<Character> set = new HashSet<Character>();
		 * 
		 * Set<Character> dup = str.chars().mapToObj(c ->(char)c) .filter(c ->
		 * !set.add(c)).collect(Collectors.toSet());
		 */



Map<Character,Long> map = str.chars()
.mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));


List<Character> list = map.entrySet().stream().filter(entry-> entry.getValue()>1)
.map(Map.Entry::getKey).collect(Collectors.toList());
	
		
		
		
		
		
		
		
		
		
		
		/*Set<Character> seen = new HashSet<Character>();
		Set<Character> dup=str.chars().mapToObj(c -> (char)c)
				.filter(c -> !seen.add(c))
				.collect(Collectors.toSet());
		
		System.out.println(dup);
		*/
		

	}

}
