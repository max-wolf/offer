package bracket;

import java.util.LinkedList;

public class bracket2 {
	public static void main(String[] args) {
		String str = "(((())))";
		String str1 = "()()((()))";
		System.out.println(counts(str));
		System.out.println("-----");
		System.out.println(counts(str1));
	}

	public static int counts(String str) {
		LinkedList<Character> l = new LinkedList<>();
		int m = 1;

		for (int i = 0; i < str.length(); i++)
			l.add(str.charAt(i));

		while (!l.isEmpty()) {
			int count = 0;
			for (int i = 0; i < l.size(); i++) {
				if (l.get(i).equals('('))
					count++;
				else {
					m *= count;
					l.remove(i - 1);
					l.remove(i - 1);
					break;
				}
			}
		}
		return m;
	}
}
