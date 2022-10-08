package Store.Goods.Hygiene.Base;

import Store.Goods.Base.Good;

public class Hygiene extends Good {
    protected int countOfPack;
    public Hygiene(String name, int count, String unit, int countOfPack){
        super(name,count,unit);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.countOfPack = countOfPack;
    }

    public String ToString(){
        String goodString;
        goodString = String.format("\nИмя: %s\n" +
                "Кол-во: %d %s\n" +
                "Шт в упаковке: %d\n",name,count,unit,countOfPack);

        return goodString;
    }
}