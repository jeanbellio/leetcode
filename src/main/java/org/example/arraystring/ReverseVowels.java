package org.example.arraystring;

import java.util.*;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    private static String reverseVowels(String s) {
        List<Character> vowels = List.of('a','e','i','o','u','A','E','I','O','U');
        Map<Integer, Character> aux = new HashMap<>();
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))){
                aux.put(i, s.charAt(i));
                cont++;
            }
        }

        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < aux.size(); i++) {
            stringBuilder.setCharAt(aux.get(i), aux.get(cont-1));
            cont--;
        }
        return stringBuilder.toString();
    }

    public static String reverseVowels2(String s) {
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