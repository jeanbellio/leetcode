package org.example;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] products = productExceptSelf(nums);
        for (int product : products) {
            System.out.println(product);
        }
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int aux = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i != j) {
                    aux = aux * nums[j];
                }
            }
            products[i] = aux;
        }
        return products;
    }
}
