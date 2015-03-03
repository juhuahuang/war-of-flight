package GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;


import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class play_panel extends JFrame implements ActionListener {


	private JPanel centerPanel;
    private JButton button;
    private JLabel label;
    private Image image;
    int[][] pos;
    int width, height;

    public play_panel() {

        initUI();
    }

    public final void initUI() {

        pos = new int[][]{
                    {0, 1, 2},
                    {3, 4, 5},
                    {6, 7, 8},
                    {9, 10, 11}
                };


        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(10, 10, 0, 0));


        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                    button = new JButton();
                    button.addActionListener(this);
                    centerPanel.add(button);
            }
        }

        setSize(325, 275);
        setTitle("Puzzle");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                play_panel panel = new play_panel();
                panel.setVisible(true);
            }
        });
    }
}