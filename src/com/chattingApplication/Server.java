package com.chattingApplication;

import javax.swing.*;
import java.awt.*;

public class Server extends JFrame{

    Server(){

        setLayout(null); //Don't use any layout from Swing and Make of your own so null

        JPanel p1 = new JPanel(); // Panel is used what to do at upper frame
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70); // For coordinates
        add(p1);


        setSize(450, 700); // Providing Frame width and Height

        getContentPane().setBackground(Color.WHITE);


        setLocation(200, 50);
        setVisible(true); // Making frame visible

    }

    public static void main(String[] args){
        new Server();
    }
}
