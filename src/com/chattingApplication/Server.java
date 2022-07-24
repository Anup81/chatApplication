package com.chattingApplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Server extends JFrame implements ActionListener {

    Server(){

        setLayout(null); //Don't use any layout from Swing and Make of your own so null

        JPanel p1 = new JPanel(); // Panel is used what to do at upper frame
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70); // For coordinates
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setBounds(5, 20, 25, 25);
//        p1.setLayout(null);
        p1.add(back); // To display on Panel

        back.addMouseListener((new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//                setVisible(false);
                System.exit(0);
            }
        }));

        // For Profile Picture Icon
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        back.setBounds(40, 10, 50, 50);
//        profile.setLayout(null);
        p1.add(profile);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        back.setBounds(300, 20, 30, 30);
        p1.add(video);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        back.setBounds(360, 20, 30, 30);
        p1.add(phone);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(35, 30, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(420, 20, 10, 25);
        p1.add(morevert);

//        For Name
        JLabel name = new JLabel("Ram");
        name.setBounds(110, 15, 100, 18);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);


//        For Status
        JLabel status = new JLabel("Active Now");
        status.setBounds(110, 35, 100, 18);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 14));
        p1.add(status);

        setSize(450, 700); // Providing Frame width and Height
        setLocation(200, 50);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true); // Making frame visible

    }

    public void actionPerformed(ActionEvent ae){}

    public static void main(String[] args){
        new Server();
    }
}
