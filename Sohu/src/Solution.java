import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int i = 0;
		while(i < n) {
			list.add(sc.nextInt());
			i++;
		}
		int page = sc.nextInt();
		int max = sc.nextInt();
		int before = page*max;
		if(before >= n) {
			System.out.println("³¬¹ý·ÖÒ³·¶Î§");
			return;
		}
		List<Integer> res;
		if(before+max <= n)
			res = list.subList(before, before+max);
		else 
			res = list.subList(before, n);
		for(int ii : res)
			System.out.println(ii);
	}

}
