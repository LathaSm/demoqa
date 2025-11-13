package intquestions;

public class Reverse_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={2,3,4,5};
	       int b[]={1,2,6,7};
	       
	       for (int i=0;i<a.length;i++){
	           for(int j=0;j<b.length;j++){
	               if(a[i]==b[j]){
	                   System.out.println(a[i]);
	               }
	           }
	       }
	}
}