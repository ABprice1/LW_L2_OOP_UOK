package Q4;
import java.util.Scanner;

public class Q4_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Target Year : ");
        int year = scanner.nextInt();
        boolean IsLeapYear = false;

        IsLeapYear = ((year % 4 == 0) && (year % 100 != 0  || year % 400 == 0));
        System.out.println(IsLeapYear ? "Leap Year": "Not a Leap Year");
    }
}
