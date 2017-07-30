//��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת��
//�����ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
//NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��

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
