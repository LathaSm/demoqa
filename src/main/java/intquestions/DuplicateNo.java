package intquestions;

import java.util.*;

public class DuplicateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int num[]= {13,2,1,0,25,17};	
	//int no=13;
	
	for(int no:num) {
	if(no<2) {
		System.out.println(no + "Number is not prime");
	}
	else if(no==2) {
		System.out.println(no + "Number is prime");
	}
	
	else {
		boolean bool = false;
		
		for(int i=2;i<no/2;i++) {
			if(no%i==0) {
				System.out.println(no +"Number is not prime");
				bool=true;
				break;
			}
		}
		
		if(bool==false) {
			System.out.println(no +"The given no is Prime");
		}
		
	}
	
	
	}
	}

}
