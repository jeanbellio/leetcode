package org.example.arraystring;

import java.util.*;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        List<Character> vowels = List.of('a','e','i','o','u','A','E','I','O','U');
        List<Character> aux = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))){
                index.add(i);
                aux.add(s.charAt(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < index.size(); i++) {
            stringBuilder.setCharAt(index.get(i), aux.get(aux.size() -1));
            aux.remove(aux.size() -1);
        }

        return stringBuilder.toString();
    }

}