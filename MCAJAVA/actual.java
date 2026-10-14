import module java.base;
class actual{
     void main(){
	var set = new HashSet<Integer>();
	var nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 1, 2};
	for (var i : nums){
		if (set.contains(i)) IO.println("Duplicate Element Found: " + i);
		set.add(i);
	}
	IO.println("Original Array:" + Arrays.toString(nums));
	IO.println("Array after Finding Duplicates: " + set);
     }
}
