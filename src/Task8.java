public class Task8 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(nextEdge(a, b));
    }
    public static int nextEdge(int a, int b) {
        int s = a + b;
        return s-1;
        }
}
