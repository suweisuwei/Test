package ch13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog{
    public MyJDialog(MyFrame frame){
        //实例化一个JDialog类对象，指定对话框的父窗体，窗体标题和类型
        super(frame,"第一个JDialog窗体",true);
        Container container = getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,200,200);
    }
}
public class MyFrame extends JFrame{
    public static void main(String[] args) {
        new MyFrame().setVisible(true);
    }
    public MyFrame(){
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        setBounds(width/2 - 200,height/2 - 150,400,300);
        Container container = getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("这是一个JFrame窗体");
        //将标签的文字置于标签中间位置
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl = new JButton("弹出对话框");
        bl.setBounds(10,10,100,21);
        bl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //使MyJDialog窗体可见
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(bl);

        //省略部分代码
    }
}
