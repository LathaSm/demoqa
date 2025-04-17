package stepdefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String str="LATHA"; String revstr=" "; for(int i=str.length()-1;i>=0;i--) {
		 * revstr= revstr + str.charAt(i); } System.out.println(revstr);
		 */
		
		List<String> name=Arrays.asList("LATHA", "KARTHIK","HEVANIKA","MOUNIKA","KARTHIK","LATHA");
		List<String> revname= name.stream().map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.toList());
		System.out.println(revname);
		
		Set<String> dupstr= new HashSet<String>();
		Set<String> resultdupstring= name.stream().filter(str -> !dupstr.add(str)).collect(Collectors.toSet());
		
		System.out.println(resultdupstring);
		
		List<Integer> num=Arrays.asList(1,3,4,2,3,4,2,5,6,6,7,9,7);
		Set<Integer> dupnum=new HashSet<Integer>();
		Set<Integer> result = num.stream().filter(n -> !dupnum.add(n)).collect(Collectors.toSet());
		System.out.println(result);
		
		String Str="I am Latha Latha Latha am I";
		
		List<String> word=Arrays.asList(Str.split("\\s+"));
		System.out.println(word);
		List<Map.Entry<String, Long>> result1= word.stream().collect(Collectors.groupingBy(w -> w,Collectors.counting())).entrySet().stream().collect(Collectors.toList());
		System.out.println(result1);	
		
		String daughtersname="hevanikamounika";
		
		List<Character> ch = daughtersname.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		System.out.println(ch);
		List<Entry<Character, Long>> count= ch.stream().collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().collect(Collectors.toList());
		System.out.println(count);
		
		List<Entry<Character, Long>>  countmorethanone=count.stream().filter(letter-> letter.getValue()>1).collect(Collectors.toList());
	System.out.println(countmorethanone);
	}
}