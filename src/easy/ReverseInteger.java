package easy;

/**
 * Created by YUANWENTAO on 2016/8/20.
 * Leetcode question No.7: Reverse Integer.
 */

public class ReverseInteger {
    public int reverse(int x) {
        int temp =x;
        int[] list = new int[10];

        if(x == 0)
            return x;

        int i = 0;


        while (temp != 0)
        {
            list[i] = temp % 10;
            temp = temp / 10;
            i++;
        }

        int j = 9, revNum = 0;

        if(list[j] != 0)
        {
            for (int k = 0; k <= j; k++) {
                revNum += list[k] * Math.pow(10, j - k);
            }
        }
        else
        {
            while(list[j] == 0) {
                j--;
                if (list[j] != 0) {
                    for (int k = 0; k <= j; k++)
                    {
                        revNum += list[k] * Math.pow(10, j - k);
                    }
                    break;
                }
            }
        }
        if ((revNum == 2147483647) || (revNum == -2147483648))
            return 0;
        else
            return revNum;
    }

    public static void main(String[] args)
    {
        ReverseInteger a = new ReverseInteger();
        System.out.println(a.reverse(12345));
    }
}
