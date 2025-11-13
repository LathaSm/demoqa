package intquestions;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=123;
		int count=0;
		while(no!=0) {
			
		int rem=no%10;//3
		count=count+rem;
		no=no/10;//12
		
		
		
		}
		
		System.out.println(count);

	}

}
