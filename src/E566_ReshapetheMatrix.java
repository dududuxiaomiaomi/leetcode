/**
 * Created by algol on 2017/8/9.
 */
public class E566_ReshapetheMatrix {
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int col = nums[0].length;
        if (row * col != r * c) return nums;

        int[] temp = new int[r * c];
        int tempIndex = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[tempIndex] = nums[i][j];
                tempIndex++;
            }
        }
        tempIndex = 0;
        int[][] newNums = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newNums[i][j] = temp[tempIndex];
                tempIndex++;
            }
        }
        return newNums;
    }

    //很棒的解法
    public static int[][] matrixReshape2(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length;
        if (r*c != n*m) return nums;
        int[][] res = new int[r][c];
        for (int i=0;i<r*c;i++)
            res[i/c][i%c] = nums[i/m][i%m];
        return res;
    }

    public static void main(String[] args){
        int[][] nums={{1,2},{3,4}};
        matrixReshape2(nums,1,4);
    }
}
