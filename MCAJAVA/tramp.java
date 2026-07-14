import java.util.*;
class tramp{
    void main(){
        int nums[] = {1, 2, 3, 4, 5, 6};
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }
}