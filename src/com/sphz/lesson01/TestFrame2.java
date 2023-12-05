package com.sphz.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame2 {
    public static void main(String[] args) {
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.magenta);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.green);
    }
}

class MyFrame extends Frame {
    static int id = 0;

    public MyFrame(int x, int y, int w, int h, Color color) {
        super("MyFrame" + (++id));
        setVisible(true);
        setSize(w, h);
        setBackground(color);
        setLocation(x, y);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
