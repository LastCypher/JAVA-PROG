import java.io.*;
public class MatrixMaxHourGlass {
    static int R = 5;
    static int C = 5;
    static int findMaxSum(int [][]mat) {
        if (R < 3 || C < 3) {
            System.out.println("Not possible");
            System.exit(0);
        }
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                int sum = (mat[i][j] + mat[i][j + 1] +
                           mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                          (mat[i + 2][j] + mat[i + 2][j + 1] +
                           mat[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
    static public void main (String[] args) {
        int [][]mat = {{1, 2, 4, 5, 6},
            {8, 5, 4, 3, 6},
            {8, 5, 1, 4, 8},
            {7, 3, 1, 3, 5},
            {4, 0, 4, 5, 5}
        };
        int res = findMaxSum(mat);
        System.out.println("Maximum sum of hour glass = "+ res);
    }
}
