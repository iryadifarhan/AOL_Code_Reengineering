package first_case.after;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_Handler extends JFrame{
	private JLabel timeLabel;
	private JLabel dayLabel;
	private JLabel dateLabel;
	
	public GUI_Handler() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Digital Clock");
		this.setLayout(new FlowLayout());
		this.setSize(350, 220);
		this.setResizable(false);

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
	}

	public JLabel getTimeLabel() {
		return timeLabel;
	}

	public JLabel getDayLabel() {
		return dayLabel;
	}

	public JLabel getDateLabel() {
		return dateLabel;
	}
	
}
