package Zoo.Animals;

import Zoo.Base.PetAnimal;

public class Dog extends PetAnimal {
    public Dog (int height1, int weight1, String colorOfEyes1, String name1,
                String breed1, String vaccines1, String ColorOfFur1, String dateOfBirth1){
        super();
        this.height = height1;
        this.weight = weight1;
        this.colorOfEyes = colorOfEyes1;
        this.name = name1;
        this.breed = breed1;
        this.vaccines = vaccines1;
        this.colorOfFur = ColorOfFur1;
        this.dateOfBirth = dateOfBirth1;
    }

    public void training(){System.out.println("Я дрессированный пес!");}
    @Override
    public void showAffection() {
        System.out.println("Играется");
    }

    @Override
    public void MakeSound() {
        System.out.println("Гав гав");
    }

    @Override
    public void GetInfo() {
        String info = String.format("Рост: %d м\n" +
                        "Вес: %d кг\n" +
                        "Цвет глаз: %s\n" +
                        "Имя: %s\n" +
                        "Порода: %s\n" +
                        "Привики: %s\n" +
                        "Цвет шерсти: %s\n" +
                        "Дата рождения: %s\n",
                height,weight,colorOfEyes,name,breed,vaccines,colorOfFur,dateOfBirth);
    }
}