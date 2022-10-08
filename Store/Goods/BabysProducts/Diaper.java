package Store.Goods.BabysProducts;

import Store.Goods.BabysProducts.Base.BabyProduct;

public class Diaper extends BabyProduct {
    protected int size;
    protected int minWeight;
    protected int maxWeight;
    protected String type;

    public Diaper(String name, int count, String unit, int minAge, boolean allergenic, int size, int min, int max, String type){
        super(name, count, unit, minAge, allergenic);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.minAge = minAge;
        if(allergenic){
            this.hypoallergenic = "Гиппоаллергенно";
        }else{
            this.hypoallergenic = "Негиппоаллергенно";
        }

        this.size = size;
        this.minWeight = min;
        this.maxWeight = max;
        this.type = type;
    }

    public String ToString(){

        String goodString;
        goodString = String.format( "\nИмя: %s\n" +
                "Кол-во: %d %s\n" +
                "Минимальный возраст: %d\n" +
                "%s\n" +
                "Размер: %d\n" +
                "Мин/макс вес: %d/%d кг\n" +
                "Тип: %s\n" ,name,count,unit,minAge,hypoallergenic,size,minWeight,maxWeight,type);

        return goodString;
    }
}