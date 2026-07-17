import java.util.*;
class seen {
    void main() {
	int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2};
	var set = new HashSet<Integer>();
	for(int i : nums){
	    if (set.contains(i)) {
		System.out.println("Element found repeating: " + i); 
	    } else {	
		set.add(i);
	    }
	}
	System.out.println("Unique Elements: " + set);
	System.out.println("Original Array: " + Arrays.toString(nums));
   }
}
