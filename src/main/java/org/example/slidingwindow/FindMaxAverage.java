package org.example.slidingwindow;

import java.util.Arrays;

public class FindMaxAverage {

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if(right >= k - 1) {
                max = Math.max(sum, max);
                sum -= nums[left];
                left++;
            }
        }
        return (double)max / k;
    }
}
