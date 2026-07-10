import java.util.Random;

/**
     * Создать и заполнить массив длиной 100 элементов, случайными числами от 0 до 10000.
     * Найти максимум среди сумм трех соседних элементов.
     * Для найденной тройки с максимальной суммой выведите значение суммы и индекс первого элемента тройки.
     *
     * Пример:
     * [1, 456, 1025, 65, 954, 5789, 4, 8742, 1040, 3254]
     * Тройка с максимальной суммой: [5789, 4, 8742]
     */
public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[100];
Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
            System.out.print(array[i] + " ");
        }
        int maxSum = array[0]+ array[1]+ array[2];
        int maxIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = array[i]+ array[i+1] + array[i+2];
            if (sum>maxSum){
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println("\nМаксимальная сумма тройки: " + maxSum);
        System.out.println("Индекс первого элемента тройки: " + maxIndex);
        System.out.println("Тройка: " + array[maxIndex] + ", "+ array[maxIndex + 1] + ", "+ array[maxIndex + 2]);
    }
}
