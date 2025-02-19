package com.scoutingdataconverter;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
public class CustomFrame implements ActionListener {
    private javax.swing.JFrame frame;
    private JPanel panel;
    public CustomFrame(){
        JButton button = new JButton("Scan");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setPreferredSize(new Dimension(200,  100));
        frame = new javax.swing.JFrame();
        panel = new JPanel();
        
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new java.awt.Dimension(300,300));
        panel.add(button);

        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Scouting Data Converter");
        frame.pack();
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked");
    }
}
