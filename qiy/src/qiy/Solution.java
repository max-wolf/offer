package qiy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int k = sc.nextInt();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				int v = map.get(s.charAt(i));
				map.put(s.charAt(i), ++v);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i2-i1;
			}
		});
		for(Entry<Character, Integer> entry : map.entrySet()) {
			queue.add(entry.getValue());
		}
		while(k > 0) {
			int t = queue.poll();
			queue.add(t-1);
			k--;
		}
		int res = 0;
		while(!queue.isEmpty()) {
			int t = queue.poll();
			res += t*t;
		}
		System.out.println(res);
	}

}
