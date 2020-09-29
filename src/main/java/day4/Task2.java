package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        int max = 0;
        for (int x : array)
            if (x > max)
                max = x;
        System.out.println(max);

        int min = 10000;
        for (int x : array)
            if (x < min)
                min = x;
        System.out.println(min);

        int counter0 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0)
                counter0++;
        }
        System.out.println(counter0);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0)
                sum += array[i];

        }System.out.println(sum);


        }
    }