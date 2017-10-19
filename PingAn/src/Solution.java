import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = n+1;
		while(res <= Integer.MAX_VALUE) {
			if(check(res)) {
				System.out.println(res);
				break;
			} else
				res++;
		}
	}
	
	public static boolean check(int n) {
		String s = String.valueOf(n);
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			int tmp = n%10;
			n = n/10;
			if(set.contains(tmp))
				return false;
			else
				set.add(tmp);
		}
		return true;
	}

}
