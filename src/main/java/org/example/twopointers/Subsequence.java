package org.example.twopointers;

public class Subsequence {

    public static void main(String[] args) {
        String s = "b";
        String t = "abc";
        System.out.println(isSubsequence(s, t));
    }

    private static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
