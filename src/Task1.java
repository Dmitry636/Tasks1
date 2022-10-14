public class Task1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // парсит(забирает) найденные значения(int) из строки
        int b = Integer.parseInt(args[1]);
        System.out.println(reminder(a, b));
        // тоже самое что и код ниже, но работает без участия пользователя (без ввода с консоли)
        // System.out.println(reminder(1, 3));
        // System.out.println(reminder(3, 4));
        // System.out.println(reminder(-9, 45));
        // System.out.println(reminder(5, 5));
    }
    public static int reminder(int a, int b){ // Метод вывода остатка
        // Static — модификатор, применяемый к полю, блоку, методу или внутреннему классу.
        // Данный модификатор указывает на привязку субъекта к текущему классу.
        a = a % b;
        return a;
    }
}