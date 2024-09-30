package string;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        while (index < first.length()) {
            if (first.charAt(index) == last.charAt(index)) {
                index++;
            } else {
                break;
            }

        }
        return (index == 0) ? "" : first.substring(0, index);

    }
}

public class Main14 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] str = { "vaishnavi", "vaishali", "vai" };
        System.out.println(sol.longestCommonPrefix(str));
    }
}
