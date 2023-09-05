package org.example.twopointers;

import java.util.Arrays;

public class MaxOperations {

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        System.out.println(maxOperations(nums, k));
    }

    private static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cont = 0;
        int auxMin = 0;
        int auxMax = nums.length - 1;
        while (auxMin < auxMax) {
            if (nums[auxMin] + nums[auxMax] == k) {
                cont++;
                auxMin++;
                auxMax--;
            } else if (nums[auxMin] + nums[auxMax] < k) {
                auxMin++;
            } else {
                auxMax--;
            }
        }
        return cont;
    }
}
