import java.util.*;
class demo{
   void main(){
	int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	var map = new HashMap<Integer, Integer>();
	for(int i : nums){
		map.put(i, map.getOrDefault(i, 0) + 1);
	}
	System.out.println("Original Array: " + Arrays.toString(nums));
	System.out.println("Frequency of each element: " + map);
   }
}
