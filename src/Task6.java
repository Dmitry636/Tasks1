public class Task6 {
    public static void main(String[] args) {
        String a = args[0];
        System.out.println(ctoa(a));
        // тоже самое что и код ниже, но работает без участия пользователя <--
        // System.out.println(ctoa("A"));
        // System.out.println(ctoa("m"));
        // System.out.println(ctoa("["));
        // System.out.println(ctoa("/"));
    }
    public static int ctoa(String a){
        return a.charAt(0); // charAt выводит значение первого символа в ascii
    }
}
