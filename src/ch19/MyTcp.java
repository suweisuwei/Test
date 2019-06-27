package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端程序，在getserver()方法中建立服务器套接字，调用getClientMessage()方法获取客户端信息
 */
public class MyTcp {
    private BufferedReader reader;                      //创建BufferedReader对象
    private ServerSocket server;                        //创建ServerSocket对象
    private Socket socket;                              //创建Socket对象socket
    void getserver(){
        try {
            server = new ServerSocket(8998);            //实例化Socket对象
            System.out.println("服务器套接字已经创建成功");         //输出信息
            while (true){                               //如果套接字是连接状态
                System.out.println("等待客户机的连接");         //输出信息
                socket = server.accept();               //实例化Socket对象
                //实例化BufferedReader对象
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientMessage();                     //调用getClientMessage()方法
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private void getClientMessage(){
        try {
            while (true){                       //如果套接字是连接状态
                //获得客户端信息
                System.out.println("客户机：" + reader.readLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            if (reader != null){
                reader.close();                 //关闭流
            }
            if (socket != null){
                socket.close();                 //关闭套接字
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyTcp tcp = new MyTcp();                //创建本类对象
        tcp.getserver();                        //调用方法
    }
}
