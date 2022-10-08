package Store.Goods.Hygiene;

import Store.Goods.Hygiene.Base.Hygiene;

public class ToiletPaper extends Hygiene {
    protected int countOfLay;
    public ToiletPaper(String name, int count, String unit, int countOfPack, int countOflay){
        super(name,count,unit,countOfPack);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.countOfPack = countOfPack;

        this.countOfLay = countOflay;
    }

    public String ToString(){
        String goodString;
        goodString = String.format( "\nИмя: %s\n" +
                "Кол-во: %d %s\n" +
                "Шт в упаковке: %d\n" +
                "Слоев: %d\n",name,count,unit,countOfPack,countOfLay);

        return goodString;
    }

}