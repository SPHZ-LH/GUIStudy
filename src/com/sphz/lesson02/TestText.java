package com.sphz.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame {
    public MyFrame() {
        // new 一个文本框
        TextField textField = new TextField();
        // 在窗口中添加文本框
        add(textField);

        // 将文本框内输入的内容屏蔽
        textField.setEchoChar('*');
        MyActionListenerTwo myActionListenerTwo = new MyActionListenerTwo();
        textField.addActionListener(myActionListenerTwo);

        setVisible(true);
        pack();
    }

}

class MyActionListenerTwo implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource();
        System.out.println(field.getText());
        field.setText("");
    }
}