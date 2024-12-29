package first_case.after;

import java.util.Calendar;

public class TimeManager {
	private Calendar calendar;
	private DateFormatter dateFormatter;

	public TimeManager() {
		this.calendar = Calendar.getInstance();
		this.dateFormatter = new DateFormatter();
	}
	
	public void updateCalendar() {
		this.calendar = Calendar.getInstance();
	}
	
	public String getTime() {
		return this.dateFormatter.formatTime(this.calendar.getTime());
	}
	
	public String getDay() {
		return this.dateFormatter.formatDay(this.calendar.getTime());
	}
	
	public String getDate() {
		return this.dateFormatter.formatDate(this.calendar.getTime());
	}
}
