package org.example.others;

import java.util.*;

public class SmallestPositive {

    public static void main(String[] args) {
        int[] a = {-12, -22,2,-5,35,5,4,-21};
        int[] b = {-12, -23,3,-5,33,6,4,-22};
        System.out.println(smallestPositive(a, b));
    }

    private static int smallestPositive(int[] a, int[] b) {
        int[] array = {1,2};
        List<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        hashMap.put(1,1);
        hashMap.put(1,3);
        hashMap.put(2,2);
        hashMap.put(2,3);
        hashMap.put(3,4);
        hashMap.put(5,null);
        hashMap.forEach((integer, integer2) -> System.out.println("key " + integer + " - value " + integer2));

        System.out.println("##########################");
        Integer smallest = null;
        Hashtable<Integer, Integer> aa = new Hashtable<>();
        aa.put(null, null);
        HashMap<Integer, Integer> ma = new HashMap<>();
        ma.put(null, null);
        int currentSmallest = 0;
        int maxEquals = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 || b[i] > 0) {
                if (a[i] < b[i]) {
                    currentSmallest = a[i];
                } else if (a[i] > b[i]) {
                    currentSmallest = b[i];
                } else {
                    if (a[i] >= maxEquals) {
                        maxEquals = a[i] + 1;
                    }
                }
                if (smallest == null || smallest > currentSmallest) {
                    smallest = currentSmallest;
                }
            }
        }
        if (smallest == 0) {
            return maxEquals;
        }
        return smallest;
    }

}
