class Solution {
    public String longestPalindrome(String s) {
        int res = 0;
        String maxlength = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                if (checkPalindrome(substr) == true) {
                    int nl = substr.length();
                    if (nl > res) {
                        res = nl;
                        maxlength = substr;
                    }
                }
            }
        }
        return maxlength;
    }

    public boolean checkPalindrome(String str) {
        int first = 0;
        int last = str.length() - 1;
        while (first < last) {
            if (str.charAt(first) != str.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkPalindrome("babad"));
        System.out.println(s.checkPalindrome("baab"));
    }
}
