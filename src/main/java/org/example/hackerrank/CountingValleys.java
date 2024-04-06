package org.example.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class CountingValleys {

    public static void main(String[] args) {
        String path = "UDDDUDUU";
        System.out.println(solution(path));
    }

    private static int solution(String path) {
        int altitute = 0;
        int cont = 0;
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'U') {
                altitute++;
                if(altitute == 0) {
                    cont++;
                }
            } else {
                altitute--;
            }
        }
        return cont;
    }
}
