package ch13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEvent extends JFrame {
    private JButton jb = new JButton("我是按钮，单击我");
    public SimpleEvent(){
        setLayout(null);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setBounds(200,200,300,300);
        c.add(jb);
        jb.setBounds(10,10,100,30);
        //为按钮添加一个实现ActionListener接口的对象
        jb.addActionListener(new jbAction());
        setVisible(true);
    }
    //定义内部类实现ActionListener接口
    class jbAction implements ActionListener{
        //重写actionPerformed()方法

        @Override
        public void actionPerformed(ActionEvent e) {
            jb.setText("我被单击了");
        }
    }

    public static void main(String[] args) {
        new SimpleEvent();
    }
}
