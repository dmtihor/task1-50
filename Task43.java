package taskjava;

/**
 * Created by Adm on 07.10.2015.
 */
public class Task43
{
    public static void main(String[] args)
    {
        double salary = 1000;
        int countYear = 2000;
        for (int i = 1; i <= 5; i++)
        {
            salary *= 1.5;
            countYear++;
        }
        System.out.println("Зарплата в " + countYear + " = " + salary);
    }
}
