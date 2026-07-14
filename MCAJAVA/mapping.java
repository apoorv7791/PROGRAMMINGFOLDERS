import java.util.*;

class mapping {
    void main() {
        var map = new HashMap<Integer, Integer>();
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

// map is used to map the elements to their number of occurrences :
// step by step
// 1. Create a HashMap to store elements and their counts
// 2. Iterate through the array of numbers
// 3. For each number, check if it is already in the map
// 4. If it is, print that the element is found occurring twice
// 5. If it is not, add it to the map with a count of 1
// 6. Finally, print the final map showing elements and their counts
// dry run : [1, 2, 3, 4, 5, 2]
// nums[0] = 1 -> map = {1=1}
// nums[1] = 2 -> map = {1=1, 2=1}
// nums[2] = 3 -> map = {1=1, 2=1, 3=1}
// nums[3] = 4 -> map = {1=1, 2=1, 3=1, 4=1}
// nums[4] = 5 -> map = {1=1, 2=1, 3=1, 4=1, 5=1}
// nums[5] = 2 -> Element found occuring twice 2
// final map: {1=1, 2 =1, 3=1, 4=1, 5=1}
// output :
// Element found occuring twice 2