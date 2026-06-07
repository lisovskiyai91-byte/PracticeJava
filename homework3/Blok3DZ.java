package TMS.homework3;

import java.util.Scanner;

public class Blok3DZ {
    public static void main(String[] args) {
        getChislo();
        getTemperature();
        getSquare();
        getSubsequence();
        getCeloeChislo();
    }
        public static void getChislo() {
            Scanner console = new Scanner(System.in);
            System.out.println("1. Vvedite chislo: ");
            int a = console.nextInt();
            if (a % 2 == 0)
                System.out.println("chislo chetnoe ");
            else
                System.out.println("chislo nechetnoe ");
            System.out.println("---------------------");
        }

        public static void getTemperature() {
            Scanner console = new Scanner(System.in);
            System.out.println("2. Vvedite temperaturu: ");
            int t = console.nextInt();
            if (t > -5) {
                System.out.println("Warm ");
            }
            else
                if (-5 >= t && t > -20) {
                System.out.println("Normal");
                }
            else
                if (-20 >=t) {
                    System.out.println("Cold");
                }
            System.out.println("---------------------");
        }
        public static void getSquare() {
            System.out.println("3. ");
        for (int i = 10; i <= 20; i++) {
                int square = i * i;
                System.out.print( i + "^2 = " + square);
            System.out.println();
            }
            System.out.println("---------------------");
        }
        public static void getSubsequence(){

            System.out.println("4. ");
            int count = 7;
            while (count <= 98) {
                System.out.println(count);
                if (count < 98) {
                    System.out.print("");
                }
                count += 7;
            }
            System.out.println("---------------------");
        }
        public static void getCeloeChislo(){
        Scanner console = new Scanner(System.in);
            int n = -1;
            while (true){
                System.out.println("5. Vvedite celoe polozitelnoe chislo: ");
                if (console.hasNextInt()) {
                        n = console.nextInt();
                        if (n > 0) {
                            break;
                        } else {
                            System.out.println("Oshibka: chislo dolzno bit' polozitelnim");
                        }
                } else  {
                    System.out.println("Oshibka: vvedeno ne celoe chislo");
                    console.next();
                }
            }
            long sum = ((long) n*(n+1)) / 2;
            System.out.println("Summa chisel ot 1 do " + n + " ravna " + sum);
            console.close();
        }
}

