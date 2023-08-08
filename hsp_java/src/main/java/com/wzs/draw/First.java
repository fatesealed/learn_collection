package com.wzs.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author FateSealed
 * @date 2023/06/29 16:05
 **/
public class First extends JFrame{

    public First() {
        MyPanel mp = new MyPanel();
        this.add(mp);
        this.setSize(1000,1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        final First first = new First();
    }
}

class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.CYAN);
        g.fillRect(20,20,20,100);
        g.fillRect(80,20,20,100);
        g.fillRect(40,40,40,60);
        g.setColor(Color.MAGENTA);
        g.fillOval(45,55,20,20);
    }
}