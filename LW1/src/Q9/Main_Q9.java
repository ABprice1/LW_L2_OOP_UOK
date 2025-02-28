package Q9;

import java.util.Scanner;

public class Main_Q9 {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);
        System.out.println("Enter Phrase : ");
        String UserInput = NewScanner.nextLine();

        int InputLength = UserInput.length();
        System.out.println(InputLength);
        System.out.println(UserInput.charAt(0));
        System.out.println(UserInput.charAt(InputLength-1));
    }
}
