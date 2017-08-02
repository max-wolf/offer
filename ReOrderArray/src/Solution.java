
public class Solution {
	//不要求相对位置
	public void reOrderArray(int[] array) {	
		int len = array.length;
		int pBegin = 0;
		int pEnd = len - 1;
		while(pBegin < pEnd) {
			while(pBegin < pEnd && (array[pBegin] & 0x1) == 1)
				pBegin++;
			while(pBegin < pEnd && (array[pEnd] & 0x1) == 0)
				pEnd--;
			if(pBegin < pEnd) {
				int tmp = array[pBegin];
				array[pBegin] = array[pEnd];
				array[pEnd] = tmp;
			}
		}
	}
	
	//要求相对位置不变
	public void reOrderArray2(int[] array) {
		int len = array.length;
		int i = 0;
		while(i < len) {
			while(i < len && (array[i] & 0x1) == 1)
				i++;
			int j = i+1;
			while(j < len && (array[j] & 0x1) == 0)
				j++;
			if(j < len) {
				int tmp = array[j];
				for(int k = j-1; k >= i; k--) {
					array[k+1] = array[k];
				}
				array[i] = tmp;
				i++;
			} else {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Solution slt = new Solution();
		int[] arr = {1,2,3,4,5,6,7};
		slt.reOrderArray2(arr);
	}
}
