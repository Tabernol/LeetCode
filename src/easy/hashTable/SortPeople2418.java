package easy.hashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortPeople2418 {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new TreeMap<>();
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        int count = map.size();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result[--count] = entry.getValue();
        }
        return result;
    }
}
