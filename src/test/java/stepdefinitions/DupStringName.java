package stepdefinitions;

import java.util.*;

public class DupStringName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="LathaSubramaniamMurugan";
		Set<Character> set=new HashSet<Character>();
		
		for(char c:str.toCharArray()){
		if(set.add(c)){
			System.out.println(c);
		}
		}
	}

}
