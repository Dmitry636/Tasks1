public class Task3 {
    public static void main(String[] args) {
        int ch = Integer.parseInt(args[0]); // парсит найденные значения(int) из строки
        int cow = Integer.parseInt(args[1]);
        int pig = Integer.parseInt(args[2]);
        System.out.println(animals(ch, cow, pig));
        // System.out.println(animals(2, 3, 5));
        // System.out.println(animals(1, 2, 3));
        // System.out.println(animals(5, 2, 8));
    }
    public static int animals(int ch, int cow, int pig){
        int a;
        a = (ch * 2) + (cow * 4) + (pig * 4);
        return a;
    }
}
