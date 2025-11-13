package pages;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is a paragraph. This is a line. This is a Statement";
		String words[]=str.toLowerCase().replaceAll("[^a-z\\s]","")
				.split("\\s+");
		
		Map<String,Long> freqmap= Arrays.stream(words)
				.collect(Collectors.groupingBy(word -> word,Collectors.counting()));
		System.out.println(freqmap);
		List<String> duplicates = freqmap.entrySet().stream()
				.filter(entry -> entry.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println(duplicates);	
		
		
		
		
		String str1="Hackerearth";
Map<Character,Long> map = str1.chars().mapToObj(c-> (char)c)
.filter(c-> !Character.isWhitespace(c))
.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
map.entrySet().stream().filter(entry-> entry.getValue()>1).forEach(entry -> System.out.println(entry.getKey() + " → " + entry.getValue() + " times"));

	}

}
