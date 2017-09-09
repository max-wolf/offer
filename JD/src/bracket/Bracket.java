package bracket;

import java.util.LinkedList;
import java.util.Scanner;

public class Bracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		
	}
	
	public static boolean isValid(String s) {
		LinkedList<Character> stack = new LinkedList<>();
		for(int i=0; i<s.length(); i++) {
			if (stack.isEmpty()) {  
                stack.push(s.charAt(i));  
            } else if (stack.peek() == '(' && s.charAt(i) == ')') {  
                stack.pop();
            } else {  
                stack.push(s.charAt(i));  
            }
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

}