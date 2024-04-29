import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arr = generateMatrix();
        System.out.println("Current matrix: ");
        for(int i = 0; i < arr.size(); i ++){
            List<Integer> currentArr = arr.get(i);
            for(int j = 0; j < currentArr.size(); j++){
                System.out.print(currentArr.get(j) + " ");
            }
            System.out.print("\n");
        }

        System.out.println(diagonalDifference(arr));
//        System.out.println("Sum left diagnol elements: " + diagonalDifference(arr));
    }

    public static List<List<Integer>> generateMatrix () {
        SecureRandom sr = new SecureRandom();
        int upperBound = 100;
        int size = getRandomNumber(3, 10);
        List<Integer> sizeArr = new ArrayList<>();
        sizeArr.add(size);
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(sizeArr);

        for(int i = 0; i < size; i++) {
           List<Integer> arr = new ArrayList<>();
           for(int j = 0; j < size; j++) {
               int rNum = sr.nextInt(upperBound);
               arr.add(rNum);
           }
           matrix.add(arr);
        }

        return matrix;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // The first line contains a single integer, , the number of rows and columns in the square matrix
        int size = arr.remove(0).get(0);
        int rtl = 0;
        int ltr = 0;

        for(int i = 0; i < size; i++) {
            ltr += arr.get(i).get(i);
        }

        for(int i = size - 1; i >= 0; i--) {
            rtl += arr.get(i).get(i);
        }

        return ltr + rtl;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}