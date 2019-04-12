package ch13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class JButtonTest extends JFrame {
    public JButtonTest(){
        URL url = MyImageIcon.class.getResource("1.jpg");
        Icon icon = new ImageIcon(url);
        setLayout(new GridLayout(3,2,5,5));
        Container c = getContentPane();
        for (int i = 0;i<5;i++){
            //创建按钮，同时设置按钮文字与图标
            JButton J = new JButton("button"+i,icon);
            c.add(J);
            if (i % 2 == 0){
                J.setEnabled(false);
            }
        }
        JButton jb = new JButton();         //实例化一个没有文字与图片的按钮
        jb.setMaximumSize(new Dimension(30,30));        //设置按钮与图片相同大小
        jb.setIcon(icon);
        jb.setHideActionText(true);
        jb.setToolTipText("图片按钮");      //设置按钮提示为文字
        jb.setBorderPainted(false);        //设置按钮边界不显示
        jb.addActionListener(new ActionListener() {     //为按钮添加监听事件
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹出确认对话框
                JOptionPane.showMessageDialog(null,"弹出对话框");
            }
        });
        c.add(jb);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}

