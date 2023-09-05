package org.example.slidingwindow;

import java.util.List;

public class MaxVowels {

    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        System.out.println(maxVowels(s, k));
    }

    private static int maxVowels(String s, int k) {
        int max = 0;
        int i = 0;
        while (i < s.length() - k + 1) {
            int count = 0;
            String subst = s.substring(i, i + k);
            for (int j = 0; j < subst.length(); j++) {
                if (isVowel(subst.charAt(j))) {
                    count++;
                }
            }
            i++;
            if (count > max) {
                max = count;
                if (max == k) {
                    break;
                }
            }
        }
        return max;
    }

    private static boolean isVowel(Character c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
