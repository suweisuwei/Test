package ch13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog{
    public MyJDialog(MyFrame frame){
        //实例化一个JDialog类对象，指定对话框的父窗体，窗体标题和类型
        super(frame,"第一个JDialog窗体",true);
        Container container = getContentPane();                     //创建一个容器
        JLabel jl = new JLabel("这是一个对话框");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        //container.add(new JLabel("这是一个对话框"));             //在容器中添加标签
        //设置弹出对话框在屏幕居中
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        setBounds(width/2 - 100,height/2 - 100,200,200);              //设置对话框窗体大小
    }
}
public class MyFrame extends JFrame{
    public static void main(String[] args) {
        new MyFrame().setVisible(true);                         //实例化MyJDialog类对象并设置可见
    }
    public MyFrame(){
        //使窗体在屏幕居中
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        setBounds(width/2 - 200,height/2 - 150,400,300);
        Container container = getContentPane();                 //创建一个容器
        container.setLayout(null);
        JLabel jl = new JLabel("这是一个JFrame窗体");         //在窗体中设置标签
        //将标签的文字置于标签中间位置
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10,10,100,21);
        bl.addActionListener(new ActionListener() {             //为按钮添加鼠标单击事件
            @Override
            public void actionPerformed(ActionEvent e) {
                //使MyJDialog窗体可见
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);                          //将按钮添加到容器中

        //省略部分代码
    }
}
