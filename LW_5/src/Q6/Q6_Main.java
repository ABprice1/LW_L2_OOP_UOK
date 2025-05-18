package Q6;

import java.util.Random;
import java.util.Scanner;

public class Q6_Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userGuess = -1;
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        while(true)
        {
            System.out.println("Enter Your Guess : ");
            userGuess = scanner.nextInt();
            if(userGuess == randomNumber)
                break;
            System.out.println("Wrong.. Correct One Is " + ((userGuess < randomNumber) ? "Higher!" : "Lower!"));
        }
        System.out.println("Correct " + randomNumber + " Is The Correct Number!");
    }
}
