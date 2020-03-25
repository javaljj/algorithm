package leetcode.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class 字符串中的第一个唯一字符 {

    public int firstUniqChar(String s) {
        Map<Character, Integer> maps = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            maps.put(s.charAt(i), maps.getOrDefault(s.charAt(i), 0) + 1);
        }

        Set<Map.Entry<Character, Integer>> entries = maps.entrySet();

        for (Map.Entry<Character, Integer> entry : entries) {
            if(entry.getValue() == 1){
                return s.indexOf(entry.getKey());
            }
        }

        return -1;
    }
}
