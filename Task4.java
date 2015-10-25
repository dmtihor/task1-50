package taskjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        for (int i = a; i <= b; i++) {
            if (i % 7 == 0)
                System.out.println("Divide '7' - " + i);
            if (!(i % 3 == 0))
                System.out.println("Not divide '3' - " + i);
        }
    }
}