package com.sphz.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCalc3 {
    public static void main(String[] args) {
        new Calculator3();
    }
}

class Calculator3 extends Frame {
    TextField field1, field2, field3;

    public Calculator3() {
        // 3个文本框
        field1 = new TextField(10);
        field2 = new TextField(10);
        field3 = new TextField(20);


        // 1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyActionListenerThree3());


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
        windowClosing3(this);
    }


    public void windowClosing3(Calculator3 calculator) {
        calculator.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    class MyActionListenerThree3 implements ActionListener {

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

}

