package org.example.hackerrank;

import java.util.*;

public class PairsOfSocks {

    public static void main(String[] args) {
        List<Integer> socks = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        int n = 9;
        System.out.println(solution(socks, n));
    }

    private static int solution(List<Integer> socks, int n) {
        Set<Integer> pairs = new HashSet<>();
        int cont = 0;
        for (Integer sock : socks) {
            if (pairs.contains(sock)) {
                cont++;
                pairs.remove(sock);
            } else {
                pairs.add(sock);
            }
        }
        return cont;
    }
}
