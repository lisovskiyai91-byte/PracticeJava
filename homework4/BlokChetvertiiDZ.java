package TMS.homework4;

import java.util.Scanner;

public class BlokChetvertiiDZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite razmer massiva: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Sposob zapolnenija: ");
        System.out.println("Vruchnyu vvedite 1: ");
        System.out.println("Random vvedite 2: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < arrayLength; i++) {
                System.out.println("array[ " + i + "] = ");
                array[i] = scanner.nextInt();
            }
        } else {
            for (int i = 0; i < arrayLength; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        }
        getArray(array);
        getMinMax(array);
        getIndexMinMax(array);
        getNulElement(array);
        getSpareParts(array);
        checkSequence(array);
    }

    public static void getArray(int[] array) {
        System.out.println("Massive v prjamom porjadke:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nMassive v obratnom porjadke:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void getMinMax(int [] array){
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nМинимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
    public static void getIndexMinMax (int [] array){
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println("Min index: " + minIndex);
        System.out.println("Max index: " + maxIndex);
    }

    public static void getNulElement(int[]array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        if (count > 0 ) {
            System.out.println(" Kol-vo nulevih elementov: " + count);
        } else {
            System.out.println("Nulevih elementov net");
        }
    }

    public static void  getSpareParts(int[]array){
        for (int i = 0; i < array.length/2; i++) {
            int t = array[i];
            array[i] = array[array.length - 1 -i];
            array[array.length -1-i] = t;
        }
        System.out.println("Massiv posle perestanovki: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void checkSequence(int[] array) {
        boolean uvelich = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i+1]) {
                uvelich = false;
                break;
            }
        }
        System.out.println();
        if (uvelich) {
            System.out.println("Massive vozrastaet. ");
        } else {
            System.out.println("Massive ne vozrastaet.");
        }
    }
}
