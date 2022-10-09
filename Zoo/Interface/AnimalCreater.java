package Zoo.Interface;

import Zoo.Animals.Birds.Chicken;
import Zoo.Animals.Birds.Stork;
import Zoo.Animals.Cat;
import Zoo.Animals.Dog;
import Zoo.Animals.Tiger;
import Zoo.Animals.Wolf;
import Zoo.Base.Animal;
import Zoo.ClassZoo.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCreater extends Zoo{
    private Scanner scan = new Scanner(System.in);
    private String type;
    protected Zoo MyZoo = new Zoo();
    private ArrayList<String> arraylist(){
        ArrayList<String> checking = new ArrayList<>();
        checking.add("cat");
        checking.add("dog");
        checking.add("tiger");
        checking.add("wolf");
        checking.add("chicken");
        checking.add("stork");
        return checking;
    }

    public AnimalCreater(String type){
        this.type = type;
        MyZoo.add(create(type));
    }

    public Animal create(String type){
        ArrayList<String>check = arraylist();
        System.out.printf("Enter height of %s: ",type);
        int height = scan.nextInt();
        System.out.printf("Enter weight of %s: ",type);
        int weight = scan.nextInt();
        System.out.printf("Enter color of eyes of %s: ",type);
        String colorOfEyes = scan.next();
        if(check.contains(type.toLowerCase())){
            if(type.toLowerCase().equals("cat") || type.toLowerCase().equals("dog")){
                System.out.printf("Enter name of %s: ",type);
                String name = scan.next();
                System.out.printf("Enter breed of %s: ",type);
                String breed = scan.next();
                System.out.printf("Enter vaccines of %s: ",type);
                String vaccines = scan.next();
                System.out.printf("Enter color of fur of %s: ",type);
                String coloroffur = scan.next();
                System.out.printf("Enter date of birth of %s: ",type);
                String dateofbirth = scan.next();
                if(type.toLowerCase().equals("cat")){
                    Cat animal = new Cat(height,weight,colorOfEyes,name,breed,vaccines,coloroffur,dateofbirth);
                    return animal;
                }else{
                    Dog animal = new Dog(height,weight,colorOfEyes,name,breed,vaccines,coloroffur,dateofbirth);
                    return animal;
                }
            }else if(type.toLowerCase().equals("tiger") || type.toLowerCase().equals("wolf")){
                System.out.printf("Enter habitat of %s: ",type);
                String habitat = scan.next();
                System.out.printf("Enter date of finding of %s: ",type);
                String dateoffinding = scan.next();
                if(type.toLowerCase().equals("tiger")){
                    Tiger animal = new Tiger(height,weight,colorOfEyes,habitat,dateoffinding);
                    return animal;
                }else{
                    Wolf animal = new Wolf(height,weight,colorOfEyes,habitat,dateoffinding);
                    return animal;
                }
            }else if(type.toLowerCase().equals("chicken") || type.toLowerCase().equals("stork")){
                System.out.printf("Enter height of fly of %s: ",type);
                int heightOfFly = scan.nextInt();
                if(type.toLowerCase().equals("chicken")){
                    Chicken animal = new Chicken(height,weight,colorOfEyes,heightOfFly);
                    return animal;
                }else{
                    Stork animal = new Stork(height,weight,colorOfEyes,heightOfFly);
                    return animal;
                }
            }
        }
        return null;
    }

}
