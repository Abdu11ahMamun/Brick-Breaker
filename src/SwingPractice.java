
import javax.swing.*;
import java.awt.*;

public class SwingPractice {
    public static void main(String[] args)  {
        JFrame obj= new JFrame();
        obj.setVisible(true);
        obj.setSize(400,400);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setBackground(Color.cyan);
        obj.add(p);


    }
}
