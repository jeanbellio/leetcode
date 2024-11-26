package org.example.array;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] array = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(array));
    }

    private static int longestConsecutive(int[] nums) {
        Set<Integer> setList = new HashSet<>();
        for (int num : nums) {
            setList.add(num);
        }
        int longestStreak = 0;
        for (int num : setList) {
            if (!setList.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (setList.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
}
