package bracket;

import java.util.*;

public class Bracket {
	public static List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<String>();
		helper(n, n, "", res);
		return res;
	}

	static void helper(int left, int right, String out, List<String> res) {
		if (left < 0 || right < 0 || left > right)
			return;
		if (left == 0 && right == 0) {
			res.add(out);
			return;
		}
		helper(left - 1, right, out + "(", res);
		helper(left, right - 1, out + ")", res);
	}
	
	public static int compute(String s1, String s2)
    {
		char[] str1 = s1.toCharArray();
		char[] str2 = s2.toCharArray();
        int substringLength1 = str1.length;
        int substringLength2 = str2.length;
 
        int[][] opt = new int[substringLength1 + 1][substringLength2 + 1];
 
        for (int i = substringLength1 - 1; i >= 0; i--)
        {
            for (int j = substringLength2 - 1; j >= 0; j--)
            {
                if (str1[i] == str2[j])
                    opt[i][j] = opt[i + 1][j + 1] + 1;
                else
                    opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);
            }
        }
 
        int i = 0, j = 0;
        while (i < substringLength1 && j < substringLength2)
        {
            if (str1[i] == str2[j])
            {
                i++;
                j++;
            }
            else if (opt[i + 1][j] >= opt[i][j + 1])
                i++;
            else
                j++;
        }
        return opt[0][0];
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		int n = len/2;
		List<String> list = generateParenthesis(n);
		list.remove(s);
		ArrayList<Integer> array = new ArrayList<>();
		int m = 0;
		for(String l : list) {
			int tmp = compute(s, l);
			array.add(tmp);
			if(tmp > m)
				m = tmp;
		}
		int count = 0;
		for(int i : array) {
			if(i == m)
				count++;
		}
		System.out.println(count);
	}
}
