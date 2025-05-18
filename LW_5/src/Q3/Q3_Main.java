package Q3;
import java.util.Scanner;

public class Q3_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = scanner.nextInt();
        for(int row = 0; row < 10; row++)
            System.out.println(row == 0 ? "Multiplication Table Of "+ number : "(x"+row + ") " + (number * row));
    }
}
