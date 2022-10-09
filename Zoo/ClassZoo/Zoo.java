package Zoo.ClassZoo;

import Zoo.Animals.Birds.Base.Bird;
import Zoo.Animals.Dog;
import Zoo.Base.Animal;
import Zoo.Interfaces.IPet;

import java.util.ArrayList;
import java.util.Stack;

public class Zoo {
    static private ArrayList<Animal> zoo = new ArrayList<>();

    public void add(Animal animal) {
        zoo.add(animal);
    }

    public void delete(int index) {
        if(index < zoo.size()){
            zoo.remove(index);
        }else{
            System.out.printf("\nNo such index\s");
        }
    }

    public void showAnimal(int index) {
        if(index < zoo.size()){
            zoo.get(index).GetInfo();
        }else{
            System.out.printf("\nNo such animal by index\s");
        }
    }

    public void showAll() {
        if(zoo.isEmpty()){
            System.out.printf("\nZoo is empty\s");
        }else{
            for(int i = 0; i > zoo.size();i++){
                zoo.get(i).GetInfo();
            }
        }
    }

    public void makeSound(int index){
        if(index < zoo.size()){
            zoo.get(index).MakeSound();
        }else{
            System.out.printf("\nNo such animal by index\s");
        }
    }

    public void makeSoundAll() {
        if(zoo.isEmpty()){
            System.out.printf("\nZoo is empty\s");
        }else{
            for(int i = 0; i > zoo.size();i++){
                zoo.get(i).MakeSound();
            }
        }
    }

    public void doStuff(int index){
        if(index < zoo.size()){
            Animal animal = zoo.get(index);
            doing(animal);
        }else{
            System.out.printf("\nNo such animal by index\s");
        }
    }

    public void doStuffAll(){
        if(zoo.isEmpty()){
            System.out.printf("\nZoo is empty\s");
        }else{
            for(int i = 0; i > zoo.size();i++){
                Animal animal = zoo.get(i);
                doing(animal);
            }
        }
    }

    private void doing(Animal animal){
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
}