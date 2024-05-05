import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // how create numbers with upper and lower limit
        // int randomNum = min + (int)(Math.random() * ((max – min) + 1));
        int min = 3;
        int max = 10;
        int n = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println("n currently equals: " + n);
        staircase(n);
    }
    public static void staircase(int n) {

        int starCount = 1;
        int spaceCount = n;
        for(int i = 0; i < n; i++) {
            String stringToPrint = "";

            for(int j = 0; j < spaceCount; j++) {
                stringToPrint = stringToPrint + ' ';
            }

            for(int k = 0; k < starCount; k++) {
                stringToPrint = stringToPrint + '#';
            }


            System.out.println(stringToPrint);
            starCount++;
            spaceCount--;
        }
    }
}