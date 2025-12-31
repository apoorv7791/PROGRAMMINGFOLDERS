import java.util.HashSet;

public class seen {
    void main() {
        var seen = new HashSet<>();
        seen.add(1);
        seen.add(2);
        seen.add(3);
        seen.add(1);
        System.out.println(seen);

    }
}
