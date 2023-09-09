package org.example.others;

public class PairsCalcule {

    public static void main(String[] args) {
        System.out.println(pairsCalcule(4));
    }

    private static int pairsCalcule(int n) {
        int countPairs = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                countPairs++;
            }
        }
        return countPairs;
    }
}
