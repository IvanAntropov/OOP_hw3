package Zoo.Interface;

import Zoo.ClassZoo.Zoo;
import Zoo.Program;

import java.util.Scanner;

public class Interface {
    public void Start() {
        Program app = new Program();
        boolean Exit = true;
        Zoo MyZoo = new Zoo();
        int index;
        int a;
        System.out.printf("===ON===");
        while(Exit){
            Scanner scan2 = new Scanner(System.in);
            System.out.printf("\nWhat do you want?\n " +
                    "1) add animal \n " +
                    "2) show animals\n " +
                    "3) show animal by index\n " +
                    "4) make sound all\n " +
                    "5) make sound by index\n " +
                    "6) delete animal by index\n " +
                    "7) do stuff all animals\n " +
                    "8) do stuff by index\n\n " +
                    "0) EXIT\n ");
            a = scan2.nextInt();
            if(a == 1){
                System.out.printf("\nWhich animal? \ncat/dog/tiger/wolf/chicken/stork\n");
                String type = scan2.next();
                AnimalCreater create = new AnimalCreater(type);
            }else if (a==2) {
                MyZoo.showAll();
            }else if (a==3) {
                System.out.printf("\nWhich index?\n");
                index = scan2.nextInt();
                MyZoo.showAnimal(index);
            }else if (a==4) {
                MyZoo.makeSoundAll();
            }else if (a==5) {
                System.out.printf("\nWhich index?\n");
                index = scan2.nextInt();
                MyZoo.makeSound(index);
            }else if (a==6) {
                System.out.printf("\nWhich index?\n");
                index = scan2.nextInt();
                MyZoo.delete(index);
            }else if (a==7) {
                MyZoo.doStuffAll();
            }else if (a==8) {
                System.out.printf("\nWhich index?\n");
                index = scan2.nextInt();
                MyZoo.doStuff(index);
            }else if (a==0) {
                Exit = false;
            }else{
                System.out.printf("\nThere is no such command\n");
            }
//            switch (a) {
//                case 1:
//                    System.out.printf("\nWhich animal? \ncat/dog/tiger/wolf/chicken/stork\n");
//                    String type = scan2.next();
//                    AnimalCreater create = new AnimalCreater(type);
//                case 2:
//                    MyZoo.showAll();
//                case 3:
//                    System.out.printf("\nWhich index?\n");
//                    index = scan2.nextInt();
//                    MyZoo.showAnimal(index);
//                case 4:
//                    MyZoo.makeSoundAll();
//                case 5:
//                    System.out.printf("\nWhich index?\n");
//                    index = scan2.nextInt();
//                    MyZoo.makeSound(index);
//                case 6:
//                    System.out.printf("\nWhich index?\n");
//                    index = scan2.nextInt();
//                    MyZoo.delete(index);
//                case 0:
//                    Exit = false;
//                case 7:
//                    MyZoo.doStuffAll();
//                case 8:
//                    System.out.printf("\nWhich index?\n");
//                    index = scan2.nextInt();
//                    MyZoo.doStuff(index);
//                default:
//                    System.out.printf("\nThere is no such command\n");
//            }
        }
        System.out.printf("\nGoodBye!\n\n===OFF====\n");

    }
}