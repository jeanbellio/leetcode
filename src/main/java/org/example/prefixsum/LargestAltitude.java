package org.example.prefixsum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LargestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    private static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currentAltitude = 0;
        for (int j : gain) {
            currentAltitude += j;
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }
        return maxAltitude;


//        List<Integer> altitudes = new ArrayList<>();
//        altitudes.add(gain[0]);
//        for (int i = 0; i < gain.length -1; i++) {
//            altitudes.add(gain[i+1] + altitudes.get(i));
//        }
//        altitudes.add(0);
//        return Collections.max(altitudes);
    }
}
