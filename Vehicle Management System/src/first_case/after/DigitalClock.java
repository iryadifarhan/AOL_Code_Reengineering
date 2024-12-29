package first_case.after;

/**
	Project Title: Digital Clock mini project
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Digital%20Clock
	
	Smells Fixing:
	-> Fowler
	- Bloaters: 
		Large class => fixed with extract classes (TimeManager, GUI_Handler, and TimerHandler)
		Temporary Field => fixed with extract class 'DateFormatter'
		Data Clumps => fixed with extract classes (TimeManager, GUI_Handler, and DateFormatter)
	- Change Preventers: Divergent Change => fixed with extract classes (TimeManager, GUI_Handler, and TimerHandler)
	- Dispensables: Dead Code => fixed with utilizing 'calendar' attribute from 'DigitalClock' class into 'TimeManager' class
	
	-> Girish:
	- Abstraction: 
		Missing Abstraction => fixed with extract classes (TimeManager, GUI_Handler, and DateFormatter) and encapsulate using private access modifier
		Multifaceted Abstraction => fixed with extract classes (TimeManager, GUI_Handler, and TimerHandler)
*/

public class DigitalClock {
	private TimeManager timeManager;
	private GUI_Handler guiHandler;
	private TimerHandler timerHandler;

	public DigitalClock() {
		this.timeManager = new TimeManager();
		this.guiHandler = new GUI_Handler();
		this.timerHandler = new TimerHandler();
	}
	
	public void startClock() {
		this.timerHandler.setTimer(this.timeManager, this.guiHandler);
	}
	
	public static void main(String[] args) {
		new DigitalClock().startClock();
	}
}
