package org.example.array;

public class RemoveDuplicates {

    private String aaa = "pork";

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        System.out.println(100 + 100 + "teste");
        System.out.println("teste" + (100 + 100));
        String a = "house";
        String b = a;

        int n = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]){
                nums[n] = nums[i];
                n++;
            }
        }
        return n;
    }
}
