import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/5/2015.
 */
public class Task10 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        int f = 1;
        for (int i = 1; i <= n; ++i) {
            f *= i;
            System.out.println("Factorial " + i + " = " + f);
        }

    }
}
