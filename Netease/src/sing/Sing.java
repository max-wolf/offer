package sing;

import java.util.Scanner;

public class Sing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			int fmx = -1;
			int fmi = -1;
			int max = -1;
			int sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
				if (i != 0) {
					if (max < Math.abs(a[i] - a[i - 1])) {
						max = Math.abs(a[i] - a[i - 1]);

						if (a[i] > a[i - 1]) {
							fmx = i;
							fmi = i - 1;
						} else {
							fmx = i - 1;
							fmi = i;
						}
					}
				}
			}
			int fmax1 = fmx, fmin1 = fmi;

			for (int i = fmx; i < n; i++) {
				if (Math.abs(a[i] - a[fmax1]) < Math.abs(a[i] - a[fmin1])) {
					sum = sum + Math.abs(a[i] - a[fmax1]);
					fmax1 = i;
				} else {
					sum = sum + Math.abs(a[i] - a[fmin1]);
					fmin1 = i;
				}
			}
			fmax1 = fmx;
			fmin1 = fmi;
			for (int i = fmx; i >= 0; i--) {
				if (Math.abs(a[i] - a[fmax1]) < Math.abs(a[i] - a[fmin1])) {
					sum = sum + Math.abs(a[i] - a[fmax1]);
					fmax1 = i;
				} else {
					sum = sum + Math.abs(a[i] - a[fmin1]);
					fmin1 = i;
				}
			}
			System.out.println(sum);
		}
	}
}