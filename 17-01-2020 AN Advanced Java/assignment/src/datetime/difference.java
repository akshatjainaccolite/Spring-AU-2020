package datetime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
public class difference {
	
	public static int calc(Date firstDate, Date secondDate,TimeUnit t) {
		long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = t.convert(diffInMillies, TimeUnit.NANOSECONDS);
	    System.out.println("First Date :"+firstDate);
	    System.out.println("Second Date :"+secondDate);
		
		return (int) diff;
		
	}
	public static void main(String args[]) throws ParseException {
	Scanner scan=new Scanner(System.in);
	
	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	String date1=scan.next();
	String date2=scan.next();
    Date firstDate = sdf1.parse(date1);
    Date secondDate = sdf2.parse(date2);
    
    
    System.out.println("difference is:  "+calc(firstDate,secondDate,TimeUnit.NANOSECONDS));
}
}
