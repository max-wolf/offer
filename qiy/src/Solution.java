import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		double[] t = new double[100];
		for(int i = 1; i <= m; i++) {
			t[i] = (t[(i-2)>=0?i-2:0]*q(i) + t[i-1]*i*(n+m-i) + q(n+m)) / (q(n+m) - q(n+m-i));
		}
		System.out.println(t[m]);
	}
	
	public static double q(double f) {
		return f*(f-1)/2;
	}

}
