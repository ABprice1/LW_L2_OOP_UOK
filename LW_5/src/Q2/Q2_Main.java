package Q2;
import java.util.Scanner;

public class Q2_Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Enter Number : ");
            int inputNumber = scanner.nextInt();
            if(inputNumber < 0)
                break;

            String numberString = Integer.toString(inputNumber);
            System.out.println("Number Length Is : "+ numberString.length());
        }
    }
}
