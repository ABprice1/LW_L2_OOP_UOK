package Q3;
import java.util.Scanner;

public class Main_Q3 {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);

        System.out.println("Enter First Name : ");
        String FirstName = NewScanner.nextLine();

        System.out.println("Enter Middle Name : ");
        String MiddleName = NewScanner.nextLine();

        System.out.println("Enter Last Name : ");
        String LastName = NewScanner.nextLine();

        System.out.println(FirstName + " " + MiddleName.charAt(0) + ". " + LastName );
    }
}
