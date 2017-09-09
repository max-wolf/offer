package kitchen;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<>();
		while(sc.hasNext()) {
			String s = sc.next();
			set.add(s);
		}
		System.out.println(set.size());
	}
}
