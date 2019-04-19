package ch15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;         //创建面板对象
    private JTextArea jTextArea = null;
    private JPanel controlPanel = null;
    private JButton openButton = null;
    private JButton closeButton = null;
    public FTest() {
        super();
        Container con  = this.getContentPane();
        jContentPane = new JPanel();
        jTextArea = new JTextArea();
        controlPanel = new JPanel();
        openButton = getOpenButton();
        closeButton = getCloseButton();
        setBounds(100, 100, 200, 200);
        con.setLayout(new FlowLayout());
        con.setSize(200,200);
        jContentPane.setSize(200, 180);
        con.add(jContentPane);
        jTextArea.setSize(200,180);
        jContentPane.add(jTextArea);
        controlPanel.setSize(200,20);
        con.add(controlPanel);
        controlPanel.add(openButton);
        controlPanel.add(closeButton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    private JButton getOpenButton(){
        if (openButton == null){
            openButton = new JButton();
            openButton.setText("写入文件");
            openButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("write!");
                    File file = new File("word.txt");
                    try{
                        FileWriter out = new FileWriter(file);
                        String s = jTextArea.getText();
                        out.write(s);
                        out.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }

    private JButton getCloseButton(){
        if (closeButton ==null){
            closeButton = new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("read!");
                    File file = new File("word.txt");
                    try{
                        FileReader in = new FileReader(file);
                        char byt[] = new char[1024];
                        int len = in.read(byt);
                        jTextArea.setText(new String(byt,0,len));
                        in.close();
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return closeButton;
    }

    public static void main(String[] args) {
        new FTest();


    }
}
