package lesson11;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int min = 5;
        int max = 10;
        int cnt = 30;
        for (int i = 0; i < cnt; i++) {
//            System.out.println(rand.nextBoolean());
//            System.out.println(rand.nextDouble());
//            System.out.println(rand.nextInt(max));  // от 0 до max (не включительно)
//            System.out.println(rand.nextInt(max - min) + min);  // от 5 до max (не включительно)
            System.out.println(rand.nextInt(max - min + 1) + min);  // от 5 до max (включительно)
        }
    }
}
