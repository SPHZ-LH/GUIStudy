package com.sphz.lesson01;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {

        Frame frame = new Frame("我的第一个Java图像界面窗口");

        // 需要设置可视化  w  h
        frame.setVisible(true);

        // 设置窗口大小
        frame.setSize(400, 400);

        // 设置背景颜色  color
        frame.setBackground(new Color(96, 96, 165));

        // 弹出的初始位置
        frame.setLocation(200, 200);

        // 固定窗口的大小
        frame.setResizable(false);
    }
}
