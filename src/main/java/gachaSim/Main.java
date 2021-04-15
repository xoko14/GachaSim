package gachaSim;

import java.util.Scanner;

public class Main {
    private static Item[] pool;
    private static Gacha gacha;
    //private static Scanner kbd = new Scanner(System.in);
    private static int count = 0;

    public static void main(String[] args) {
        Item roll;
        while (true) {
            init();
            roll = gacha.roll();
            System.out.println(roll);
            // kbd.nextLine();
            count++;
            if (roll.getName().equals("diamante"))
                break;
        }
        System.out.printf("Número de tiradas: %d", count);
    }

    private static void init() {
        pool = new Item[] { new Item("tierra", 0.6), new Item("madera", 0.5), new Item("piedra", 0.3),
                new Item("oro", 0.2), new Item("diamante", 0.05) };
        gacha = new Gacha(pool);
    }
}
