import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class labels {
    public static void main(String args[]){
        ImageIcon logo = new ImageIcon("image.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        JLabel label = new JLabel();
        label.setText("Do you code?"); //set text of label
        label.setIcon(logo);
        label.setHorizontalTextPosition(JLabel.CENTER); 
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("Times New Roman",Font.PLAIN,20));
        label.setIconTextGap(-45);
        label.setOpaque(true);
        label.setBackground(Color.BLACK);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,250,250);

        JFrame frame = new JFrame();
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(label);
        // frame.pack();
    }
}
