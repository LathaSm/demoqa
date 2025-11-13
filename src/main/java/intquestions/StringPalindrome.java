package intquestions;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Nurses Run"; 
str=str.toLowerCase().replaceAll("\\s", "");
System.out.println(str);
char ch[]=str.toCharArray();
String strrev="";
for(int i=str.length()-1;i>=0;i--) {
	strrev=strrev+ch[i];
}
System.out.println(strrev);
if(str.equals(strrev)) {
	System.out.println("String is Palindrome");
}
else {
	System.out.println("String is not a Palindorme");
}
	}

}
