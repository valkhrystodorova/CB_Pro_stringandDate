package additionaltask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

public class NumberOfDate {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("ddMMyyyy");

        Date date = null;
        try {
            date = dateFormat.parse("18101995");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String strdate = dateFormat.format(date);
        System.out.println(strdate);
        int sum = 0;
        for (int i = 0; i < strdate.length(); i++) {
           sum  = sum + Character.getNumericValue(strdate.charAt(i));
        }

        System.out.println(sum);

    }
}
