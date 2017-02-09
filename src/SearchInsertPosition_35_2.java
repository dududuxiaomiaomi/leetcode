/**
 * Created by algol on 2017/2/8.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 考虑采用二分查找的方法
 *
 */
public class SearchInsertPosition_35_2 {
    public static int searchInsert(int[] nums, int target) {
        if(nums == null)
            return -1;
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        int left=0;
        int right=nums.length;
        while(left < right){
            int mid = (left + right)/2;
            if(target>nums[mid]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args){
        int[] nums = {1,2};
        int target = 3;
        searchInsert(nums, target);
    }
}
