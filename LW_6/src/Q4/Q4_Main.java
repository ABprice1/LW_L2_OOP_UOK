package Q4;
import Teacher.Pet;

import java.util.ArrayList;
import java.util.Scanner;

class Dog extends Pet{
    float weight;

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public float getWeight()
    {
        return this.weight;
    }

    public String speak( ) {
        return "";
    }
}

class Cat extends Pet{

    String coatColor;

    public void setCoatColor(String coatColor)
    {
        this.coatColor = coatColor;
    }

    public String getCoatColor()
    {
        return this.coatColor;
    }

    public String speak( ) {
        return "";
    }
}

public class Q4_Main {
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
                System.out.println("Enter Coat Color : ");
                cat.setCoatColor(scanner.nextLine());
                pets.add(cat);
            } else if (playerInput.equals("d")) {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.println("Enter Weight : ");
                dog.setWeight(scanner.nextFloat());
                scanner.nextLine();
                pets.add(dog);
            }
            else {
                System.out.println("Invalid input. Try again.");
            }
        }

        for (int i=0;i<pets.size();i++)
        {
            if (pets.get(i) instanceof Dog) continue;
            Cat cat = (Cat) pets.get(i);
            System.out.println("Cat | " + pets.get(i).getName() + " | " + cat.getCoatColor());
        }

        for (int i=0;i<pets.size();i++)
        {
            if ( pets.get(i) instanceof Cat) continue;
            Dog dog = (Dog)pets.get(i);
            System.out.println("Dog | " + pets.get(i).getName() + " | " + dog.getWeight());
        }

    }
}
