/**
 * Создать класс Мотоцикл, с полями "Год выпуска", "Цвет", "Модель".
 * Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
 * Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 */

package Avto;

public class Task51 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2010, "kawasaki", "red");
        System.out.println(motorbike.getModel()+ "\n" +
                motorbike.getYear()+ "\n"+
                motorbike.getColor());
    }
}