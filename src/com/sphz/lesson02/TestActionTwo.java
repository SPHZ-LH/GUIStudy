package com.sphz.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionTwo {
    public static void main(String[] args) {
        // 两个按钮，实现同一个监听
        // 开始   停止
        Frame frame = new Frame();
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        button2.setActionCommand("mag");

        MyEvent myEvent = new MyEvent();
        button1.addActionListener(myEvent);
        button2.addActionListener(myEvent);
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);

        frame.setVisible(true);
        frame.pack();

    }
}

class MyEvent implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

}
