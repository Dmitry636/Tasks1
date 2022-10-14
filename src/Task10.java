public class Task10 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(abcmath(a, b, c));
        // тоже самое что и код ниже, но работает без участия пользователя <--
        // System.out.println(abcmath(42, 5, 10));
        // System.out.println(abcmath(5, 2, 1));
        // System.out.println(abcmath(1, 2, 3));
    }
    public static boolean abcmath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        return (a % c) == 0;
    }
}
