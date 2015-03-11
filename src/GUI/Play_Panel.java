package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import backend.FlightBoard;

public class Play_Panel extends JPanel implements ActionListener{

	
	
	protected FlightBoard flightboard;
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	 public final void draw_panel() {



	     	JPanel centerPanel = new JPanel();
	        centerPanel.setLayout(new GridLayout(10, 10, 0, 0));


	        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);
	        add(centerPanel, BorderLayout.CENTER);

	        JButton button;
	        for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                    button = new JButton();
	                    button.addActionListener(this);
	                    centerPanel.add(button);
	            }
	        }

	        setSize(325, 275);
	        setResizable(false);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    }


}
