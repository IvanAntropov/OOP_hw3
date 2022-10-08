package Store.Goods.Base;

public class Good {
    protected String name;
    protected int count;
    protected String unit;

    public Good(String name, int count, String unit) {
        this.name = name;
        this.count = count;
        this.unit = unit;
    }

    public String toString() {
        String goodString;
        goodString = String.format(   "Имя: %s\n" +
                "Кол-во: %d %s"
                ,name,count,unit);

        return goodString;
    }
}
