package day2;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Укажите количество этажей здания");
        int i = s.nextInt();
        if (i >= 1 && i <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (i >= 5 && i <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (i >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (i < 0) {
            System.out.println("Ошибка ввода");
        } else if (i == 0) {
            System.out.println("У дома должен быть хотя бы один этаж");
        }
    }
}