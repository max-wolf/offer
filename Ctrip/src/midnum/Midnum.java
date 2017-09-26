package midnum;

import java.util.Scanner;

public class Midnum {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		int[] res = merge(a, n, b, m);
		// for(int k:res) {
		// System.out.println(k);
		// }
		int len = res.length;
		int mid = len / 2;
		if (len % 2 == 0) {
			System.out.println((res[mid] + res[mid - 1]) / 2.0);
		} else {
			System.out.println(res[mid]);
		}*/

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int[] a = new int[m];
			for (int i = 0; i < m; i++) {
				a[i] = sc.nextInt();
			}
			int n = sc.nextInt();
			int[] b = new int[n];
			for (int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			int al = a.length;
			int bl = b.length;
			int[] c = new int[m + n];
			int i = 0, j = 0, k = 0;
			while (i < al && j < bl) {
				if (a[i] < b[j]) {
					c[k++] = a[i++];
				} else {
					c[k++] = b[j++];
				}
			}
			while (i < al) {
				c[k++] = a[i++];
			}
			while (j < bl) {
				c[k++] = b[j++];
			}
			int mid = c.length / 2;
			if (c.length % 2 == 0) {
				System.out.println(((c[mid] + c[mid - 1]) / 2.0));
			} else {
				System.out.println(((c[mid] / 2)));
			}
		}
	}

	public static int[] merge(int[] a, int n, int[] b, int m) {
		if (n == 0)
			return a;
		if (m == 0)
			return b;
		int[] res = new int[n + m];
		int i = 0, j = 0, k = 0;
		int dup = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else if (a[i] > b[j]) {
				res[k] = b[j];
				j++;
				k++;
			} else {
				res[k] = a[i];
				i++;
				j++;
				k++;
				dup++;
			}
		}
		while (i < n) {
			res[k] = a[i];
			i++;
			k++;
		}
		while (j < m) {
			res[k] = b[j];
			j++;
			k++;
		}
		int val = n + m - dup;
		int[] res2 = new int[val];
		for (int t = 0; t < val; t++) {
			res2[t] = res[t];
		}
		return res2;
	}

}
