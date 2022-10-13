public class Task9 {
    public static void main(String[] args) {
        int[] num = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }
        System.out.println(sumOfCubes(num));
    }
    public static int sumOfCubes(int[] num) {
        int sum = 0;
        for (int j = 0; j < num.length; j++) {
            sum += Math.pow(num[j], 3);
        }
        return sum;
    }
}
