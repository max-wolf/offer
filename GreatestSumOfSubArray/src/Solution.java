
public class Solution {
	public int FindGreatestSumOfSubArray(int[] array) {
		int sum = array[0];
		int res = Integer.MIN_VALUE;
		for(int i = 1; i < array.length; i++) {
			if(sum > 0)
				sum += array[i];
			else
				sum = array[i];
			if(sum > res)
				res = sum;
		}
		return res;
	}
}
