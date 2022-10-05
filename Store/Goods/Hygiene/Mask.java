package Goods.Hygiene;

import Goods.Hygiene.Base.Hygiene;

public class Mask extends Hygiene {
    public Mask(String name, int count, String unit, int countOfPack){
        super(name,count,unit,countOfPack);
        this.name = name;
        this.count = count;
        this.unit = unit;
        this.countOfPack = countOfPack;
    }

}