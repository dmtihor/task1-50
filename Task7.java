import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/5/2015.
 */
public class Task7 {
    static double G = 9.8;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         int h = Integer.parseInt(bufferedReader.readLine());
        int t = 0;
        while (t >= 0) {
            double freefall = G * t * t;
            System.out.println(t + " " + freefall);
            t++;
            if (freefall >= h) {
                double crash = Math.sqrt(h / G);
                System.out.println("Столкновение с землей через " + crash);
                break;
            }
        }
    }
}
