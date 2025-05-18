package Q4;

import java.util.Scanner;

public class Q4_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int inputRows = scanner.nextInt();
        int Gaps =  (inputRows - (inputRows % 2 == 0 ? 2 : 1));
        while (Gaps != 0 - 2)
        {
            System.out.println(
                    new String(new  char[Gaps/2]).replace("\0"," ")+
                            " " + new String(new  char[(inputRows - Gaps)]).replace("\0","*")  + " " +
                            new String(new  char[Gaps/2]).replace("\0"," ")
            );
            Gaps -= 2;
        }
    }
}
