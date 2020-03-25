package tesecase;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

    public static void main(String[] args) {

        Queue<Integer> ans = new LinkedList<>();

        ans.offer(1);
        ans.offer(1);

        for (int i = ans.size(); i > 0; i--) {
            ans.poll();
            ans.offer(2);
            ans.offer(3);
            ans.offer(4);
        }
        System.out.println(ans);

    }


}
