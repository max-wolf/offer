import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		while(i < n) {
			Integer k = sc.nextInt();
			String v = sc.next();
			if(map.containsKey(k)) {
				ArrayList<String> list = map.get(k);
				list.add(v);
				map.put(k, list);
			} else {
				ArrayList<String> list = new ArrayList<>();
				list.add(v);
				map.put(k, list);
			}
			i++;
		}
		ArrayList<Integer> res = new ArrayList<>();
		for(Map.Entry<Integer, ArrayList<String>> entry : map.entrySet()) {
			if(entry.getValue().size() > 1) {
				res.add(entry.getKey());
				//System.out.print(entry.getKey() + " ");	
				//System.out.println(entry.getValue());
				//ArrayList<String> list = entry.getValue();
				//for(String str : list) {
				//	System.out.print(str + " ");
				//}
				//System.out.println();
			}
		}
		if(res.isEmpty()) {
			System.out.println("YES");
			return;
		}
		Collections.sort(res);
		for(Integer ii : res) {
			if(ii < 10)
				System.out.print(0);
			System.out.print(ii + " ");
			int j = 0;
			for(; j < map.get(ii).size()-1; j++) {
				System.out.print(map.get(ii).get(j) + " ");
			}
			System.out.println(map.get(ii).get(j));
		}
	}
}
