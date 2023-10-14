package org.example.array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        for(Integer in : reverseArray2(array)){
            System.out.println(in);
        }
    }

    // time complexity O(1), space complexity O(2);
    private static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];
        int index = 0;
        for (int i = array.length -1; i >= 0; i--) {
            result[index] = array[i];
            index++;
        }
        return result;
    }

    // time complexity O(1), space complexity O(1);
    private static int[] reverseArray2(int[] array) {
        int start = 0;
        int end = array.length -1;
        while (start < end) {
            int aux = array[start];
            array[start] = array[end];
            array[end] = aux;
            start++;
            end--;
        }
        return array;
    }
}
