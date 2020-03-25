package leetcode.array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class 根据字符出现频率排序 {

    public static void main(String[] args) {
        frequencySort("22211113344444");
    }
    public static String frequencySort(String s) {

        Map<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Character> queue = new PriorityQueue<>(
                (n1, n2) -> maps.get(n1) - maps.get(n2)
        );

        for (Character character : maps.keySet()) {
            queue.add(character);
        }
        //4,1,2,3
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Character tmp = queue.poll();
            for (int i = 0; i < maps.get(tmp); i++) {
                sb.append(tmp);
            }
        }

        return sb.reverse().toString();

    }
}
