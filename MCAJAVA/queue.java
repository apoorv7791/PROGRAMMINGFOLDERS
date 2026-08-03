
import java.util.*;

public class queue {
    public static void main(String[] args) {
        var q = new PriorityQueue<Integer>();
        q.add(0);
        q.add(8);
        q.add(2);
        q.add(6);
        q.add(1);
        q.add(4);
        System.out.println(q.peek());
    }
}
