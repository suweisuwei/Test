package ch19;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 客户端程序，实现将用户在文本框中输入的信息发送至服务器端，并将文本框中输入的信息显示在客户端的文本域中，先运行服务器端MyTcp.java，再运行MyClien.java
 */
public class MyClien extends JFrame {
    private PrintWriter writer;                      //声明PrintWriter类对象
    Socket socket;                                   //声明Socket对象
    private JTextArea ta = new JTextArea();             //创建JTextArea对象
    private JTextField tf = new JTextField();           //创建JTextField对象
    Container cc;                                   //声明Container对象
    public MyClien(String title){
        super(title);                               //调用父类的构造方法
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc = this.getContentPane();                 //实例化对象
        final JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(scrollPane,BorderLayout.CENTER);
        scrollPane.setViewportView(ta);
        cc.add(tf,"South");                 //将文本框放在窗体的下部
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //将文本框中的信息写入流
                writer.println(tf.getText());
                //将文本框中的信息显示在文本域中
                ta.append(tf.getText() + '\n');
                ta.setSelectionEnd(ta.getText().length());
                tf.setText(" ");                    //将文本清空
            }
        });
    }
    private void connect(){                         //连接套接字方法
        ta.append("尝试连接\n");                     //文本域中提示信息
        try {
            socket = new Socket("127.0.0.1",8998);      //实例化Socket对象
            writer = new PrintWriter(socket.getOutputStream(),true);
            ta.append("完成连接\n");                //文本域中提示信息
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyClien clien = new MyClien("向服务器送数据");         //创建本例对象
        clien.setSize(200,200);
        clien.setVisible(true);
        clien.connect();                            //调用连接方法
    }

}
