package Goods.Drinks;

import Goods.Drinks.Base.Drink;


public class Limonade extends Drink {
    protected int volume;

    public Limonade(String name, int count, String unit, int volume) {
        super(name, count, unit, volume);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.volume = volume;
    }

}