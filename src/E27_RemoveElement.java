/**
 * Created by algol on 2017/8/9.
 */
public class E27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==val){
            count ++;
        }else{
            nums[i-count] = nums[i];
        }
    }
    return nums.length - count;
}
}
