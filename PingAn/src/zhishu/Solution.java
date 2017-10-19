package zhishu;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getNum(n));
	}

	public static boolean checkPrime(int n) {
		if(n == 2) return true;
        if(n < 2 || n % 2 == 0) return false;
        for(int i=3; i<=Math.sqrt(n); i+=2){  
            if(n % i == 0){
                return false;  
            }  
        }  
        return true;  
	}
	
	public static int getNum(int n) {
		int sum = 0;  
        if(checkPrime(n - 2)){  
            ++sum;
        }  
        for(int i=3; i<=(n/2); i+=2){  
            if(checkPrime(i) && checkPrime(n - i)){  
                ++sum;  
            }  
        }  
        return sum; 
	}
}
