package string;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If the lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to store the frequency of each character (26 lowercase
        // letters)
        int[] count = new int[26];

        // Increment the frequency for characters in string s and decrement for
        // string t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero (i.e., the frequency matches for both
        // strings)
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}

public class Main242 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isAnagram("listen", "silent")); // true
        System.out.println(sol.isAnagram("hello", "world")); // false
    }
}
