package org.example.twopointers;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
    }

    private static void moveZeroes(int[] nums) {
        List<Integer> aux = new ArrayList<>();
        for (int i = 0; i <= nums.length -1; i++) {
            if(nums[i] != 0) {
                aux.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i < aux.size()) {
                nums[i] = aux.get(i);
            } else {
                nums[i] = 0;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
