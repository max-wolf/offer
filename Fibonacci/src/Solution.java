
public class Solution {
	public int Fibonacci(int n) {
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
	
	public int Fibonacci2(int n) {
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		int one = 0;
		int two = 1;
		int res = 0;
		for(int i = 2; i <= n; i++) {
			res = one + two;
			one = two;
			two = res;
		}
		return res;
	}
}
