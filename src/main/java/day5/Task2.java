package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Black","Honda",2018 );

        System.out.println(motorbike.getColor() + "\n " + motorbike.getModel() + "\n " + motorbike.getYear());
    }
}
