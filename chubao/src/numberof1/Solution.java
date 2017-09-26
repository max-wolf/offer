package numberof1;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			result = s;
			while ((result | (result + 1)) <= e) {
				result = result | (result + 1);
			}
			System.out.println("Case " + (i + 1) + ": " + result);
		}
	}
	
}