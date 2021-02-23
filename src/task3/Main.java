package task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date birthdaydate = null;
        try {
            birthdaydate = dateFormat.parse("18-10-1995");
        } catch (ParseException e) {
            e.getMessage();
        }

        long todaytime = today.getTime();
        long bTime = birthdaydate.getTime();
        long age = todaytime - bTime;

        Calendar nowCalendar = Calendar.getInstance();
        nowCalendar.setTimeInMillis(todaytime);

        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTimeInMillis(birthdaydate.toInstant().toEpochMilli());

        System.out.println();
        System.out.println();

        long birhtDayMonth = birthCalendar.get(Calendar.MONTH);
        long nowMonth = nowCalendar.get(Calendar.MONTH);
        long birthdayDay = birthCalendar.get(Calendar.DAY_OF_MONTH);
        long nowDay = nowCalendar.get(Calendar.DAY_OF_MONTH);

        Month mymonth = Month.OCTOBER;
        int monthLength = mymonth.length(false);
        System.out.println(monthLength);

        long years = nowCalendar.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR);
        long yearsLived = ((nowMonth < birhtDayMonth) || (nowMonth == birhtDayMonth && nowDay < birthdayDay)) ? years - 1 : years;
        long month = nowMonth < birhtDayMonth ? nowMonth + (12 - birhtDayMonth) : nowMonth - birhtDayMonth;
        long days = nowDay < birthdayDay ? nowDay + (monthLength - birthdayDay) : nowDay - birthdayDay;
        System.out.println(yearsLived);
        System.out.println(month);
        System.out.println(days);

    }


//        long monthLived = nowMonth < birhtDayMonth
//                ? (years - 1) * 12 + nowMonth
//                : years * 12 + (nowMonth - birhtDayMonth);

}

