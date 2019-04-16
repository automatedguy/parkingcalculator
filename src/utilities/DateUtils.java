package utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    public String generateDate(int additionalDays){

        DateFormat dateFormat = new SimpleDateFormat("MMMMM-dd");

        Date currentDate =  new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);

        calendar.add(Calendar.DATE, additionalDays);

        Date selectedDate = calendar.getTime();

        return dateFormat.format(selectedDate);
    }
}
