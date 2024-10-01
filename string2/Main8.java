class Solution {
    public int strToInt(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;

        int index = 0;
        int sign = 1;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        long res = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            res = res * 10 + (s.charAt(index) - '0');

            if (res * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (res * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) (res * sign);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.strToInt("42"));
        System.out.println(s.strToInt("   -42"));
    }
}
