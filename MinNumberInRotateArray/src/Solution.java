//��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת�� ����һ���ǵݼ�����������һ����ת��
//�����ת�������СԪ�ء� ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
//NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��

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
