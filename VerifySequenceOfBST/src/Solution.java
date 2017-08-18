import java.util.Arrays;

public class Solution {
	public boolean VerifySquenceOfBST(int[] sequence) {
		int len = sequence.length;
        if(sequence == null || len == 0)
        	return false;
        int root = sequence[len-1];
        int i = 0;
        for(; i<len-1; i++) {
        	if(sequence[i]>root)
        		break;
        }
        int j = i;
        for(; j<len-1; j++) {
        	if(sequence[j]<root)
        		return false;
        }
        boolean left = true;
        if(i>0)
        	left = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        boolean right = true;
        if(j<len-1)
        	right = VerifySquenceOfBST(Arrays.copyOfRange(sequence, j, len-1));
        return left&&right;
    }	
}
