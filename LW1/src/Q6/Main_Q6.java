package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Main_Q6 {
    public static void main(String[] args) {
        int Width;
        int Height;
        String Title;

        Scanner NewScanner = new Scanner(System.in);

        System.out.println("Enter Width : ");
        Width = NewScanner.nextInt();

        System.out.println("Enter Height : ");
        Height = NewScanner.nextInt();

        NewScanner.nextLine();

        System.out.println("Enter Title : ");
        Title = NewScanner.nextLine();

        JFrame NewWindow = new JFrame();
        NewWindow.setSize(Width,Height);
        NewWindow.setTitle(Title);
        NewWindow.setVisible(true);
    }
}
