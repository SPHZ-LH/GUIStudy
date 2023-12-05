package com.sphz.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setBounds(200, 200, 400, 400);

        // 设置流式布局
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        Button button1 = new Button("Button");
        Button button2 = new Button("Button");
        Button button3 = new Button("Button");
        Button button4 = new Button("Button");


        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
