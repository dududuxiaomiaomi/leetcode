/**
 * Created by algol on 2017/8/9.
 */
public class E283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i] == 0){
                count ++;
            }else{
                if(count != 0){
                    nums[i-count] = nums[i];
                }
            }
        }
        //后面的值赋值为0
        for(int j=i-count;j<nums.length;j++){
            nums[j] = 0;
        }
    }
}
