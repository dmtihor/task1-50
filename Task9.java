import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/5/2015.
 */
public class Task9 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int m = Integer.parseInt(bufferedReader.readLine());
        if (n < m)
            for (int i = n; i < m; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        else if (n > m)
            for (int i = n; i > m; i--) {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        else
            System.out.println("n = m");
    }
}