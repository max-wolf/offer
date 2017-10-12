package didi;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int k = sc.nextInt();
		
		convert("192.168.0.0/16");
	}
	
	public static void convert(String s) {
		String[] aa = s.split("\\/");
		Long a = ipToLong(aa[0]);
		//System.out.println(a);
		int b= Integer.parseInt(aa[1]);
		//String res = a.substring(0, b);
		//String res2 = 
		//System.out.println(res);
	}
	
	 public static Long ipToLong(String strIP) {
	        long[] ip = new long[4];
	        // 先找到IP地址字符串中.的位置
	        int position1 = strIP.indexOf(".");
	        int position2 = strIP.indexOf(".", position1 + 1);
	        int position3 = strIP.indexOf(".", position2 + 1);
	        // 将每个.之间的字符串转换成整型
	        ip[0] = Long.parseLong(strIP.substring(0, position1));
	        ip[1] = Long.parseLong(strIP.substring(position1 + 1, position2));
	        ip[2] = Long.parseLong(strIP.substring(position2 + 1, position3));
	        ip[3] = Long.parseLong(strIP.substring(position3 + 1));
	        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
	    }

}
