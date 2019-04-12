package ch13;

import javax.swing.*;
import java.awt.*;

public class GridLayoutPosition extends JFrame {
    public GridLayoutPosition(){
        Container c = getContentPane();
        //设置容器使用网格布局管理器，设置7行3列的网格
        setLayout(new GridLayout(7,3,5,5));
        for (int i =0;i<20;i++){
            c.add(new JButton("button"+i));
        }
        setSize(300,300);
        setTitle("这是一个使用网格布局管理器的窗体");
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutPosition();
    }
}
