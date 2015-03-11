package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import backend.FlightBoard;

public class Play_Panel extends JPanel{

	
	
	protected FlightBoard flightboard;
	
	

	
	Play_Panel() {
		    flightboard = new FlightBoard();
	     	setLayout(new GridLayout(10, 10, 0, 0));
	        JButton button;
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                    button = new JButton();
	                    button.setName(String.valueOf(i*10+j));
	                    button.addActionListener(new ClickAction());
	                    add(button);
	            }
	        }

	        setSize(200, 200);
	        setVisible(true);
	    }
	
	private class ClickAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			JButton clicked = (JButton) e.getSource();
			clicked.setText(clicked.getName());
			
		}
	}
	


}
