package ch19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Receive extends JFrame implements Runnable, ActionListener {
    int port;                               //定义int型变量
    InetAddress group = null;               //声明InetAddress对象
    MulticastSocket socket = null;          //创建多点广播套接字对象
    JButton ince = new JButton("开始接收");
    JButton stop  = new JButton("停止接收");
    JTextArea inceAr = new JTextArea(10,10);
    JTextArea inced = new JTextArea(10,10);
    Thread thread;                          //创建Thread对象
    boolean b = false;                      //创建boolean型变量
    public Receive(){
        super("guan广播数据报");         //调用父类方法
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thread = new Thread(this);
        ince.addActionListener(this);               //绑定按钮ince的单击事件
        stop.addActionListener(this);               //绑定按钮stop的单击事件
        inceAr.setForeground(Color.blue);              //指定文本域中文字的颜色
        JPanel north = new JPanel();                    //创建面板对象north
        north.add(ince);                                //将按钮添加到north上
        north.add(stop);
        add(north,BorderLayout.NORTH);                  //将north放置在窗体的上部
        JPanel center = new JPanel();                   //创建面板对象center
        center.setLayout(new GridLayout(1,2));          //设置面板布局
        center.add(inceAr);                             //将文本域添加到面板上
        center.add(inced);
        add(center,BorderLayout.CENTER);                //设置面板布局
        validate();                          //刷新
        port = 9898;                         //设置端口号
        try {
            group = InetAddress.getByName("224,255,10,0");          //指定接收地址
            socket = new MulticastSocket(port);                     //绑定多点广播套接字
            socket.joinGroup(group);                    //加入广播组
        }catch (Exception e){
            e.printStackTrace();
        }
        setBounds(100,50,360,380);
        setVisible(true);
    }
    public void run(){
        while (true){
            byte data[] = new byte[1024];
            DatagramPacket packet = null;                   //创建DatagramPacket对象
            //待接收的数据包
            packet = new DatagramPacket(data,data.length,group,port);
            try {
                socket.receive(packet);                     //接收数据包
                String message = new String(packet.getData(),0,packet.getLength());         //获取数据包中的内容
                //将接收内容显示在文本域中
                inceAr.setText("正在接收的内容：\n" + message);
                inced.append(message+"\n");                 //每条信息为一行
            }catch (Exception e){
                e.printStackTrace();
            }
            if (b == true){                                 //当变量等于true时退出循环
                break;
            }
        }
    }
    public void actionPerformed(ActionEvent e){          //单击事件
        if (e.getSource() == ince){                         //单击按钮ince触发的事件
            ince.setBackground(Color.red);
            stop.setBackground(Color.yellow);
            if (!(thread.isAlive())){                       //如果线程不处于"新建状态"
                thread = new Thread(this);            //启动Thread对象
            }
            thread.start();                                 //启动线程
            b = false;                                      //设置变量值

        }
        if (e.getSource() == stop ){                        //单击按钮stop触发的事件
            ince.setBackground(Color.yellow);
            stop.setBackground(Color.red);
            b = true;
        }

    }

    public static void main(String[] args) {
        Receive rec = new Receive();
        rec.setSize(460,200);
    }
}
