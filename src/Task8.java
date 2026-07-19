public class Task8 {
    public static void main(String[] args) {
        //1. Создать объект StringBuilder с любой строкой
        StringBuilder s = new StringBuilder("Hello!");
        //2. Добавить к строке "xxxx"
        s.append("xxxx");
        System.out.println("После append:" + s);
        //3. В 5-ю позицию вставить "y"
        s.insert(5, "y");
        System.out.println(s);
        //4. Удалить символы с 3 по 6
        s.delete(3, 6);
        System.out.println(s);
        //5. Перевернуть строку
        s.reverse();
        System.out.println(s);
        //6. Преобразовать в String и вывести
        String result = s.toString();
        System.out.println("String: " + result);
    }
}
