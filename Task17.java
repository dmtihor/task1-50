import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/6/2015.
 */
public class Task17 {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int[] array = new int[5];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] =");
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println("array[" + j + "] = " + array[j]);
        }
        System.out.println("Введіть число х = ");
        int x = Integer.parseInt(bufferedReader.readLine());
        for (int k = 0; k < array.length; k++) {
            if (x == array[k]) {
                count++;
            }
        }
        System.out.println("Кількість співпадінь = " + count);
    }
}