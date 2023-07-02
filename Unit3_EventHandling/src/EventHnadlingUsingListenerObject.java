import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventHnadlingUsingListenerObject extends JFrame {
		JButton btn,btn2,btn3;
		ActionListener listener;
		
		public EventHnadlingUsingListenerObject() {
			setTitle ("Event Handeling Concept Frame");
			setSize (400,400);
			listener = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getActionCommand()=="Exit")
						System.exit(ABORT);
					else if (e.getActionCommand()=="Blue") {
						JButton source = (JButton) e.getSource();
						source.setBackground(Color.blue);
					}
					else {
						JButton source = (JButton) e.getSource();
						source.setBackground(Color.green);
					}

				}
			};
			
			btn = new JButton("Exit");
			btn.addActionListener(listener);
			btn2 = new JButton("Blue");
			btn2.addActionListener(listener);
			btn3 = new JButton("Green");
			btn3.addActionListener(listener);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			add(btn);
			add(btn2);
			add(btn3);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
	

	public static void main(String[] args) {
		new EventHnadlingUsingListenerObject();

	}

}