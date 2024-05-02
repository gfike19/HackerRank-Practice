import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int totalCharCount = 4;
        int starCount = 1;
        int spaceCount = 3;

        while(starCount != 4) {
            for(int i = 0; i <= spaceCount;i ++) {
                System.out.print(' ');
            }

            for(int i = 0; i <= starCount; i++) {
                System.out.print('*');
            }
            System.out.print('\n');
            starCount--;
        }
    }
}