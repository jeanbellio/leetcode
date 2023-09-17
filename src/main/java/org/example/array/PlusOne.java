package org.example.array;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {4,3,2,9};
        int[] result = plusOne(digits);
        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] plusOne(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
