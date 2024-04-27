import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arr = generateMatrix();
        System.out.println("Current matrix: ");
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
        // The first line contains a single integer, , the number of rows and columns in the square matrix 
        int rtl = arr.get(0).get(6);
        int ltr = arr.get(0).get(0);

        int col = 6;
        int row = 1;

        System.out.println("Right to left:\n");
        while(col != 1) {
          System.out.print("Current row: " + row + "\n");
          System.out.print("Current column: " + col + "\n");
            rtl += arr.get(row).get(col);
            col --;
            row ++;
        }

        row = 1;

        while(col != 6) {
            System.out.print("Current row: " + row + "\n");
            System.out.print("Current column: " + col + "\n");
            ltr += arr.get(row).get(col);
            col ++;
            row --;
        }

        return ltr + rtl;
    }
}