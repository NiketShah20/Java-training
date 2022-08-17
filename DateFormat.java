import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
		DateTimeFormatter dif=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime local=LocalDateTime.now();
		System.out.println("dd/mm/yy  :"+dif.format(local));
		DateTimeFormatter dif2=DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDateTime local2=LocalDateTime.now();
		System.out.println("mm/dd/yy  :"+dif2.format(local2));
		DateTimeFormatter dif3=DateTimeFormatter.ofPattern("E dd/MM/yyyy");
		LocalDateTime local3=LocalDateTime.now();
		System.out.println("Date formating with day:"+dif3.format(local3));
		DateTimeFormatter dif4=DateTimeFormatter.ofPattern("E dd/MMM/yyyy");
		LocalDateTime local4=LocalDateTime.now();
		System.out.println(dif4.format(local4));
		
	}
}
