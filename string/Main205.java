package string;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] str1 = new int[256];
        int[] str2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);
            if (str1[s1] != str2[s2]) {
                return false;
            }
            str1[s1] = i + 1;
            str2[s2] = i + 1;
        }
        return true;
    }
}

public class Main205 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.isIsomorphic("egg", "add"));
        System.out.println(obj.isIsomorphic("off", "abc"));
    }
}
