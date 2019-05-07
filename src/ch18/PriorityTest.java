package ch18;

import javafx.scene.control.ProgressBar;

import javax.swing.*;
import java.awt.*;

public class PriorityTest extends JFrame {
    private Thread threadA;
    private Thread threadB;
    private Thread threadC;
    private Thread threadD;
    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();
    final JProgressBar progressBar3 = new JProgressBar();
    final JProgressBar progressBar4 = new JProgressBar();


    public PriorityTest(){
        super();
        getContentPane().add(progressBar, BorderLayout.NORTH);
        getContentPane().add(progressBar2, BorderLayout.SOUTH);
        getContentPane().add(progressBar3, BorderLayout.WEST);
        getContentPane().add(progressBar4, BorderLayout.EAST);
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);
        progressBar3.setStringPainted(true);
        progressBar4.setStringPainted(true);
        threadA = new Thread(new MyThread(progressBar));
        threadB = new Thread(new MyThread(progressBar2));
        threadC = new Thread(new MyThread(progressBar3));
        threadD = new Thread(new MyThread(progressBar4));
        setPriority("threadA",5,threadA);
        setPriority("threadB",5,threadB);
        setPriority("threadC",4,threadC);
        setPriority("threadD",3,threadD);
    }
    //定义设置线程的名称、优先级的方法
    public static void setPriority(String threadName,int priority,Thread t){
        t.setPriority(priority);                    //设置线程的优先级
        t.setName(threadName);                      //设置线程的名称
        t.start();                                  //启动线程

    }
    public static void main(String[] args) {
        init(new PriorityTest(),100,100);
    }
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);
        frame.setVisible(true);
    }
    //定义一个实现Runnable接口的类
    private final class MyThread implements Runnable{
        private final JProgressBar bar;
        int count = 0;
        private MyThread(JProgressBar bar){
            this.bar = bar;
        }
        public void run(){
            while (true){
                bar.setValue(count+=10);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println("当前线程被中断");
                }
            }
        }
    }

}
