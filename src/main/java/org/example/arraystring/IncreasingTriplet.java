package org.example.arraystring;

public class IncreasingTriplet {

    public static void main(String[] args) {
        int[] nums = {1,5,0,4,1,3};
        System.out.println(increasingTriplet(nums));
    }

    private static boolean increasingTriplet(int[] nums) {
        int cont = 0;
        int aux = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && aux == 0 || i == aux) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] < nums[j] && j <= nums.length - 1) {
                        cont++;
                        if (cont == 3) {
                            return true;
                        }
                        aux = j;
                        break;
                    } else if (nums[i] >= nums[j] && j == nums.length - 1){
                        aux = 0;
                        cont = 0;
                    }
                }
            }
        }
        return cont == 2;
    }
}
