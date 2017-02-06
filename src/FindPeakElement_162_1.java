/**
 * Created by algol on 2017/2/4.
 * run time 2ms
 * O(n)
 */
public class FindPeakElement_162_1 {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        else if(nums.length==2)
        {
            if(nums[0]>nums[1])
                return 0;
            else if(nums[0]<nums[1])
            {
                return 1;
            }else
                return -1;
        }else{
            for(int i=0;i<nums.length;i++){
                if(i==nums.length-1){
                    if(nums[i]>nums[i-1] ){
                        return i;
                    }
                }else if(i==0){
                    if(nums[i]>nums[i+1]){
                        return i;
                    }
                }else{
                    if(nums[i]==nums[i-1]||nums[i]==nums[i+1])
                        continue;
                    else if(nums[i]>nums[i-1]&&nums[i]<nums[i+1])
                        continue;
                    else
                        return i;
                }
            }

        }
        return -1;
    }
}
