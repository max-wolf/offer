import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
	public int FirstNotRepeatingChar(String str) {
		int len = str.length();
		if(len == 0)
            return -1;
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < len; i++) {
			char c = str.charAt(i);
			String s = String.valueOf(c);
			if(map.containsKey(s)) {
				int count = map.get(s);
				count++;
				map.put(s, count);
			} else
				map.put(s, 1);
		}
		Iterator iter = map.entrySet().iterator();
		String target = new String();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>)iter.next();
			String key = entry.getKey();
			int value = entry.getValue();
			if(value == 1) {
				target = key;
				break;
			}
		}
		for(int i = 0; i < len; i++) {
			char c = str.charAt(i);
			String s = String.valueOf(c);
			if(s.equals(target))
				return i;
		}
		return 0;
	}
	
	public int FirstNotRepeatingChar2(String str) {
		if(str.length() <= 0)
			return -1;
		char[] c = str.toCharArray();
		int[] hashTable = new int[256];
		for(int i = 0; i < str.length(); i++) {
			hashTable[(int)c[i]]++;
		}
		for(int i = 0; i < str.length(); i++) {
			if(hashTable[(int)c[i]] == 1)
				return i;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Solution slt = new Solution();
		slt.FirstNotRepeatingChar("google");
	}
}
