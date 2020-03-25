package leetcode.字符串;

public class 分割平衡字符串 {

    public int balancedStringSplit(String s) {

        int r = 0;
        int cpunt = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'R')
                r++;
            else
                r--;

            if (r == 0)
                cpunt++;
        }
        return cpunt;

    }


}
