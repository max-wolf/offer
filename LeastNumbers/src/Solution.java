import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Solution {
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
		int len = input.length;
		if(k > len || k < 1)
			return null;
		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		});
		for(int i = 0; i < len; i++) {
			if(queue.size() < k)
				queue.add(input[i]);
			else {
				int max = queue.peek();
				if(max > input[i]) {
					queue.poll();
					queue.add(input[i]);
				}
			}
		}
		ArrayList<Integer> res = new ArrayList<>();
		Iterator it = queue.iterator();
		while(it.hasNext()) {
			res.add((int)it.next());
		}
		return res;
	}
	
	public static void main(String[] args) {
		Solution slt = new Solution();
		int[] input = {4,5,1,6,2,7,3,8};
		System.out.println(slt.GetLeastNumbers_Solution(input, 4));
	}
}
