package org.example.hashmapset;

import java.util.*;

public class FindDifference {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> result = findDifference(nums1, nums2);
        result.forEach(integers -> {
            integers.forEach(System.out::println);
            System.out.println("**********");
        });
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        set1.removeAll(set2);

        Set<Integer> aux = new HashSet<>();
        for (int num : nums1) {
            aux.add(num);
        }
        set2.removeAll(aux);

        List<Integer> list1 = new ArrayList<>(set1);
        List<Integer> list2 = new ArrayList<>(set2);

        List<List<Integer>> result = new ArrayList<>();
        result.add(list1);
        result.add(list2);

        return result;
//        List<List<Integer>> answer = new ArrayList<>();
//        HashSet<Integer> first = new HashSet<>();
//        HashSet<Integer> second = new HashSet<>();
//
//        for (int i = 0; i < nums1.length; i++) {
//            for (int j = 0; j < nums2.length; j++) {
//                if(nums1[i] == nums2[j]){
//                    break;
//                }
//                if(j == nums2.length -1){
//                    first.add(nums1[i]);
//                }
//            }
//        }
//
//        for (int i = 0; i < nums2.length; i++) {
//            for (int j = 0; j < nums1.length; j++) {
//                if(nums2[i] == nums1[j]){
//                    break;
//                }
//                if(j == nums1.length -1){
//                    second.add(nums2[i]);
//                }
//            }
//        }
//        answer.add(first.stream().toList());
//        answer.add(second.stream().toList());
//        return answer;
    }
}
