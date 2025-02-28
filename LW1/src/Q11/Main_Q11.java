package Q11;

import java.util.Scanner;

public class Main_Q11 {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);
        System.out.println("Enter Your Name In Format (F M L) : ");
        String UserName = NewScanner.nextLine();

        String[] NameParts = UserName.split(" ");

        System.out.println(NameParts[2] + " " + NameParts[0] + " " + NameParts[1].charAt(0) + ".");
    }
}
