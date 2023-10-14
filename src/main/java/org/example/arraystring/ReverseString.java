package org.example.arraystring;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("Hello world!"));
    }

    private static String reverseString(String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
}
