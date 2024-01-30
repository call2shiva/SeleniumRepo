package week2.day2;

import java.util.Arrays;

public class FindingMissingElement {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 2, 8, 6, 7 };
		Arrays.sort(a);
		int n = a.length;
		int sum = 0;
		int sum1 = n * (n + 1) / 2;

		for (int i = 0; i < n - 1; i++) {
			sum = sum + a[i];

		}

		System.out.println(sum1 - sum);
	}

}
