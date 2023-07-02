import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ConceptOfEventHandling extends JFrame {
	JButton  btn;
	
	public ConceptOfEventHandling() {
		setTitle("Event Handling Concept frame");
		setSize(400, 400);
		btn = new JButton("Exit");
		btn.addActionListener(null);
		
	    
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(btn);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ConceptOfEventHandling();

	}

}


//proceduer of event handling
//1. Register event listener to a source or component
//2. Use event handler to handle event (actionPerformed() of ActionListener
//3. Write a code ot perform the operation inside actionPerformed())
