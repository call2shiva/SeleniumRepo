package week2.day1;

public class PrimeNo {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=1; i<=20; i++) {
			for(j=2; j<i; j++) {
				
				if(i%j==0) {
					break;
				}
				
				}
			
			if(i==j) {
				System.out.print(i+" ");
			}
		}
	}
}

