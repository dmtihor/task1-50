package taskjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 04.07.2015.
 */
public class Task1 {
    final static double Pi = 3.1415926536;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double r = Double.parseDouble(reader.readLine());
        double area = Pi * r * r;
        System.out.println("S = " + area);
    }
}
