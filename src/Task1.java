public class Task1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // парсит(забирает) найденные значения(int) из строки
        int b = Integer.parseInt(args[1]);
        System.out.println(reminder(a, b));
    }
    public static int reminder(int a, int b){ // Метод вывода остатка
        // Static — модификатор, применяемый к полю, блоку, методу или внутреннему классу.
        // Данный модификатор указывает на привязку субъекта к текущему классу.
        a = a % b;
        return a;
    }
}