package revert;

import java.util.Scanner;

public class Revert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean neg = false;
		int[] a = new int[5];
		int count = 0;
		if(n < 0) {
			neg = true;
			n = -n;
		}
		int i = 0;
		for(; n >= 10; i++) {
			a[i] = n%10;
			n = n/10;
			//System.out.println(a[i]);
		}
		count = i;
		a[i] = n;
		System.out.println(i+1);
		if(neg)
			System.out.print("-");
		int res = 0;
		for(; i>0; i--) {
			System.out.print(a[i]+" ");
		}		
		System.out.println(a[i]);
		if(neg)
			System.out.print("-");
		for(i = 0; i <= count; i++)
			res += a[i]*Math.pow(10, count-i);
		System.out.println(res);	
	}

}
