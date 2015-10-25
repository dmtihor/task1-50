import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/6/2015.
 */
public class Task18 {
    public static void main(String[] args) throws Exception {
        int count = 0;
        double[] array = new double[5];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] =");
            array[i] = Double.parseDouble(bufferedReader.readLine());
        }
        System.out.println("Введіть число х = ");
        double x = Double.parseDouble(bufferedReader.readLine());
        for (int k = 0; k < array.length; k++) {
            if (x < array[k]) {
                count++;
            }
        }
        System.out.println("Кількість чисел більших х = " + count);
    }
}
