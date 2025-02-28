package Q7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_Q7 {
    public static void main(String[] args) {
        Date CurrentDate = new Date();
        SimpleDateFormat DateFormat = new  SimpleDateFormat("hh:mm:ss a");
        System.out.println(DateFormat.format(CurrentDate));
    }
}
