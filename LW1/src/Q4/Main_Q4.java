package Q4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main_Q4 {
    public static void main(String[] args) {
        Date CurrentDate = new Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(DateFormat.format(CurrentDate));
    }
}
