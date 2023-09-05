package org.example.arraystring;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Compress {

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

    private static int compress(char[] chars) {
        List<Character> readed = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if(!readed.contains(chars[i])){
                readed.add(chars[i]);
            } else {

            }
        }

        for (Character character : readed) {
            Stream.of(chars).filter(chars1 -> chars1.equals(character)).count();
        }

        return chars.length;
    }
}
