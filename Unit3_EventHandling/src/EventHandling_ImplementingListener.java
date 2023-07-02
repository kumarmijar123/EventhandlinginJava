import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHandling_ImplementingListener extends JFrame implements ActionListener {
	JButton  btn;
	JButton  btn2;
	JButton  btn3;
	
	public EventHandling_ImplementingListener() {
		setTitle("Event Handling Concept frame");
		setSize(400, 400);
		btn = new JButton("Exit");
		btn.addActionListener(this);
		btn2 = new JButton("Blue");
		btn2.addActionListener(this);
		btn3 = new JButton("Green");
		btn3.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(btn);
		add(btn2);
		add(btn3);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Exit")
			System.exit(0);
		else if (e.getActionCommand() == "Blue") {
			JButton source = (JButton) e.getSource();
			source.setBackground(Color.BLUE);
		}
		else {
			JButton source = (JButton) e.getSource();
			source.setBackground(Color.GREEN);
		}
		
	}

		
		
		
		public static void main(String[] args) {
			new EventHandling_ImplementingListener();
		}
	

		
}
