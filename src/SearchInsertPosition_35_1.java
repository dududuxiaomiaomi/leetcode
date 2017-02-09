/**
 * Created by algol on 2017/2/8.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 考虑采用二分查找的方法
 */
public class SearchInsertPosition_35_1 {
    public static int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid = (left + right) / 2;
        while(left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                if(left == right){
                    return left+1;
                }else{
                    left = mid + 1;
                }
            } else {
                if(left == right){
                    return left;
                }else{
                    right = mid;
                }

            }
        }
        return mid+1;
    }

    public static void main(String[] args){
        int[] nums = {1,2};
        int target = 3;
        searchInsert(nums, target);
    }
}
