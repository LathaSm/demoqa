package utils;

	
	import java.util.*;

	public class LongPrefix {
	    public static String longestCommonPrefix(String[] strs) {
	        if (strs == null || strs.length == 0) return "";

	        List<String> list = Arrays.asList(strs);
	        Collections.sort(list);
	        System.out.println(list);

	        String first = list.get(0);
	        String last = list.get(list.size() - 1);
	        int i = 0;

	        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
	            i++;
	        }

	        return first.substring(0, i);
	    }

	    public static void main(String[] args) {
	        String[] input = {"flower", "flow", "flight"};
	        System.out.println("Longest Common Prefix: " + longestCommonPrefix(input));
	    }
	}



