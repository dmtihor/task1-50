package taskjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 04.07.2015.
 */
public class Task2
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(reader.readLine());
        if (age <= 25)
            System.out.println("молодой");
        else if (26 < age && age <= 50 )
            System.out.println("средний возраст");
        else if (50 < age && age < 60)
            System.out.println("предпенсионный");
        else if (age >= 60)
            System.out.println("пенсионер");
    }
}
