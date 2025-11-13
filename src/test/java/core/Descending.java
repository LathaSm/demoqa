package core;
import java.util.*;

public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={10,30,6,12};

ArrayList<Integer> list= new ArrayList<Integer>();

/*
 * for(Integer n:a) { list.add(n); } Collections.sort(list);
 * Collections.sort(list,Collections.reverseOrder()); System.out.println(list);
 */

		for(int i=0;i<a.length;i++){ //0
		for(int j=i+1;j<a.length;j++) //1 2 3
		{
			int temp=0; //10
		if(a[i]<a[j]){// 10<30 ; 10<6 ; 10<12 ; 30<6
			temp=a[i];//10 //10
			a[i]=a[j];//30 //12
		a[j]=temp;//0 //10 //10 
	//10 //12
		}

	}
		
		}
		for(int k=0;k<=a.length-1;k++){
			System.out.println(a[k]);
		}
		
	}
}
