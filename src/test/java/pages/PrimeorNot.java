package pages;

public class PrimeorNot {
	
	public void prime(int a) {
		boolean bool = false;
		if(a==0 ||a==1) {
			System.out.println("Given no is not prime");
		}
		else {
			for(int i=2;i<a/2;i++) {
				if(a%i==0) {
					bool=true;
					System.out.println("The given no is not Prime");
					break;
				}
			}
		}
			if(bool==false) {
				System.out.println("The Given no is prime");
			}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeorNot p=new PrimeorNot();
		p.prime(81);
		p.prime(17);
		p.prime(2);
	}

}
