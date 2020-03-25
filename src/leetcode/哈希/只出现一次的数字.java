package leetcode.哈希;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        Set<Integer> hash =new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(hash.contains(num)){
                hash.remove(num);
            }else{
                hash.add(num);
            }

        }
        Iterator<Integer> iterator = hash.iterator();
        return iterator.next();
    }

}
