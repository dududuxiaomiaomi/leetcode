import java.util.Arrays;

/**
 * Created by algol on 2017/4/20.
 *
 */
public class ThreeSumClosest_1 {
    public int threeSumClosest(int[] num, int target) {
        int result = 0;
        //长度小于3的时候，直接返回所有数字的和
        if(num.length <= 3){
            for(int i:num){
                result += i;
            }
            return result;
        }

        Arrays.sort(num);
        result = num[0] + num[1] + num[num.length - 1];
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
