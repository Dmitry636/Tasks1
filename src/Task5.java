public class Task5 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // парсит найденные значения(int) из строки
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        System.out.println(operation(N, a, b));
        // тоже самое что и код ниже, но работает без участия пользователя <--
        // System.out.println(operation(24, 15, 9));
        // System.out.println(operation(24, 26, 2));
        // System.out.println(operation(15, 11, 11));
    }
    public static String operation(int N, int a, int b){
        if ((a + b) == N) {
            return "add";
        } else if (((a - b) == N)) {
            return "sub";
        } else if ((a / b) == N) {
            return "div";
        } else if ((a * b) == N) {
            return "mul";
        }
        return "none";
    }
}
