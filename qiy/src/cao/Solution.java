package cao;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		for(int i = 0; i < t; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < t; i++) {
			if(check(arr[i]) == 1)
				System.out.println("niu");
			else
				System.out.println("yang");
		}
	}

	public static int check(int n) {
		int count = 0;
		while(n>0) {
			int c = (int) (Math.log((double)4)/Math.log((double)n));
			n = (int) (n - Math.pow(4, c));
			count ++;
		}
		return n%2;
	}
}
