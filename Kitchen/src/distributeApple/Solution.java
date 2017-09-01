package distributeApple;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println(apple(n, a, sum));
	}
	
	public static int apple(int n, int[] a, int sum) {
		if(n == 1)
			return 0;
		if(sum%n != 0) 
			return -1;
		int average = sum/n;
		int count = 0;
		for(int i = 0; i < n; i++) {
			if((average-a[i])%2 != 0)
				return -1;
			if(average > a[i])
				count += (average-a[i])/2;
		}
		return count;
	}

}
