package DifferentEventsPackage;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyAdapterDemo extends KeyAdapter {
	JFrame frame;
	JLabel firstlbl, secondlbl, resultlbl;
	JTextField firsttxt, secondtxt, resulttxt;
	JButton add, subtract;
	
	
	public KeyAdapterDemo() {
		frame = new JFrame();
		firstlbl = new JLabel("First Number");
		secondlbl = new JLabel("Second Number");
		resultlbl = new JLabel("Result");
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);
		resulttxt = add KeyListener
		//Jframe configuration
		frame.setTitle("Key Event Handle Frame");
		frame.setSize(200, 400);
		frame.setLayout(new GridLayout(4, 2, 5, 5));
		
		//adding components to JFrame
		frame.add(firstlbl);
		frame.add(firsttxt);
		frame.add(secondlbl);
		frame.add(secondtxt);
		frame.add(resultlbl);
		frame.add(resulttxt);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public
	

	public static void main(String[] args) {
	

	}

}
