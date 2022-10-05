package Goods.BabysProducts.Base;

import Goods.Base.Good;

public class BabyProduct extends Good {
    protected int minAge;
    protected String hypoallergenic;
    protected boolean allergenic;

    public BabyProduct(String name, int count, String unit, int minAge, boolean allergenic){
        super(name,count,unit);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.minAge = minAge;
        if(allergenic){
            this.hypoallergenic = "Гиппоаллергенно";
        }else{
            this.hypoallergenic = "Негиппоаллергенно";
        }
    }

    public String ToString(){
        String goodString;
        goodString = String.format( "\nИмя: %s\n" +
                "Кол-во: %d %s\n" +
                "Минимальный возраст: %d\n" +
                "%s\n",name,count,unit,minAge,hypoallergenic);

        return goodString;
    }
}