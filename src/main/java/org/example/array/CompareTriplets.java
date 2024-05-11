package org.example.array;

import java.util.List;

public class CompareTriplets {

    public static void main(String[] args) {
        List<Integer> a = List.of(17,28,30);
        List<Integer> b = List.of(99,16,8);
        List<Integer> result = compareTriplets(a, b);
        result.forEach(System.out::println);
    }

    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (b.get(i) > a.get(i)) {
                bob++;
            }
        }
        return List.of(alice, bob);
    }
}
