package taskjava;

/**
 * Created by Adm on 08.10.2015.
 */
public class Task21
{
    public static void main(String[] args)
    {
        double[] d1 = {2.2, 3.3, 4.4, 1.1, 1.8};
        double[] d2 = new double[5];
        for (int i = 0, j = d1.length - 1; i < d1.length; i++, j--)
        {
            d2[j] = d1[i];
        }
        for (int i = 0; i < d1.length; i++)
        {
            System.out.print(d1[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < d2.length; j++)
        {
            System.out.print(d2[j] + " ");
        }
    }
}
