package AlishevNail;

public class arrays {
    public static void main(String[] args) {

        int number = 10; // примитивный тип данных
   /*char character = 'a'; // примитивный тип данных
    String s = 'Hello'; // одинаково создан класс
    String s1 = new String('Hello');// одинаково создан класс
    */
        int[] numbers = new int[5]; // ccылочный тип данных
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
        //for ( int i =0; i<numbers.length; i++){

        }
    }
