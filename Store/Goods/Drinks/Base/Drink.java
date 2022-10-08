package Store.Goods.Drinks.Base;

import Store.Goods.Base.Good;

public class Drink extends Good {
    protected int volume;

    public Drink(String name, int count, String unit, int volume) {
        super(name, count, unit);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.volume = volume;

    }

    public String ToString(){
        String goodString;
        goodString = String.format(    "\nИмя: %s\n" +
                "Кол-во: %d %s\n" +
                "Объем: %d мл\n",name,count,unit,volume);

        return goodString;
    }
}