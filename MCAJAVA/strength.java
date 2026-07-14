import java.util.*;
class strength {
	void main(){
		int nums[] = {1, 2, 3, 4, 5, 6};
		var map = new HashMap<Integer, Integer>();
		for(int i : nums){
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		System.out.println(map);
	}
}



