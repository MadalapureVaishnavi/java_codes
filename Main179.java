import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }

        // Sorting the strings based on custom comparator
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        // Building the largest number
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s);
        }

        // Convert to string and handle edge case for leading zeros
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }
}

class Main179 {
    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of Solution
        int arr[] = { 10, 2 };
        System.out.println(solution.largestNumber(arr)); // Call the method on the instance
    }
}
