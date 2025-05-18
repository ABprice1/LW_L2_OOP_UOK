package Q1;
public class Q1_Main {
    public static void main(String[] args) {
        int lineNumbers = 0;
        for(int i = 10;i<50;i++)
        {
            System.out.print( (lineNumbers % 10 == 0 ? "\n" : "") + i + " ");
            lineNumbers += 1;
        }

    }
}
