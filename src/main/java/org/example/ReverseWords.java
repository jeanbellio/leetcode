package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    private static String reverseWords(String s) {
        List<String> words = new ArrayList<>(Arrays.stream(s.split(" ")).toList());
        words.removeIf(String::isBlank);
        StringBuilder stringBuilder = new StringBuilder();
        int index = words.size();
        for (int i = 0; i < index; i++) {
            stringBuilder.append(words.get(words.size() - 1)).append(" ");
            words.remove(words.size() - 1);
        }
        return stringBuilder.toString().trim();
    }
}
