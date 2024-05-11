package org.example.array;

import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<Integer> ar1 = List.of(11,2,4);
        List<Integer> ar2 = List.of(4,5,6);
        List<Integer> ar3 = List.of(10,8,-12);
        List<List<Integer>> arr = List.of(ar1, ar2, ar3);
        System.out.println(diagonalDifference(arr));
    }

    private static int diagonalDifference(List<List<Integer>> arr) {
        int leftRightSum = 0;
        int rightLeftSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            leftRightSum += arr.get(i).get(i);
            rightLeftSum += arr.get(arr.size()-i-1).get(i);
        }
        return Math.abs(leftRightSum - rightLeftSum);
    }
}
