import Goods.BabysProducts.Base.BabyProduct;
import Goods.BabysProducts.Diaper;
import Goods.BabysProducts.Nipple;
import Goods.Base.Good;
import Goods.Drinks.Base.Drink;
import Goods.Drinks.Limonade;
import Goods.Drinks.Milk;
import Goods.Food.Base.Food;
import Goods.Food.Bread;
import Goods.Food.Eggs;
import Goods.Hygiene.Base.Hygiene;
import Goods.Hygiene.Mask;
import Goods.Hygiene.ToiletPaper;
import Store.Store;

public class Program {
    public static void main(String[] args) {
        Good otherGood = new Good("Товар",5,"Шт");

        Food food = new Food("Еда",10,"пачек","05.10.2023");
        Bread whiteBread = new Bread("Екбешный", 1, "Буханок","7.10.2022","первосортная");
        Eggs egg = new Eggs("Ирбитские",100,"Упаковок","12.10.2022",10);

        Drink someDrink = new Drink("Питье",15,"бутылок",1000);
        Milk milk  = new Milk("Бородулинское",50,"пакетов",1000,2.5,"7.10.2022");
        Limonade limonade = new Limonade("Буратино",10,"бутылок",500);

        Hygiene hygiene = new Hygiene("Гигиена",10,"Шт",5);
        Mask mask = new Mask("Красавица",25,"Шт",10);
        ToiletPaper tPaper = new ToiletPaper("Зева",40,"пачек",5,3);

        BabyProduct babyP = new BabyProduct("Детский товар",50,"пачек",0,true);
        Diaper diaper = new Diaper("ХагиВаги",25,"пачек",0,true,25,3,10,"Классические");
        Nipple nipple = new Nipple("Соска",100,"Шт",0,true);

//        System.out.println(otherGood);
//        System.out.println(whiteBread);

        Store MyStore = new Store();
        MyStore.add(food);
        MyStore.add(whiteBread);
        MyStore.add(egg);
        MyStore.add(someDrink);
        MyStore.add(milk);
        MyStore.add(limonade);
        MyStore.add(hygiene);
        MyStore.add(mask);
        MyStore.add(tPaper);
        MyStore.add(babyP);
        MyStore.add(diaper);
        MyStore.add(nipple);

        System.out.println(whiteBread.getClass().getName());

//        MyStore.delete(6);
//        MyStore.delete(3);
//
//        MyStore.printByIndex(0);
//        MyStore.printAll();


    }

}