import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;

public class AddTimeDate {
public static void main(String[] args) {
	LocalDate date=LocalDate.of(2022,Month.FEBRUARY,22);
	LocalDateTime time=date.atTime(12,38);
	System.out.println(time);
}
}
