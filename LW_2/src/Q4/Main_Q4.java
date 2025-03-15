package Q4;

import java.util.Scanner;

public class Main_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Weight In Pounds: ");
        double Weight = sc.nextDouble();
        double Calories = Weight * 19;
        sc.close();
        System.out.println("Calories Need : " + Calories);
    }
}
