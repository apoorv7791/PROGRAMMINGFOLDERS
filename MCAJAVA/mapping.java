import java.util.HashMap;

class mapping {
    void main() {
        var map = new HashMap<>();
        int nums[] = { 1, 2, 3, 4, 5, 2 };
        for (var i : nums) {
            if (map.containsKey(i)) {
                System.out.println("Element found occuring  twice " + i);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println("final map: " + map);
    }
}
