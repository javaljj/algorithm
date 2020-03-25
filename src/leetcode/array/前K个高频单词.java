package leetcode.array;

import java.util.*;

public class 前K个高频单词 {

    public static void main(String[] args) {
        topKFrequent(
                new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"},4);
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> cache = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String tmp = words[i];
            if (cache.get(tmp) == null) {
                cache.put(tmp, 1);
            } else {
                cache.put(tmp, cache.get(tmp) + 1);
            }
        }

        PriorityQueue<String> queue =new PriorityQueue<>((n1,n2)->
                cache.get(n1).equals(cache.get(n2)) ?
                        n2.compareTo(n1) : cache.get(n1) - cache.get(n2)

                );

        for (String s : cache.keySet()) {
            queue.add(s);
            if(queue.size()>k){
                queue.poll();
            }
        }


        List<String> ans = new ArrayList();
        while (!queue.isEmpty())
            ans.add(queue.poll());
        Collections.reverse(ans);


       return ans;
    }
}
