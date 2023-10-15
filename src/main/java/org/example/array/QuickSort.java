package org.example.array;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {6,3,4,5,2,7,1,9,8,0};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int left, int right){
        if(left < right) {
            int j = partition(array, left, right);
            quickSort(array, left, j-1);
            quickSort(array, j+1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int i = left + 1;
        int j = right;
        int pivot = array[left];
        while (i <= j) {
            if(array[i] <= pivot) {
                i++;
            } else if (array[j] > pivot) {
                j--;
            } else if (i <= j) {
                change(array, i, j);
                i++;
                j--;
            }
        }
        change(array, left, j);
        return j;
    }

    private static void change(int[] array, int i, int j) {
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
