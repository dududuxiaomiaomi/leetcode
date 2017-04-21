/**
 * Created by algol on 2017/2/9.
 * Given a roman numeral, convert it to an integer.
   Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        for(int i = 0;i<s.length();i++){
            result = result * 10 + (s.charAt(i) - '0');
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("3999"));
    }
}
