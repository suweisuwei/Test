package ch13;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("本窗体使用流布局管理器");
        Container c = getContentPane();
        //设置窗体使用流布局管理器，使组件右对齐，并且设置组件之间的水平间隔和垂直间隔
        setLayout(new FlowLayout(2,10,10));
        for (int i = 0;i<10;i++){
            c.add(new JButton("button"+i));
        }
        setSize(300,200);
        setVisible(true);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}
