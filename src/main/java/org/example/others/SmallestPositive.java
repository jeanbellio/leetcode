package org.example.others;

public class SmallestPositive {

    public static void main(String[] args) {
        int[] a = {-12, -22,2,-5,35,5,4,-21};
        int[] b = {-12, -23,3,-5,33,6,4,-22};
        System.out.println(smallestPositive(a, b));
    }

    private static int smallestPositive(int[] a, int[] b) {
        Integer smallest = null;
        int currentSmallest = 0;
        int maxEquals = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 || b[i] > 0) {
                if (a[i] < b[i]) {
                    currentSmallest = a[i];
                } else if (a[i] > b[i]) {
                    currentSmallest = b[i];
                } else {
                    if (a[i] >= maxEquals) {
                        maxEquals = a[i] + 1;
                    }
                }
                if (smallest == null || smallest > currentSmallest) {
                    smallest = currentSmallest;
                }
            }
        }
        if (smallest == 0) {
            return maxEquals;
        }
        return smallest;
    }

}
