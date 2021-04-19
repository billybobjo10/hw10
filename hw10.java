package hw10;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


import javax.swing.*;


public class hw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("My First GUI");
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setSize(300,300);
	       JButton button = new JButton("Press");
	       frame.getContentPane().add(button); // Adds Button to content pane of frame
	       frame.setVisible(true);
		
		
		JFrame f = new JFrame("A JFrame");
	    f.setSize(250, 250);
	    f.setLocation(300,200);
	    final JTextArea textArea = new JTextArea(10, 40);
	    f.getContentPane().add(BorderLayout.CENTER, textArea);
	    final JButton button = new JButton("Click Me");
	    f.getContentPane().add(BorderLayout.SOUTH, button);
	    button.addActionListener(new ActionListener() {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            textArea.append("Button was clicked\n");

	        }
	    });

	    f.setVisible(true);

	  }
		

	}

}
