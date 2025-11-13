package intquestions;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		for(int i=0;i<=num;i++) {
	System.out.print(" " +fib(i));
		
		}
		
	}
	public static int fib(int n) {
		
		if(n<=1) {
			return n;
		}
		else {
			return  (fib(n-1)+fib(n-2));
		}
		
	}

}
