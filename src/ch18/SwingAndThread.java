package ch18;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    private JLabel jl = new JLabel();                           //声明JLable对象
    private static Thread t;                                    //声明线程对象
    private int count = 0;                                      //声明计数变量
    private Container container = getContentPane();             //声明容器

    public SwingAndThread(){
        setBounds(300,200,250,100);             //绝对定位窗体大小与位置
        container.setLayout(null);
        URL url = SwingAndThread.class.getResource("1.jpg");
        Icon icon = new ImageIcon(url);
        jl.setIcon(icon);
        //设置图片在标签的最左方
        jl.setHorizontalAlignment(SwingConstants.LEFT);
        jl.setBounds(10,10,200,50);
        jl.setOpaque(true);
        t = new Thread(new Runnable() {                         //定义匿名内部类，该类实现Runnable接口
            @Override
            public void run() {                                 //重写run()方法
                while (count<= 200){
                    //将标签的横坐标用变量表示
                    jl.setBounds(count,10,200,50);
                    try{
                        Thread.sleep(1000);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    count += 4;
                    if (count == 200){
                        //当图标到达标签的最右边时，使其回到标签的最左边
                        count = 10;
                    }
                }

            }
        });
        t.start();                      //启动线程
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingAndThread();
    }

}
