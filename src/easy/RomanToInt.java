package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YUANWENTAO on 2016/8/26.
 * Leetcode algorithms No.13
 * 给定一个罗马数字，将其转换为整数。输入给定在1-3999。
 * 用switch貌似比写一个hashmap再调用快很多。
 */
public class RomanToInt {
    public int solution (String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            int val = getSymbolValue(c[i]);
            if ((i + 1) < c.length && val < getSymbolValue(c[i+1])) {
                sum -= val;
            } else {
                sum += val;
            }
        }
        return sum;
    }

    public int getSymbolValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        RomanToInt ans = new RomanToInt();
        String num1 = "DCXXI";
        String num2 = "MCDXIV";
        System.out.println(num1 + ": "+ ans.solution(num1));
        System.out.println(num2 + ": "+ ans.solution(num2));
    }
}
