class Solution {
    public int homogensub(String s) {
        int sum = 0, count = 0, MOD = 1_000_000_007;
        char prev = '?';
        for (char c : s.toCharArray()) {
            if (c != prev) {
                count = 1;
                prev = c;
            }
            sum = (sum + count++) % MOD;
        }
        return sum;
    }
}

public class Main1759 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.homogensub("xy"));
        System.out.println(s.homogensub("zzzzz"));
    }
}
