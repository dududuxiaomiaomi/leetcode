/**
 * Created by algol on 2017/2/4.
 * run time 0ms
 * O(logn)
 * 采用二分查找的方法
 */
public class FindPeakElement_162 {
    public int findPeakElement(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            if(low == high){
                return low;
            }
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1]){
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
