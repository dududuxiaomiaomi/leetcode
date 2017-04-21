/**
 *
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
    You could assume no leading zero bit in the integer’s binary representation.
 * Created by algol on 2017/4/21.
 */
public class NumberComplement_476_1 {
    public static int findComplement(int num) {
        String numStr = Integer.toBinaryString(num);

        StringBuilder result = new StringBuilder();
        for(int i = 0; i<numStr.length();i++){
            if(numStr.charAt(i) == '1'){
                result.append("0");
            }else{
                result.append("1");
            }
        }
        return Integer.parseInt(result.toString(), 2);
//        int count = 0;
//
//        int ws = num;
//        while(ws != 0){
//            ws = ws & (ws-1);
//            count ++ ;
//        }
//        int temp =0;
//        while(count >=0 ){
//            temp += (int)Math.pow(2, count);
//            count -- ;
//        }
//
//        int result = num ^ temp;
//        return result;
    }

    public static void main(String[] args){
        System.out.println(findComplement(1));
    }
}
