package Store.Goods.BabysProducts;

import Store.Goods.BabysProducts.Base.BabyProduct;

public class Nipple extends BabyProduct {
    public Nipple(String name, int count, String unit, int minAge, boolean allergenic) {
        super(name, count, unit,minAge,allergenic);
        this.name = name;
        this.count = count;
        this.unit = unit;

        this.minAge = minAge;
        if (allergenic) {
            this.hypoallergenic = "Гиппоаллергенно";
        } else {
            this.hypoallergenic = "Негиппоаллергенно";
        }
    }
}

