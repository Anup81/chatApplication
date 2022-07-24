package com.chattingApplication;

import javax.swing.*;

public class Server extends JFrame{

    Server(){
        setSize(450, 700); // Providing Frame width and Height
        setVisible(true); // Making frame visible
        setLocation(200, 50);

    }

    public static void main(String[] args){
        new Server();
    }
}
