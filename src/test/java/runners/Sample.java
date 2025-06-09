package runners;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String str="Latha Karthik"; Map<Character,Long> letter=
		 * str.chars().mapToObj(c -> (char)c) .filter(Character::isLetter)
		 * .collect(Collectors.groupingBy(Character ::
		 * toLowerCase,Collectors.counting()));
		 * 
		 * 
		 * letter.forEach((l, count) -> System.out.println(l + " -> " + count));
		 */
System.out.println("The count of letters from HevanikaKarthik String");
String Str1="HevanikaKarthik";
Map<Character,Long> word= Str1.chars().mapToObj(c -> (char)c)
.filter(Character ::isLetter)
.collect(Collectors.groupingBy(Character :: toLowerCase , Collectors.counting()));

word.forEach((s,m) -> System.out.println(s + "->" + m));


System.out.println("The Duplicate characters are");
word.entrySet().stream().filter(entry -> entry.getValue()>1)
.forEach(entry -> System.out.println(entry.getKey()+"->"+entry.getValue()));




























































}
}
