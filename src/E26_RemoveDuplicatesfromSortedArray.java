/**
 * Created by algol on 2017/8/9.
 */
public class E26_RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }
}
