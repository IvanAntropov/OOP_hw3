package Goods.Food;


import Goods.Base.Good;
import Goods.Food.Base.Food;

public class Eggs extends Food {
    protected int countInPack;
    public Eggs(String name, int count, String unit, String date, int countInPack){
        super(name, count, unit, date);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.shelfLife = date;

        this.countInPack = countInPack;;
    }

    public String toString() {
        String goodString;
        goodString = String.format(   "\nИмя: %s\n" +
                "Кол-во: %d %s\n" +
                "Годен до: %s\n"+
                "Кол-во в упаковке: %d\n",name,count,unit,shelfLife,countInPack);

        return goodString;
    }
}