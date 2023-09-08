package org.example.hashmapset;

import java.util.HashMap;

public class EqualPairs {

    public static void main(String[] args) {
        int[][] grid = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println(equalPairs(grid));
    }

    private static int equalPairs(int[][] grid) {
        HashMap<String, Integer> mapRows = new HashMap<>();
        HashMap<String, Integer> mapColumns = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            StringBuilder auxRow = new StringBuilder();
            StringBuilder auxColumn = new StringBuilder();
            for (int j = 0; j < grid.length; j++) {
                auxRow.append(grid[i][j]);
                auxColumn.append(grid[j][i]);
                auxRow.append(",");
                auxColumn.append(",");
            }
            String curr1 = auxRow.toString(), curr2 = auxColumn.toString();
            mapRows.put(curr1, mapRows.getOrDefault(curr1, 0)+1);
            mapColumns.put(curr2, mapColumns.getOrDefault(curr2, 0)+1);
        }

        int count = 0;

        for(String str : mapRows.keySet()) {
            if (mapColumns.containsKey(str)) {
                count += mapRows.get(str) * mapColumns.get(str);
            }
        }
        return count;
    }
}
