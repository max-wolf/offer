package telecom;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int day = sc.nextInt()-1;
		String yy = String.valueOf(year);
		String initDate = yy+"-01"+"-01";
		SimpleDateFormat dd = new SimpleDateFormat("yyyy-mm-dd");
		Date date = dd.parse(initDate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DATE, day);
		int m = c.get(Calendar.MONTH)+1;
		int d = c.get(Calendar.DAY_OF_MONTH);
		System.out.print(m);
		System.out.print(" ");
		System.out.println(d);
	}

}
