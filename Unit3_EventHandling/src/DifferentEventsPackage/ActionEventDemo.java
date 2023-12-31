package DifferentEventsPackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventDemo extends JFrame implements ActionListener{
	JLabel firstlbl, secondlbl, resultlbl;
	JTextField firsttxt, secondtxt, resulttxt;
	JButton add, subtract;
	
	public ActionEventDemo() {
		firstlbl = new JLabel("First Number");
		secondlbl = new JLabel("Second Number");
		resultlbl = new JLabel("Result");
		firsttxt = new JTextField(20);
		secondtxt = new JTextField(20);
		resulttxt = new JTextField(20);
		add = new JButton("Addition");	
		add.addActionListener(this);//this is a reference of current class
		subtract = new JButton("Subtraction");
		
		//Jframe configuration
		setTitle("Action Event Handle Frame");
		setSize(200, 400);
		setLayout(new GridLayout(4, 2, 5, 5));
		
		//adding components to JFrame
		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(resultlbl);
		add(resulttxt);
		add(subtract);
		add(add);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) {
		int first = Integer.parseInt(firsttxt.getText());
		int second = Integer.parseInt(secondtxt.getText());
		int result = 0;
	    if(e.getActionCommand() == "Addition") {
	    	result = first + second;
	    }
	    else {
	    	result = first - second;
	    	
	    }
	    resulttxt.setText(String.valueOf(result));
		
	}

	public static void main(String[] args) {
		new ActionEventDemo();

	}

	
		
	

}
