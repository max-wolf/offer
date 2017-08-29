
public class Solution {
	public int MoreThanHalfNum_Solution(int[] array) {
		int len = array.length;
		if(array == null || len == 0)
			return 0;
		int count = 1, res = array[0];
		for(int i = 1; i < len; i++) {
			if(count == 0) {
				res = array[i];
				count = 1;
			} else if(res == array[i])
				count++;
			else
				count--;
				
		}
		if(!checkValid(array, len, res))
			return 0;
		return res;
	}
	
	public boolean checkValid(int[] arr, int len, int num) {
		int count = 0;
		boolean isValid = true;
		for(int e : arr) {
			if(e == num)
				count++;
		}
		if(count*2 <= len)
			isValid = false;
		return isValid;
	}
}
