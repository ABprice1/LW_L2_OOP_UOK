package Q3;

import java.util.Scanner;

public class Main_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius value: ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("Fahrenheit: " + Fahrenheit);
    }
}
