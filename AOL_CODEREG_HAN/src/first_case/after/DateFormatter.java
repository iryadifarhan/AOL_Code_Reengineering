package first_case.after;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	private SimpleDateFormat timeFormat;
	private SimpleDateFormat dayFormat;
	private SimpleDateFormat dateFormat;
	
	public DateFormatter() {
		this.timeFormat = new SimpleDateFormat("hh:mm:ss a");
		this.dayFormat= new SimpleDateFormat("EEEE");
		this.dateFormat= new SimpleDateFormat("dd MMMMM, yyyy");
	}
	
	public String formatTime(Date time) {
		return this.timeFormat.format(time);
	}
	
	public String formatDay(Date day) {
		return this.dayFormat.format(day);
	}
	
	public String formatDate(Date date) {
		return this.dateFormat.format(date);
	}
}
