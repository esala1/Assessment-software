import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.* ;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

class how  extends JFrame{
    how (int time) {
        setSize(400,400);
        setLocationRelativeTo(null);
        setResizable(false);
        JPanel pan = new JPanel () ;
        pan.setSize(this.getSize().width,this.getSize().height);
        pan.setBackground(Color.DARK_GRAY);
        pan.setLayout(null);
        setContentPane(pan);
        JLabel howLabel = new JLabel("<html><center>You have "+ time/60+" min "+time%60 +" s to answer 4 questions."
                + " And you can use tools such as 50:50 to remove two options, "
                + "or the hint to give you a little clue about the answer.</center></html>");
        howLabel.setFont(new Font("Verdana", Font.BOLD, 15));
        howLabel.setBounds(8,5,350,150);
        howLabel.setForeground(Color.white);
        JLabel border = new JLabel() ;
        border.setBorder(new LineBorder(Color.white, 2, true));
        border.setBounds(10,5,365,350);
        JLabel img = new JLabel(new ImageIcon(getClass().getResource("how it works.jpg")));
        img.setBounds(8,160,350,150);
        border.add(howLabel);
        border.add(img);
        pan.add(border);
        setVisible(true);
    }
}