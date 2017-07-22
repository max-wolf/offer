//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，
//输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
//NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

import java.util.ArrayList;

public class Solution {
	public int minNumberInRotateArray(int[] array) {
		int len = array.length;
		if(len == 0) return 0;
		int i = 0;
		int j = len - 1;
		int mid = i;
		while(array[i] >= array[j]) {
			if(j - i == 1){
				mid = j;
				break;
			}
			mid = (i + j) / 2;
			if(array[i] == array [mid] && array[mid] == array[j]) {
				return sequentialSearch(array, i, j);
			}
			if(array[mid] > array[i]) {
				i = mid;
			} else if(array[mid] < array[j]) {
				j = mid;
			}
		}
		return array[mid];
	}
	
	int sequentialSearch(int[] array, int i, int j) {
		int min = array[i];
		for(int k = i+1; k <= j; k++) {
			if(min > array[k])
				min = array[k];
		}
		return min;
	}
}
