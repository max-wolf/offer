import java.util.Arrays;

public class Solution {
	public int InversePairs(int[] array) {
		if(array.length <= 0)
			return 0;
		int[] copyArray = Arrays.copyOf(array, array.length);
		int res = mergeSort(array, copyArray, 0, array.length-1);
		return res;
	}
	
	public int mergeSort(int[] array, int[] copyArray, int start, int end) {
		if(start == end)
			return 0;
		int mid = (start + end) >> 1;
		int leftCount = mergeSort(array, copyArray, start, mid);
		int rightCount = mergeSort(array, copyArray, mid+1, end);
		int i = mid, j = end, indexCopy = end, count = 0;
		while(i >= start && j >= mid+1) {
			if(array[i] > array[j]) {
				count += (j-mid);
				if(count >= 1000000007)
					count %= 1000000007;
				copyArray[indexCopy--] = array[i--];
			} else {
				copyArray[indexCopy--] = array[j--];
			}
		}
		while(i >= start) {
			copyArray[indexCopy--] = array[i--];
		}
		while(j >= mid+1) {
			copyArray[indexCopy--] = array[j--];
		}
		for(int s = start; s <= end; s++) {
			array[s] = copyArray[s];
		}
		return (leftCount + rightCount + count)%1000000007;
 	}
}
