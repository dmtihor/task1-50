package taskjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 05.10.2015.
 */
public class task5
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        for (int i = a; i <=b ; i++)
        {
            System.out.println(i);
            if (i%2==0)
                System.out.println(i*i);
            else
                System.out.println(i*i*i);
        }
    }
}
