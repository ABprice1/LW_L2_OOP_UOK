package Q1;
import java.lang.Math;//Didn't need to incude this but included anyway.

public class Main_Q1 {
    public static void main(String[] args) {
        //a.
        double A = 2,B = 23,C = 2.5;
        double AnswerA = Math.pow(B,2) + ( 4 * A * C);
        System.out.println("Answer1 = " + AnswerA);

        //b.
        double X = 2,Y = 5;
        double AnswerB = X + (4 * Math.pow(Y,3));
        System.out.println("Answer2 = " + AnswerB);

        //c.
        double AnswerC = Math.cbrt(X * Y);
        System.out.println("Answer3 = " + AnswerC);

        //d.
        double Radius = 2;
        double AnswerD = Math.PI * Math.pow(Radius,2);
        System.out.println("AnswerD = " + AnswerD);
    }
}
