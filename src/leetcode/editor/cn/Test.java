package leetcode.editor.cn;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws NoSuchFieldException {
//
//        Class<Fanxin> fanxinClass = Fanxin.class;
//        Field field = fanxinClass.getDeclaredField("t");
//
//
//        Class<?> type = field.getType();
//        Type genericType = field.getGenericType();
//        System.out.println( type + ":" + genericType);
//
//        System.out.println(genericType.getTypeName());
//        Vector;
//        ArrayList;
//        Hashtable;
//        HashMap;
//        LinkedHashSet；
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap() {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                if (size() > 5)
                    return true;

                return false;
            }
        };
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 3);
        map.put(5, 3);
        map.put(6, 3);

        System.out.println(map);
       map.get(1);
        System.out.println(map);


    }


}
