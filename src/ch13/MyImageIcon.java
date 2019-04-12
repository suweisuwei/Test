package ch13;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ConcurrentModificationException;

public class MyImageIcon extends JFrame {
    public MyImageIcon(){
        Container c = getContentPane();
        JLabel jl = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
        URL url = MyImageIcon.class.getResource("1.jpg");
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jl.setOpaque(true);
        c.add(jl);
        setSize(250,100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyImageIcon();
    }
}
