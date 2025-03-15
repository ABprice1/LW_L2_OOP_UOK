package Q6;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GregorianCalendar Calendar = new GregorianCalendar();
        System.out.println("Enter Born Year : ");
        int BornYear = sc.nextInt();
        int Age = Calendar.get(Calendar.YEAR) - BornYear;
        System.out.println("Your Age is: " + Age);
    }
}
