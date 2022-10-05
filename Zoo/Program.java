import Animals.*;

import Animals.Birds.Base.Bird;
import Animals.Birds.Chicken;
import Animals.Birds.Stork;
import Base.Animal;
import ClassZoo.Zoo;
import Interfaces.IPet;

public class Program {

    public static void doStuff(Animal animal){
        if(animal instanceof IPet){
            ((IPet) animal).showAffection();
        }
        if(animal instanceof Bird){
            ((Bird) animal).fly();
        }
        if(animal instanceof Dog){
            ((Dog)animal).training();
        }
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat(5,2,"Blue","Вася","Дворняжка", "Нет","Gray","23.02.2013");
        Dog dog1 = new Dog(5,4,"Gray","Chubaka","Alabay","Бешенство","brown","29.03.2001" );
        Tiger tiger1 = new Tiger(10,8,"Green","Amyr","05.03.2009");
        Wolf wolf1 = new Wolf(7,5,"Brown", "Ekb","23.06.2007");

        Chicken chicken1 = new Chicken(1,2,"Yellow",5);
        Stork stork1 = new Stork(1,2,"Purple",100);

        chicken1.fly();
        stork1.fly();

        Zoo myZoo = new Zoo();
        myZoo.add(cat1);
        myZoo.add(dog1);
        myZoo.add(tiger1);
        myZoo.add(wolf1);
        myZoo.add(chicken1);
        myZoo.add(stork1);

        myZoo.delete(2); // -stork
        myZoo.delete(4); // -tiger

//        myZoo.showAnimal(3);// tiger
//        myZoo.showAll();

//        myZoo.makeSound(2); // chicken
        myZoo.makeSoundAll();



    }

}