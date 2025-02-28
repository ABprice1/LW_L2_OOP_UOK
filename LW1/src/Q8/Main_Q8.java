package Q8;

import java.util.Scanner;

public class Main_Q8 {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);
        System.out.println("Enter Phrase : ");
        String UserInput = NewScanner.nextLine();
        String[] Parts = UserInput.split("!");
        System.out.println(Parts[0]);
        System.out.println(Parts[1]);
    }
}
