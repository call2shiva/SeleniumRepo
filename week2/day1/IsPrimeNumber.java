package week2.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int number=15;
		int count=0;
		
	for(int i=1; i<=number; i++) {
	if(number%i==0) {
		count++;
	}
		
	}
	if(count==2) {
		
		System.out.println("Given No is Prime");
	}else
	{
		System.out.println("Given No is Not a Prime");
	}
	
}
}