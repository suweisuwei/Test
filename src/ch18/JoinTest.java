package ch18;

import javax.swing.*;
import java.awt.*;

public class JoinTest extends JFrame {
    private Thread threadA;
    private Thread threadB;
    final JProgressBar progressBar = new JProgressBar();            //定义两个进度条件组件
    final JProgressBar progressBar2 = new JProgressBar();
    int count = 0;

    public static void main(String[] args) {
        init(new JoinTest(),100,100);
    }
    public JoinTest(){
        super();
        //将进度条设置在窗体最北面
        getContentPane().add(progressBar, BorderLayout.NORTH);
        //将进度条设置在窗体最南面
        getContentPane().add(progressBar2, BorderLayout.SOUTH);
        progressBar.setStringPainted(true);                 //设置进度条显示数字字符
        progressBar2.setStringPainted(true);
        //使用匿名内部类形式初始化THread实例
        threadA = new Thread(new Runnable() {
            int count = 0;
            public void run() {
                while (true){
                    progressBar.setValue(++count);          //设置进度条当前值
                    try{
                        Thread.sleep(100);
                        threadB.join();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;
            public void run() {
                while (true){
                    progressBar2.setValue(++count);
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    if (count ==100){
                        break;
                    }
                }
            }
        });
        threadB.start();
    }
    //设置窗体的各种属性
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
}
