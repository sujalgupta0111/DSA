package com.leetcode;

import java.math.BigInteger;

public class Add_Binary_68_2 {

    public static void main(String[] args) {

        String a = "11111";
        String b = "11111";
        System.out.println(binary(a, b));
    }

    public static String binary(String a, String b) {
    	int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int base = 2, Sum = 0;
        int c = 0;

        StringBuilder result = new StringBuilder();
       
        while (l1 >= 0 || l2 >= 0) {
            int i = 0, j = 0;

            if (l1 >= 0) {
                i = a.charAt(l1--) - '0';
               
            }
            if (l2 >= 0) {
                j = b.charAt(l2--) - '0';

            }
            Sum = i + j + c;

            result.append(Sum % base);

            if (Sum >= base) {
                c = 1;
            } else {
                c = 0;
            }

        }
        if(c==1)
        {
        	result.append(c);
        }
        return new String(result.reverse());
    }
}
