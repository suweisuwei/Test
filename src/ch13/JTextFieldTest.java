package ch13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldTest extends JFrame {
    public JTextFieldTest(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setBounds(200,200,300,300);

        final JTextField jt = new JTextField("aaa",20);
        jt.setSize(100,100);
        final JButton jb = new JButton("清除");
        c.add(jt);
        c.add(jb);
        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("触发事件");
            }
        });
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jt.setText("");
                jt.requestFocus();
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
