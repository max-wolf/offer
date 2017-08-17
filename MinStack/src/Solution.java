import java.util.Stack;

public class Solution {
	Stack<Integer> minStack = new Stack<>();
	Stack<Integer> assistStack = new Stack<>();
	
	public void push(int node) {
		minStack.push(node);
		if(assistStack.isEmpty() || node < assistStack.peek())
			assistStack.push(node);
		else
			assistStack.push(assistStack.peek());
	}
	
	public void pop() {
		if(!minStack.isEmpty())
			minStack.pop();
		if(!assistStack.isEmpty())
			assistStack.pop();
	}
	
	public int top() {
		return minStack.peek();
	}
	
	public int min() {
		return assistStack.peek();
	}
}
