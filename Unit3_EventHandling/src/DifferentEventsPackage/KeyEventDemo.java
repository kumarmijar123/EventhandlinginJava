package DifferentEventsPackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class KeyEventDemo extends JFrame implements KeyListener{
	JLabel firstlbl, secondlbl, resultlbl;
	JTextField firsttxt, secondtxt, resulttxt;
	
	
	public KeyEventDemo() {
		firstlbl = new JLabel("First Number");
		secondlbl = new JLabel("Second Number");
		resultlbl = new JLabel("Result");
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);
		resulttxt = addKeyListener(this);
		//Jframe configuration
		setTitle("Key Event Handle Frame");
		setSize(200, 400);
		setLayout(new GridLayout(4, 2, 5, 5));
		
		//adding components to JFrame
		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(resultlbl);
		add(resulttxt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	

	@Override
	public void keyPressed(KeyEvent e) {//long press
		int first = Integer.parseInt(firsttxt.getText());
		int second = Integer.parseInt(secondtxt.getText());
		int result = 0;
		if(e.getKeyChar()=='a') {
			result = first+second;
		}
		else if(e.getKeyChar()=='s') {
		    result = first-second;
		}
		else if(e.getKeyChar()=='r') {
			result=first%second;
		}
		else {
			JOptionPane.showMessageDialog(this,  "No operations selected");
		}
		resulttxt.setText(String.valueOf(result)); //convert int to string
	}
		
    @Override
	public void keyTyped(KeyEvent e) {
		resultlbl.setText("Key is typed");
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		resultlbl.setText("Key is Released");
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new KeyEventDemo();
   
	}
}
