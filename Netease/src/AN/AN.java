package AN;

import java.util.Scanner;

public class AN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				int p = 0;
				int q = 0;
				for (int j = 0; j < k; j++) {
					int t = sc.nextInt();
					if (t % 4 == 0) {
						p++;
					} else if (t % 2 == 0) {
						q++;
					}
				}
				int c = k - ((int) (q / 2)) * 2;
				c = c / 2;
				if (p >= c) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}