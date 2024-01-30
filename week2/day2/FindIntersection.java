package week2.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {

		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };
		Arrays.sort(a);
		Arrays.sort(b);
		int len = a.length - 1;
		int len1 = b.length - 1;

		for (int i = 0; i < len; i++) {

			for (int j = 0; j < len1; j++) {

				if (a[i] == b[j]) {
					// System.out.print("");
					System.out.println("Intersecting Numbers:" + a[i] + " ");
				}
			}
		}

	}

}
