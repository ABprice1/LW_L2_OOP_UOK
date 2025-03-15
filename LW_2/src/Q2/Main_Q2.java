package Q2;

import java.util.Scanner;

public class Main_Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Centimeter value: ");
        double Centimeters = sc.nextDouble();
        double Feet = Centimeters / 30.48;
        double Inches = Centimeters / 2.54;
        System.out.println("Centimeters in Inches: " + Inches);
        System.out.println("Centimeters in Feet: " + Feet);
    }
}
