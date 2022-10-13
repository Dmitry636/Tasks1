public class Task7 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println(addUpTo(a));
    }
    public static int addUpTo(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
