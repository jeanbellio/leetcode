package org.example.array;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = 1; j < nums.length; j++) {
               if(i != j && nums[i] + nums[j] == target){
                   result[0] = i;
                   result[1] = j;
                   return result;
               }
            }
        }
        return result;
    }
}
