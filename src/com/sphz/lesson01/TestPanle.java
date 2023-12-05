package com.sphz.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanle {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        // 设置窗口页面布局
        frame.setLayout(null);

        // 可视化设置
        frame.setVisible(true);

        // 设置窗口的位置和大小
        frame.setBounds(200, 200, 400, 400);

        // 设置背景颜色
        frame.setBackground(new Color(108, 163, 63));

        // 设置空间的位置和大小
        panel.setBounds(50, 50, 300, 300);

        // 设置空间的颜色
        panel.setBackground(new Color(255, 238, 40, 255));

        frame.add(panel);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
