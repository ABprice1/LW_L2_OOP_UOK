package Q5;
import java.util.Scanner;

public class Q5_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Phrase : ");
        char[] phrase = scanner.nextLine().toCharArray();
        boolean isPalindrome = true;
        for(int front = 0,back = phrase.length - 1; front < phrase.length; front++,back--)
        {
            if(phrase[front] != phrase[back])
            {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Word Is " + (isPalindrome ? "" : "NOT ") + "Palindrome!");
    }
}
