import java.util.HashMap;
import java.util.Map;

/**
 * Created by algol on 2017/2/4.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 * 借助于一个hashmap  key:数组中的整数  value：下标
 * 使用map的containsKey方法
 * time O(n)
 */
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                result[1]= i;
                result[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
