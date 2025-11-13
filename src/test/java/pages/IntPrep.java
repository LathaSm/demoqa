package pages;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class IntPrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Findout Duplicate array
		
		int a[]= {2,3,5,7,2,3,4,7,8,9,5,2,2};
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		Map<Integer,Long> freqmap = list.stream().collect(Collectors.groupingBy(num->num,Collectors.counting()));
		
		List<Integer> duplicate=freqmap.entrySet().stream()
				.filter(entry->entry.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		
		
		
		
	}

}
