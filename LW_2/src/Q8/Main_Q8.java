package Q8;

import java.util.Scanner;

public class Main_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        double Radius = sc.nextDouble();
        double Volume = (4/3) * (Math.PI * Math.pow(Radius, 3));
        System.out.println("Volume is: " + Volume);
    }
}
