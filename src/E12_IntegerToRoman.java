/**
 * Created by zhao on 2018/7/16.
 * I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
 */
public class E12_IntegerToRoman {
    public static String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();
        String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; num != 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        intToRoman(3);
    }
}
