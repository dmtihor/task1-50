package taskjava;

/**
 * Created by Adm on 07.10.2015.
 */
public class Task42
{
    public static void main(String[] args)
    {
        int x = 5;
        int countDays = 1;
        while (x <= 70000)
        {
            countDays++;
            x = x * 2;
        }
        System.out.println("Не сможет унести зарплату с " + countDays + " дня месяца");
    }

}
