public class Task4 {
    public static void main(String[] args) {
        float prob = Float.parseFloat(args[0]); // парсит найденные значения(int) из строки
        float prize = Float.parseFloat(args[1]);
        float pay = Float.parseFloat(args[2]);
        System.out.println(profitableGamble(prob, prize, pay));
        // тоже самое что и код ниже, но работает без участия пользователя <--
        // System.out.println(profitableGamble((0.2, 50, 9));
        // System.out.println(profitableGamble(0.9, 1, 2));
        // System.out.println(profitableGamble(0.9, 3, 2));
    }
    public static boolean profitableGamble(float prob, float prize, float pay){
        return (prob * prize) > pay;
    }
}
