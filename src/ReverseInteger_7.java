/**
 * Created by algol on 2017/2/4.
 * 反转数字，正负号不变
 * 反转整数溢出时返回0
 *
 * 通过得到参数的每位数字求得
 *
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * Note:
 The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 */
public class ReverseInteger_7 {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        //超范围
        if(result < Integer.MIN_VALUE  || result > Integer.MAX_VALUE){
            return 0;
        }
        return (int)result;
    }
}
