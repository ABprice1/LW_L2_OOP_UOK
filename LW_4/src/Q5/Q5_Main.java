package Q5;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Q5_Main {
    static void DisplayMenu(String menuName,LinkedHashMap<String, Float> list)
    {
        System.out.println("-------[" + menuName + "]-------");
        list.forEach((itemName,price) -> {
            System.out.println(itemName + "    $" + price);
        });
        System.out.println("--------------------------------");
    }

    public static void main(String[] args)
    {
        LinkedHashMap<String,Float> EntreeList = new LinkedHashMap<>();
        EntreeList.put("Tofu Burger", 3.49f);
        EntreeList.put("Cajun Chicken", 4.59f);
        EntreeList.put("Buffalo Wings", 3.99f);
        EntreeList.put("Rainbow Fillet", 2.99f);

        LinkedHashMap<String,Float> SideDishList = new LinkedHashMap<>();
        SideDishList.put("Rice Cracker", 0.79f);
        SideDishList.put("No-Salt Fries", 0.69f);
        SideDishList.put("Zucchini", 1.09f);
        SideDishList.put("Brown Rice", 0.59f);

        LinkedHashMap<String,Float> DrinkList = new LinkedHashMap<>();
        DrinkList.put("Cafe Mocha", 1.99f);
        DrinkList.put("Cafe Latte", 1.90f);
        DrinkList.put("Espresso", 2.49f);
        DrinkList.put("Oolong Tea ", 0.99f);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Section ");
        System.out.println("1) Entrees");
        System.out.println("2) Side Dishes");
        System.out.println("3) Drinks");

        int selection = scanner.nextInt();
        switch (selection)
        {
            case 1:
                DisplayMenu("Entrees",EntreeList);
                break;
            case 2:
                DisplayMenu("Side Dishes",SideDishList);
                break;
            case 3:
                DisplayMenu("Drinks",DrinkList);
                break;
            default:
                System.out.println("Invalid Selection!");
                break;
        }

    }
}
