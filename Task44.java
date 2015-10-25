import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adm on 10/7/2015.
 */
public class Task44 {
    public static void main(String[] args) throws Exception {
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] questions = {"Kyiv is the capital of Ukraine?",
                "USA is a country in the South America?",
                "London is the capital of France?",
                "Poland is the bigger, than Russia?",
                "Dnipro is a river in Ukraine?",
                "Paris is a city in Germany?",
                "Paris and Kyiv are placer one the same continent?",
                "Rome is the capital of France?",
                "Canada is near Ukraine?",
                "The capital of Canada is Washington?"};
        String[] answers = {"y", "n", "n", "n", "y", "n", "y", "n", "n", "n"};
        String[] answersUser = new String[10];
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            answersUser[i] = bufferedReader.readLine();

        }
        for (int j = 0, k = 0; j < answersUser.length; j++, k++) {
            if (answersUser[j].equals(answers[k]))
                count++;
        }
        System.out.println("count of right answers = " + count);
        System.out.println("count of questions = " + questions.length);
        switch (count) {
            case 7:
                System.out.println("mark = bad");
                break;
            case 8:
                System.out.println("mark = so-so");
                break;
            case 9:
                System.out.println("mark = good");
                break;
            case 10:
                System.out.println("mark = excellent");
                break;
            default:
                System.out.println("mark = very bad");
                break;
        }
    }
}