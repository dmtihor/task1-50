import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/5/2015.
 */
public class Task6 {
    static final double G = 9.8;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
              int n = Integer.parseInt(bufferedReader.readLine());
        for (int t = 0; t <= n; t++) {
            double freefall = G * t * t;
            System.out.println(t + " " + freefall);
        }
    }
}
