package cybersoft.java12.cenima_ticket.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	public static final String DATE_FORMAT = "yyyy-Mm-dd HH:mm:ss";
	public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
	
	public static LocalDateTime toDate( String date ) {
		return LocalDateTime.parse(date, formatter);
	}
	
	public static String toString (LocalDateTime date) {
		return date.format(formatter);
	}
}
