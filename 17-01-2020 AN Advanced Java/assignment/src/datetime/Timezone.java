package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
public class Timezone {
    
    public static void main(String[] args) throws ParseException
    {
    	LocalDateTime myTime = LocalDateTime.parse("1998-11-06T08:56:59");
	      System.out.println("Current Time" + myTime);
	      LocalDateTime parentTime=LocalDateTime.parse("1995-10-07T09:30:27");
	      System.out.println("Parent DateTime: " + parentTime);

	      Instant start=Instant.parse("1998-11-06T08:56:59.000Z");
	      Instant end=Instant.parse("1995-10-07T09:30:27.000Z");
	      Duration d=Duration.between(end, start);
	      System.out.println(d.toNanos());
	      ZonedDateTime z1=ZonedDateTime.parse("1992-11-06T08:56:59+05:30");
	      System.out.println(z1);
	      ZonedDateTime z2=ZonedDateTime.parse("1995-10-07T09:30:27-15:30");
	      System.out.println(z2);
	      ChronoUnit c=ChronoUnit.DAYS;
	      System.out.println(c.between(z2, z1));
    }

}
