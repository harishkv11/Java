import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {
    public static void main(String args[]){
        JFrame frame = new JFrame();    // Creates a frame
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setTitle("GUI");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());

        frame.getContentPane().setBackground(Color.CYAN);
    }
}
