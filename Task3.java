package taskjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 04.07.2015.
 */
public class Task3
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String language = reader.readLine();
        int numb = Integer.parseInt(number);

        if (language.equals("eng"))
            switch (numb)
            {
                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Thuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Number Error");
            }
        else if (language.equals("rus"))
            switch (numb)
            {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("П'ятница");
                    break;
                case 6:
                    System.out.println("Субота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
                default:
                    System.out.println("Ошибка номера");
            }
        else
            System.out.println("ошибка ввода языка");
    }
}




