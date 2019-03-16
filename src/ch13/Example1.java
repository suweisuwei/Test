package ch13;
import java.awt.*;                              //导入AWT包
import javax.swing.*;                           //导入Swing包

public class Example1 extends JFrame {              //定义一个类继承JFrame类
    public void CreatJFrame(String title){          //定义一个CreateJFrame()方法
        JFrame jf = new JFrame(title);              //实例化一个JFrame对象
        Container container = jf.getContentPane();          //获取一个容器
        JLabel jl = new JLabel("这是一个JFrame窗体");     //创建一个JLable标签
        //使标签上的文字居中
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);                             //将标签添加到容器中
        container.setBackground(Color.white);          //设置容器的背景颜色
        jf.setVisible(true);                           //使窗体可视
        jf.setSize(400,250);              //设置窗体大小
        //设置窗体关闭方式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Example1().CreatJFrame("创建一个JFrame窗体");         //在主方法中调用CreatJFrame()方法
    }
}
