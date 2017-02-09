/**
 * Created by algol on 2017/2/8.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * 考虑采用二分查找的方法
 *
 * 时间复杂度最好的一种编码写法
 */
public class SearchInsertPosition_35_3 {
    public static int searchInsert(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(target > nums[mid]){
                left = mid + 1;
            }else if (target < nums[mid]){
                right = mid - 1;
            }else{
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] nums = {1,2};
        int target = 3;
        searchInsert(nums, target);
    }
}
