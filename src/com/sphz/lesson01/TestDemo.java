package com.sphz.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestDemo {
    public static void main(String[] args) {

        // 设置顶级窗口布局
        Frame frame = new Frame();
        frame.setBounds(200, 200, 400, 400);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 1));

        // 设置板块布局
        Panel panel1 = new Panel();
        panel1.setLayout(new BorderLayout());

        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(2, 1));

        Panel panel3 = new Panel();
        panel3.setLayout(new BorderLayout());

        Panel panel4 = new Panel();
        panel4.setLayout(new GridLayout(2, 2));

        // 添加按钮
        Button east1 = new Button("Panel-East");
        Button west1 = new Button("Panel-West");
        panel1.add(east1, BorderLayout.EAST);
        panel1.add(west1, BorderLayout.WEST);

        Button north = new Button("Panel-North");
        Button south = new Button("Panel-South");
        panel2.add(north);
        panel2.add(south);

        panel1.add(panel2, BorderLayout.CENTER);

        frame.add(panel1);

        Button east2 = new Button("Panel-East");
        Button west2 = new Button("Panel-West");
        panel3.add(east2, BorderLayout.EAST);
        panel3.add(west2, BorderLayout.WEST);

        for (int i = 1; i < 5; i++) {
            panel4.add(new Button("Button" + i));
        }

        panel3.add(panel4, BorderLayout.CENTER);

        frame.add(panel3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
