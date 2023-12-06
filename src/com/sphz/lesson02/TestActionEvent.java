package com.sphz.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button();

        MyActionListenerTwo myActionListener = new MyActionListenerTwo();
        button.addActionListener(myActionListener);

        // 添加按钮在中间
        frame.add(button, BorderLayout.CENTER);
        // 窗口自动适应
        frame.pack();
        // 窗口显示
        frame.setVisible(true);

    }

    // 关闭窗口方法
    private static void windowClosing(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}
