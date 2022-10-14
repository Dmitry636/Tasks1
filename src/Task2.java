public class Task2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); // парсит найденные значения(int) из строки
        int b = Integer.parseInt(args[1]);
        System.out.println(triArea(a, b));
        // тоже самое что и код ниже, но работает без участия пользователя <--
        // System.out.println(triArea(3, 2));
        // System.out.println(triArea(7, 4));
        // System.out.println(triArea(10, 10));
    }
    public static int triArea(int a, int b){
        int s;
        s = (a * b) / 2;
        return s;
    }
}
