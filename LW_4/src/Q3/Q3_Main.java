package Q3;
import java.util.*;

public class Q3_Main {
    public static void main(String[] args) {

        HashMap<Integer,String> info = new HashMap<>();
        info.put(6,"Million");
        info.put(9,"Billion");
        info.put(12,"Trillion");
        info.put(15,"Quadrillion");
        info.put(18,"Quintillion");
        info.put(21,"Sextillion");
        info.put(30,"Nonillion");
        info.put(100,"Googol");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Power : ");
        int inputPower = scanner.nextInt();
        String message = "";
        if(info.containsKey(inputPower))
            message = info.get(inputPower);
        else
            message = "No Common Word For 10^" + inputPower;

        System.out.println(message);
    }
}
