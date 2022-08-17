import java.sql.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class Timezone {
	public static void main(String[] args) throws Exception {
		java.util.Date date=new java.util.Date();
		System.out.println("China :"+DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA).format(new java.util.Date()));
		System.out.println("US    :"+DateFormat.getDateInstance(DateFormat.LONG,Locale.US).format(new java.util.Date()));
		System.out.println("UK    :"+DateFormat.getDateInstance(DateFormat.LONG,Locale.UK).format(new java.util.Date()));
	}
}
