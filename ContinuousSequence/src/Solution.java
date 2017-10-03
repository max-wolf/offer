import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int i = 1, j = 2, m = (sum+1)/2;
		int c = i+j;
		while(i<m) {
			if(c == sum)
				res.add(addContinuous(i, j));
			while(c > sum && i < m) {
				c -= i;
				i++;
				if(c == sum)
					res.add(addContinuous(i, j));
			}
			j++;
			c += j;
		}
		return res;
	}
	
	public static ArrayList<Integer> addContinuous(int i, int j) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int a=i; a<=j; a++) {
			list.add(a);
		}
		return list;
	}
}
