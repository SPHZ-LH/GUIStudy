package com.sphz.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCalc2 {
    public static void main(String[] args) {
        new Calculator2();
    }
}

class Calculator2 extends Frame {
    TextField field1, field2, field3;

    public Calculator2() {
        // 3个文本框
        field1 = new TextField(10);
        field2 = new TextField(10);
        field3 = new TextField(20);


        // 1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyActionListenerThree2(this));


        // 1个标签
        Label label = new Label("+");


        // 布局
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(field1);
        add(label);
        add(field2);
        add(button);
        add(field3);
        pack();

        setVisible(true);
        windowClosing2(this);
    }

    public void windowClosing2(Calculator2 calculator) {
        calculator.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}

class MyActionListenerThree2 implements ActionListener {

    private Calculator2 calculator2 = null;

    public MyActionListenerThree2(Calculator2 calculator2) {
        this.calculator2 = calculator2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(calculator2.field1.getText());
        int num2 = Integer.parseInt(calculator2.field2.getText());

        calculator2.field3.setText("" + (num1 + num2));
        calculator2.field1.setText("");
        calculator2.field2.setText("");
    }
}
