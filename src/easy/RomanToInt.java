package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YUANWENTAO on 2016/8/26.
 * Leetcode algorithms No.13
 * 给定一个罗马数字，将其转换为整数。输入给定在1-3999。
 * 用hashmap加上递归实现
 */
public class RomanToInt {
    public int solution (String s) {
        Map<Character, Integer> RomToInt = new HashMap();
        RomToInt.put('I', 1);
        RomToInt.put('V', 5);
        RomToInt.put('X', 10);
        RomToInt.put('L', 50);
        RomToInt.put('C', 100);
        RomToInt.put('D', 500);
        RomToInt.put('M', 1000);

        int sum = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(i == s.length() -1)
                return sum+RomToInt.get(s.charAt(i));
            else if (RomToInt.get(s.charAt(i)) < RomToInt.get(s.charAt(i+1)))
                sum -= RomToInt.get(s.charAt(i));
            else
                sum += RomToInt.get(s.charAt(i));
        }
        return sum;
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
