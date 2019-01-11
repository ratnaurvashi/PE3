package com.stackroute.pe3main;
import java.text.*;
import java.util.Calendar;

public class DateOfWeek{
    public String[] dateOfWeek(Calendar c){
        //providing date format
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String[] storeDate = new String[2];
        //storing first date of week
        storeDate[0] = df.format(c.getTime());
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        //storing last date of week
        storeDate[1]= df.format(c.getTime());
        return storeDate;
    }

}