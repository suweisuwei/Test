package ch13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventTest extends JFrame {
    public FocusEventTest(){
        setLayout(null);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setBounds(200,200,300,300);
        JTextField jt = new JTextField("请单击其他文本框",10);
        JTextField jt2 = new JTextField("请单击我",10);
        c.add(jt);
        c.add(jt2);
        jt.addFocusListener(new FocusListener(){
            //组件失去焦点时调用的方法
            public void focusLost(FocusEvent arg0){
                JOptionPane.showMessageDialog(null,"文本框失去焦点");
            }
            //组件获取焦点时调用的方法
            public void focusGained(FocusEvent arg0){

            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new FocusEventTest();
    }
}
