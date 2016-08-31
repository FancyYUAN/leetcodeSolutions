package easy;

/**
 * Created by YUANWENTAO on 2016/8/31.
 * Leetcode No.58
 * Length of Last Word
 * 先判断是不是空字符串，再把结尾的空格去掉。
 * 如果最判断到后一个字符非空，则只有一个单词。
 */
public class LengthOfLastWord {
    public int solutions(String s)
    {
        int n = s.length(), x = 0;
        if(n>0)
        {
            while( n!= 0 && s.charAt(n-1) ==' ')
            {
                n--;
            }
            if(n == 0)
                return 0;

        }
        else
            return 0;
        for(int i = n-1; i>=0; i--)
        {
            if(s.charAt(i) == ' ')
                return n-i-1;
        }
        if(s.charAt(0) !=' ')
            return n;
        else
            return 0;
    }

    public static void main (String[] args)
    {
        LengthOfLastWord a = new LengthOfLastWord();
        System.out.println("Last word's length is: "+ a.solutions("Hello the world") );
        System.out.println("Last word's length is: "+ a.solutions("a") );
        System.out.println("Last word's length is: "+ a.solutions("     ") );
        System.out.println("Last word's length is: "+ a.solutions("") );
        System.out.println("Last word's length is: "+ a.solutions("Hello the world ha ha         ") );
    }
}
