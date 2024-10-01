// //optimized code

// class Main1781 {
//     public int beautySum(String s) {
//         int sum = 0;
//         int n = s.length();

//         // Iterate over each possible starting index of the substring
//         for (int i = 0; i < n; i++) {
//             int[] freq = new int[26]; // Frequency array for 26 lowercase English letters

//             // Expand the window to include substrings starting at 'i' and ending at 'j'
//             for (int j = i; j < n; j++) {
//                 freq[s.charAt(j) - 'a']++; // Update frequency for character s[j]

//                 // Find max and min frequencies in the current window
//                 int maxFreq = Integer.MIN_VALUE;
//                 int minFreq = Integer.MAX_VALUE;

//                 // Traverse the frequency array to find max and min values
//                 for (int k = 0; k < 26; k++) {
//                     if (freq[k] > 0) {
//                         maxFreq = Math.max(maxFreq, freq[k]);
//                         minFreq = Math.min(minFreq, freq[k]);
//                     }
//                 }

//                 // Add the difference between max and min to the sum (beauty value)
//                 sum += (maxFreq - minFreq);
//             }
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Main1781 sol = new Main1781();
//         // Test the solution with a sample input
//         System.out.println(sol.beautySum("aabcb")); // Expected output: 5
//     }
// }

//mine answer
import java.util.HashMap;
import java.util.Map;

class Main1781 {
    public int beautySum(String s) {
        int sum = 0;

        // Iterate over all possible substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);

                // Calculate frequency difference (beauty) for the substring
                int freq = frequency(substr);

                // Add the result to sum
                sum += freq;
            }
        }
        return sum;
    }

    // This method calculates the difference between the maximum and minimum
    // frequency of characters
    public int frequency(String str) {
        char[] ch = str.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < ch.length; i++) {
            hm.put(ch[i], hm.getOrDefault(ch[i], 0) + 1);
        }

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        // Find the max and min frequency
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
            }
            if (value < minValue) {
                minValue = value;
            }
        }

        // Calculate beauty (max - min)
        int res = maxValue - minValue;
        return res;
    }

    public static void main(String[] args) {
        Main1781 sol = new Main1781();
        // Test the solution with a sample input
        System.out.println(sol.beautySum("aabcb")); // Expected output: 5
    }
}
