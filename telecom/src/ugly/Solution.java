package ugly;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
        int[] ug = new int[index];
		ug[0] = 1;
		int t1 = 0, t2 = 0, t3 = 0;
		int i = 1;
		while(i < index) {
			int min = getMin(ug[t1]*2, ug[t2]*3, ug[t3]*5);
			ug[i] = min;
			while(ug[t1]*2 <= min)
				t1++;
			while(ug[t2]*3 <= min)
				t2++;
			while(ug[t3]*5 <= min)
				t3++;
			i++;
		}
		System.out.println(ug[index-1]);
	}
	
	public static int getMin(int a, int b, int c) {
		int tmp = a<b?a:b;
		if(c < tmp)
			return c;
		else
			return tmp;
	}
}
