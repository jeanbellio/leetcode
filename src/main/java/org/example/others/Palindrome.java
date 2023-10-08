package org.example.others;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        for (int i = 0; i < number.length() - 1; i++) {
            if(number.charAt(i) != number.charAt(number.length() -1 - i)){
                return false;
            }
        }
        return true;
    }
}
