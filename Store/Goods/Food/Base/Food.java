package Goods.Food.Base;

import Goods.Base.Good;

public class Food extends Good{
    protected String shelfLife;

    public Food(String name, int count, String unit, String date) {
        super(name, count, unit);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.shelfLife = date;

    }

    public String ToString(){
        String goodString;
        goodString = String.format(   "Имя: %s\n" +
                "Кол-во: %d %s" +
                "Годен до: %s",name,count,unit,shelfLife);

        return goodString;
    }
}
