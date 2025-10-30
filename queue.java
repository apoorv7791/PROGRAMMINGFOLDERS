import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove(1);
        System.out.println(q);
    }
}
