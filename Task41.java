/**
 * Created by Adm on 10/8/2015.
 */
public class Task41 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 3, 4}, {4, 2, 1}, {5, 1, 7}};
        int[] sum = new int[3];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++) {
                sum[i] += matrix[j][i];
            }
        }
        for (int i = 0; i < sum.length; i++)
        {
            System.out.println(sum[i]);
        }
    }
}
