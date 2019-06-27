package ch19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
    public static void main(String[] args) {
        InetAddress ip;                             //创建InetAddress对象
        try{                                            //使用try语句块捕捉可能出现的异常
            ip = InetAddress.getLocalHost();            //实例化对象
            String localname  = ip.getHostName();       //获取本机名
            String localip = ip.getHostAddress();       //获取本机IP地址
            System.out.println("本机名：" + localname);         //将本机名输出
            System.out.println("本机IP地址：" + localip);        //将本机IP地址输出
        }catch (UnknownHostException e){
            e.printStackTrace();                     //输出异常信息
        }
    }
}
