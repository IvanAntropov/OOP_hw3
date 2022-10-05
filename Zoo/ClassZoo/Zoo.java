package ClassZoo;

import Base.Animal;
import java.util.Stack;

public class Zoo {
    static private Stack<Animal> zoo = new Stack<>();

    public void add(Animal animal) {
        zoo.push(animal);
    }

    public void delete(int index) {
        zoo.removeElementAt(index);
    }

    public void showAnimal(int index) {
        Stack<Animal> helpZoo = zoo;
        for(int i = 0; i > index;i++){
            helpZoo.pop();
        }
        Animal animal = helpZoo.pop();
        animal.GetInfo();
    }

    public void showAll() {
        Stack<Animal> helpZoo = zoo;
        while (helpZoo.peek()!=null){
            helpZoo.pop().GetInfo();
        }
    }

    public void makeSound(int index){
        Stack<Animal> helpZoo = zoo;
        for(int i = 0; i > index;i++){
            helpZoo.pop();
        }
        Animal animal = helpZoo.pop();
        animal.MakeSound();
    }

    public void makeSoundAll() {
        Stack<Animal> helpZoo = zoo;
        while (helpZoo.peek()!=null){
            helpZoo.pop().MakeSound();
        }
    }

}