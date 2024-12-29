package first_case.before;

/**
	Project Title: Digital Clock mini project
	URL: https://github.com/kishanrajput23/Java-Projects-Collections/tree/main/Digital%20Clock
	
	Smells Identification:
	-> Fowler
	- Bloaters: Large class, Temporary Field, Data Clumps,
	- Change Preventers: Divergent Change 
	- Dispensables: Dead Code
	
	-> Girish:
	- Abstraction: Missing Abstraction, Multifaceted Abstraction
*/

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

// start mark for 'Large Class', 'Divergent Change' and 'Multifaceted Abstraction' smell
public class DigitalClock extends JFrame {

	// start mark for 'Data Clumps' and 'Missing Abstraction' smell
	Calendar calendar;	// mark for 'Dead Code' smell
	
	// start mark for 'Temporary Field' smell
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	// end mark for 'Temporary Field' smell
	
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	
	String time;
	String day;
	String date;
	// end mark for 'Data Clumps' and 'Missing Abstraction' smell
	
	DigitalClock() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Digital Clock");
		this.setLayout(new FlowLayout());
		this.setSize(350, 220);
		this.setResizable(false);

		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat=new SimpleDateFormat("EEEE");
		dateFormat=new SimpleDateFormat("dd MMMMM, yyyy");
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("SANS_SERIF", Font.PLAIN, 59));
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setForeground(Color.WHITE);
		timeLabel.setOpaque(true);
		dayLabel=new JLabel();
		dayLabel.setFont(new Font("Ink Free",Font.BOLD,34));

		dateLabel=new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.BOLD,30));


		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);

		setTimer();
	}

	public void setTimer() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
	
	public static void main(String[] args) {
		new DigitalClock();
	}
}
// end mark for 'Large Class', 'Divergent Change' and 'Multifaceted Abstraction' smell
