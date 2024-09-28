package string;

class Solution {
    public boolean rotateString(String s, String goal) {
        int len1 = s.length();
        int len2 = goal.length();
        String temp1 = s;

        if (len1 == len2) {
            for (int i = 0; i < len1; i++) {
                temp1 = temp1.substring(1) + temp1.substring(0, 1);
                System.out.println("Rotation " + (i + 1) + ": " + temp1);

                if (temp1.equals(goal)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }
}

public class Main796 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.rotateString("abcde", "cdeab")); // true
    }
}
