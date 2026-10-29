function BinarySearch(nums, target){
 	let left = 0;
	let right = nums.length - 1;
	while(left <= right){
		let mid = Math.floor(left + (right - left) / 2);
		if (nums[mid] === target) return mid;
		else if (nums[mid] > target){
			right = mid - 1;
		} else {
			left = mid + 1;
		}
	}
	return -1;
}

const nums = [2, 7, 11, 15, 27, 38];
const target = 15;
console.log(BinarySearch(nums, target));

// [2, 7, 11, 15, 27, 38];
// 15


// left = 0 -> 2
// right = 5 -> 38
// mid = 0 + (5 - 0) / 2;
// 
