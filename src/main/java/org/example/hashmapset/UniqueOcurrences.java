package org.example.hashmapset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class UniqueOcurrences {

    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
    private static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            if(!map.containsKey(arr[i])) {
//                int count = 0;
//                for (int j = 0; j < arr.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        count++;
//                    }
//                }
//                map.put(arr[i], count);
//            }
//        }
//
//        AtomicBoolean isUnique = new AtomicBoolean(true);
//        map.forEach((integer, integer2) -> {
//            map.forEach((integer1, integer21) -> {
//                if(Objects.equals(integer2, integer21) && !Objects.equals(integer, integer1)){
//                    isUnique.set(false);
//                }
//            });
//        });
//        map.forEach((integer, integer2) -> System.out.println(integer + " " + integer2));
//        return isUnique.get();
    }
}
