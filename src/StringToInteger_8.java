/**
 * Created by algol on 2017/2/4.
 * 1. 空格处理  2. 溢出处理
 * 每次在对result进行*10+value之前进行判断
 * 1. Integer.MAX_VALUE/10 < result;
 * 当前转换结果比Integer中最大值/10还大（因为这个判断放在while循环最开始，之后还要对result进行*10+当前遍历元素的操作，所以如果还乘10的result已经比Integer.MAX_VALUE/10还大，可想而知，乘了10更大）
 *
 * 2. Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10 <(str.charAt(i) - '0')
 * 另外的情况就是，当前result恰跟 Integer.MAX_VALUE/10相等，那么就判断当前遍历的元素值跟最大值的最后一位的大小关系即可
 *
 * 这种方法是使用int类型来保存结果的，如果采用普通计算方法 需要使用范围大于int类型范围的类型
 */
public class StringToInteger_8 {
    public int myAtoi(String str) {
        //check the length of str
        if(str == null || str.length() < 1){
            return 0;
        }
        //trim the whitespace at begging and end
        str = str.trim();
        //flag
        char flag = '+';
        //check negtive or positive
        int i = 0;
        if(str.charAt(0) == '-'){
            flag = '-';
            i++;
        }else if (str.charAt(0) == '+'){
            i++;
        }

        int result = 0;

        //calculate value
        while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9'){
            if(Integer.MAX_VALUE/10<result || (Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10 < (str.charAt(i)-'0'))){
                return flag=='-'?Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = result * 10 + (str.charAt(i)-'0');
            i++;
        }
        if(flag == '-')
            result = result * -1;
        return result;
    }
}
