import sun.tools.jstat.JStatLogger;

import javax.swing.*;
import java.awt.*;

public class MainWard {
    static GraphicsConfiguration gc;
    public static void main(String[] args) {
        //Set up the main window frame
        JFrame frame = new JFrame(gc);
        frame.setSize(500,300);
        frame.setVisible(true);
        //This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create the JPanels and the components
        JPanel mainPanel = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel graphPanel = new JPanel();
        //JPanel closePanel = new JPanel(); //IS THIS NECESSARY?
        JPanel scrollPanel = new JPanel();
        //Add 3 text field components
        JTextField tf1 = new JTextField("BLA");
        JTextField tf2 = new JTextField("BLA");
        JTextField tf3 = new JTextField("BLA");
        //Add 4 graph field components

        //Add a scroll field component
        JScrollBar scr = new JScrollBar();
        //scr.setAlignmentX(JScrollBar.RIGHT_ALIGNMENT);

        //Add the mainPanel to the frame client area
        frame.getContentPane().add(mainPanel);

        //Add the textPanel, graphPanel, and scrollPanel to the mainPanel
        mainPanel.setLayout(new GridLayout(1,3));
        mainPanel.add(textPanel);
        mainPanel.add(graphPanel);
        mainPanel.add(scrollPanel);

        //Add the text boxes to the textPanel
        textPanel.setLayout(new GridLayout(3,1));
        textPanel.add(tf1);
        textPanel.add(tf2);
        textPanel.add(tf3);

        //Add the graphs to the graphPanel
        graphPanel.setLayout(new GridLayout(4,1));


        //Add the scroll to the scrollPanel
        scrollPanel.setLayout(new GridLayout(1,1));
        scrollPanel.add(scr);
    }
}
