package taskjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 08.10.2015.
 */
public class Task50
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = (int) ((Math.random()) * 100 + 1);
        for (int i = 0; i < 7; i++)
        {
            int shot = Integer.parseInt(reader.readLine());
            if (shot > x)
                System.out.println("shot больше чем загаданое число");
            else if (shot < x)
                System.out.println("shot меньше чем загаданое число");
            else
            {
                System.out.println("Угадал");
                break;
            }
            if (i == 6)
                System.out.println("Проиграл");
        }
    }
}