package gachaSim;

//import java.util.Scanner;
//Hola
public class Main {
    private static Item[] pool;
    private static Gacha gacha;
    //private static Scanner kbd = new Scanner(System.in);
    private static int[] count = {0,0,0,0,0,0};

    public static void main(String[] args) {
        Item roll;
        while (true) {
            init();
            roll = gacha.roll();
            System.out.println(roll);
            // kbd.nextLine();
            count[0]++;
            if (roll.getName().equals("tierra")) count[1]++;
            if (roll.getName().equals("madera")) count[2]++;
            if (roll.getName().equals("piedra")) count[3]++;
            if (roll.getName().equals("oro")) count[4]++;
            if (roll.getName().equals("diamante")) {
                count[5]++;
                break;
            }
        }
        System.out.printf("\nNúmero de tiradas: %d\n", count[0]);
        System.out.printf("Loot:\nTierra: %d\nMadera: %d\nPiedra: %d\nOro: %d\nDiamante: %d", count[1], count[2], count[3], count[4], count[5]);

    }

    private static void init() {
        pool = new Item[] {
            new Item("tierra", 0.6),
            new Item("madera", 0.5),
            new Item("piedra", 0.3),
            new Item("oro", 0.2),
            new Item("diamante", 0.05) };
        gacha = new Gacha(pool);
    }
}
