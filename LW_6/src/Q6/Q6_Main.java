package Q6;

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

public class Q6_Main
{
    public static void main(String[] Args)
    {
        Scanner ScannerObj = new Scanner(System.in);
        ArrayList<Pet> Pets = new ArrayList<>();
        ArrayList<Dog> DogList = new ArrayList<>();
        ArrayList<Cat> CatList = new ArrayList<>();

        while (true)
        {
            System.out.println("Enter Type (c,d,STOP) : ");
            String PlayerInput = ScannerObj.nextLine();

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
                CatList.add(CatObj);
            }
            else if (PlayerInput.equals("d"))
            {
                Dog DogObj = new Dog();
                DogObj.setName(Name);
                System.out.println("Enter Weight : ");
                DogObj.setWeight(ScannerObj.nextFloat());
                ScannerObj.nextLine();

                Pets.add(DogObj);
                DogList.add(DogObj);
            }
        }

        while (true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter Choice: ");
            int Choice = ScannerObj.nextInt();
            ScannerObj.nextLine();

            if (Choice == 0)
            {
                break;
            }
            else if (Choice == 1)
            {
                System.out.println("Enter Name : ");
                String Name = ScannerObj.nextLine();
                System.out.println("Enter Coat Color : ");
                String CoatColor = ScannerObj.nextLine();

                Cat CatObj = new Cat();
                CatObj.setName(Name);
                CatObj.setCoatColor(CoatColor);

                Pets.add(CatObj);
                CatList.add(CatObj);
            }
            else if (Choice == 2)
            {
                System.out.println("Enter Name : ");
                String Name = ScannerObj.nextLine();
                System.out.println("Enter Weight : ");
                float Weight = ScannerObj.nextFloat();
                ScannerObj.nextLine();

                Dog DogObj = new Dog();
                DogObj.setName(Name);
                DogObj.setWeight(Weight);

                Pets.add(DogObj);
                DogList.add(DogObj);
            }
            else if (Choice == 3)
            {
                System.out.println("Enter Name to Remove: ");
                String Name = ScannerObj.nextLine();
                Cat ToRemove = null;

                for (int I = 0; I < CatList.size(); I++)
                {
                    if (CatList.get(I).getName().equals(Name))
                    {
                        ToRemove = CatList.get(I);
                        break;
                    }
                }

                if (ToRemove != null)
                {
                    CatList.remove(ToRemove);
                    Pets.remove(ToRemove);
                    System.out.println("Cat Removed.");
                }
                else
                {
                    System.out.println("Cat Not Found.");
                }
            }
            else if (Choice == 4)
            {
                System.out.println("Enter Name to Remove: ");
                String Name = ScannerObj.nextLine();
                Dog ToRemove = null;

                for (int I = 0; I < DogList.size(); I++)
                {
                    if (DogList.get(I).getName().equals(Name))
                    {
                        ToRemove = DogList.get(I);
                        break;
                    }
                }

                if (ToRemove != null)
                {
                    DogList.remove(ToRemove);
                    Pets.remove(ToRemove);
                    System.out.println("Dog Removed.");
                }
                else
                {
                    System.out.println("Dog Not Found.");
                }
            }
        }

        System.out.println("Final Pets List:");
        for (int I = 0; I < Pets.size(); I++)
        {
            Pet PetObj = Pets.get(I);
            if (PetObj instanceof Dog)
            {
                Dog DogObj = (Dog) PetObj;
                System.out.println("Dog | " + DogObj.getName() + " | " + DogObj.getWeight());
            }
            else if (PetObj instanceof Cat)
            {
                Cat CatObj = (Cat) PetObj;
                System.out.println("Cat | " + CatObj.getName() + " | " + CatObj.getCoatColor());
            }
        }
    }
}
