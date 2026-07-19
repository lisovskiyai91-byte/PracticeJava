
public class Task7 {
    public class Main {
        public static void main(String[] args) {
            String s1 = "Alex";
            String s2 = "Lisovskiy";

            //1. Объединить 2 строки тремя способами
            String result1 = s1 + " " + s2;
            String result2 = s1.concat(" ").concat(s2);
            System.out.println(result1);
            System.out.println(result2);

            StringBuilder sb = new StringBuilder();
            sb.append("Привет");
            sb.append(" Мир");
            String result = sb.toString();
            System.out.println(result);

            // 1.2 Проверить строки на равенство
            String s11 = "Java";
            String s22 = "java";

            System.out.println("equals: " + s11.equals(s22));
            System.out.println("equalsIgnoreCase: " + s11.equalsIgnoreCase(s22));

            // 1.3 Подстрока с 3-го символа до конца
            String text = "Programming";
            System.out.println(text.substring(2));

            // 1.4 Длина строки
            System.out.println("Длина: " + text.length());

            // 1.5 Порядковый номер символа
            System.out.println("Индекс буквы 'g': " + text.indexOf('g'));

            // 1.6 Преобразовать boolean в String
            boolean value = true;
            String boolString = String.valueOf(value);
            System.out.println(boolString);

            // 1.7 Верхний регистр
            System.out.println(text.toUpperCase());

            // 1.8 Заменить '1' на '%'
            String number = "123451";
            System.out.println(number.replace('1', '%'));

            // 1.9 Убрать пробелы с двух сторон
            String space = "   Hello Java   ";
            System.out.println(space.trim());

            // 1.10 Проверить, пустая ли строка
            String empty = "";
            System.out.println(empty.isEmpty());

            // 1.11 Разбить строку по разделителю
            String fruits = "Apple,Banana,Orange";
            String[] array = fruits.split(",");

            for (String fruit : array) {
                System.out.println(fruit);
            }
        }

    }
}
