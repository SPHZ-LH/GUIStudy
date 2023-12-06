package com.sphz.lesson03;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new frame().matted();
    }
}

class frame extends Frame {
    public void matted() {
        setBounds(200, 200, 600, 500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(100, 100, 100, 100);
    }
}
