package taskjava;

/**
 * Created by Adm on 08.10.2015.
 */
public class Task45
{
    public static void main(String[] args)
    {
        int[][] matrix = {{3, 4, 4, 2},
                {2, 1, 2, 3},
                {1, 2, 3, 4},
                {5, 3, 2, 1}};
        int[][] swap = new int[4][4];
        System.out.println("matrix");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("swap matrix");
        // for (int i = 0; i < matrix.length; i++)
        // {
        //   for (int j = 0; j < matrix.length; j++)
        // {
        // swap[j][i] = matrix[i][j];
        //     }
        //   }
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                // System.out.print(swap[i][j] + " ");
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
