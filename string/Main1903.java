package string;

class Solution {
    public String largestOddNumber(String num) {
        // Convert the string to a character array
        char[] ch = num.toCharArray();

        // Traverse the string from the end to find the largest odd-numbered suffix
        for (int i = ch.length - 1; i >= 0; i--) {
            // Convert the character to an integer value
            if ((ch[i] - '0') % 2 != 0) { // Check if the digit is odd
                // Return the substring from the start to the current index (inclusive)
                return num.substring(0, i + 1);
            }
        }

        // If no odd number is found, return an empty string
        return "";
    }
}

public class Main1903 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestOddNumber("35427")); // Output: "35427"
        System.out.println(solution.largestOddNumber("4206")); // Output: ""
    }
}
