package org.example.hashmapset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CloseStrings {

    public static void main(String[] args) {
        String word1 = "cabbba", word2 = "abbccc";
        System.out.println(closeStrings(word1, word2));
    }

    private static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> mapWord1 = new HashMap<>();
        HashMap<Character, Integer> mapWord2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            mapWord1.put(word1.charAt(i), mapWord1.getOrDefault(word1.charAt(i),0) + 1);
        }

        for (int i = 0; i < word2.length(); i++) {
            mapWord2.put(word2.charAt(i), mapWord2.getOrDefault(word2.charAt(i),0) + 1);
        }

        if(!mapWord1.keySet().equals(mapWord2.keySet())){
            return false;
        }

        List<Integer> mapValuesWord1 = new ArrayList<>(mapWord1.values());
        List<Integer> mapValuesWord2 = new ArrayList<>(mapWord2.values());
        Collections.sort(mapValuesWord1);
        Collections.sort(mapValuesWord2);

        return mapValuesWord1.equals(mapValuesWord2);
    }
}
