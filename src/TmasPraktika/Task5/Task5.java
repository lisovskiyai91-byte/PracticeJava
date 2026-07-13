/**
 * В классах Автомобиль и Мотоцикл реализовать два метода:
 * первый метод - выводит в консоль строку "Это Автомобиль" ("или Мотоцикл")
 * второй метод - принимает на вход число (год), и возвращает разницу между переданным годом
 * и годом выпуска транспортного средства
 */

package TmasPraktika.Task5;

import TmasPraktika.Task5.Car;
import TmasPraktika.Task5.Motorbike;

public class Task5 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setColor("black");
        car.setModel("audi");
        car.setYear (2015);

        Motorbike motorbike = new Motorbike(1900, "kawasaki", "blue");

        car.info();
        motorbike.info();


        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(2020));
    }
}
