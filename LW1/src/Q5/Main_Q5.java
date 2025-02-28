package Q5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_Q5 {
    public static void main(String[] args) {
        Date CurrentDate = new Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println(DateFormat.format(CurrentDate));
    }
}
