package intquestions;

public class Tomorrow {

	public static void main(String[] args) {
		

		String strinput="tomorrow";
		/*
		 * int ocount=0; int rcount=0; for(char c:strinput.toCharArray()) { if(c=='o') {
		 * ocount++; } else if(c=='r') { rcount++; } else { System.out.println(c); } }
		 * 
		 * int currocount=ocount; int current_rcount=rcount;
		 */
		//Input: tomorrow
	//	Output: t3m3223w

		StringBuilder sb=new StringBuilder();
		for(char c:strinput.toCharArray()) {
			if(c=='o') {
				sb.append("3");
			
				}
			else if(c=='r')
			{
				sb.append("2");
				//current_rcount--;
			}
			else {
				sb.append(c);
			}
		
	}
		System.out.println(sb.toString());
		
	}
}
