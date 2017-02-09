/**
 * Created by algol on 2017/2/8.
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *这个方法采用的是顺序查找的方法，时间复杂度O(n)
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }
}
