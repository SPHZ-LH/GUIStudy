package com.sphz.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setBounds(200, 200, 400, 400);

        // 设置东西南北中布局
        frame.setLayout(new BorderLayout());

        // 北
        Button button1 = new Button("North");
        // 南
        Button button2 = new Button("South");
        // 东
        Button button3 = new Button("East");
        // 西
        Button button4 = new Button("West");
        // 中
        Button button5 = new Button("Center");

        frame.add(button1, "North");
        frame.add(button2, "South");
        frame.add(button3, "East");
        frame.add(button4, "West");
        frame.add(button5, "Center");

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
