package Zoo.Animals;

import Zoo.Base.WildAnimal;

public class Tiger extends WildAnimal {

    public Tiger(int height1, int weight1, String colorOfEyes1, String hab, String date){
        super();
        this.height = height1;
        this.weight = weight1;
        this.colorOfEyes = colorOfEyes1;
        this.habitat = hab;
        this.dateOfFinding = date;
    }

    @Override
    public void MakeSound() {
        System.out.println("Рррррр");
    }

    @Override
    public void GetInfo() {
        String info = String.format("Рост: %d м\n" +
                        "Вес: %d кг\n" +
                        "Цвет глаз: %s\n" +
                        "Место обитания: %s\n" +
                        "Дата нахождения: %s\n",
                height,weight,colorOfEyes,habitat,dateOfFinding);
        System.out.println(info);
    }
}