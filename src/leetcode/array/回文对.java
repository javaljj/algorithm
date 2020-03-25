package leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 回文对 {

    public List<List<Integer>> palindromePairs(String[] words) {
        Map<String, Integer> maps = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            maps.put(new StringBuilder(words[i]).reverse().toString(), i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {

            if (maps.get(words[i]) != null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(maps.get(words[i]));
                ans.add(list);
            }
        }
        return ans;


    }
}
