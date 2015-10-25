import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/11/2015.
 */
public class Task23 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int matrix[][] = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("input matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = Integer.parseInt(bufferedReader.readLine());
            }
            System.out.println();
        }
        for (int i = 0, j = 0; i <matrix.length ; i++,j++) {
            matrix[i][j] = 555;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}