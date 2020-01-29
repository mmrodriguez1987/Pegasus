
package JRodriguez.JDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateOperation {
    
    public static String GetDateFormatString() {   
        return (Calendar.MONTH + "/" + Calendar.DAY_OF_MONTH + "/" + Calendar.YEAR);
    }
    
    public static String GetDateFull() {     
        return new SimpleDateFormat("MM/dd/yyyy").format(new Date());         
    }
    
    public static String GetHour(){
        return new SimpleDateFormat("hh:mm:ss").format(new Date());     
    }
    
    public static String GetDateLog() {
         return new SimpleDateFormat("MMddyyyy__hhmmss").format(new Date());         
    }
}
