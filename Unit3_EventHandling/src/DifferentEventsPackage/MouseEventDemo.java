package DifferentEventsPackage;


import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventDemo extends JFrame {
	JLabel label;
	
	public MouseEventDemo() {
		setTitle("MouseEvent Frame");
		setSize(400, 400);
		label = new JLabel();
		add(label, BorderLayout.NORTH);
	    addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = getY();
				label.setText("Pressed at:"+x +", " + y);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = getY();
				label.setText("Clicked at:"+x +", " + y);
				
			}
		});
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	 
	}

	public static void main(String[] args) {
		new MouseEventDemo();

	}

}
