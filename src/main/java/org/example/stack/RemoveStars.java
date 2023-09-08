package org.example.stack;

public class RemoveStars {

    public static void main(String[] args) {
        String s = "erase*****";
        System.out.println(removeStars(s));
    }

    private static String removeStars(String s) {
        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                aux.deleteCharAt(aux.length() - 1);
            } else {
                aux.append(s.charAt(i));
            }
        }
        return aux.toString();
    }
}
