import java.util.Stack;

public class Solution {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if(pushA == null || popA == null)
			return false;
		int pushAlen = pushA.length;
		int popAlen = popA.length;
		Stack<Integer> stack = new Stack<>();
		int j = 1;
		int i = 0;
		stack.push(pushA[0]);
		boolean isPossible = false;
		for(; i<popAlen; i++) {
			//if(j >= pushAlen) break;
			while(popA[i] != stack.peek() && j < pushAlen) {
				stack.push(pushA[j]);
				j++;
			}
			if(popA[i] == stack.peek())
				stack.pop();
		}
		if(stack.isEmpty() && i == popAlen)
			isPossible = true;
		return isPossible;
	}
}
