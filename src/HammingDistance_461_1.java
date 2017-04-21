/**
 * 海明距离，给定两个整数，得出两个整数的二进制中不同的位数
 * Created by algol on 2017/4/21.
 * 先将两个整数异或，然后计算异或结果中1的位数
 */
public class HammingDistance_461_1 {
    public static int hammingDistance(int x, int y) {
        if(x <0 || x>Math.pow(2,31) || y <0 || y>Math.pow(2,31)){
            return 0;
        }
        int result = x ^ y;
        int count = 0;
        while(result != 0){
            result = result & (result-1);
            count ++ ;
        }
        return count;
    }

    public static void main(String[] args){
        int result = hammingDistance(1,4);
        System.out.println(result);
    }
}
