package Q2;
import Teacher.Pet;

import java.util.ArrayList;
import java.util.Scanner;

class Dog extends Pet{
    public String speak( ) {
        return "";
    }
}

class Cat extends Pet{
    public String speak( ) {
        return "";
    }
}

public class Q2_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        String playerInput = "";
        while (true)
        {
            System.out.println("Enter Type (c,d,STOP) : ");
            playerInput = scanner.nextLine();

            if(playerInput.equals("STOP"))
                break;

            System.out.println("Enter Name : ");
            String name = scanner.nextLine();
            if(playerInput.equals("c"))
            {
                Cat cat = new Cat();
                cat.setName(name);
                pets.add(cat);
            } else if (playerInput.equals("d")) {
                Dog dog = new Dog();
                dog.setName(name);
                pets.add(dog);
            }
            else {
                System.out.println("Invalid input. Try again.");
            }
        }
        System.out.println(pets.size());
        for (int i=0;i<pets.size();i++)
        {
            System.out.println((pets.get(i) instanceof Dog ? "Dog" : "Cat") + " | " + pets.get(i).getName());
        }
    }
}
