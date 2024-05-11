package org.example.array;

import java.util.List;

public class VeryBigSum {

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(List.of(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L)));
    }

    private static long aVeryBigSum(List<Long> ar) {
        long sum = 0;
        for (Long num : ar) {
            sum += num;
        }
        return sum;
    }
}
