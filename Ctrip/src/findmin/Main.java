package findmin;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


/*������������������ʵ����ĿҪ��Ĺ���
��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^ 
******************************��ʼд����******************************/
    static int findMinMis(int[] A) {
    	int ma = Integer.MAX_VALUE;
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int i:A) {
    		if(i > 0) {
    			map.put(i, 1);
    		}
    	}
    	for(int i = 1; i < ma; i++) {
    		if(!map.containsKey(i)) {
    			return i;
    		}
    	}
    	return 1;
    }
/******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
            
        int _A_size = 0;
        _A_size = Integer.parseInt(in.nextLine().trim());
        int[] _A = new int[_A_size];
        int _A_item;
        for(int _A_i = 0; _A_i < _A_size; _A_i++) {
            _A_item = Integer.parseInt(in.nextLine().trim());
            _A[_A_i] = _A_item;
        }
  
        res = findMinMis(_A);
        System.out.println(String.valueOf(res));    

    }
}
