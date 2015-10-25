/**
 * Created by Adm on 10/6/2015.
 */
public class Task11 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {

            if (i % 3 != 0)
                continue;
                System.out.println(i + " " + i * i);
        }
    }
}
