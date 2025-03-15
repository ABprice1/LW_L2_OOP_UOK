package Q9;
import java.util.Scanner;
import java.lang.Math;

public class Main_Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dollar Value : ");
        double DollarValue = sc.nextDouble();
        System.out.println("Enter Interest Rate Percent : ");
        double InterestRatePercent = sc.nextDouble();
        System.out.println("Enter Years : ");
        int Years = sc.nextInt();
        double MoneyEarned = DollarValue * Math.pow(1 + (InterestRatePercent / 100), Years);
        System.out.println("Your Money earned is: " + MoneyEarned);
    }
}
