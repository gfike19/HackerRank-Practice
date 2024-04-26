import java.security.SecureRandom;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arr = generateMatrix();
        for(int i = 0; i < arr.size() - 1; i ++){
            List<Integer> currentArr = arr.get(i);
            for(int j = 0; j < currentArr.size() - 1; j++){
                System.out.print(currentArr.get(j) + " ");
            }
            System.out.print("\n");
        }
        diagonalDifference(arr);
//        System.out.print(diagonalDifference(arr));
    }

    public static List<List<Integer>> generateMatrix () {
        SecureRandom sr = new SecureRandom();
        int upperBound = 100;

        List<List<Integer>> matrix = new ArrayList<>();

        for(int i = 0; i < 6; i++) {
           List<Integer> arr = new ArrayList<>();
           for(int j = 0; j < 6; j++) {
               int rNum = sr.nextInt(upperBound);
               arr.add(rNum);
           }
           matrix.add(arr);
        }

        return matrix;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int size = arr.get(0).remove(0);
        int rtl = arr.get(0).get(size - 1);
        int ltr = arr.get(0).get(0);

        int col = size - 1;
        int row = 1;

        System.out.println("Right to left:\n");
        while(col != 1) {
//          System.out.print()
            rtl += arr.get(row).get(col);
            col --;
            row ++;
        }

        row = 1;

        while(col != size) {
            ltr += arr.get(row).get(col);
            col ++;
            row --;
        }

        int result = ltr + rtl;
        return result;
    }
}