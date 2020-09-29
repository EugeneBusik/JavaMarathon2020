package day5;

public class Task1 {
    public static void main(String[] args) {
    Car car = new Car();
    car.setColor("Red");
    car.setModel("Bentley");
    car.setYear(2019);

        System.out.println(car.getColor() + " " + car.getModel() + ", " + car.getYear());
    }
}
