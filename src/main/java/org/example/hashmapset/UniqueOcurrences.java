package org.example.hashmapset;

import java.util.HashMap;

public class UniqueOcurrences {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    private static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                map.put(arr[i], count);
            }
        }

        map.forEach((integer, integer2) -> System.out.println(integer + " " + integer2));
        return true;
    }
}
