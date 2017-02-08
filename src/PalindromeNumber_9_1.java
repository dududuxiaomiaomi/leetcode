/**
 * Created by algol on 2017/2/8.
 * 尝试将整数转换为字符串
 * 然后从两端开始遍历
 * 前半部分和后半部分相同
 * 这个时间复杂度相对 PalindromeNumber_9 好一些 都是O(N)
 */
public class PalindromeNumber_9_1 {
    public boolean isPalindrome(int x) {
        String numStr = Integer.toString(x);
        int i = 0;
        int j = numStr.length() - 1;
        while(i<=j){
            if(numStr.charAt(i) == numStr.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
