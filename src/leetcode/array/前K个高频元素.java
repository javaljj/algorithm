package leetcode.array;

import java.util.*;

public class 前K个高频元素 {
    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,1,2,2,2,3,3,3,3,3,4,4,5,5,5,5,5,56,6,6,6,6,6,6,6,6,6,6,7,4,6,7,8,9,9,0,8},4);
    }

    public  static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer tmp = nums[i];
            if (cache.get(tmp) == null) {
                cache.put(tmp, 1);
            } else {
                cache.put(tmp, cache.get(tmp) + 1);
            }
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue(
                (n1, n2) -> cache.get(n1) - cache.get(n2));

        for (int n : cache.keySet()) {
            priorityQueue.add(n);
            if (priorityQueue.size() > k)
                priorityQueue.poll();
        }

        // build output list
        List<Integer> top_k = new LinkedList();
        while (!priorityQueue.isEmpty())
            top_k.add(priorityQueue.poll());
        Collections.reverse(top_k);
        return top_k;


    }
}
