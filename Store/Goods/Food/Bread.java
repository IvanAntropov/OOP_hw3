package Goods.Food;


import Goods.Base.Good;
import Goods.Food.Base.Food;

public class Bread extends Food {
    protected String typeOfFlour;
    public Bread(String name, int count, String unit, String date, String typeOfFlour){
        super(name, count, unit, date);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.shelfLife = date;

        this.typeOfFlour = typeOfFlour;
    }

    public String toString() {
        String goodString;
        goodString = String.format("\nИмя: %s\n" +
                "Кол-во: %d %s\n" +
                "Годен до: %s\n"+
                "Тип муки: %s\n",name,count,unit,shelfLife,typeOfFlour);

        return goodString;
    }
}