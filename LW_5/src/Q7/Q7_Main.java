package Q7;
import java.util.Scanner;

public class Q7_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Phrase : ");
        String phrase = scanner.nextLine();

        System.out.println("Enter Target Word : ");
        String target = scanner.nextLine();

        System.out.println("Enter Replacement Word : ");
        String replace = scanner.nextLine();

        String output = phrase.replaceAll(target,replace);
        System.out.println("Replaced Output Is ");
        System.out.println(output);
    }
}
