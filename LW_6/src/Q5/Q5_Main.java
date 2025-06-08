package Q5;

import Teacher.Pet;

import java.util.ArrayList;
import java.util.Scanner;

class Dog extends Pet
{
    float Weight;

    public void setWeight(float Weight)
    {
        this.Weight = Weight;
    }

    public float getWeight()
    {
        return this.Weight;
    }

    public String speak()
    {
        return "";
    }
}

class Cat extends Pet
{
    String CoatColor;

    public void setCoatColor(String CoatColor)
    {
        this.CoatColor = CoatColor;
    }

    public String getCoatColor()
    {
        return this.CoatColor;
    }

    public String speak()
    {
        return "";
    }
}

public class Q5_Main
{
    public static void main(String[] Args)
    {
        Scanner ScannerObj = new Scanner(System.in);
        ArrayList<Pet> Pets = new ArrayList<>();
        String PlayerInput = "";

        while (true)
        {
            System.out.println("Enter Type (c,d,STOP) : ");
            PlayerInput = ScannerObj.nextLine();

            if (PlayerInput.equals("STOP"))
            {
                break;
            }

            System.out.println("Enter Name : ");
            String Name = ScannerObj.nextLine();

            if (PlayerInput.equals("c"))
            {
                Cat CatObj = new Cat();
                CatObj.setName(Name);

                System.out.println("Enter Coat Color : ");
                CatObj.setCoatColor(ScannerObj.nextLine());

                Pets.add(CatObj);
            }
            else if (PlayerInput.equals("d"))
            {
                Dog DogObj = new Dog();
                DogObj.setName(Name);

                System.out.println("Enter Weight : ");
                DogObj.setWeight(ScannerObj.nextFloat());
                ScannerObj.nextLine(); // Consume newline

                Pets.add(DogObj);
            }
            else
            {
                System.out.println("Invalid input. Try again.");
            }
        }

        System.out.println("Total Pets: " + Pets.size());

        for (int I = 0; I < Pets.size(); I++)
        {
            if (Pets.get(I) instanceof Dog)
            {
                Dog DogObj = (Dog) Pets.get(I);
                System.out.println("Dog | " + DogObj.getName() + " | " + DogObj.getWeight());
            }
        }

        for (int I = 0; I < Pets.size(); I++)
        {
            if (Pets.get(I) instanceof Cat)
            {
                Cat CatObj = (Cat) Pets.get(I);
                System.out.println("Cat | " + CatObj.getName() + " | " + CatObj.getCoatColor());
            }
        }

        ArrayList<Dog> DogList = new ArrayList<>();

        for (int I = 0; I < Pets.size(); I++)
        {
            if (Pets.get(I) instanceof Dog)
            {
                DogList.add((Dog) Pets.get(I));
            }
        }

        if (!DogList.isEmpty())
        {
            float TotalWeight = 0;
            float MinWeight = DogList.get(0).getWeight();
            float MaxWeight = DogList.get(0).getWeight();

            for (int I = 0; I < DogList.size(); I++)
            {
                float Weight = DogList.get(I).getWeight();
                TotalWeight += Weight;

                if (Weight < MinWeight)
                {
                    MinWeight = Weight;
                }

                if (Weight > MaxWeight)
                {
                    MaxWeight = Weight;
                }
            }

            float AverageWeight = TotalWeight / DogList.size();

            System.out.println("\nDog Weight Stats:");
            System.out.println("Average: " + AverageWeight);
            System.out.println("Minimum: " + MinWeight);
            System.out.println("Maximum: " + MaxWeight);
        }
        else
        {
            System.out.println("\nNo Dogs Found.");
        }
    }
}
