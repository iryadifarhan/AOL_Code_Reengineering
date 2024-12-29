package first_case.after;

public class TimerHandler {
	public void setTimer(TimeManager timeManager, GUI_Handler guiHandler) {
		while (true) {
			timeManager.updateCalendar();
			
			guiHandler.getTimeLabel().setText(timeManager.getTime());
			guiHandler.getDayLabel().setText(timeManager.getDay());
			guiHandler.getDateLabel().setText(timeManager.getDate());

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}
}
