package ArrayMed;

//cd..
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false; // Less than 3 elements can't form a triplet
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update first if the current number is smaller or equal
            } else if (num <= second) {
                second = num; // Update second if the current number is between first and second
            } else {
                // If we find a number greater than both first and second, return true
                return true;
            }
        }

        return false; // No triplet found
    }
}

public class Main334 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int arr[] = { 5, 4, 3, 2, 1 };

        // Call the function and print the result
        System.out.println("Increasing Triplet Exists: " + obj.increasingTriplet(arr));
    }
}
