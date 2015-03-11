package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test_run extends JFrame{

	public test_run() {

        initUI();
    }

    private void initUI() {
    	setLayout(new GridLayout(2,1));
    	JPanel upper_panel = new JPanel();
    	add(upper_panel);
    	
    	JPanel lower_panel = new JPanel();
    	add(lower_panel);
    	
    	
    	upper_panel.setLayout(new GridLayout(1,3));
        Play_Panel test_panel1 = new Play_Panel();
        upper_panel.add(test_panel1);
    	JLabel blank = new JLabel();
    	upper_panel.add(blank);
        Play_Panel test_panel2 = new Play_Panel();
        upper_panel.add(test_panel2);
    	
    	
        
        
        setTitle("Simple example");
        setSize(500, 600);
        setLocationRelativeTo(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
        
            @Override
            public void run() {
            	test_run ex = new test_run();
                ex.setVisible(true);
            }
        });
    }
	
}
