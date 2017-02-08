/**
 * Created by algol on 2017/2/8.
 * 反转整数（ReverseInteger_7）
 * 超范围 肯定就不是回文
 * 负数不是回文
 */
public class PalindromeNumber_9 {
    public boolean isPalindrome(int x) {
        int num = x;
        if(x<0)
            return false;
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        //超范围
        if(result < Integer.MIN_VALUE  || result > Integer.MAX_VALUE){
            return false;
        }
        if(result == num){
            return true;
        }
        return false;
    }
}
