package Zoo.Animals.Birds;

import Zoo.Animals.Birds.Base.Bird;

public class Stork extends Bird {

    public Stork(int height1, int weight1, String colorOfEyes1, int heightOfFly1){
        super();
        this.height = height1;
        this.weight = weight1;
        this.colorOfEyes = colorOfEyes1;
        this.heightOfFly = heightOfFly1;
    }

    @Override
    public void MakeSound() {
        System.out.println("*Звуки аиста*");
    }

    @Override
    public void GetInfo() {
        String info = String.format("Рост: %d м\n" +
                        "Вес: %d кг\n" +
                        "Цвет глаз: %s\n" +
                        "Высота полета: %d\n",
                height,weight,colorOfEyes,heightOfFly);
        System.out.printf(info);
    }

    @Override
    public void fly() {
            System.out.printf("\nЯ лечу на %d метрах\n", heightOfFly);
    }
}