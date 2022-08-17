import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class DateAndTime {
	public static void main(String[] args) {
		java.util.Date date=new java.util.Date();
		System.out.println(date);
		long millis=System.currentTimeMillis();
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
	}
}
