import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=nums[i];
        }
    }
}

class Main179 {
    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of Solution
        int arr[] = { 10, 2 };
        System.out.println(solution.largestNumber(arr)); // Call the method on the instance
    }
}
