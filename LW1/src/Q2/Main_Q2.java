package Q2;

import javax.swing.*;
import java.util.Scanner;

public class Main_Q2 {
    public static void main(String[] args) {
        Scanner NewScanner = new Scanner(System.in);

        System.out.println("Enter First Name : ");
        String FirstName = NewScanner.nextLine();

        System.out.println("Enter Last Name : ");
        String LastName = NewScanner.nextLine();

        JFrame NewWindow = new JFrame();
        NewWindow.setTitle(FirstName + " " + LastName);
        NewWindow.setSize(200,200);
        NewWindow.setVisible(true);
    }
}
