package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角2 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result  = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            result = getResult( result);
        }
        return result;
    }


    public static List<Integer> getResult( List<Integer> before) {
        List<Integer> list = new ArrayList<>();
        if (before.size() == 0) {
            list.add(1);
            return list;
        }
        if (before.size() == 1) {
            list.add(1);
            list.add(1);
            return list;
        }

        list.add(1);
        if (before.size() >= 2)
            for (int i = 0; i < before.size() - 1; i++) {
                list.add(before.get(i) + before.get(i + 1));
            }
        list.add(1);
        return list;
    }
}
