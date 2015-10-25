/**
 * Created by Adm on 10/11/2015.
 */
public class Task30 {
    int year = 10;

    public static void main(String[] args) {
Task30 task30 = new Task30();
        task30.globOrLocal(1,1111);
    }
    void globOrLocal(int kind,int year){
        if (kind == 1)
            System.out.println(this.year);
        else
            System.out.println(year);
    }
}
