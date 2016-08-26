package easy;

import java.util.LinkedList;

/**
 * Created by YUANWENTAO on 2016/8/25.
 * Leetcode algorithms No.20
 * Valid Parentheses
 * 平衡符号：建立一个空栈，从头开始读入字符。如果是开放符号"( [ {",入栈。如果是封闭符号，栈为空的时候报错；否则将元素弹出。
 * 如果弹出的符号不是其对应的开放符号，则报错。最后，如果栈非空，也报错。
 */
public class ValidParentheses {
    public boolean isValid(String s)
    {
        int a = s.length();
        if (a % 2 != 0)
            return false;
        else
        {
            LinkedList<Character> stack = new LinkedList<>();
            for(int i=0; i<a; i++)
            {
                if(s.charAt(i) == '(' || s.charAt(i) =='['||s.charAt(i) =='{')
                    stack.addLast(s.charAt(i));
                else {
                    if (stack.isEmpty())
                        return false;
                    else
                    {
                        if(s.charAt(i) == ')')
                        {
                            if(stack.getLast() != '(')
                                return false;
                            else
                                stack.removeLast();
                        }
                        else if(s.charAt(i) == ']')
                        {
                            if(stack.getLast() != '[')
                                return false;
                            else
                                stack.removeLast();
                        }
                        else
                        {
                            if(stack.getLast() != '{')
                                return false;
                            else
                                stack.removeLast();
                        }
                    }
                }
            }
            if(!stack.isEmpty())
                return false;
            else
                return true;
        }
    }

    public void printMessage(boolean flag)
    {
        if(flag)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
    public static void main(String [] args)
    {
        String S[] = new String[4];
        ValidParentheses abc = new ValidParentheses();
        S[0]="]";
        S[1]="[]{}{}()";
        S[2]="[(])";
        S[3]="{[()]}";
        for (int i=0; i<4 ;i++)
        {
            System.out.print(S[i] + " is ");
            abc.printMessage(abc.isValid(S[i]));
        }
    }
}
