package org.example.twopointers;

public class Subsequence {

    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        boolean isThere = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    if (j > s.length()) {
                        return false;
                    }
                    isThere = true;
                    i = j;
                    break;
                }
                isThere = false;
            }
            if (!isThere) {
                break;
            }
        }
        return isThere;
    }
}
