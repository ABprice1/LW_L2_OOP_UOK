package Q10;

import java.util.Scanner;

public class Main_Q10 {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);
        String UserInput = NewScanner.next();
        int InputLength = UserInput.length();
        if (InputLength % 2 == 0) {
            System.out.println("Error : Program Only Accepts Odd Length Words!");
            return;
        }

        System.out.println(UserInput.charAt( (int)(InputLength/2)));
    }
}
