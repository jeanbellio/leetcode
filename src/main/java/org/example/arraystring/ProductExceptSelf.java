package org.example.arraystring;

public class ProductExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] products = productExceptSelf(nums);
        for (int product : products) {
            System.out.println(product);
        }
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        int aux = 1;
        for (int i = 0; i < nums.length; i++) {
            products[i] = aux;
            aux *= nums[i];
        }

        aux = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            products[i] *= aux;
            aux *= nums[i];
        }
        return products;
    }

}

