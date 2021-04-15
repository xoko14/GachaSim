package gachaSim;

import java.util.Random;

public class Item {
    private String name;
    private double dropRate;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDropRate() {
        return this.dropRate;
    }

    public void setDropRate(double dropRate) {
        this.dropRate = dropRate;
    }

    private static final int FACTOR = 100;
    public static final Item NULL = new Item("", -1);

    private static Random r = new Random();

    Item(String name, double dropRate){
        this.name=name;
        this.dropRate=dropRate;
    }

    public double getChance(){
        return (r.nextInt(FACTOR)+1)*dropRate;
    }

    @Override
    public String toString(){
        return String.format("Item: %s", name);
    }
}
