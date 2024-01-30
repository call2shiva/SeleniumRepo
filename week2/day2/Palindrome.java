package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num = 12345;
		int num1 = num;
		int rem = 0;

		while (num > 0) {
			rem = (rem * 10) + num % 10;
			num = num / 10;
		}
		System.out.println(rem);
		if (rem == num1) {
			System.out.println("Given Number is Plaindrome");

		} else {
			System.out.println("Given Number is Not a Plaindrome");
		}
	}
}
