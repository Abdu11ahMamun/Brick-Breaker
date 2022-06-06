package brickBreaker;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String user_name= JOptionPane.showInputDialog(null,"Enter your name: ","Break ball",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,user_name+" Welcome to Break ball game","Break ball",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"This game is made by Mamun & Syeed","Break ball",JOptionPane.PLAIN_MESSAGE);
        JFrame obj = new JFrame();
        Gameplay gamePlay = new Gameplay();
        //obj.setBounds(10,10,700,600);
        obj.setSize(700,600);
        obj.setLocationRelativeTo(null);
        obj.setTitle("Break ball");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);

    }
}
