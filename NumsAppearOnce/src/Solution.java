
public class Solution {
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
		int flag = 1;
		int tag = 0;
		for(int i = 0; i < array.length; i++)
			tag ^= array[i];
		while((tag & flag) == 0) 
			flag <<= 1;
		num1[0] = 0;
		num2[0] = 0;
		for(int i = 0; i < array.length; i++) {
			if((flag & array[i]) == 0)
				num2[0] ^= array[i];
			else
				num1[0] ^= array[i];
		}
	}
}
