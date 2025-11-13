package intquestions;
import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Latha Subramaniam Murugan";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		 str=str.toLowerCase().replaceAll("\\s","");

	
		System.out.println(str);
		char ch[]=str.toCharArray();
		//System.out.println(ch);
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
						}
			else {
				map.put(c,1);
			}
		}
		System.out.println(map);
	}

}
