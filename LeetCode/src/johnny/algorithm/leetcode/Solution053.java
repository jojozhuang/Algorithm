/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.leetcode;

/**
 * Maximum Subarray.
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * 
 * Click to show more practice.
 * 
 * More practice:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 * 
 * @author Johnny
 */
public class Solution053 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        int max = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(nums[i], nums[i] + sum[i - 1]);
            max = Math.max(max, sum[i]);
        }
        
        return max;
    }
}