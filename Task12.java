/**
 * Created by Adm on 10/6/2015.
 */
public class Task12 {
    public static void main(String[] args) {
        for (int i = 12; i >= 1; i--) {
            System.out.println("  ");
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + "  ");
            }
        }
    }
}
