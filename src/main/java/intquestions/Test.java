package intquestions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input - tomorrow
		//output - t$$$m$$rr$w
		String str="tomorrow";
		System.out.println("input:"+str);
		StringBuilder result = new StringBuilder();
		int ocount=0;
		for(char c:str.toCharArray()) {
			if(c=='o') {
				ocount++;
			}
		}
		int currentcount=ocount;
		for(char c:str.toCharArray()) {
			if(c=='o') {
				result.append("$".repeat(currentcount));
				currentcount--;
			}
			else {
				result.append(c);
			}
		}
		
		System.out.println(result.toString());
		
	}
}	