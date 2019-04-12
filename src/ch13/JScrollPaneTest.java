package ch13;

import javax.naming.CompositeName;
import javax.swing.*;
import java.awt.*;

public class JScrollPaneTest extends JFrame {
    public JScrollPaneTest(){
        Container c = getContentPane();
        JTextArea ta = new JTextArea(20,50);
        JScrollPane sp = new JScrollPane(ta);
        c.add(sp);
        setTitle("带滚动条的文字编译器");
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
