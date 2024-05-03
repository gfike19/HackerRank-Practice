import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // how create numbers with upper and lower limit
        // int randomNum = min + (int)(Math.random() * ((max – min) + 1));
        int min = 3;
        int max = 100;
        int n = min + (int)(Math.random() * ((max - min) + 1));
        staircase(n);
    }
    public static void staircase(int n) {
        int spaceNum = n - 1;
        int starNum = n - spaceNum;
        System.out.println("Space num is: " + spaceNum);
        System.out.println("Star num is: " + starNum);
    }
}