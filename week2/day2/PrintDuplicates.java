package week2.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(num);
		int len=num.length-1;
		
		for(int i=0;i<len;i++)
		{
			if(num[i]==num[i+1]) {
				
				System.out.print(num[i]+" ");
			}
		}

	}

}
