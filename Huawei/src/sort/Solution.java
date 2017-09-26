package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = sc.nextInt();
		String[] inputArr = input.split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for(String str : inputArr) {
			int i = Integer.parseInt(str);
			list.add(i%1000);
			map.put(i%1000, i);
		}
		Collections.sort(list);
		int tmp = list.get(n-1);
		int index = list.indexOf(tmp);
		int res = 0;
		ArrayList<Integer> list2 = new ArrayList<>();
		for(String str : inputArr) {
			int i = Integer.parseInt(str);
			if(tmp == i%1000)
				list2.add(i);
		}
		Collections.sort(list2);
		res = list2.get(n - index -1);
		System.out.println(res);
		System.out.println(n);
		System.out.println(index);
	}

}
