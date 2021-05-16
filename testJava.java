import java.util.*;
import java.text.*;

public class testJava {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formattedDateString = sdf.format(currentDate);
        Calendar cal = Calendar.getInstance();
        System.out.printf("%d/%02d/%02d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DATE));
        System.out.println(formattedDateString);
        System.out.printf("%tY/%<tm/%<te", currentDate); 
    }
}
