package com.sphz.lesson03;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new MyWindowFrame();
    }
}

class MyWindowFrame extends frame {
    public MyWindowFrame() {
        this.setBounds(1, 2, 300, 400);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }
        });
    }
}
