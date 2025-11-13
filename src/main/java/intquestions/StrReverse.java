package intquestions;

public class StrReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s = "abcd1234%^&*";
		
String result = s.replaceAll("[%^&*]", " ");
System.out.println(result);

		String str = "this is epam systems";
		//Output: Systems Epam Is This
		StringBuilder reverse= new StringBuilder();
		String str1[]= str.split(" ");
		
		for (int i=str1.length-1;i>=0;i--) {
			
			String word=str1[i];
			if(word.length()>0) {
				String capital = word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase();
			reverse.append(capital).append(" ");
			}
			
	}
		System.out.println(reverse.toString().trim());
}
}
