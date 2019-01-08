import java.text.*;
import java.util.Calendar;

public class DateOfWeek{

    public String[] dateOfWeek(Calendar c){
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String[] storeDate = new String[2];
        storeDate[0] = df.format(c.getTime());
        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        storeDate[1]= df.format(c.getTime());
        return storeDate;
    }

}