// program to find the first non repeating element 
// nums = [1, 2, 2, 3, 3, 4, 5]
// ouput: 1 because 1 is first in sequence and is a non repeating

import module java.base;
class Act{
     void main(){
	var nums = new int[]{1, 2, 2, 3, 3, 4, 5};
	var map = new HashMap<Integer, Integer>();
	for(int i : nums){
		map.put(i, map.getOrDefault(i, 0) + 1);
	}
	for(int j : nums){
		if (map.get(j) == 1){
			IO.println("Found the first non Repeating Element : " + j);
			break;
		}
	}
	IO.println("Elements and their frequncies: " + map);
     }
}
