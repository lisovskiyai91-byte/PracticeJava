package TMS.homework2;
public class BLOKVtoroiDZ {
    public static void main(String[] args) {
        calculationByFormula();
        calculationSumDigits();
        calculationSumDigitsN();
        calculationRounding();
        calculationDivision();
        changeVariables();
    }

    public static void calculationByFormula() {
        int b = 3;
        int c = 5;
        int a = 4 * (b + c - 1) / 2;
        System.out.println("1. a = " + a);
        System.out.println("------------------");
    }

    public static void calculationSumDigits() {
        int n = 26;
        int sum = (n / 10) + (n % 10);
        System.out.println("2. Сумма цифр n = " + n + " равна " + sum);
        System.out.println("------------------");
    }
    public static void calculationSumDigitsN() {
        int n = 126;
        int sum = ((n/100) + ((n/10)%10) + (n%10));
        System.out.println("3. Сумма цифр n = " + n + " равна " + sum);
        System.out.println("------------------");
    }
    public static void calculationRounding() {
        double n = 16.6;
        long r = Math.round(n);
        System.out.println("4. n = " + n + " округлено до = " + r);
        System.out.println("------------------");
    }
    public static void calculationDivision(){
        int q = 21;
        int w = 8;
        int n = q/w;
        int r = q % w;
        System.out.println("5.  " + n);
        System.out.println("    " + r);
        System.out.println("------------------");
    }
    public static void changeVariables(){
        int a = 1;
        int b = 2;
        int temp = a;
        a=b;
        b=temp;
        System.out.println("6.  " + a);
        System.out.println("    " + b);
    }
    }

