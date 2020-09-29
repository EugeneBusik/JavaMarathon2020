package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 8;
        int m = 12;
        int[][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxInd = 0;
        for (int i = 0; i < array.length; i++){
            int sum = 0;
            for (int j = 0; j <array[i].length; j++){
                sum =+ array[i][j];
            }
            if (sum >= maxSum){
                maxSum = sum;
                maxInd = i;
            }
        }System.out.println(maxInd);
    }
}