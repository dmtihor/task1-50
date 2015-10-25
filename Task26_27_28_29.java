/**
 * Created by Adm on 10/11/2015.
 */
public class Task26_27_28_29 {
    public static void main(String[] args) {
        int[] a = {3, 40, 2, 30, 1};
        writeArray(a);
        massive1(a);
        massiveSum(a);
        massiveAvg(a);
    }

    static void writeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("a[" + i + "] = " + array[i]);
        }
    }

    static void massive1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10)
                System.out.println(array[i]);
        }
    }

    static int massiveSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double massiveAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
