import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		int cc = arr.length;
		int count = 0;
		int j = 0;
		while (cc > 1) {
			if (arr[j] == true) {
				count++;
				if (count == 3) {
					count = 0;
					arr[j] = false;
					cc--;
				}
			}

			j++;
			if (j == arr.length) {
				j = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.println(i+1);
			}
		}
	}

}
