package org.example.array;

import java.util.List;

public class SimpleArraySum {

    public static void main(String[] args) {
        System.out.println(simpleArraySum(List.of(1,2,3,4,10,11)));
    }

    private static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer num : ar) {
            sum += num;
        }
        return sum;
    }
}
