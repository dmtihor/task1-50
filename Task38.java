package taskjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 08.10.2015.
 */
public class Task38
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of array ");
        int n = Integer.parseInt(reader.readLine());
        int[] array = new int[n];
        int swap;
        for (int i = 0; i < n; i++)
        {
            array[i] = (int) (Math.random() * 1001) - 500;
        }
        for (int j = 0; j < n - 1; j++)
        {
            for (int k = 0; k < n - j - 1; k++)
            {
                if (array[k] > array[k + 1])
                {
                    swap = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = swap;
                }
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.println(array[i]);
        }
    }
}

