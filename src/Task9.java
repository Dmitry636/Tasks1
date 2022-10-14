public class Task9 {
    public static void main(String[] args) {
        int[] num = new int[args.length]; // массив целых чисел = новый массив с определённым количеством чисел
        for (int i = 0; i < args.length; i++) { // запись значений полученных из (args) в массив целых (num)
            num[i] = Integer.parseInt(args[i]);
        }
        System.out.println(sumOfCubes(num));
        // System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        // System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        //System.out.println(sumOfCubes(new int[]{2}));
        // System.out.println(sumOfCubes(new int[]{}));
    }
    public static int sumOfCubes(int[] num) {
        int sum = 0;
        for (int j = 0; j < num.length; j++) {
            sum += Math.pow(num[j], 3);
        }
        return sum;
    }
}
