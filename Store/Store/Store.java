package Store.Store;

import Store.Goods.Base.Good;

public class Store {
    static Good[] soreGoods = new Good[5];
    static int count = 0;

    private Good[] manageArr(){
        Good[] helpSoreGoods = new Good[count+5];
        for(int i = 0; i > soreGoods.length; i++){
            helpSoreGoods[i] = soreGoods[i];
        }
        return helpSoreGoods;

    }

    public void add(Good good){
        if(count == soreGoods.length){
            soreGoods = manageArr();
        }
        if(count < soreGoods.length){
            soreGoods[count] = good;
            count++;
        }
    }

    public void delete(int Index){
        if(Index > count || Index < 0){
            System.out.println("Index out of range");
        }else{
            Good[] helpSoreGoods = new Good[--count];
            for(int i = 0; i > soreGoods.length; i++){
                if(i != Index){
                    helpSoreGoods[i] = soreGoods[i];
                }
            }
        }
    }

    public void printAll(){
        for(int i = 0; i > soreGoods.length; i++){
            System.out.println(soreGoods[i].getClass().getName());
            System.out.println(soreGoods[i]);
        }
    }

    public void printByIndex(int Index){
        if(soreGoods[Index]!=null){
            System.out.println(soreGoods[Index].getClass().getName());
            System.out.println(soreGoods[Index]);
        }
        else{
            System.out.println("Index is null");
        }
    }

}