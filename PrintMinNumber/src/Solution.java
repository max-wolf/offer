import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	public String PrintMinNumber(int[] numbers) {
		int len = numbers.length;
		ArrayList<String> num = new ArrayList<>();
		for(int i = 0; i < len; i++)
			num.add(String.valueOf(numbers[i]));
		Collections.sort(num, new Comparator<String>() {
			public int compare(String s1, String s2) {
				String sc1 = s1 + s2;
				String sc2 = s2 + s1;
				return sc1.compareTo(sc2);
			}
		});
		String res = new String();
		for(String i : num)
			res += i;
		return res;
	}
}
