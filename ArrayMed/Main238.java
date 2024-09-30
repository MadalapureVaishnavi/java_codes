class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;

        int[] res = new int[nums.length];

        // Calculate the left product array
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }

        // Calculate the right product array
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        // Calculate the result by multiplying left and right
        for (int j = 0; j < nums.length; j++) {
            res[j] = left[j] * right[j];
        }

        return res;
    }
}

class Main238 {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = { 5, 2, 3, 4 };
        int[] result = obj.productExceptSelf(arr);

        // Properly print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
