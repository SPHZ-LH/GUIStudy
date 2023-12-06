package com.sphz.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCalc1 {
    public static void main(String[] args) {
        new Calculator();
    }
}

class Calculator extends Frame {
    public Calculator() {
        // 3个文本框
        TextField field1 = new TextField(10);
        TextField field2 = new TextField(10);
        TextField field3 = new TextField(20);


        // 1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyActionListenerThree(field1, field2, field3));


        // 1个标签
        Label label = new Label("+");


        // 布局
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(field1);
        add(label);
        add(field2);
        add(button);
        add(field3);

        // 窗口自动适应
        pack();

        // 显示窗口
        setVisible(true);
        // 关闭方法
        windowClosing(this);
    }

    // 关闭窗口
    public void windowClosing(Calculator calculator) {
        calculator.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyActionListenerThree implements ActionListener {

    TextField field1, field2, field3;

    public MyActionListenerThree(TextField field1, TextField field2, TextField field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(field1.getText());
        int num2 = Integer.parseInt(field2.getText());

        int num3 = num1 + num2;
        field3.setText("" + num3);
        field1.setText("");
        field2.setText("");
    }
}
