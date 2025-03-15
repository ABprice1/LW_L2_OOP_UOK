package Q7;

import java.util.Scanner;

public class Main_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weight in kilograms: ");
        double Weight = sc.nextDouble();
        System.out.println("Enter Your Height in centimeters: ");
        double Height = sc.nextDouble();
        double BMI = Weight / Math.pow(Height/100.0, 2);
        System.out.println("Your BMI is: " + BMI);
    }
}
