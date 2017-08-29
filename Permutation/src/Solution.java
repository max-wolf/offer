import java.util.ArrayList;

public class Solution {
	ArrayList<String> res = new ArrayList<>();

	public ArrayList<String> Permutation(String str) {
		if (str == null || str.length() == 0)
			return res;
		char[] cstr = str.toCharArray();
		Permutation(cstr, 0, res);
		return res;
	}

	public void Permutation(char[] cstr, int begin, ArrayList<String> list) {
		if (begin == cstr.length - 1) {
			list.add(String.valueOf(cstr));
		} else {
			for (int i = begin; i < cstr.length; i++) {
				if(i == begin || cstr[i] != cstr[begin]) {
					swap(cstr, i, begin);
					Permutation(cstr, begin + 1, list);
					swap(cstr, i, begin);
				}
			}
		}
	}
	
	public void swap(char[] cstr, int i, int begin) {
		char t = cstr[i];
		cstr[i] = cstr[begin];
		cstr[begin] = t;
	}
	
	public static void main(String[] args) {
		Solution slt = new Solution();
		slt.Permutation("abc");
		System.out.println(slt.res);
	}
}
