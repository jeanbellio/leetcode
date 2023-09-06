package org.example.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class MaxVowels {

    public static void main(String[] args) {
        String s = "";
        int k = 3945;
        System.out.println(maxVowels(s, k));
    }

    private static int maxVowels(String s, int k) {
        if (s.length() < k) {
            return 0;
        }
        int max = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        int move = 0;
        while (move < s.length()) {
            int count = 0;
            for (int i = move; i < k + move; i++) {
                if (i >= s.length()) {
                    break;
                }
                if (vowels.contains(s.charAt(i))) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                if (max == k) {
                    break;
                }
            }
            move++;
        }
        System.out.println();
        return max;


//        for (int i = 0; i < k; i++) {
//            if(vowels.contains(s.charAt(i))){
//                windowVowels++;
//            }
//        }
//        max = windowVowels;
//
//        for (int i = k; i < s.length(); i++) {
//            if (vowels.contains(s.charAt(i - k))) {
//                windowVowels--;
//            }
//            if (vowels.contains(s.charAt(i))) {
//                windowVowels++;
//            }
//            max = Math.max(max, windowVowels);
//        }
//        return max;
//        while (i < s.length() - k + 1) {
//            int count = 0;
//            String subst = s.substring(i, i + k);
//            for (int j = 0; j < subst.length(); j++) {
//                if (isVowel(subst.charAt(j))) {
//                    count++;
//                }
//            }
//            i++;
//            if (count > max) {
//                max = count;
//                if (max == k) {
//                    break;
//                }
//            }
//        }
//        return max;
    }

    private static boolean isVowel(Character c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
