package Q10;

import java.util.Scanner;

public class Main_Q10 {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Loan Amount: ");
        double loanAmount = sc.nextDouble();
        System.out.println("Enter The Annual Interest Rate: ");
        double annualInterestRate = sc.nextDouble();
        System.out.println("Enter The Loan Period: ");
        double loanPeriod = sc.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100.0/ MONTHS_IN_YEAR;
        double numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 -
                Math.pow(1/(1 + monthlyInterestRate),numberOfPayments));
        double totalPayments = monthlyPayment * numberOfPayments;

        System.out.println("Monthly payment is: " + monthlyPayment);
        System.out.println("Total Payments: " + totalPayments);
    }
}
