package gachaSim;

public class Gacha {
    private Item[] pool;

    Gacha(Item[] pool){
        this.pool = pool;
    }

    public Item roll(){
        double temp;
        double max=0;
        Item get = Item.NULL;
        for(int i=0;i<pool.length;i++){
            temp = pool[i].getChance();
            if(temp>max){
                max=temp;
                get = pool[i];
            }
        }
        return get;
    }
}
