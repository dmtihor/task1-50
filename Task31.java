/**
 * Created by Adm on 10/11/2015.
 */
public class Task31 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Task26_27_28_29.writeArray(invertArray(a));
    }

    static int[] invertArray(int[] array) {
        int[] invertArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            invertArray[j] = array[i];
        }
        return invertArray;

    }
}
