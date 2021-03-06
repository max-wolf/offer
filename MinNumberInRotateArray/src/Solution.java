//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非递减排序的数组的一个旋转，
//输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
//NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

public class Solution {
	public int minNumberInRotateArray(int[] array) {
		int len = array.length;
		if(len == 0) return 0;
		int i = 0;
		int j = len - 1;
		int mid = i;
		while(i < j) {
			mid = (i + j) / 2;
			if(array[i] == array[mid] && array[mid] == array[j]) {
				int min = array[0];
                for(int k = 1; k < len; k++) {
                    if(min > array[k]) {
                        min = array[k];
                    }
                }
                return min;
			} else if(array[mid] > array[i]) {
				i = mid;
			} else {
				j = mid;
			}
		}
		return array[mid+1];
	}
}
