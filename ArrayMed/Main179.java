import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert the numbers to strings
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        // Sort strings based on custom comparator
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is 0, the result is "0"
        if (str[0].equals("0")) {
            return "0";
        }

        // Build the largest number
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }

        return sb.toString();
    }
}

class Main179 {
    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of Solution
        int arr[] = { 10, 2 };
        System.out.println(solution.largestNumber(arr)); // Call the method on the instance
    }
}
