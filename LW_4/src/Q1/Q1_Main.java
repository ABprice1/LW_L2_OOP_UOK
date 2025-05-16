package Q1;
import java.util.Scanner;

public class Q1_Main {
    public static void main(String[] args) {
        int min = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<3;i++)
        {
            System.out.println("Enter Number " + (i+1) + " : " );
            int input = scanner.nextInt();

            if(i == 0) {min = input; continue;};
            if (min > input) min = input;
        }
        System.out.println("Min Number Is " + min);
    }
}
