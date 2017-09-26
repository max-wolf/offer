package ip;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a1 = sc.nextLine();
		String a2 = sc.nextLine();
		String b1 = sc.nextLine();
		String b2 = sc.nextLine();
		
		long a1l = getIpNum(a1);
		long a2l = getIpNum(a2);
		long b1l = getIpNum(b1);
		long b2l = getIpNum(b2);
		
		boolean res = isMix(a1l, a2l, b1l, b2l);
		if(res)
			System.out.println("Overlap IP");
		else
			System.out.println("No Overlap IP");
	}

	public static long getIpNum(String ipAddress)
    {
		String[] ip = ipAddress.split("\\.");
        long a = Integer.parseInt(ip[0]);
        long b = Integer.parseInt(ip[1]);
        long c = Integer.parseInt(ip[2]);
        long d = Integer.parseInt(ip[3]);

        return a * 256 * 256 * 256 + b * 256 * 256 + c * 256 + d;
    }
	
	public static boolean isMix(long a1, long a2, long b1, long b2) {
		if(Math.max(a1, b1) <= Math.min(a2, b2))
			return true;
		else
			return false;
	}
}
